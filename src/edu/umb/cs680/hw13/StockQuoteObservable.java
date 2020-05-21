package edu.umb.cs680.hw13;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class StockQuoteObservable extends Observable {
	private Map<String, Float> map = new HashMap<String, Float>();
	
	public void changeQuote(String t, float q) {
		//update a map with t and q
		map.put(t, q);
		setChanged();
		notifyObservers(new StockEvent(t, q));
	}
}