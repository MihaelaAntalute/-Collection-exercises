package sesiunea17ExVacanta.Transaction2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainTransactions {
    public static void main(String[] args) {
        Transaction transaction = new Transaction("23",State.CANCELED,300);
        Transaction transaction2 = new Transaction("13",State.PROCESSING,700);
        Transaction transaction3= new Transaction("33",State.FINISHED,90);
        Transaction transaction4 = new Transaction("43",State.PROCESSING,400);
        Transaction transaction5 = new Transaction("63",State.FINISHED,200);
        Transaction transaction6 = new Transaction("73",State.CANCELED,900);
        Transaction transaction7 = new Transaction("03",State.PROCESSING,100);
        Transaction transaction8 = new Transaction("65",State.FINISHED,50);
        List<Transaction>transactions1 = new ArrayList<>();
        transactions1.add(transaction);
        transactions1.add(transaction2);
        List<Transaction>transactions2 = new ArrayList<>();
        transactions2.add(transaction3);
        transactions2.add(transaction4);
        List<Transaction>transactions3 = new ArrayList<>();
        transactions3.add(transaction5);
        transactions3.add(transaction6);
        List<Transaction>transactions4 = new ArrayList<>();
        transactions4.add(transaction7);
        transactions4.add(transaction8);
        Account account1 = new Account(200,"RO13RNCB111",transactions1);
        Account account2 = new Account(350,"RO13RNCB222",transactions2);
        Account account3 = new Account(0,"RO13RNCB333",transactions3);
        Account account4 = new Account(-50,"RO13RNCB444",transactions4);
        List<Account> accountsList = new ArrayList<>();
        accountsList.add(account1);
        accountsList.add(account2);
        accountsList.add(account3);
        accountsList.add(account4);
        System.out.println(accountsList);
        System.out.println(getSumOfTransactionsWithStateCanceled(accountsList));
        System.out.println(getSumOfTransaction(accountsList));
    }

//Todo dak e ok
    //Ce face metoda:Calculeaza suma tranzactiilor cu starea cancelled,adica cu balance mai mare decat 0
    //ce intra: lista de accounturi,iese suma
    //1.parcurgem lista de accounturi
    //2.comparam daca balance e mai mare decat 0
    //3.facem suma si o returnam
    public static Integer getSumOfTransactionsWithStateCanceled(List<Account>accountList) {
     return  accountList.stream()
                .filter(account -> account.getBalance() > 0)
                .flatMap(account ->account.getTransactionList().stream())
                .filter(transaction -> transaction.getState() == State.CANCELED)
                //.map(transaction -> transaction.getAmount())
               // .reduce((sum,amount)->sum + amount); //?
              .collect(Collectors.summingInt(transaction ->transaction.getAmount()));
    }

    //Avand intr-un main o lista de conturi, care au fiecare lista lor de tranzactii, scrie o metoda care sa
    // returneze suma tranzactiilor cu starea CANCELED din conturile care au soldul mai mare decat 0.
    //(HINT: stream pe lista de conturi si filter pentru a filtra conturile cu balanta mai mare decat 0,
    // apoi flatMap pentru a ajunge la tranzactiile conturilor si filter pentru a filtra tranzactiile CANCELED)
    //
    //Rezolva apoi problema si fara expresii lambda.
    public static Integer getSumOfTransaction(List<Account>accountList){
        int sum = 0;
        for(Account account : accountList){
            if (account.getBalance() > 0) {
                for (Transaction transaction : account.getTransactionList()) {
                    if (transaction.getState() == State.CANCELED) {
                        sum += transaction.getAmount();
                    }
                }
            }
        }
        return sum;
    }
}
