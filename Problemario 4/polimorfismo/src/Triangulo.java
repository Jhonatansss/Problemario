import java.util.Scanner;
public class Triangulo extends Figura {
    private float base;
    private  float altura;
    Scanner sc = new Scanner(System.in);

    public Triangulo(String nombreFigura) {
        super(nombreFigura);
    }


    public void checharbase(float base , float altura)throws ExceptionFigura{
        if(base<altura) {
            throw new ExceptionFigura("la base debe ser mayor o igual a la altura ");
        }

    }


    @Override
    public void pideDatos(){
        try {
            System.out.println("ingrese la base del Triangulo:");
            base = sc.nextFloat();
            System.out.println("Ingrese la altura del Triangulo");
            altura = sc.nextFloat();
            checharbase(base,altura);
            this.base=base;
            this.altura=altura;


        } catch(ExceptionFigura e){
            System.out.println(e.getMessage());
        }
    }




    @Override
    public void imprimeDatos(){
        float area = base*altura/2;
        System.out.println("El area del Triangulo es:"+area);
    }
}
