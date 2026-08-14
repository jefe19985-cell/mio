package arryasBidemensionales;

public class bidemencionalesARRA {
    public static void main(String[] args){
        int [][] matrixx= new int[4][5];

        matrixx[0][0]=25;
        matrixx[0][1]=25;
        matrixx[0][2]=25;
        matrixx[0][3]=25;
        matrixx[0][4]=25;

        matrixx[1][0]=25;
        matrixx[1][1]=25;
        matrixx[1][2]=25;
        matrixx[1][3]=25;
        matrixx[1][4]=25;

        matrixx[2][0]=25;
        matrixx[2][1]=25;
        matrixx[2][2]=25;
        matrixx[2][3]=2;
        matrixx[2][4]=25;

        matrixx[3][0]=25;
        matrixx[3][1]=25;
        matrixx[3][2]=25;
        matrixx[3][3]=25;
        matrixx[3][4]=25;
       // System.out.println("valor de la posicion 2,3"+" "+matrixx[2][3]);

        // bucles for aninados
        for (int i=0; i<4;i++){
            System.out.println();
            for (int j=0;j<5;j++){
                System.out.print(matrixx[i][j]+" ");
            }
        }


    }
}
