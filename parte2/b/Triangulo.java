public class Triangulo extends FiguraGeometrica{

    public Triangulo (double tamanho, double base, double altura) {
    super(tamanho, base, altura);
    }

    public double calculoAreaTriangulo(double base, double altura) {
    return base*altura/2;
    }

}
