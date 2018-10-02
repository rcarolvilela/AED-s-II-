import java.util.*;

public class Fila20{

    public static Scanner in = new Scanner (System.in);

    public static void main (String [ ] args){
        CFila f = new CFila( );
        int   k = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um dado para colocar na fila: ");
            k = in.nextInt( );
            f.enfileira(k);
        }
        f.mostra( );
        f.limpar( );
        f.mostra( );
    }
}