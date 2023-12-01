import java.util.List;

public class Esfera extends Circulo {

        public Esfera() {
            super();
        }
        double calcularVolumen(){
            List<Punto> puntos = this.getListaPunto();
            Punto p1 = this.listaPunto.get(0);
            Punto p2 = this.listaPunto.get(1);

            double r=p1.calculoDistancia(p2);

            this.volumen=(4.0 / 3.0)*Math.PI*Math.pow(r,3);
            return this.volumen;

        }
    @Override
    public void imprimirVolumen(String figura) {
        System.out.println("El volumen de la " + figura + "es :"+volumen);
    }

}


