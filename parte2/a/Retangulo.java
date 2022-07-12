public class Retangulo extends FiguraGeometrica{

    public Retangulo (double tamanho, double base, double altura) {
    super(tamanho, base, altura);
    }


    public double calculoAreaRetangulo(double base, double altura) {
    return base*altura;
    }

}
