
package bingo;

public class Tablero {
    Partida partida;
    
    Tablero(Partida partida){
        this.partida = partida;
        }
        
    void pintar (){
        for (int a = 0; a<9; a++){
            for (int b = 1; b<=10 ; b++){
                if (partida.existe((a*10) + b)) {
                    System.out.print((a*10) + b);
                } else {
                    System.out.print("-");
                }
                    
                System.out.print("\t"); 
            } 
        
        System.out.println ();
        
        }
    

    }
}
