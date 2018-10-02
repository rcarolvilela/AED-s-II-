import java.util.*;

public class ConcatenaFila {

	public static Scanner in = new Scanner (System.in);

	public static CFila concatenaFila (CFila f1, CFila f2){
		CFila concatenada = new CFila ( );	
		int conc   = 0;
		int q1     = f1.quantidade( );
		int q2     = f2.quantidade( );		
		int amount = q1 + q2;

		while (conc != amount){
			//verificar se fila 1 esta vazia
			if (! f1.vazia( )){
				concatenada.enfileira(f1.desenfileira( ));
				conc ++;
			}else{
				//verificar se a fila 2 esta vazia
				if (! f2.vazia( )){
					concatenada.enfileira(f2.desenfileira( ));
					conc ++;
				}//end if
			}//end else
		}//end while ( )
	    return concatenada;
	}//end concatenaFila( )


	public static void main (String [ ] args){
		CFila concatenada = new CFila ( );
		CFila f1 	  = new CFila ( );
		CFila f2 	  = new CFila ( );
		CFila aux1, aux2;		
		int quantidade    = 0;
		int dado   	  = 0;
		
		System.out.println ("Digite a quantidade de dados para a primeira fila: ");
		quantidade = in.nextInt( );
		
		for (int i = 0; i < quantidade; i++){
			System.out.println ("Digite um dado para a primeira fila: ");
			dado = in.nextInt( );
			f1.enfileira(dado);		
		}//end for

		aux1 = f1;

		System.out.println ("Digite a quantidade de dados para a segunda fila: ");
		quantidade = in.nextInt( );

		for (int i = 0; i < quantidade; i++){
			System.out.println ("Digite um dado para a segunda fila: ");		
			dado = in.nextInt( );
			f2.enfileira(dado);
		}//end for

		aux2 = f2;

		System.out.println("F1:");
		aux1.mostra( );
		System.out.println("F2:");
		aux2.mostra( );	
		System.out.println("Concatenada:");
		concatenada = concatenaFila(aux1,aux2);
		concatenada.mostra( );
	}//end main ( )

}//end class
