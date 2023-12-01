import java.util.List;

public class Cubo extends Cuadrado {
    private double profundidad;

    @Override
    public void imprimirVolumen(String figura) {
        System.out.println("El volumen de la " + figura + "es :"+volumen);
    }

    public Cubo() {
        super();
        this.profundidad = 0;  // Inicializamos la profundidad a 0
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public void calcularProfundidad() {
        List<Punto> puntos = this.getListaPunto();
        Punto p1 = puntos.get(0);
        Punto p2 = puntos.get(1);
        double l1 = p1.calculoDistancia(p2);
        this.profundidad = l1;
    }

    public double calcularVolumen() {
        this.calcularArea();
        this.calcularProfundidad();
        volumen= this.getArea() * this.profundidad;
        return volumen;
    }
}
