package objetoPRACTICAORIENTADAaobjetosEMpleado;

public class usoEmpleado {
    public static void main (String []args){
/* empleado Empleado=new empleado("javier",85000,1990,12,1);
        empleado Empleado2=new empleado("javo",95000,1995,6,2);
        empleado Empleado3=new empleado("martin",105000,2002,3,15);
        Empleado.subeSueldo(5);
        Empleado.subeSueldo(5);
        Empleado.subeSueldo(5);
        System.out.println(Empleado.getNombre()+ "   "+"seldo" +Empleado.getSueldo()+" fech alta:"+Empleado.getAltaContrato());*/
        empleado [] Empleado= new empleado[4];
                 Empleado[0]=new empleado("javier",85000,1990,12,1);
                 Empleado[1]=new empleado("javo",95000,1995,6,2);
                 Empleado[2]=new empleado("martin",105000,2002,3,15);
                 Empleado[3]=new empleado("jajaja");

                 //for (int i=0;i<3;i++){
//Empleado[i].subeSueldo(5);
               //  }

        for (empleado e:Empleado ){
            e.subeSueldo(5);
        }
        for (int i=0;i<4;i++){
            System.out.println(Empleado[i].getNombre()+Empleado[i].getSueldo()+Empleado[i].getAltaContrato());
        }

    }


}
