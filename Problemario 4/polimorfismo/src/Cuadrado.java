import java.util.Scanner;

public class Cuadrado extends Figura{
    Scanner sc = new Scanner(System.in);
    private float lado;

    public Cuadrado(String nombreFigura) {
        super(nombreFigura);
    }

    public void validarLado(float lado) throws ExceptionFigura{
        if(!(lado > 5)){
            throw new ExceptionFigura("El lado tiene que ser mayor a 5");
        }
    }

    @Override
    public void pideDatos(){
        try {
            System.out.println("ingrese el lado de cuadrado:");
            lado = sc.nextFloat();
            validarLado(lado);
            this.lado=lado;
        }catch(ExceptionFigura e){
            System.out.println(e.getMessage());

        }
    }

    @Override
    public void imprimeDatos(){
        float area;
        area= lado*lado;
        System.out.println("El area del cuadrado es:"+ area);
    }
}
