package practicasbucles;

import javax.swing.*;
import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Scanner;

public class condicionaleIndeterminados {
    public void main  (String [] args){
        String clave="javier";
        String pass="";
        while (clave.equals(pass)==false){
           pass= JOptionPane.showInputDialog("introduce contrase.a");
           if (clave.equals(pass)==false){
               System.out.println("incorecta");
           } else if (clave.equals(!Boolean.parseBoolean("javier "))) {
               System.out.println("salio");
           }
            System.out.println("contraseña correcta. acceso permitidojjjjjj");
        }
    }
}
