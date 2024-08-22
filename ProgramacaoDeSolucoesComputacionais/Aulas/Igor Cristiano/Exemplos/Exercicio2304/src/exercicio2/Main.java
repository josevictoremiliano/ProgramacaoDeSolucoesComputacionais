package exercicio2;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(5);
        System.out.println("Área do círculo: " + circulo.calcularArea());

        Retangulo retangulo = new Retangulo();
        retangulo.setBase(5);
        retangulo.setAltura(10);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(5);
        triangulo.setAltura(10);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
    }
}
