public class questao14 {
    
    public static void main (String [ ] args){
        CPilha p = new CPilha ( );

        p.empilha(1);
        p.empilha(2);
        p.empilha(3);
        p.empilha(4);
        p.empilha(5);
        p.mostra( );
        p.inverte( );
        System.out.println( );
        p.mostra( );                               
    }
}