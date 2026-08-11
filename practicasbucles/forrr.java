import javax.swing.*;

public class forrr {
}
public static void main (String[] args){
    boolean arroba= false;
    String email= JOptionPane.showInputDialog("introduce mail");
    for (int i=0; i<email.length();i++){
        if (email.charAt(i)== '@'){
             arroba=true;
        }
    }
    if (arroba==true){
        System.out.println("es correcto");
    } else if (arroba==false) {
        System.out.println("incorrecto");
    }

    //recorrer cadenas de textos.
}
