package Item.Item;

public class Item {
  private String name;
  private double price;

  public Item(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public getPrice() { return this.price; }
  
  public getName() { return this.name; }
}
