package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop implements IShop {

  // private Customer customers[] = new Customer[5];
  List<Customer> customers = new ArrayList<>();

  // private Product products[] = new Product[5];
  List<Product> products = new ArrayList<>();

  private String title;
  private int customerNo;
  //장바구니
  // private Product carts[] = new Product[5]; //CellPhone과 SmartTV 둘다 담아야 하기 때문에 부모타입으로 만듬
  List<Product> carts = new ArrayList<>();

  Scanner sc = new Scanner(System.in);

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public void genUser() {
    Customer customer = new Customer();
    customer.setName("홍길동");
    customer.setPayType(PayType.CARD);
    // customers[0] = customer;
    customers.add(customer);

    Customer customer1 = new Customer();
    customer1.setName("성춘향");
    customer1.setPayType(PayType.CASH);
    customers.add(customer1);

    Customer customer2 = new Customer();
    customer2.setName("김유신");
    customer2.setPayType(PayType.CARD);
    customers.add(customer2);

    Customer customer3 = new Customer();
    customer3.setName("이순신");
    customer3.setPayType(PayType.CASH);
    customers.add(customer3);

    Customer customer4 = new Customer();
    customer4.setName("김재정");
    customer4.setPayType(PayType.CARD);
    customers.add(customer4);
  }

  @Override
  public void genProduct() {
    //제품 생성
    CellPhone Phone = new CellPhone("갤럭시 노트", 1000000, "U+");
    // products[0] = Phone;
    products.add(Phone);
    Phone = new CellPhone("아이폰", 1500000, "KT");
    products.add(Phone);
    Phone = new CellPhone("갤럭시 z플립", 1300000, "SKT");
    products.add(Phone);
    SmartTV tv = new SmartTV("삼성tv", 2000000, "4K");
    products.add(tv);
    tv = new SmartTV("LG TV", 1500000, "4K");
    products.add(tv);
  }

  @Override
  public void start() {
    System.out.println(title + " : 메인화면 - 계정선택");
    System.out.println("===================================");
    for (int i = 0; i < customers.size(); i++) {
      System.out.printf(
        "[%d] %s(%s)\n",
        i,
        customers.get(i).getName(),
        customers.get(i).getPayType()
      );
    }
    System.out.println("[x] 종료");

    //사용자에게 고객번호 입력받기
    System.out.print("고객 번호 >> ");
    String cNo = sc.nextLine();
    System.out.println("###" + cNo + " 고객선택 ###");

    customerNo = Integer.parseInt(cNo);

    if (cNo.equals("x")) {
      System.exit(0);
    } else { //0~4
      productList();
    }
  }

  public void productList() {
    //상품 목록 출력
    System.out.println("\n");
    System.out.println(title + " : 상품목록 - 상품선택");
    System.out.println("===================================");
    for (int i = 0; i < products.size(); i++) {
      System.out.printf("[%d]", i);
      products.get(i).printDetail();
    }
    System.out.println("[h] 메인 화면");
    System.out.println("[c] 체크 아웃");

    System.out.println("상품 번호 >>");
    String menu = sc.nextLine();

    switch (menu) {
      case "h":
        start();
        break;
      case "c":
        checkOut();
        break;
      default: //0~4에 해당하는 제품을 장바구니에 추가
        // for (int i = 0; i < carts.size(); i++) {
        //   if (carts.get(i) == null) {
        //     // carts[i] = Products[Integer.parseInt(menu)];
        carts.add(products.get(Integer.parseInt(menu)));

        break;
    }

    productList();
  }

  public void checkOut() {
    System.out.println("\n");
    System.out.println(title + " : 체크아웃");
    System.out.println("===================================");

    int i = 0, total = 0;
    for (Product product : carts) {
      if (product != null) {
        System.out.printf(
          "[%d] %s %d\n",
          i,
          product.getPname(),
          product.getPrice()
        );
        total += product.getPrice();
      }
    }
    System.out.println("===================================");
    System.out.println("합계 : " + total);
    System.out.println("결제방법 : " + customers.get(customerNo).getPayType());
    System.out.println("[p] 이전");
    System.out.println("[q] 결제");
    String menu = sc.nextLine();

    switch (menu) {
      case "p":
        productList();

        break;
      case "q":
        System.out.println("결제가 완료되었습니다.");
        System.exit(0);

        break;
      default:
        break;
    }
  }
}
