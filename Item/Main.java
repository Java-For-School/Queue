import Item.Item;

public class Main {
  public static void main(String[] args) {

  }
  private static Item Big(Item a, Item b) {
    if (a.getPrice() > b.getPrice()) return a;
    return b;
  }
  public static Item Secret(Queue<Item> queue) {
    if (queue.isEmpty()) return new Item("000", 0);
    Item x = queue.poll();
    Item it = Big(x, Secret(queue));
    queue.add(x);

    return it;
  }
}
