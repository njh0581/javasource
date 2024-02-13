package poly;

public class Buyer {

  int money = 1000; //소유금액
  int bonusPoint = 0;

  //   void buy(Tv tv) {
  //     if (money < tv.price) {
  //       System.out.println("잔액이 부족하여 구매가 불가능합니다.");
  //       return;
  //     }
  //     money -= tv.price;
  //     bonusPoint += tv.bonusPoint;
  //     System.out.println("제품을 구매하셨습니다.");
  //   }

  //   void buy(Computer computer) {
  //     if (money < computer.price) {
  //       System.out.println("잔액이 부족하여 구매가 불가능합니다.");
  //       return;
  //     }
  //     money -= computer.price;
  //     bonusPoint += computer.bonusPoint;
  //     System.out.println("제품을 구매하셨습니다.");
  //   }
  void buy(Product p) {
    if (money < p.price) {
      System.out.println("잔액이 부족하여 구매가 불가능합니다.");
      return;
    }
    money -= p.price;
    bonusPoint += p.bonusPoint;
    System.out.println(p + "제품을 구매하셨습니다.");
  }
}
