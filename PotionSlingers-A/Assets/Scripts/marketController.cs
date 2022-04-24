using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class marketController : MonoBehaviour
{

    public MarketDeck potions;
    public MarketDeck specials;
    // Start is called before the first frame update
    void Start()
    {
        potions = GameObject.Find("PotionPile").GetComponent<MarketDeck>();
        specials = GameObject.Find("SpecialCardPile").GetComponent<MartketDeck>();
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    //Sell the player their chosen card
    public void sell(Player player, Card card) {
        //check how much card costs
        //check how many pips player has
        //if enough -> move card from marketDeck to top of player deck
        //if not enough -> return message that card is too expensive
    }
}
