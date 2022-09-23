package sesiunea17ExVacanta;

import java.util.*;
import java.util.stream.Collectors;

public class temeMain {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 5, 4, 7, 9, 6, 8);

        // Ex1 ok tot
        System.out.println(getSumOfEvenNumbers(numbers));
        System.out.println("Ex 1:Java8 & Lambda: " + getSumOfEvenNumbersLambda(numbers));

        // Ex2 ok tot
        System.out.println(getSumOfNumbersDividedBy(2, 3, numbers));
        System.out.println("Ex 2:Java8 & Lambda: " + getSumOfNumbersDividedBy1(2, 3, numbers));

        //Ex 3 nu merge cu lambda
        List<Integer> negativeNumbers = List.of(-1, 2, -3, 4, -5);
        System.out.println(getPositiveNumbersFromList(negativeNumbers));
        System.out.println("Ex 3:Java8 & Lambda " + getPositiveNumbers(negativeNumbers));

        //EX 4 ok tot
        PersonClass person = new PersonClass("Andreea", 13);
        PersonClass person1 = new PersonClass("Alin", 20);
        PersonClass person2 = new PersonClass("Livia", 45);
        PersonClass person3 = new PersonClass("Cosmin", 33);
        PersonClass person4 = new PersonClass("Roberta", 16);
        List<PersonClass> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        //System.out.println(personList);
        System.out.println(isPersonEligibleForVoting(personList));
        System.out.println("Ex 4:Lambda: " + getPersonEligibleForVoting(personList));

        //Ex 5 Spell Checker2 nu merge cu lambda
        String word = "acesta etse nu text";
        List<String> badWords = new ArrayList<>();
        badWords.add("etse");
        badWords.add("nu");
        badWords.add("acetsa");
        badWords.add("extt");
        System.out.println(getWordsFromText(word, badWords));
        System.out.println(" Ex 5:Java 8 & Lambda " + findWordsFromText(word, badWords));

        //Ex 6 Account nu merge cu for
        Account account = new Account(2400, "RO24RNBR342513");
        Account account1 = new Account(3000, "RO24BCRN983861");
        Account account2 = new Account(900, "RO24BNRC564787");
        Account account3 = new Account(1400, "RO24BCRU345436");
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        //System.out.println(accounts);
        Transaction transaction = new Transaction("Credit Card", 200, account);
        Transaction transaction1 = new Transaction("Debit Card", 600, account1);
        Transaction transaction2 = new Transaction("Credit Card", 700, account2);
        Transaction transaction3 = new Transaction("Debit Card", 150, account3);
        Transaction transaction4 = new Transaction("Credit Card", 500, account3);
        Transaction transaction5 = new Transaction("Credit Card", 300, account1);
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(transaction);
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        transactions.add(transaction4);
        transactions.add(transaction5);
        System.out.println("Ex 6:Java8 & Lambda " + getSumOfTransactionsByAccountNumber(transactions));//ok
        System.out.println(getSumOfTransactionsByAccount(transactions)); //nu ok

        //Ex 7 Departments nu parcurge listele de angajati
        Employee employee = new Employee("Maria", 2100);
        Employee employee1 = new Employee("Nicoleta", 1900);
        Employee employee2 = new Employee("Mircea", 2500);
        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        Employee employee3 = new Employee("Marian", 3400);
        Employee employee4 = new Employee("Clara", 2900);
        Employee employee5 = new Employee("Bogdan", 3200);
        List<Employee> list2 = new ArrayList<>();
        list2.add(employee3);
        list2.add(employee4);
        list2.add(employee5);
        Department department = new Department("Tehnologie", "TEH34", list);
        Department department1 = new Department("Electronica", "ECT50", list2);
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department);
        departmentList.add(department1);
        System.out.println(departmentList);
        System.out.println("Ex7:" + getEmployeesNumberWithBiggestSalaryBy(2500, departmentList));
        System.out.println(getEmployeesNumberWithBiggestSalaryThan(3000,departmentList));

    }
    //1. Suma numerelor pare
    //Calculeaza suma numerelor pare dintr-o lista de Integer-uri.
    //(HINT: filter si sum sau reduce)
    //
    //Rezolva problema si fara expresii lambda.

    public static int getSumOfEvenNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }
        return sum;
    }

    public static Integer getSumOfEvenNumbersLambda(List<Integer> numbers) {
        Optional<Integer> sumOfEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .reduce((sum, number) -> sum + number);
        return sumOfEvenNumbers.orElse(0);
    }


    //2. Suma numerelor divizibile cu x sau cu y
    //Scrie o metoda care sa calculeze suma numerelor divizibile cu x sau y (unde x si y sunt primiti ca parametri), dintr-o lista de Integer-uri.
    //(HINT: filter si sum sau reduce)
    //
    //Rezolva problema si fara expresii lambda.

    public static int getSumOfNumbersDividedBy(int x, int y, List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % x == 0 && numbers.get(i) % y == 0) {
                sum += numbers.get(i);
            }
        }
        return sum;
    }

    public static Integer getSumOfNumbersDividedBy1(int x, int y, List<Integer> numbers) {
        Optional<Integer> sumOfNumbersDividedBy = numbers.stream()
                .filter(number -> number % x == 0 && number % y == 0)
                .reduce((sum, number) -> sum + number);
        return sumOfNumbersDividedBy.orElse(0);
    }


    //3. Sorteaza numerele dintr-un array
    //Scrie o metoda care sa sorteze numerele dintr-o lista de Integer-uri, dar inainte de asta sa le transforme in valori pozitive
    //Ex: Input: [-1,2,-3,4,-5]
    //      Output:[1,2,3,4,5]
    //(HINT: map pentru a transforma fiecare numar din negativ in pozitiv, apoi sorted() ca si operatie finala.
    // Foloseste Math.abs() pentru a transforma un numar din negativ in pozitiv)
    //
    //Rezolva problema si fara expresii lambda
    public static List<Integer> getPositiveNumbersFromList(List<Integer> numbers) {
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            positiveNumbers.add(Math.abs(numbers.get(i)));
        }
        return positiveNumbers;
    }

    //TODO lambda ex nu e ok
    public static List<Integer> getPositiveNumbers(List<Integer> numbers) {
        List<Integer> positiveNumbers = numbers.stream()
                .sorted().toList();
        return positiveNumbers;
    }


    //4. Filtreaza persoanele care pot vota
    //O persoana este caracterizata de nume si varsta.
    //Scrie o metoda statica numita isPersonEligibleForVoting(), care accepta ca parametru o lista de persoane
    // si returneaza o lista cu persoanele care pot vota.
    //
    //Scrie apoi metoda si fara expresii lambda

    public static List<PersonClass> isPersonEligibleForVoting(List<PersonClass> personList) {
        List<PersonClass> personListEligibleForVoting = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getAge() > 18) {
                personListEligibleForVoting.add(personList.get(i));
            }
        }
        return personListEligibleForVoting;
    }

    public static List<PersonClass> getPersonEligibleForVoting(List<PersonClass> personList) {
        return personList.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());
    }


    //5. Spell checker 2
    //Avand intr-un main un String, in care se stocheaza un text si o lista de cuvinte gresite,
    // scrie o functie care accepta acesti 2 parametrii si returneaza lista cu cuvintele gresite
    // care se regasesc in text
    //Ex: Input: String text = “acesta etse nu text”
    //                List<String> badWords = [“etse”, “nu”, “acetsa”, “extt”]
    //Output: [“etse”, “nu”], pentru ca acestea sunt cuvintele din badWords care se regasesc in text
    //(HINT: stream pe lista badWords, apoi filtram doar cuvintele care sunt continute in text
    // (folosind metoda contains()) )
    //
    //Rezolva problema si fara expresii lambda
    public static List<String> getWordsFromText(String text, List<String> badWords) {
        List<String> foundedWords = new ArrayList<>();
        for (int i = 0; i < badWords.size(); i++) {
            if (text.contains(badWords.get(i))) {
                foundedWords.add(badWords.get(i));
            }
        }
        return foundedWords;
    }

    public static List<String> findWordsFromText(String text, List<String> badWords) {
        return badWords.stream()
                .filter(word -> text.contains(word))
                .collect(Collectors.toList());
    }


    //6. Gestiunea tranzactiilor
    //O tranzactie este caracterizata de id, amount si de contul din care s-a facut tranzactia
    //(HINT: atribute: id, sum, account - care este de tip Account)
    //Un cont este caracterizat de balance (sold) si un account number (numar de cont)
    //(HINT - aceasta este clasa Account).
    //
    //Avand o lista de tranzactii intr-un main, scrie o metoda care primeste aceasta lista de tranzactii
    // si genereaza o mapa in care cheia sa fie numarul de cont,
    // iar valoarea sa fie suma amount-urilor tututor tranzactiilor care au avut loc din acel cont.
    //(HINT) - Collectors.summingLong.
    //
    //Rezolva apoi problema si fara expresii lambda.


    //
    public static Map<String, Integer> getSumOfTransactionsByAccount(List<Transaction> transactions) {
        Map<String, Integer> sumOfTransactionByAccountNumber = new HashMap<>();
        for (Transaction transaction : transactions) {
            String key = transaction.getAccount().getAccountNumber();
            if (!sumOfTransactionByAccountNumber.containsKey(key)) {
                sumOfTransactionByAccountNumber.put(key, transaction.getAmount());
            } else {
                sumOfTransactionByAccountNumber.put(key, sumOfTransactionByAccountNumber.get(key) + transaction.getAmount());
            }
        }
        return sumOfTransactionByAccountNumber;
    }

    //ok
    public static Map<String, Long> getSumOfTransactionsByAccountNumber(List<Transaction> transactions) {
        Map<String, Long> sumOfTransactionByAccountNumber = transactions.stream()
                .collect(Collectors.groupingBy(transaction -> transaction.getAccount().getAccountNumber(), Collectors.summingLong(transaction -> transaction.getAmount())));
        return sumOfTransactionByAccountNumber;
    }

    //7. Gestiunea angajatilor
    //Un angajat este caracterizat de nume si salariu
    //Un departament este caracterizat de nume, cod, si o lista de angajati. Codul este un String
    //
    //Avand o lista de departamente intr-un main, care are fiecare o lista de angajati,
    // scrie o metoda care primeste lista de departamente si un salariu minim.
    //
    //Metoda va returna cati angajati din toate departamentele au salariul mai mare
    // decat salariul minim primit ca parametru.
    //
    //(HINT: stream pe departamente si apoi flatMap pentru a ajunge la angajati,
    // apoi filter pentru a filtra pe cei cu salariul mai mare decat salariul minim si count la final pentru a-i numara)
    //
    //Rezolva problema si fara expresii lambda

    public static int getEmployeesNumberWithBiggestSalaryBy(int minimSalary, List<Department> departmentsList) {
        int employeesNumber = 0;
//        for (int i = 0; i < departmentsList.size(); i++) {
//            List<Employee> currentDepartmentEmployees = departmentsList.get(i).getEmployees();
//            for (int j = 0; j < currentDepartmentEmployees.size(); j++) {
//                if (minimSalary < currentDepartmentEmployees.get(j).getSalary()) {
//                    employeesNumber++;
//                }
//            }
//        }
//        return employeesNumber;

        for (Department department : departmentsList) {
            for (Employee employee : department.getEmployees()) {
                if (minimSalary < employee.getSalary()) {
                    employeesNumber++;
                }
            }
        }
        return employeesNumber;
    }

    //TODO de facut suma cu lambda
    public static double getEmployeesNumberWithBiggestSalaryThan(int minimSalary, List<Department> departmentsList) {

        return departmentsList.stream()
                .flatMap(department -> department.getEmployees().stream())
                .filter(employee -> employee.getSalary() > minimSalary)
                .count();
    }

}
