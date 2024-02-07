package ch4;

public class PersonEx {

  public static void main(String[] args) {
    // Person person = new Person();
    // person.setName("홍길동");
    // System.out.println(person.getName());
    // System.out.println(person); //Person@5ca881b5

    // Person person2 = new Person();
    // person.setName("성춘향");
    // System.out.println(person.getName());

    Person person = new Person("홍길동", "korea");
    person.setName("김길동");

    Person person2 = new Person("장길동", "korea");
    person2.setName("김길동");
  }
}
