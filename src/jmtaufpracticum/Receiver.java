package src.jmtaufpracticum;

import java.util.ArrayList;

public class Receiver {
    //Represents EmployeeManager, contains business logic
    private ArrayList<Employee> employeeList;

    //constructor
    public Receiver() {
        employeeList = new ArrayList<>();
    }

    //Add employee, info, email address etc..
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }
    //Delete Employee
    public void deleteEmployee(int id, Employee emp) {
        employeeList.remove(emp);
    }


    //update
    public void updateEmployee(int id, Employee emp) {
        employeeList.set(employeeList.indexOf(emp), emp);
    }

    //list


    //find

    //storeToFile
    public void storeToFile(){

    }
}
