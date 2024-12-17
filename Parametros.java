public class Parametros {
    // Variables constantes
    public double natalidadPresa;
    public double natalidadDepredador;
    public double mortalidadPresa;
    public double mortalidadDepredador;
    public double indiceCaza;
    public double indiceAlimentacion;
    public double maxPresas;
    public double x0;  // Población inicial de presas
    public double y0;  // Población inicial de depredadores

    // Constructor para inicializar los parámetros
    public Parametros(double natalidadPresa, double natalidadDepredador, double mortalidadPresa,
                      double mortalidadDepredador, double indiceCaza, double indiceAlimentacion,
                      double maxPresas, double x0, double y0) {
        this.natalidadPresa = natalidadPresa;
        this.natalidadDepredador = natalidadDepredador;
        this.mortalidadPresa = mortalidadPresa;
        this.mortalidadDepredador = mortalidadDepredador;
        this.indiceCaza = indiceCaza;
        this.indiceAlimentacion = indiceAlimentacion;
        this.maxPresas = maxPresas;
        this.x0 = x0;
        this.y0 = y0;
    }
}
