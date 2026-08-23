package practicasPOO;


import java.sql.SQLOutput;

public class usoCoche {
    public static void main (String[]args){
       coche ranul=new coche();
        System.out.print(ranul.damedatosgenerales());
        System.out.println();
        ranul.establececolor("rojo");
        System.out.println(ranul.dimecolor());
        ranul.setAsientoscuero("no");
        System.out.println(ranul.dimeasintos());
    }

}
