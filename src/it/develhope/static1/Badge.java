package it.develhope.static1;

public class Badge {

    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees ++;
    }

    private String generateBadgeIdCode(){
        return "XYZ" + employee.name + employee.surname + "XYZ";
    }

    public void showBadgeDetails(){
        System.out.println("Total number of employees tracked by badges: " + totalNumberOfEmployees);
        System.out.println("Details of the employee: " + employee.getEmployeeDetails());
        System.out.println("Badge ID code: " + generateBadgeIdCode());
    }

    public Badge(Employee employeeThatNeedsBadge){
        Badge.keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}
