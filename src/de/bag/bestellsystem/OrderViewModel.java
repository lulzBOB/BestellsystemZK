package de.bag.bestellsystem;

import java.util.ArrayList;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Sessions;

/**
 * @author afast

 * 
 */

public class OrderViewModel {
	
	private PartialOrder partialOrder = new PartialOrder();
	
	//private CompleteOrder completeOrder = new CompleteOrder();
	
	private ArrayList<PartialOrder> completeOrder = new ArrayList<>();
	
	public ArrayList<PartialOrder> getCompleteOrder() {
		if(Sessions.getCurrent().getAttribute("completeOrder")!=null){
			this.completeOrder = (ArrayList<PartialOrder>) Sessions.getCurrent().getAttribute("completeOrder");
		}
		return completeOrder;
	}
	
	public PartialOrder getPartialOrder() {
		return partialOrder;
	}

	@Init
	public void loadData(){
		
	}
	
	
	@NotifyChange("*")
	@Command
	public void submitOrder() {
		completeOrder.add(partialOrder);
		Sessions.getCurrent().setAttribute("completeOrder", completeOrder);
		this.partialOrder = new PartialOrder();	
	}
	
	@NotifyChange("completeOrder")
	@Command
	public void clear(){
		this.completeOrder = new ArrayList<PartialOrder>();
	}

	
}
