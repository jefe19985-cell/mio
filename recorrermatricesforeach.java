import javax.swing.*;
import java.util.Scanner;

public class recorrermatricesforeach {
    public static void main (String[] args){
  //incio desde cero las matrices
        // int [] miMtriz=new int[5]; declaracion en varias lineas
        /*     miMtriz[0]=15
               miMtriz[1]=15
               miMtriz[2]=15
                miMtriz[3]=15
        * */

        //int [] miMtriz={15,15,12,12,,12}; declaracion y  inicializacion en la misma linea

        /*int miMatriz []=new int[5];
        miMatriz[0]=5;
        miMatriz[1]=6;
        miMatriz[2]=2;
        miMatriz[3]=11;
        miMatriz[4]=10;
        System.out.println(miMatriz[4]);*/

      /* int miMatriz []=new int[5];
        miMatriz[0]=5;
        miMatriz[1]=6;
        miMatriz[2]=2;
        miMatriz[3]=11;
        miMatriz[4]=10;
        // bucle for para mostrar todos elementos de la matriz
        for (int i=0; i<5;i++){
            System.out.println("valor de indice"+i+" "+miMatriz[i]);*/
         int miMatri[]={5,5,5,5,5,};

        for (int i=0; i< miMatri.length;i++){
            System.out.println("valor de indice"+i+"  "+miMatri[i]);

        }
        for ( int maa :miMatri){
            System.out.println(   maa);
        }


        }

}
