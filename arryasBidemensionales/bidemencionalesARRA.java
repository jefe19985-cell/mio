package arryasBidemensionales;

public class bidemencionalesARRA {
    public static void main(String[] args){
        int [][] matrixx= {
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}
                // arys rellendos
        };
        // System.out.println("valor de la posicion 2,3"+" "+matrixx[2][3]);

        // bucles for aninados
        for (int i=0; i<4;i++){
            System.out.println();
            for (int j=0;j<5;j++){
                System.out.print(matrixx[i][j]+" ");
            }
            // for ecach

        }
        for ( int [] fila: matrixx){
            System.out.println();
            for (int z: fila){
                System.out.println(z+ " ");
            }
        }


    }
}
