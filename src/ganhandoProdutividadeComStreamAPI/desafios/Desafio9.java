package src.ganhandoProdutividadeComStreamAPI.desafios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.size() == numeros.stream().distinct().count();
        //todosDistintos = new HashSet<>(numeros).size() == numeros.size();

        //Logica 2: HashSet não permite elementos duplicados, logo seu tamanho será menor que a da
        //lista em caso de repetição de elementos.

        System.out.println("Não há repetição de numeros? " + todosDistintos);
    }
}
