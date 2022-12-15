package it.develhope.static1;

public class Employee {

    public String name;
    public String surname;
    public String address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public String getEmployeeDetails(){
        return "The employee's name and surname is: " + name + " " + surname + ". The address is " + address + ".";
    }
}
