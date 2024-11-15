package Herencia;

public class EjecutarHerencia {
    public static void main(String[] args) {

        Trabajador objT1 = new Vendedor(1, "cristiano", "Textiles", 20.0);
        Trabajador objT2 = new Vendedor(2, "Messi", "Electrodomesticos", 10.0);

        Trabajador objT3 = new Operario(3, "neymar", "Dulceria", 200.0);
        Trabajador objT4 = new Operario(4, "Mbappe", "cocina", 230.0);

        System.out.println("salario vendedor: " + objT1.salario());
        System.out.println("salario operario: " + objT3.salario());

        System.out.println(objT1 instanceof Vendedor);
        System.out.println(objT1 instanceof Trabajador);

        Trabajador[] t = new Trabajador[4];
        t[0] = objT1;
        t[1] = objT3;
        t[2] = objT2;
        t[3] = objT4;

        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i].getClass() + "-" + t[i].getNombre() + " " + t[i].salario() + " ");
        }

    }
}