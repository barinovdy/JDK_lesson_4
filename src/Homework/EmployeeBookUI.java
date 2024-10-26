package Homework;

public class EmployeeBookUI {
    EmployeeBook employeeBook = new EmployeeBook();

    public EmployeeBookUI() {
        testEmployeeBook();
        System.out.println(employeeBook.showEmployeeBook(employeeBook.getEmployeeList()));
        System.out.println(employeeBook.showEmployeeBook(employeeBook.findEmployeeByExperience(0.5f, 1.5f)));
        System.out.println(employeeBook.showEmployee(employeeBook.findEmployeeByPersonnelNumber(25467)));
        System.out.println(employeeBook.findPhoneNumberByName("Daria"));
    }

    public void testEmployeeBook(){
        employeeBook.addNewEmployee(new Employee(25789, "+7(916)780-34-55", "Ivan", 5.3f));
        employeeBook.addNewEmployee(new Employee(25467, "+7(932)453-44-78", "Daria", 1.2f));
        employeeBook.addNewEmployee(new Employee(21376, "+7(918)185-97-45", "Aleksandr", 2.7f));
        employeeBook.addNewEmployee(new Employee(28631, "+7(925)284-85-82", "Sergey", 0.5f));
        employeeBook.addNewEmployee(new Employee(29561, "+7(906)285-83-85", "Irina", 4.2f));
        employeeBook.addNewEmployee(new Employee(29147, "+7(935)859-34-77", "Daria", 12.7f));
    }


}
