package colections.demo.streams.collectoperations;

import colections.demo.streams.helperclasses.Account;
import colections.demo.streams.helperclasses.Employee;
import colections.demo.streams.helperclasses.Status;

import java.util.*;
import java.util.stream.Collectors;

public class CollectingOp {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee("Ben", 63, 25000, "India"));
        employeeList.add(new Employee("Dave", 34, 56000, "Bhutan"));
        employeeList.add(new Employee("Jodi", 43, 67000, "China"));
        employeeList.add(new Employee("Ryan", 53, 54000, "Libya"));

        //1. returneaza o lista cu numele tututor angajatilor din lista de angajati
//       List<String> employeeNames = employeeList.stream()
//                .map(employee ->employee.getName())
//                .collect(Collectors.toList());
//        System.out.println(employeeNames);
        System.out.println(printNamesOfEmployees(employeeList));

        //2. returneaza un set cu tarile tututor angajatilor din lista de angajati
//        Set<String>employeeCountries = employeeList.stream()
//                .map(employee -> employee.getCountry())
//                .collect(Collectors.toSet());
//        System.out.println(employeeCountries);
        System.out.println(printCountriesFromAllEmployees(employeeList));

        //3. returneaza o mapa in care cheia este fiecare nume de angajat din lista, iar valoarea este tara angajatului
        Map<String, String> wordsByCountry = employeeList.stream()
                .collect(Collectors.toMap(employee -> employee.getName(), employee -> employee.getCountry()));
        System.out.println(wordsByCountry);

        System.out.println(printNameEmployeeAndCountry(employeeList));


        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(3000, "3451231231", Status.ACTIVE));
        accounts.add(new Account(4000, "1233451233", Status.ACTIVE));
        accounts.add(new Account(5000, "1287429134", Status.ACTIVE));
        accounts.add(new Account(6000, "4567831246", Status.ACTIVE));
        accounts.add(new Account(7000, "3467851293", Status.ACTIVE));
        //4. returneaza o lista cu numerele de cont ale tuturor conturilor din lista de conturi

        List<String> accountNumbersByAllAccounts = accounts.stream()
                .map(account -> account.getNumber())
                .collect(Collectors.toList());
        System.out.println(accountNumbersByAllAccounts);

        System.out.println(printAccountsNumber(accounts));

        //5. returneaza suma soldurilor  tuturor conturilor din lista de conturi

        Optional<Integer> sumOfBalance = accounts.stream()
                .map(account -> account.getBalance())
                .reduce((sum, balance) -> sum + balance);
        System.out.println(sumOfBalance.orElse(0));
        //sau varianta asta
        Integer sum = accounts.stream()
                .collect(Collectors.summingInt(a -> a.getBalance()));
        System.out.println(sum);

        System.out.println(getSumBalanceByAllAccounts(accounts));

        //TODO 6.returneaza o lista cu soldurile conturilor din lista de conturi
        List<Integer> balanceAccounts = accounts.stream()
                .map(account -> account.getBalance())
                .collect(Collectors.toList());
        System.out.println(balanceAccounts);
        System.out.println(getAccountsBalance(accounts));

    }

    //1
    public static List<String> printNamesOfEmployees(List<Employee> employeeList) {
        List<String> employeeNames = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            employeeNames.add(employeeList.get(i).getName());
        }
        return employeeNames;
    }

    //2
    public static Set<String> printCountriesFromAllEmployees(List<Employee> employeeList) {
        Set<String> foundedCountries = new HashSet<>();
        for (int i = 0; i < employeeList.size(); i++) {
            foundedCountries.add(employeeList.get(i).getCountry());
        }
        return foundedCountries;
    }

    //3
    public static Map<String,String> printNameEmployeeAndCountry(List<Employee> employeeList) {
        Map<String, String> foundedCountry = new HashMap<>();
        for (Employee e : employeeList) {
            foundedCountry.put(e.getName(), e.getCountry());
        }
        return foundedCountry;
    }

    //4
    public static List<String> printAccountsNumber(List<Account> accountList) {
        List<String> accountNumbers = new ArrayList<>();
        for (int i = 0; i < accountList.size(); i++) {
            accountNumbers.add(accountList.get(i).getNumber());
        }
        return accountNumbers;
    }
    //5
    public static int getSumBalanceByAllAccounts(List<Account> accountList){
        int sum = 0;
        for (int i = 0; i < accountList.size(); i++) {
            sum += accountList.get(i).getBalance();
        }
        return sum;
    }
    //6
    public static List<Integer> getAccountsBalance(List<Account> accountList){
        List<Integer> balancesAccounts = new ArrayList<>();
        for (int i = 0; i < accountList.size(); i++) {
            balancesAccounts.add(accountList.get(i).getBalance());
        }
        return balancesAccounts;
    }
}


