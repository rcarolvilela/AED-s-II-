/*
	Remove item desejado em uma determinada da posicao da Lista
*/

      public void RemovePos (int i){
            CCelula c     = new CCelula ( );
            int item      = i;
            boolean found = false;
            int aux       = 0; 
            while (!found){
                  if (this.primeira != this.ultima && i < qtde){
                  if (aux == i){
                        this.removeIndice(item);
                        found = true;
                  }//end if
                  else{
                        // this.primeira = primeira.prox;
                        aux ++;
                      }//end else
                  }//end else
            }//end while  
      }//end RemovePos( )
