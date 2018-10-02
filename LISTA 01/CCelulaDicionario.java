import java.util.*;

class CCelulaDicionario {

    //atributos 
    public Object key, value;
    public CCelulaDicionario prox;

    //construtora que anula os tres atributos da celula
    public CCelulaDicionario ( ){
        key = null; value = null; prox = null;
    }//end CCelulaDicionario( )

    //construtora que inicializa key e value com os argumentos passados
    //por parametro e anula a referencia a proxima celula
    public CCelulaDicionario (Object chave, Object valor){
        this.key   = chave;
        this.value = valor;
    }//end CCelulaDicionario ( )

    //construtora que inicializa todos os atributos da celula com os argumentos
    //passados por parametro 
    public CCelulaDicionario (Object chave, Object valor, CCelulaDicionario proxima){
        this.key   = chave;
        this.value = valor;
        this.prox  = proxima;
    }//end CCelulaDicionario ( ) 
}//end class

class CDicionario {
    private CCelulaDicionario first, last;

    public CDicionario ( ){
        this.first = new CCelulaDicionario ( );
        this.last  = first;
    }//end CDicionario ( )

    public boolean empty ( ){
        if (this.first == this.last){
            return true;
        } else {
            return false;
        }//end if
    }//end empty ( )

    public void add (Object chave, Object valor){
        this.last.prox = new CCelulaDicionario (chave, valor);
        this.last = last.prox;
    }//end add ( )

    public Object recebaValor (Object chave){
        boolean found = false, achou;
        Object  item  = null;
        CCelulaDicionario aux = this.first.prox;
        while (aux != null && !found){
            achou = aux.key.equals(chave);
            if (achou == true){
                found  = true;
                item   = aux.value;
            } else {
                if (aux.prox == null){
                    found = true;
                }//end if
            }//end else
            aux = aux.prox;
        }//end while
     return item;
    }//end recebaValor
}
