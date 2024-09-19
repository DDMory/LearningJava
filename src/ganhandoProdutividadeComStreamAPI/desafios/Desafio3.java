package src.ganhandoProdutividadeComStreamAPI.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3,-22, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,-3,-1,-33);

        numeros.stream().filter(n-> n >=0 ).forEach(System.out::println);
    }
}
