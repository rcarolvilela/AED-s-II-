import java.util.*;

public class ConcatenaPilha {

	public static Scanner in = new Scanner (System.in);

	public static CPilha concatenaPilha (CPilha p1, CPilha p2){
		CPilha concatenada = new CPilha( );
		int conc   = 0;		
		int q1     = p1.quantidade( );
		int q2     = p2.quantidade( );
		int amount = q1 + q2;

		while (conc != amount){
			//verificar se pilha1 esta vazia
			if (! p1.vazia( )){
				concatenada.empilha(p1.desempilha( ));
				conc ++;
			} else {
				if (! p2.vazia ( )){
					concatenada.empilha(p2.desempilha( ));
					conc ++;
				}//end if 
			}//end else
		}//end while 
 	    return concatenada;
	}//end concatenaPilha( );

	public static void main (String [ ] args){
		CPilha concatenada = new CPilha( );
		CPilha p1 	   = new CPilha( );
		CPilha p2 	   = new CPilha( );
		CPilha aux1, aux2;
		int quantidade 	   = 0;
		int dado 	   = 0;
		
		System.out.println ("Digite a quantidade de valores que serao inseridos na primeira pilha: ");
		quantidade = in.nextInt( );

		for (int i = 0; i < quantidade; i++){
			System.out.println ("Digite o dado desejado para a primeira pilha: ");
			dado = in.nextInt( );
			p1.empilha(dado);
		}//end for	
	
		aux1 = p1;

		System.out.println ("Digite a quantidade de valores que serao inseridos na segunda pilha: ");
		quantidade = in.nextInt( );

		for (int i = 0; i < quantidade; i++){
			System.out.println ("Digite o dado desejado para a segunda pilha: ");
			dado = in.nextInt( );
			p2.empilha(dado);
		}//end for	

		aux2 = p2;
		
		System.out.println("P1:");
		aux1.mostra( );
		System.out.println("P2:");
		aux2.mostra( );
		System.out.println("Concatenada:");
		concatenada = concatenaPilha(aux1,aux2);
		concatenada.mostra();
	}//end main ( )
}//end class
