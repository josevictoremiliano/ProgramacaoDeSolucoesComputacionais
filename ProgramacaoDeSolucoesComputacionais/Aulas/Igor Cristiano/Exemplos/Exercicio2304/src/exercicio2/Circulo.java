package exercicio2;

    /*
     * Exercício 2: Abstração e Polimorfismo
     * Enunciado: Crie uma classe abstrata Forma com um método abstrato calcularArea().
     * Implemente três subclasses, Circulo, Retangulo e Triangulo, que estendam Forma e implementem o método calcularArea() para calcular a área de cada forma. 
     */


     // use a classe abstrata forma como base para a classe Circulo que esta em forma

class Circulo extends Forma {
    private double raio;

    

    public double calcularArea() {
        return Math.PI * raio * raio;
    }



    public double getRaio() {
        return raio;
    }



    public void setRaio(double raio) {
        this.raio = raio;
    }

    
}