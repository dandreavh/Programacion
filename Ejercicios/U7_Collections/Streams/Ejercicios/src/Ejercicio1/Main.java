package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int number = 0;

        for (int i = 0; i < 10; i++) {
            number = (int) (Math.random()*100);
            numbers.add(number);
        }

        System.out.println(numbers);

        int primos = (int) numbers.stream().
                                 filter(num -> {
                                     for (int i = 2; i < num; i++) {
                                         if(num%i==0){
                                             return false;
                                         }
                                     }
                                     return true;
                                 }).
                                 count();

        System.out.println();
    }
}
