// class to represent a grocery item
// class to represent a grocery item
public class GroceryItem {
  String name;
  int quantity;
  double pricePerUnit;
  
  public GroceryItem(String name1, int quantity1, double pricePerUnit1){
    name = name1;
    quantity = quantity1;
    pricePerUnit = pricePerUnit1;
  }
  
  public double getCost(){
    return pricePerUnit * quantity;
  }
  
  public void setQuantity(int quantity1) {
    quantity = quantity1;
  }
  
  public String toString(){
    return quantity + name + " @ " + pricePerUnit + " = " + getCost();
  }
}
