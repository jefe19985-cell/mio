package practicasbucles;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class aleatorio {
    public static void  main(String[] args){
        int aleatorio=(int)(Math.random()*100);
        Scanner sacaner=new Scanner(System.in);
        int num=0;
        int attem=0;
        while (num!=aleatorio){
            System.out.println("introduce nombre porfavor");
            num=sacaner.nextInt();
            if (aleatorio<num){
                System.out.println("mas bajo");

            } else if (aleatorio>num) {
                System.out.println("mas alto");
            }

        }
        System.out.println("correcto");
    }
}
