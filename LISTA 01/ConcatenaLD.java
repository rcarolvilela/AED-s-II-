import java.util.*;

public class ConcatenaLD{

	public static Scanner in = new Scanner (System.in);

	public static CListaDup concatena (CListaDup c1, CListaDup c2){
		//definir dados 
		CListaDup concatenada = new CListaDup( );
		int conc    = 0;
		int Clista1 = c1.quantidade( );
		int Clista2 = c2.quantidade( );
		int amount  = Clista1 + Clista2;
		
		while (conc != amount){
			//verificar se ainda tem item na primeira lista 
			if (! c1.vazia( )){
				concatenada.insereFim(c1.removeRetornaComeco( ));
				conc ++;
			} else {
				if (! c2.vazia( )){
				//verificar se ainda tem item na segunda lista
				concatenada.insereFim(c2.removeRetornaComeco( ));
				conc ++;
				}//end if
			}//end else
		}//end while 
	    return concatenada;
	}//end concatena( )

	public static void main (String [ ] args){
		CListaDup c1          = new CListaDup ( );
		CListaDup c2          = new CListaDup ( );
		CListaDup concatenada = new CListaDup ( );
		CListaDup aux1, aux2;
		int quantidade = 0;
		int dado       = 0;

		System.out.println ("Quantos dados sao desejados para o primeira lista?: ");
		quantidade = in.nextInt( );

		for (int i = 0; i < quantidade; i++){
			System.out.println ("Digite o dado para inserir na primeira lista: ");
			dado = in.nextInt ( );
			c1.insereFim(dado);
		}//end for

		aux1 = c1;
		
		System.out.println ("Quantos dados sao desejados para a segunda lista?: ");
		quantidade = in.nextInt( );
		
		for (int i = 0; i < quantidade; i++){
			System.out.println ("Digite o dado para inserir na segunda lista: ");
			dado = in.nextInt( );
			c2.insereFim(dado);
		}//end

		aux2 = c2;

		System.out.println("C1:");		
		aux1.imprimeFor( );
		System.out.println("C2:");
		aux2.imprimeFor( );
		concatenada = concatena(aux1,aux2);
		System.out.println("Concatenada: ");		
		concatenada.imprime( );		
	}//end main ( )

}//end class
