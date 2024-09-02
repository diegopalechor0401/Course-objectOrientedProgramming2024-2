package CLASE26AGO2024;
public class Marcador {

    //Atributos de la clase
    private String nombre;
    private String color;
    private double diametro;
    private boolean esBorrable;

    //Constructor
    public Marcador(String nombre, String color, double diametro, boolean esBorrable){
        this.nombre = nombre;
        this.color = color;
        this.diametro = diametro;
        this.esBorrable = esBorrable;
   }

   //Metodos de la clase

   /*
    * firma del metodo
    *publico
    *el nombre del metodo es "rayar"
    *no retorna valores
    *no tiene parametros o argumentos
    */
    public void rayar(){
        System.out.println(x:"Marcador rayando...");
   }

   /*
    * firma del metodo
    * publico
    * el nombre del metodo es "recargar"
    * retorna un valor tipo string
    * recibe 1 parametro o argumento de tipo real(double)
    */
    public String recargar(double cantidad){
        return "El marcador se recargo con" + cantidad + "ml";

    }

    public String toString(){
        return "El marcador se recargo con" + cantidad + "ml";
    }

    public String toString(){
        return"{marcador: nombre: " + nombre + "color:" + color + "Diametro:" + diametro + "esBorrable:" + esBorrable + "}"}


    }

