package de.bag.bestellsystem;

import java.util.ArrayList;
import java.util.Map;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.annotation.ScopeParam;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.ext.ScopeListener;

/**
 * @author afast

 * 
 */

public class OrderViewModel {

	private ArrayList<PartialOrder> completeOrder = new ArrayList<PartialOrder>();
	
	
	private  PartialOrder partialOrder = new PartialOrder();
	
	public ArrayList<PartialOrder> getCompleteOrder() {
		return completeOrder;
	}
	
	public PartialOrder getPartialOrder() {
		return partialOrder;
	}

	@NotifyChange("*")
	@Command
	public void submitOrder() {
		completeOrder.add(partialOrder);
		this.partialOrder = new PartialOrder();
		Sessions.getCurrent();
	}
	
	@NotifyChange("completeOrder")
	@Command
	public void clear(){
		this.completeOrder = new ArrayList<PartialOrder>();
	}
}
