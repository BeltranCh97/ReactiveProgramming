package creations;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Se define una lista para transacciones realizadas desde corresponsales
        List<Transaction> correspondentTransactions= Arrays.asList(
                new Transaction(123, "debit", 200000),
                new Transaction(1234, "debit", 250000),
                new Transaction(1235, "debit", 55500),
                new Transaction(1236, "credit", 230000)
        );

        //Se define una lista para transacciones realizadas desde el portal transaccional
        List<Transaction> portalTransactions= Arrays.asList(
                new Transaction(124, "debit", 200000),
                new Transaction(1244, "debit", 250000),
                new Transaction(1245, "debit", 55500),
                new Transaction(1246, "credit", 230000)
        );


        //Se crea un observable a partir de la lista correspondentTransactions que calculara los debitos realizados en corresponsales
        Observable.fromIterable(correspondentTransactions)
                .filter(transaction -> "debit".equals(transaction.getTransactionType()))
                .map(transaction -> transaction.getAmmount())
                .reduce(Double::sum)
                .subscribe(System.out::println);

        //Se crea un observable a partir de la lista portalTransactions que calculara los debitos realizados desde el protal transaccional
        Observable.fromIterable(portalTransactions)
                .filter(transaction -> "debit".equals(transaction.getTransactionType()))
                .map(transaction -> transaction.getAmmount())
                .reduce(Double::sum)
                .subscribe(System.out::println);

    }
}
