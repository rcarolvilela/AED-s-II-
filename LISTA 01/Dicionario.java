import java.util.*;

public class Dicionario extends CCelulaDicionario {

    public static Scanner in = new Scanner (System.in);

    public static void main (String [ ] args){
        CDicionario dic = new CDicionario ( );
        int quantidade  = 0;
        String url  = "";
        String ip   = "";
        String dado = "";
        
	url = "www.google.com";
	ip  = "74.125.234.81";
	dic.add(url,ip);
	url = "www.pucminas.br";
	ip  = "200.229.32.27";
	dic.add(url,ip);
	url = "www.youtube.com";
	ip  = "216.58.194.206";
	dic.add(url,ip);
	url = "www.capes.gov.br";
	ip  = "200.130.18.222";
	dic.add(url,ip);
	url = "www.yahoo.com";
	ip  = "98.138.219.232";
	dic.add(url,ip);
	url = "www.microsoft.com";
	ip  = "104.81.49.171";
	dic.add(url,ip);
	url = "www.twitter.com";
	ip  = "104.244.42.65";
	dic.add(url,ip);
	url = "www.brasil.gov.br";
	ip  = "170.246.252.243";
	dic.add(url,ip);
	url = "www.wikipedia.com";
	ip  = "198.35.26.96";
	dic.add(url,ip);
	url = "www.amazon.com";
	ip  = "216.137.36.124";
	dic.add(url,ip);
	url = "research.microsoft.com";
	ip  = "13.67.218.189";
	dic.add(url,ip);
	url = "www.facebook.com";
	ip  = "157.240.22.39";
	dic.add(url,ip);
	url = "www.whitehouse.gov";
	ip  = "104.91.190.179";
	dic.add(url,ip);
	url = "www.answers.com";
	ip  = "151.101.40.203";
	dic.add(url,ip);
	url = "www.uol.com.br";
	ip  = "54.230.147.3";
	dic.add(url,ip);
	url = "www.hotmail.com";
	ip  = "204.79.197.212";
	dic.add(url,ip);
	url = "www.cplusplus.com";
	ip  = "167.114.170.15";
	dic.add(url,ip);
	url = "www.nyt.com";
	ip  = "151.101.41.164";
	dic.add(url,ip);
	url = "www.apple.com";
	ip  = "172.230.107.90";
	dic.add(url,ip);
	url = "www.dropbox.com";
	ip  = "162.125.4.1";
	dic.add(url,ip);
	url = "www.submarino.com.br";
	ip  = "23.53.253.85";
	dic.add(url,ip);
	url = "www.americanas.com";
	ip  = "23.53.253.85";
	dic.add(url,ip);
	url = "www.casasbahia.com.br";
	ip  = "104.80.206.167";
	dic.add(url,ip);
	url = "www.pontofrio.com.br";
	ip  = "104.92.127.204";
	dic.add(url,ip);


        System.out.println ("Deseja o IP de qual site?: ");
        dado = in.next( );
        System.out.println ( "O IP do site '"+dado+"' é: " +dic.recebaValor(dado));
    }

}
