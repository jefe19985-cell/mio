package pruevaParaSaerconstante;

public class emple {
    public void cambiosetSeccion(String seccion) {
        this.seccion = seccion;
    }
  public String devuelveDatos(){
        return "el nombre es"+nombre+"la seccion es "+ seccion+Id;
  }
    public emple(String nom){
        nombre=nom;
        seccion="administaion";
        Id=idsiguiente;
        idsiguiente++;



    }

    public static String dameidedigiente(){
        return "el idsiguiente es:"+idsiguiente;

    }
    private int   Id;
    private static int idsiguiente=1;
    private  final String nombre;
    private  String seccion;

}
