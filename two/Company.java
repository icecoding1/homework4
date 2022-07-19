class Employee {
  String name, lastname;

  public Employee(String n, String l) {
    name = n;
    lastname = l;
  }

}

class Manager extends Employee {

  public Manager(String n, String l) {
    super(n, l);
  }
}

class Secretary extends Employee {

  public Secretary(String n, String l) {
    super(n, l);
  }
}

public class Company {

  public static void main(String[] args) {
    Manager manager = new Manager("bob", "smit");
    Secretary secretary = new Secretary("anna", "joy");
    System.out.println("manager");
    System.out.println("name : " + manager.name);
    System.out.println("lastname : " + manager.lastname);
    System.out.println("*****************************");
    System.out.println("secretary");
    System.out.println("name : " + secretary.name);
    System.out.println("lastname : " + secretary.lastname);
  }
}
