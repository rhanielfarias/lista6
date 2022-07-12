public class Quadrado extends FiguraGeometrica{
    public Quadrado (double tamanho, double base, double altura) {
    super(tamanho, base, altura);
    }

    public double  calculoArea(double tamanho) {
    tamanho = tamanho*tamanho;
    return tamanho;
    }
}
