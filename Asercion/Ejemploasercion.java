public class Ejemploasercion {
    public static void main(String[] args) {
        //una variable que debería ser positiva
        int variable = 10;

        // Utilizamos una aserción para verificar
        assert variable >= 0 : "La cantidad no puede ser negativa";

        // Si la aserción es verdadera, continuamos con el programa
        System.out.println("Variable: " + variable);

        // escenario donde la aserción falla
        int cantidadNegativa = -5;

        // Utilizamos una aserción para verificar que la cantidadNegativa sea positiva
        assert cantidadNegativa >= 0 : "La cantidadNegativa no puede ser negativa";

        // El código no llegará a esta línea si la aserción falla
        System.out.println("Esta línea no se imprimirá si la aserción falla");
    }
}



