
class PerSon {
  String name;
  int age;

  public PerSon(String name_send, int age_send) {
    name = name_send;
    age = age_send;
  }
}

public class PeetyGirl extends PerSon {

  public PeetyGirl(String name_send, int age_send) {
    super(name_send, age_send);
    // TODO Auto-generated constructor stub
  }

  public static void main(String[] args) {
    PerSon s = new PerSon("ann", 12);
    System.out.println("name : " + s.name);
    System.out.println("age : " + s.age);
    // s.showAll();
  }

}
