import java.util.*;

public class RemovePosLista {

    public static Scanner in = new Scanner (System.in);
	
    public static void main (String [ ] args){
        CListaDup lista = new CListaDup ( );

        for (int i = 0; i < 10; i++){
            lista.insereFim(i);
        }//end for

        System.out.println("Lista: ");
        lista.imprime( );
        System.out.println("Lista removida: ");
        lista.RemovePos(4);
        lista.imprime( );
    }//end main ( ) 



/*
    public static void main (String [ ] args){
        CLista lista = new CLista( );

        for (int i = 0; i < 10; i++){
            lista.insereFim(i);
        }//end for

        System.out.println("Lista: ");
        lista.imprime( );
        System.out.println("Lista removida: ");
        lista.RemovePos(3);
        lista.imprime( );
    }//end main ( ) */
}//end class
