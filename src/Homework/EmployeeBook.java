package Homework;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBook {
    private List<Employee> employeeList;

    public EmployeeBook() {
        employeeList = new ArrayList<>();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public List<Employee> findEmployeeByExperience(float minExperience, float maxExperience){
        List<Employee> employees = employeeList.stream().filter(exp ->
                (exp.getExperience() >= minExperience & exp.getExperience() <= maxExperience)).toList();
        return employees;
    }

    public String findPhoneNumberByName(String name){
        List<Employee> employee = employeeList.stream().filter(empl -> empl.getName().toLowerCase().equals(name.toLowerCase())).toList();
        StringBuilder phoneNumbers = new StringBuilder();
        for (Employee item : employee) {
            phoneNumbers.append(item.getPhoneNumber() + ", ");
        }
        phoneNumbers.delete(phoneNumbers.length() - 2, phoneNumbers.length());
        return String.format("Номера телефонов для сотрудника с именем %s: %s", name, phoneNumbers.toString());
    }

    public Employee findEmployeeByPersonnelNumber(int personnelNumber){
        Employee employee = employeeList.stream().filter(empl -> empl.getPersonnelNumber() == personnelNumber).findFirst().get();
        return employee;
    }

    public void addNewEmployee(Employee employee){
        employeeList.add(employee);
    }

    public String showEmployee(Employee employee){
        return employee.toString() + "\n";
    }

    public String showEmployeeBook(List<Employee> list){
        StringBuilder sb = new StringBuilder();
        for (Employee employee : list) {
            sb.append(showEmployee(employee));
        }
        return sb.toString();
    }

}
