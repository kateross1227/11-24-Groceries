// main program to run the GroceryList
// main program to run the GroceryList
public class Groceries {
  public static void main(String[] args) {
    GroceryList list=new GroceryList();
    GroceryItem One = new GroceryItem("Oreos", 3, 2.5);
    GroceryItem Two = new GroceryItem("Goldfish Crackers", 2, 1.75);
    GroceryItem Three = new GroceryItem("Apple", 8, 0.23);
    GroceryItem Four = new GroceryItem("Fruit Loops", 2, 4.32);
    GroceryItem Five = new GroceryItem("Pop Tarts", 4, 3.67);
    
    list.add(One);
    list.add(Two);
    list.add(Three);
    list.add(Four);
    list.add(Five);
    System.out.println(list.toString());
    System.out.println("Total: $" + list.getTotalCost());
  }
}
