package de.bag.bestellsystem;



/**
*
* Beschreibung
*
* @version 1.0 vom 30.04.2012
* @author andreas fast
*/

public class PartialOrder {
	
  private String article = "Artikel...";
  private String customer = "Mitarbeiter...";
  private boolean driver = false;
  private String destination = "Edeka";
  private double unitPrice = 0;
  private double deadline = 0;

  
  public String getArticle() {
	  return article;
  }

  public void setArticle(String article) {
    this.article = article;
  }

  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public boolean isDriver() {
    return driver;
  }

  public void setDriver(boolean driver) {
    this.driver = driver;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getDestination() {
    return destination;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getDeadline() {
    return deadline;
  }

  public void setDeadline(double deadline) {
    this.deadline = deadline;
  }


  // Ende Methoden
}