import java.util.ArrayList;
import java.util.List;

public abstract class Figura {
    public double perimetro,area,volumen;
    public List<Punto> listaPunto = new ArrayList<>();


    public Figura(double perimetro, double area, double volumen, List<Punto> listaPunto) {
        this.perimetro = perimetro;
        this.area = area;
        this.volumen = volumen;
        this.listaPunto = listaPunto;
    }

    public Figura() {
    }


    double calculoDistancia (Punto punto1, Punto punto2){
        double dist = Math.sqrt(Math.pow(punto1.getX()- punto2.getX(),2)+Math.pow(punto1.getY()-punto2.getY(),2));
        return dist;
    }

    public abstract void imprimirArea(String figura);


    public abstract void imprimirPerimetro(String figura);

    public abstract void imprimirVolumen(String figura);


    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<Punto> getListaPunto() {
        return listaPunto;
    }

    public void setListaPunto(List<Punto> listaPunto) {
        this.listaPunto = listaPunto;
    }

}
