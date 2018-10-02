import java.util.*;

public class Lista20{

    public static Scanner in = new Scanner (System.in);

    public static void main (String [ ] args){
        CLista l = new CLista( );
        int    k = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite um dado para colocar na lista: ");
            k = in.nextInt( );
            l.insereFim(k);
        }

        l.imprime( );
        l.limpar ( );
        l.imprime( );
    }

}