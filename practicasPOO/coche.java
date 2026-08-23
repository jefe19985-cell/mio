package practicasPOO;

public class coche {
    int rueda;
    int pesoTotal;
    int pesoPlataforma;
    int ancho;
    int largo;
    int motor;
    String color;
    boolean asientoscuero, aclimatizador;


    public coche() {
        rueda=4;
        pesoPlataforma=500;
        ancho=2;
        largo=4;
        motor=1600;


    }
    public String damedatosgenerales(){
        return rueda+"  " + "tiene" + pesoPlataforma + ancho + largo;
    }

    public String dimecolor() {
        return color;
    }

    public void establececolor(String dimecolor) {
        color=dimecolor;
    }

    public void setAsientoscuero(String asientoscuero){
        if (asientoscuero.equalsIgnoreCase("si")){
            this.asientoscuero=true;
        }else{
            this.asientoscuero=false;
        }
    }
    public String dimeasintos(){
        if (asientoscuero==true){
            return "tiene asientos";
        }else {
            return "el coche no tiene asientos de cueri";
        }
    }

    public void setAclimatizador(String aclimatizador) {
        if (aclimatizador.equalsIgnoreCase("si")) {

            this.aclimatizador=true;
        }else {
            this.aclimatizador=false;

        }
    }
    public String dimeacimatizador(){
        if (aclimatizador==true){
            return "tiene aclimatizador";
        }else {
            return "no tiene";
        }
    }
    public  String dimePesoCoche(){
        int pesoCrarooseria=500;
        pesoTotal=pesoPlataforma+pesoCrarooseria;
        if (asientoscuero==true){
            pesoTotal=pesoTotal+50;
        }if (aclimatizador==true){
            pesoTotal=pesoTotal+20;

        }
        return "tiene"+pesoTotal;
    }
    public int precioCoche(){
        int preciofinal=100000;
        if (asientoscuero==true){
            preciofinal+=2000;

        }if (aclimatizador==true){
            preciofinal+=1500;
        }
        return preciofinal;
    }


}
