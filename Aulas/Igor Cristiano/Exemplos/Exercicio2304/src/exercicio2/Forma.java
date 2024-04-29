package exercicio2;
    /*
     * Exercício 2: Abstração e Polimorfismo
     * Enunciado: Crie uma classe abstrata Forma com um método abstrato calcularArea().
     * Implemente três subclasses, Circulo, Retangulo e Triangulo, que estendam Forma e implementem o método calcularArea() para calcular a área de cada forma. 
     */

abstract class Forma {
    public abstract double calcularArea(); // Método abstrato sem implementação
}
