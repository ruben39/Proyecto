package bingo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bingo {
    
   int imprimirMenu(){
       Scanner scanner = new Scanner(System.in);
       
       System.out.println(" Bienvenido a Bingo 1.0 ");
       System.out.println(" Que deseas hacer? ");
       System.out.println(" ------------------ ");
       System.out.println(" 1. Jugar nueva partida ");
       System.out.println(" 2. Salir ");
       System.out.println(" Opcion: ");
       
       int opcion = scanner.nextInt();
       if (opcion==1){
         return 1;  
       }
        return 2;
    }
    
    void iniciarPartida(){
        
        Scanner scanner = new Scanner(System.in);
        Partida partida = new Partida();
        Tablero tablero = new Tablero(partida);
        
        
        while(true){
            int numero = partida.siguiente();
            System.out.println("Numero" + numero);
            tablero.pintar();
            
            System.out.println(" Pulse (c) para finalizar, " + "cualquier otra tecla para continuar ");
        
            String command = scanner.nextLine();
            
            if( command.equals("c")){
                salir();
            }
        }
        
    }
    
 
    void salir(){
        System.exit(0);
    
    }
    

    public static void main(String[] args) {
        Bingo bingo = new Bingo();
        
        int opcion = bingo.imprimirMenu();
        
        if (opcion==1){
        bingo.iniciarPartida();
        }else{
            if(opcion==2){
                bingo.salir();
            }
        }
        

    }

}


