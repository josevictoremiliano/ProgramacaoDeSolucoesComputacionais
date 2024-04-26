package exercicio2;

class Triangulo extends Forma {
    private double base;
    private double altura;

    // Construtor, getters e setters para base e altura
    

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}