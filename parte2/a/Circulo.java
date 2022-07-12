public class Circulo extends FiguraGeometrica{

    public Circulo (double tamanho, double base, double altura) {
    super(tamanho, base, altura);
    }

    public double calculoArea(double tamanho) {
    tamanho = (1/4)*3.14*tamanho*tamanho;
    return tamanho;
    }

}
