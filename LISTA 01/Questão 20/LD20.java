import java.util.*;

public class LD20{

    public static Scanner in = new Scanner (System.in);

    public static void main (String [ ] args){
        CListaDup LD = new CListaDup ( );
        int      k  = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite um dado para esta lista dupla: ");
            k = in.nextInt ( );
            LD.insereComeco(k);
        }//end for 

        LD.imprime( );
        LD.limpar ( );
        LD.imprime( );
    }//end main ( )

}//end LD20