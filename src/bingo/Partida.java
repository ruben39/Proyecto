package bingo;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    List<Integer> numeros = new ArrayList<Integer>();
    
    int randomNumber() {
        return (int) (Math.random()*90 + 1);
    }
    
    boolean existe(int numero) {
        for (Integer n : numeros) {
           if (numero == n) {
               return true;
           }
        }
        return false;
    }
    
    int siguiente() {
        boolean numeroExiste = true;
        int numero = 0;
        
        while (numeroExiste) {
            numero = randomNumber();                
            numeroExiste = existe(numero);
        }
        
        numeros.add(numero);
        return numero;
    }
}
