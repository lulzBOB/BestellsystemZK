package de.bag.bestellsystem;

import java.util.ArrayList;

import org.zkoss.bind.annotation.ScopeParam;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 30.04.2012
  * @author andreas fast
  */

public class CompleteOrder {
	
	
	private ArrayList<PartialOrder> completeOrder;
	
	public ArrayList<PartialOrder> getCompleteOrder() {
		return completeOrder;
	}
	
	public void setCompleteOrder(ArrayList<PartialOrder> completeOrder) {
		this.completeOrder = completeOrder;
	}
	
	
} 

