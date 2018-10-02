import java.util.*;

public class Pilha(20){

    public static Scanner in = new Scanner (System.in);

    public static void main (String [ ] args){
        CPilha p = new CPilha( );
        int    k = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Entre com um dado para pilha: ");
            k = in.nextInt( );
            p.empilha(k);
        }
        p.mostra( );
        p.limpar( );
        p.mostra( );
    }
}
