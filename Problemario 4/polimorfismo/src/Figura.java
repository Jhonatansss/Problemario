public abstract class Figura {
    protected String nombreFigura;

    public Figura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }


    public void pideDatos(){
    }

    public void imprimeDatos(){
    }

    @Override
    public String toString() {
        return  nombreFigura;
    }

}
