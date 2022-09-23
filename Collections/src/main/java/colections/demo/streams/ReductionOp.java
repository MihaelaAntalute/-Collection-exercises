package colections.demo.streams;

import colections.demo.streams.helperclasses.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReductionOp {
    public static void main(String[] args) {
        List<Integer> transactions = List.of(20, 40, -60, 5);
        //1. printeaza maximul din lista de numere

//        Optional<Integer> optionalMax = transactions.stream()
//                .max((number1, number2) -> number1.compareTo(number2));
//        System.out.println(optionalMax.orElse(0));
        System.out.println(printMaxFromList(transactions));
        System.out.println(printMaxFromList2(transactions));
        //2. printeaza suma numerelor din lista
//
//        Optional<Integer> optionalSum = transactions.stream()
//                .reduce((sum, transaction) -> sum + transaction);
//        System.out.println(optionalSum.orElse(0));
        printSum(transactions);
        System.out.println(printSum2(transactions));

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee("Ben", 63, 25000, "India"));
        employeeList.add(new Employee("Dave", 34, 56000, "Bhutan"));
        employeeList.add(new Employee("Jodi", 43, 67000, "China"));
        employeeList.add(new Employee("Ryan", 53, 54000, "Libya"));
        //TODO 3. printeaza suma salariilor angajatilor din lista

//        Optional<Integer> optionalSum2 = employeeList.stream()
//                .map(employee -> employee.getSalary())
//                .reduce((sum, transaction) -> sum + transaction);
//        System.out.println(optionalSum2.orElse(0));
        printSumSalaryOfEmployees(employeeList);
        System.out.println( printSumSalaryOfEmployees2(employeeList));
    }


    //1
    public static Integer printMaxFromList(List<Integer> numbersList) {
        Optional<Integer> optionalMax = numbersList.stream()
                .max((number1, number2) -> number1.compareTo(number2));
        return optionalMax.orElse(0);

    }
    //1 var cu for
    public static Integer printMaxFromList2(List<Integer> numbersList) {
        int max = numbersList.get(0);
        for (int i = 0; i < numbersList.size(); i++) {
            if (max < numbersList.get(i)) {
                max = numbersList.get(i);
            }
        }
        return max;
    }

    //2
    public static Integer printSum(List<Integer> numbersList) {
        Optional<Integer> optionalSum = numbersList.stream()
                .reduce((sum, transaction) -> sum + transaction);
        return optionalSum.orElse(0);
    }
    // 2 varianta cu for
    public static Integer printSum2(List<Integer> numberList){
        int sum = 0;
        for (int i = 0; i < numberList.size(); i++) {
            sum += numberList.get(i);
        }
        return sum;
    }



    //3
    public static Integer printSumSalaryOfEmployees(List<Employee> employeeList) {
        Optional<Integer> optionalSum2 = employeeList.stream()
                .map(employee -> employee.getSalary())
                .reduce((sum, transaction) -> sum + transaction);
        return optionalSum2.orElse(0);

    }
//3 varianta cu for
    public static Integer printSumSalaryOfEmployees2(List<Employee> employeeList){
        int sum = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            sum += employeeList.get(i).getSalary();
        }

        return sum;
    }
}
