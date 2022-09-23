package colections.exercisesForSes16.companymanagement;

import java.util.ArrayList;
import java.util.List;

public class MainCompany {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ioana", "SUA", 52));
        employeeList.add(new Employee("Crina", "Franta", 30));
        employeeList.add(new Employee("Maria", "Romania", 34));
        employeeList.add(new Employee("Mihai", "Romania", 51));
        employeeList.add(new Employee("Cosmin", "Ucraina", 40));
        Company company = new Company(employeeList);
        System.out.println(company.filterByAgeGraterThen(50));
        System.out.println(company.filterRomaniaEmployee("Romania"));
        company.sortByName();
        System.out.println(employeeList);
        company.sortByCountry();
        System.out.println(employeeList);
        System.out.println(company.groupNumberOfEmployeesByCountry());
        System.out.println(company.groupEmployeesByCountry());

    }
}
