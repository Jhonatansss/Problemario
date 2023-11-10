import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Polimo polimo = new Polimo();
        ArrayList<Figura> figuras = new ArrayList<>();

        Figura obj = new Cuadrado("Cuadrado");
        figuras.add(obj);

        Figura obj1 = new Triangulo("Triangulo");
        figuras.add(obj1);

        for(Figura figura: figuras){
            polimo.imprime(figura);

        }

    }
}
