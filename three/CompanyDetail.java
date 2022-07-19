class Employee {
  String name, lastname;
  int salary;

  public Employee(String n, String l, int s) {
    name = n;
    lastname = l;
    int percentage = s + s * 10 / 100;
    salary = percentage;
  }

}

class Manager extends Employee {

  public Manager(String n, String l, int s) {
    super(n, l, s);
  }
}

class Secretary extends Employee {

  public Secretary(String n, String l, int s) {
    super(n, l, s);

  }
}

public class CompanyDetail {

  public static void main(String[] args) {
    Manager manager = new Manager("bob", "smit", 10000);
    Secretary secretary = new Secretary("anna", "joy", 15000);
    System.out.println("manager");
    System.out.println("name : " + manager.name);
    System.out.println("lastname : " + manager.lastname);
    System.out.println("lastname : " + manager.salary);
    System.out.println("*****************************");
    System.out.println("secretary");
    System.out.println("name : " + secretary.name);
    System.out.println("lastname : " + secretary.lastname);
    System.out.println("lastname : " + secretary.salary);
  }
}
