package practicasPOO;


import javax.swing.*;
import java.sql.SQLOutput;

public class usoCoche {
    public static void main (String[]args){
       coche ranul=new coche();
        System.out.print(ranul.damedatosgenerales());
        System.out.println();
        ranul.establececolor(JOptionPane.showInputDialog("dime color de coche"));
        System.out.println(ranul.dimecolor());
        ranul.setAsientoscuero(JOptionPane.showInputDialog("tiene asientos cuero o no "));
        System.out.println(ranul.dimeasintos());

        ranul.setAclimatizador(JOptionPane.showInputDialog("tiene aire  o no"));
        System.out.println(ranul.dimeacimatizador());
        System.out.println(ranul.dimePesoCoche());
        System.out.println("el prcio final es+"+ranul.precioCoche());

    }

}
