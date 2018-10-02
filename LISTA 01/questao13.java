public class questao13 {

        public static void main (String [ ] args){
            CFila fila  = new CFila ( );
            CFila fila2 = new CFila ( );

            fila.enfileira(1);
            fila.enfileira(1);
            fila.enfileira(1);
            fila.enfileira(1);
            fila.enfileira(1);
            fila.enfileira(1);
            fila.enfileira(1); 
            fila.mostra( );
            int quantidade = fila.quantidadeOcorrencias(5);
            System.out.println ( "QO Fila: " +quantidade);
            
            fila2.enfileira(1);
            fila2.enfileira(1);
            fila2.enfileira(1);
            fila2.enfileira(1);
            fila2.enfileira(1);
            fila2.enfileira(1);
            fila2.enfileira(1); 
            fila.mostra( );
            int quantidade2 = fila2.quantidadeOcorrencias(1);
            System.out.println ( "QO Fila2: " +quantidade2);
          
            fila.enfileira(2);
            fila.enfileira(1); 
            fila.mostra( );
            int quantidade3 = fila.quantidadeOcorrencias(2);
            System.out.println ( "QO Fila3: " +quantidade3);
            
        }
}