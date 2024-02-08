package com.Addison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();

	Deck() {
		String[] suits = { "Spades", "Clubs", "Diamonds", "Hearts" };
		String[] numbers = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };

		for (String suit : suits) {
			int i = 2;
			for (String number : numbers) {
				cards.add(new Card(number, suit, i));
				i++;
			}
		}
	}

	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
	
}
