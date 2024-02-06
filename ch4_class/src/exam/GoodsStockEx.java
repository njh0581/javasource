package exam;

public class GoodsStockEx {

  public static void main(String[] args) {
    GoodsStock goodsStock = new GoodsStock("p1011", 150);

    int stockNum = goodsStock.addStock(20);
    System.out.println(stockNum);

    stockNum = goodsStock.subtrackStock(100);
    System.out.println(stockNum);
  }
}
