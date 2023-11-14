// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cuadrado c1= new Cuadrado();
        c1.ingresarPuntos();
        c1.calcularPerimetro();
        c1.calcularArea();
        c1.imprimirPerimetro("Cuadrado 1 ");
        c1.imprimirArea("Cuadrado 1 ");
        Cubo cubo1 =new Cubo();
        cubo1.setListaPunto(c1.getListaPunto());
        cubo1.calcularProfundidad();
        cubo1.calcularVolumen();
        cubo1.imprimirVolumen("Cubo 1 ");

        Rectangulo r1= new Rectangulo();
        r1.ingresarPuntos();
        r1.calcularPerimetro();
        r1.calcularArea();
        r1.imprimirPerimetro("Rectangulo 1 ");
        r1.imprimirArea("Rectangulo 1 ");
        Ortoedro o1=new Ortoedro();
        o1.setListaPunto(r1.getListaPunto());
        o1.calcularProfundidad();
        o1.calcularVolumen();
        o1.imprimirVolumen("Rectangulo 1 ");


        Circulo circulo1=new Circulo();
        circulo1.ingresarPuntos();
        circulo1.calculrPerimetro();
        circulo1.calcularArea();
        circulo1.imprimirPerimetro("Circulo 1 ");
        circulo1.imprimirArea("Circulo 1 ");
        Esfera e1= new Esfera();
        e1.setListaPunto(circulo1.getListaPunto());
        e1.calcularVolumen();
        e1.imprimirVolumen("Circulo 1 ");


        Triangulo t1= new Triangulo();
        t1.ingresarPuntos();
        t1.calculrPerimetro();
        t1.calcularArea();
        t1.imprimirPerimetro("Triangulo 1 ");
        t1.imprimirArea("Triangulo 1 ");
        Piramide p1= new Piramide();
        p1.setListaPunto(t1.getListaPunto());
        p1.calcularAltura();
        p1.calcularVolumen();
        p1.imprimirVolumen("Triangulo 1 ");


    }
}