import java.util.Scanner;

public class Circulo extends Figura {


    public Circulo() {
    }

    void ingresarPuntos(){
        Scanner sc= new Scanner(System.in);
        System.out.println();

        for (int i=0;i<2;i++){
            System.out.println("Ingrese la componente X el punto: " +i);
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y el punto: " +i);
            double y = sc.nextDouble();
            Punto punto =new Punto(x,y);
            this.listaPunto.add(punto);
        }
    }

    double calculrPerimetro(){
        Punto p1 = this.listaPunto.get(0);
        Punto p2 = this.listaPunto.get(1);


        double r=p1.calculoDistancia(p2);

        this.perimetro= 2*r*Math.PI;
        return this.perimetro;
    }

    double calcularArea(){
        Punto p1 = this.listaPunto.get(0);
        Punto p2 = this.listaPunto.get(1);

        double r=p1.calculoDistancia(p2);

        this.area=Math.PI*Math.pow(r,2);
        return this.area;

    }
}