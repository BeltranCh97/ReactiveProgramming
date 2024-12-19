package examples;

import io.reactivex.Observable;

public class Filter {
    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5)
                .filter(item -> item % 2 == 0) //Filtra solo los elementos en función de una condición
                .subscribe(System.out::println);
    }
}
