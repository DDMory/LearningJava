package dio.springBoot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public int soma(int n1, int n2){
        return n1 + n2;
    }
}
