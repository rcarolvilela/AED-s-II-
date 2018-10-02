public class questao24 {
    
    public static void main (String [ ] args){
        CLista l = new CLista ( );
        Object [ ] vetor = null;
        l.insereEspelhado(1);
        l.insereEspelhado(2);
        l.insereEspelhado(3);
        l.imprime( );
        System.out.println("");
        vetor = l.copiaParaVetor( );
        System.out.println("VETOR: ");
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++){
            System.out.print ("" +vetor[i]);
        }//end for
        System.out.print("]");
        System.out.println("");
    }

}