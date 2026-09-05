package objetoPRACTICAORIENTADAaobjetosEMpleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class empleado {
    public empleado(String nombr, double sueld, int año,int mes, int dia) {
nombre=nombr;
sueldo=sueld;
GregorianCalendar calendario=new GregorianCalendar(año,mes-1,dia);
altaContrato=calendario.getTime();
    }
    public empleado(String nom){
this(nom,3000,2000,1,1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }
   public void subeSueldo(double porcentaje){
        double aument=sueldo*porcentaje/100;
        sueldo+=aument;

   }
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}
