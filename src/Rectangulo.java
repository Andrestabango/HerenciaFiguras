import java.util.ArrayList;
import java.util.Scanner;

public class Rectangulo extends Figura{


    public Rectangulo() {
    }

    void ingresarPuntos(){
        Scanner sc= new Scanner(System.in);
        System.out.println();

        for (int i=0;i<3;i++){
            System.out.println("Ingrese la componente X el punto: " +i);
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y el punto: " +i);
            double y = sc.nextDouble();
            Punto punto =new Punto(x,y);
            this.listaPunto.add(punto);
        }
    }

    double calcularPerimetro(){
        Punto p1 = this.listaPunto.get(0);
        Punto p2 = this.listaPunto.get(1);
        Punto p3 = this.listaPunto.get(2);

        double l1=p1.calculoDistancia(p2);
        double l2=this.calculoDistancia(p1,p3);

        this.perimetro= l1*2+l2*2;
        return this.perimetro;
    }

    double calcularArea(){
        Punto p1 = this.listaPunto.get(0);
        Punto p2 = this.listaPunto.get(1);
        Punto p3 = this.listaPunto.get(2);

        double l1=p1.calculoDistancia(p2);
        double l2=this.calculoDistancia(p1,p3);

        this.area= l1*l2;
        return this.area;

    }


}
