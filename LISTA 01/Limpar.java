/* 
	Metodo responsavel por limpar uma PILHA 
*/
	public void limpar( ){
            Object item = null;
            while(topo != null && this.qtde != 0){
                  item = this.desempilha( );
            }//end while
            if(this.vazia( )){
                  System.out.println("Nao ha' elementos nesta pilha.");
            }//end if
        }//end limparPilha( )

/*
	Metodo responsavel por limpar uma FILA 
*/
	public void limpar ( ){
            Object item = null;
            while(this.frente != this.tras && this.qtde != 0){
                  item = this.desenfileira( );
            }//end while 
            if(this.vazia( )){
                  System.out.println("Nao ha' elementos nesta fila.");
            }//end if ;
        }//end limpar ( )

/*
	Metodo responsavel por limpar uma LISTA	
*/

        public void limpar( ){
     	    Object item = null;
            while (this.primeira != this.ultima && this.qtde != 0){
                   item = this.removeRetornaFim( );
            }//end while 
            if(this.vazia( )){
                  System.out.println("A lista esta' vazia");
            }//end if
        }//end Limpar ( )

/*
	Metodo responsavel por limpar uma LISTA DUPLA
*/

        public void limpar ( ){
            Object item = null;
            while(this.primeira != this.ultima && this.qtde != 0){
                  item = this.removeRetornaFim( );
            }//end while
            if(this.vazia( )){
                  System.out.println("Nao ha' elementos nesta fila dupla.");
            }//end if
      }//end limpar ( )
