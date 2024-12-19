package examples;

import io.reactivex.Observable;

public class Map {
    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5)
                .map(item -> item * 2) //Permite transformar los elementos adjuntos mediante una función
                .subscribe(System.out::println);
    }
}
