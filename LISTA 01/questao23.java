public class questao23 {
    
    public static void main (String [ ] args){
         CFila fila = new CFila( );

         fila.enfileira(1);
         fila.enfileira(2);
         fila.enfileira(3);
         fila.enfileira(4);
         fila.enfileira(5);
         fila.mostra( );

        CFila fila2 = new CFila(fila);
        fila2.mostra( );
        fila.mostra ( );

    }
}