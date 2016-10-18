/**
 * This class is to test the Employee class and 
 * its methods. An object of the class is 
 * created and then we use the getter, setters,
 * and toString methods.
 */

public class EmployeeTest{
    public static void main(String[] args){
        Employee employeeOne = new Employee("Ralph", "Wiggins", 2013);

        System.out.println(employeeOne.getFirstName());

        System.out.println(employeeOne.getSurname());

        System.out.println(employeeOne.getYearOfJoining());

        employeeOne.setSurname("Harambe");

        System.out.println(employeeOne.getSurname());

        System.out.println(employeeOne.toString()); 

    }
}
