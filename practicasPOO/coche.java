package practicasPOO;

public class coche {
    int rueda;
    int peso;
    int ancho;
    int largo;
    String color;
    boolean asientoscuero, aclimatizador;


    public coche() {
        rueda=4;
        peso=500;
        ancho=2;
        largo=4;


    }
    public String damedatosgenerales(){
        return rueda+"  " + "tiene" + peso + ancho + largo;
    }

    public String dimecolor() {
        return color;
    }

    public void establececolor(String dimecolor) {
        color=dimecolor;
    }

    public void setAsientoscuero(String asientoscuero){
        if (asientoscuero=="si"){
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
}
