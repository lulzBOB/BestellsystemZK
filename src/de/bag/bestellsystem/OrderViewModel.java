package de.bag.bestellsystem;

import java.sql.Connection;
import java.sql.SQLException;
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
	
	private ArrayList<PartialOrder> completeOrder = new ArrayList<>();
	
	private Database database = new Database();
	
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
	public void submitOrder() throws  SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		completeOrder.add(partialOrder);
		Sessions.getCurrent().setAttribute("completeOrder", completeOrder);
		this.partialOrder = new PartialOrder();	
		String test1 = database.getConnection().getSchema();
		String test2;
	}	
	
	@NotifyChange("completeOrder")
	@Command
	public void clear(){
		this.completeOrder = new ArrayList<PartialOrder>();
	}
	
	public void getDatabase(){
		try {
			Connection conn= database.getConnection();
			
			database.executeQuery("SELECT * FROM COMPLETEORDER");
			System.out.println(conn.getSchema());
			conn.close();
			}
		 catch (SQLException e) {
			e.printStackTrace();
		}
		String test2;
	
	}	
}
