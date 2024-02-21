package generics;

public class Juicer {

  static Juice makeJuce(FruitBox<Fruit> box) {
    String temp = "";
    for (Fruit f : box.getList()) {
      temp += f + " ";
    }
    return new Juice(temp);
  }
}
