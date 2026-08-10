package practicasbucles;

import javax.swing.*;

public class aleatorio {
    public static void  main(String[] args){
        int aleatorio=(int)(Math.random()*100);
        System.out.println(aleatorio);
        aleatorio=Integer.parseInt(JOptionPane.showInputDialog(aleatorio));
        while (aleatorio==aleatorio) {
            System.out.println("correcto");
            aleatorio++;
         break;
        }

    }
}
