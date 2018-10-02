import java.util.*;

public class Nucleotideos extends CCelulaDicionario{
    
    public static Scanner in = new Scanner (System.in);

    public static void main (String [ ]args){
        CDicionario dic = new CDicionario ( );
        String trinca     = "";
        String aminoacido = "";
        String dado       = "";
        String max 	  = "";

        //montar tabela 
        //Fenilalanina
        trinca     = "UUU";
        aminoacido = "Fenilalanina";
        dic.add(trinca,aminoacido);
        trinca     = "UUC";
        aminoacido = "Fenilalanina";
        dic.add(trinca,aminoacido);
        //Leucina
        trinca     = "UUA";
        aminoacido = "Leucina";
        dic.add(trinca,aminoacido);
        trinca     = "UUG";
        aminoacido = "Leucina";
        dic.add(trinca,aminoacido);
        trinca     = "CUU";
        aminoacido = "Leucina";
        dic.add(trinca,aminoacido);
        trinca     = "CUC";
        aminoacido = "Leucina";
        dic.add(trinca,aminoacido);
        trinca     = "CUA";
        aminoacido = "Leucina";
        dic.add(trinca,aminoacido);
        trinca     = "CUG";
        aminoacido = "Leucina";
        dic.add(trinca,aminoacido);
        //Isoleucina
        trinca     = "AUU";
        aminoacido = "Isoleucina";
        dic.add(trinca,aminoacido);
        trinca     = "AUC";
        aminoacido = "Isoleucina";
        dic.add(trinca,aminoacido);
        trinca     = "AUA";
        aminoacido = "Isoleucina";
        dic.add(trinca,aminoacido);
        //Metionina
        trinca     = "AUG";
        aminoacido = "Valina";
        dic.add(trinca,aminoacido);
        //Valina
        trinca     = "GUU";
        aminoacido = "Valina";
        dic.add(trinca,aminoacido);
        trinca     = "GUC";
        aminoacido = "Valina";
        dic.add(trinca,aminoacido);
        trinca     = "GUA";
        aminoacido = "Valina";
        dic.add(trinca,aminoacido);
        trinca     = "GUG";
        aminoacido = "Valina";
        dic.add(trinca,aminoacido);
        //Serina
        trinca     = "UCU";
        aminoacido = "Serina";
        dic.add(trinca,aminoacido);
        trinca     = "UCC";
        aminoacido = "Serina";
        dic.add(trinca,aminoacido);
        trinca     = "UCA";
        aminoacido = "Serina";
        dic.add(trinca,aminoacido);
        trinca     = "UCG";
        aminoacido = "Serina";
        dic.add(trinca,aminoacido);
        trinca     = "AGU";
        aminoacido = "Serina";
        dic.add(trinca,aminoacido);
        trinca     = "AGC";
        aminoacido = "Serina";
        dic.add(trinca,aminoacido);
        //Prolina
        trinca     = "CCU";
        aminoacido = "Prolina";
        dic.add(trinca,aminoacido);
        trinca     = "CCC";
        aminoacido = "Prolina";
        dic.add(trinca,aminoacido);
        trinca     = "CCA";
        aminoacido = "Prolina";
        dic.add(trinca,aminoacido);
        trinca     = "CCG";
        aminoacido = "Prolina";
        dic.add(trinca,aminoacido);
        //Treonina
        trinca     = "ACU";
        aminoacido = "Treonina";
        dic.add(trinca,aminoacido);
        trinca     = "ACC";
        aminoacido = "Treonina";
        dic.add(trinca,aminoacido);
        trinca     = "ACA";
        aminoacido = "Treonina";
        dic.add(trinca,aminoacido);
        trinca     = "ACG";
        aminoacido = "Treonina";
        dic.add(trinca,aminoacido);
        //Alanina
        trinca     = "GCU";
        aminoacido = "Alanina";
        dic.add(trinca,aminoacido);
        trinca     = "GCC";
        aminoacido = "Alanina";
        dic.add(trinca,aminoacido);
        trinca     = "GCA";
        aminoacido = "Alanina";
        dic.add(trinca,aminoacido);
        trinca     = "GCG";
        aminoacido = "Alanina";
        dic.add(trinca,aminoacido);
        //Tirosina
        trinca     = "UAU";
        aminoacido = "Tirosina";
        dic.add(trinca,aminoacido);
        trinca     = "UAC";
        aminoacido = "Tirosina";
        dic.add(trinca,aminoacido);
        //Histidina
        trinca     = "CAU";
        aminoacido = "Histidina";
        dic.add(trinca,aminoacido);
        trinca     = "CAC";
        aminoacido = "Histidina";
        dic.add(trinca,aminoacido);
        //Glutamina
        trinca     = "CAA";
        aminoacido = "Glutamina";
        dic.add(trinca,aminoacido);
        trinca     = "CAG";
        aminoacido = "Glutamina";
        dic.add(trinca,aminoacido);
        //Asparagina
        trinca     = "AAU";
        aminoacido = "Asparagina";
        dic.add(trinca,aminoacido);
        trinca     = "AAC";
        aminoacido = "Asparagina";
        dic.add(trinca,aminoacido);
        //Lisina
        trinca     = "AAA";
        aminoacido = "Lisina";
        dic.add(trinca,aminoacido);
        trinca     = "AAG";
        aminoacido = "Lisina";
        dic.add(trinca,aminoacido);
        //Aspartato
        trinca     = "GAU";
        aminoacido = "Aspartato";
        dic.add(trinca,aminoacido);
        trinca     = "GAC";
        aminoacido = "Aspartato";
        dic.add(trinca,aminoacido);
        //Glutamato
        trinca     = "GAA";
        aminoacido = "Glutamato";
        dic.add(trinca,aminoacido);
        trinca     = "GAG";
        aminoacido = "Glutamato";
        dic.add(trinca,aminoacido);
        //Cisteina
        trinca     = "UGU";
        aminoacido = "Cisteina";
        dic.add(trinca,aminoacido);
        trinca     = "UGC";
        aminoacido = "Cisteina";
        dic.add(trinca,aminoacido);
        //Parada
        trinca     = "UAA";
        aminoacido = "Parada";
        dic.add(trinca,aminoacido);
        trinca     = "UAG";
        aminoacido = "Parada";
        dic.add(trinca,aminoacido);
        trinca     = "UGA";
        aminoacido = "Parada";
        dic.add(trinca,aminoacido);
        //Triptofano
        trinca     = "UGG";
        aminoacido = "Triptofano";
        dic.add(trinca,aminoacido);
        //Glicina
        trinca     = "GGU";
        aminoacido = "Glicina";
        dic.add(trinca,aminoacido);
        trinca     = "GGC";
        aminoacido = "Glicina";
        dic.add(trinca,aminoacido);
        trinca     = "GGA";
        aminoacido = "Glicina";
        dic.add(trinca,aminoacido);
        trinca     = "GGG";
        aminoacido = "Glicina";
        dic.add(trinca,aminoacido);
        //Arginina
        trinca     = "CGU";
        aminoacido = "Arginina";
        dic.add(trinca,aminoacido);
        trinca     = "CGC";
        aminoacido = "Arginina";
        dic.add(trinca,aminoacido);
        trinca     = "CGA";
        aminoacido = "Arginina";
        dic.add(trinca,aminoacido);
        trinca     = "CGG";
        aminoacido = "Arginina";
        dic.add(trinca,aminoacido);
        trinca     = "AGA";
        aminoacido = "Arginina";
        dic.add(trinca,aminoacido);
        trinca     = "AGG";
        aminoacido = "Arginina";
        dic.add(trinca,aminoacido);

        System.out.println ("Digite a 'trinca' para o aminoacido desejado: ");
        dado = in.next( );
        System.out.println (""+dado.toUpperCase( )+" = "+ dic.recebaValor(dado.toUpperCase( )));

    }//end main ( )
}//end class
