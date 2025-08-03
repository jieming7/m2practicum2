public class Employee {
    //represents employee
   private int employeeId;
   private String name;
   private int age;
   private String address;
   private String email;


public Employee(String name, int age, String address, String email) {
    //constructor for employee
    this.employeeId  = employeeId;
    this.name = name;
    this.age = age;
    this.address = address;-
    this.email = email;
    }

    //getters and setters
public int getEmployeeID() {
    return employeeId;
}
//no setter required for employeeId

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
}
