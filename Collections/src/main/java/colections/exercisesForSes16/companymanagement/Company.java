package colections.exercisesForSes16.companymanagement;

import java.util.*;

public class Company {

    List<Employee> employeeList;

    public Company(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


    public List<Employee> filterByAgeGraterThen(int age) {
        List<Employee> foundEmployee = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getAge() > 50) {
                foundEmployee.add(employeeList.get(i));
            }
        }
        return foundEmployee;
    }

    public List<Employee> filterRomaniaEmployee(String country) {
        List<Employee> founfEmployee = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getCountry().equals(country)) {
                founfEmployee.add(employeeList.get(i));
            }
        }
        return founfEmployee;
    }

    public void sortByName() {
        Collections.sort(employeeList);

    }

    public void sortByCountry() {
        employeeList.sort(new CountryComparator());
    }

    public Map<String, Integer> groupNumberOfEmployeesByCountry() {
        Map<String, Integer> numbersOfEmployeesByCountry = new HashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            String country = employeeList.get(i).getCountry();
            if (!numbersOfEmployeesByCountry.containsKey(country)) {
                numbersOfEmployeesByCountry.put(country, 1);
            } else {
                numbersOfEmployeesByCountry.put(country, numbersOfEmployeesByCountry.get(country) + 1);
            }
        }
        return numbersOfEmployeesByCountry;
    }

    public Map<String, List<Employee>> groupEmployeesByCountry() {
        Map<String, List<Employee>> employeesByCountry = new HashMap<>();

        for (int i = 0; i < employeeList.size(); i++) {
            String country = employeeList.get(i).getCountry();
            if (!employeesByCountry.containsKey(country)) {
                List<Employee> employees = new ArrayList<>();
                employees.add(employeeList.get(i));
                employeesByCountry.put(country,employees);
            }
            else {
                employeesByCountry.get(country).add(employeeList.get(i));
            }
        }
        return employeesByCountry;
    }


}
