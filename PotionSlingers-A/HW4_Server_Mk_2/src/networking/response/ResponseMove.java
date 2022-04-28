package networking.response;

// Other Imports
import metadata.Constants;
import model.Player;
import utility.GamePacket;
import utility.Log;
/**
 * The ResponseLogin class contains information about the authentication
 * process.
 */
public class ResponseMove extends GameResponse {
    private Player player;
    private int x;
    private int y;
    private int z;

    public ResponseMove() {
        responseCode = Constants.SMSG_MOVE;
    }

    @Override
    public byte[] constructResponseInBytes() {
        GamePacket packet = new GamePacket(responseCode);
        packet.addInt32(player.getID());
        packet.addInt32(x);
        packet.addInt32(y);
        packet.addInt32(z);

        Log.printf("Player with id %d has moved gun Vector to (%d, %d, %d)", player.getID(), x, y, z);
 
        return packet.getBytes();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setData(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}