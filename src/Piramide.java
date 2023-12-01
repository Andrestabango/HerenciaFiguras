import java.util.List;
import java.util.Scanner;

public class Piramide extends Triangulo {

    private double altura;

    public Piramide() {
        super();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularAltura() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el punto de de la altura");
        System.out.println("Ingrese la componente X el punto: " );
        double x = sc.nextDouble();
        System.out.println("Ingrese la componente Y el punto: " );
        double y = sc.nextDouble();
        Punto punto = new Punto(x,y);
        this.listaPunto.add(punto);
        Punto altura = this.listaPunto.get(3);
        List<Punto> puntos = this.getListaPunto();
        Punto p1 = puntos.get(0);
        double h= altura.calculoDistancia(p1);
        this.altura =h;
    }

    public double calcularVolumen() {
        List<Punto> puntos = this.getListaPunto();
        Punto p1 = this.listaPunto.get(0);
        Punto p2 = this.listaPunto.get(1);

        double l1 = p1.calculoDistancia(p2);
        volumen = (l1*l1 *this.altura) / 3;
        return volumen;
    }

    @Override
    public void imprimirVolumen(String figura) {
        System.out.println("El volumen de la " + figura + "es :"+volumen);
    }
}
