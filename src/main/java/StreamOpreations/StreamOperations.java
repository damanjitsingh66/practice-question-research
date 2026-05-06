package StreamOpreations;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {


        //problem -1 get the orders where the status is completed and group it by customerid for with addition of amount sum.
        //You have list of orders like
        // Order = [[102,"New",450],[103,"Completed",450],[103,"Pending",450],[103,"Completed",450],[101,"Completed",450]]

        List<Order> orders= Arrays.asList(new Order(102,"New",450),
                                         new Order(103,"Completed",450),
                                         new Order(103,"Pending",4506),
                                         new Order(103,"Completed",4504),
                                         new Order(101,"Completed",450));

        Optional<OrderResponse> maxOrder = orders.stream()
                .filter(order -> order.getStatus().equals("Completed"))
                .collect(Collectors.groupingBy(
                        Order::getCustomerId,
                        Collectors.summingDouble(Order::getAmount)
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(entry -> new OrderResponse(
                        entry.getKey(),
                        entry.getValue()
                ));

        maxOrder.ifPresent(or ->
                System.out.println("customerId :- " + or.getCustomerId() +
                        " amount :- " + or.getAmount())
        );
    }
}
