package examples;

import io.reactivex.Observable;

public class FlatMap {
    public static void main(String[] args) {
        Observable.just(1, 2, 3)
                .flatMap(item -> Observable.just(item * 10, item * 20)) //Transforma cada item emitido por el **observable** en un nuevo **observable**
                .subscribe(System.out::println);
    }
}
