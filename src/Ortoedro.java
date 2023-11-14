import java.util.List;
import java.util.Scanner;

public class Ortoedro extends Rectangulo{

    private double profundidad;
    public Ortoedro() {
        super();
        this.profundidad = 0;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public void calcularProfundidad() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el punto de profundidad");
        System.out.println("Ingrese la componente X el punto: " );
        double x = sc.nextDouble();
        System.out.println("Ingrese la componente Y el punto: " );
        double y = sc.nextDouble();
        Punto punto = new Punto(x,y);
        this.listaPunto.add(punto);
        Punto profundidad = this.listaPunto.get(3);
        List<Punto> puntos = this.getListaPunto();
        Punto p1 = puntos.get(0);
        double l1 = p1.calculoDistancia(profundidad);
        this.profundidad = l1;
    }

    public double calcularVolumen() {
        // Calculamos el volumen multiplicando el área de la base (cuadrado) por la profundidad
        this.calcularArea();
        volumen= this.getArea() * this.profundidad;
        return volumen;
    }
}



