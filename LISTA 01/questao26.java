public class questao26 {
    public static void main (String [ ] args){
        CPilha p = new CPilha( );

        p.empilha(1);
        p.empilha(2);
        p.empilha(3);
        p.empilha(4);
        p.empilha(5);
        p.mostra( );
        
        CPilha p2 = new CPilha(p);
        System.out.println ("");
        p2.empilha(6);
        p2.empilha(7);
        p2.empilha(8);
        p2.mostra( );

        System.out.println ("");
        p.mostra( );
    }
}