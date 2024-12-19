package examples;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class CustomExample {
    public static void main(String[] args) {
        List<FromIterable> orders = Arrays.asList(
                new FromIterable("Product A", 2, 50.0),
                new FromIterable("Product B", 1, 30.0),
                new FromIterable("Product A", 1, 50.0),
                new FromIterable("Product C", 3, 20.0)
        );



        Observable.fromIterable(orders)
                .filter(order -> "Product A".equals(order.getProduct())) // Filtrar por Producto A
                .map(order -> order.getQuantity() * order.getPrice()) // Calcular el total por pedido
                .reduce(Double::sum) // Calcular el total de ventas para Producto A
                .subscribe(total -> System.out.println("Total sales for Product A: " + total));
    }
}
