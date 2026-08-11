import javax.swing.*;

public class segundodo {
    public static void  main (String [] args ){
        String genero="";

        do {
            genero= JOptionPane.showInputDialog("introduce tu genero");


        }while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false );
        int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce en cm"));

        int pesoideal=0;
        if (genero.equalsIgnoreCase("h")){
            pesoideal=altura-110;

        } else if (genero.equalsIgnoreCase("m")) {
           pesoideal=altura-120;
        }
        System.out.println(pesoideal);
    }
}
