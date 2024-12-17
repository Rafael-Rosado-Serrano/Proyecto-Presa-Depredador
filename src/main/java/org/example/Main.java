import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Datos de entrada
        Scanner scanner = new Scanner(System.in);
        // Solicitar parámetros al usuario
        System.out.println("Ingrese los parámetros del modelo:");
        // Parámetros constantes
        double natalidadPresa = 0.50;  // 50% natalidad de presas
        double natalidadDepredador = 0.15;  // 15% natalidad de depredadores
        double mortalidadPresa = 0.05;  // 5% mortalidad de presas
        double mortalidadDepredador = 0.05;  // 5% mortalidad de depredadores
        double indiceCaza = 0.002;  // 0.20% índice de caza
        double indiceAlimentacion = 0.60;  // 60% índice de alimentación
        double maxPresas = 5000;  // Máximo de presas en el ecosistema
        // Poblaciones iniciales
        double x0 = 4000;  // Población inicial de presas
        double y0 = 150;   // Población inicial de depredadores
        // Crear objeto Parametros
        Parametros params = new Parametros(natalidadPresa, natalidadDepredador, mortalidadPresa,
                mortalidadDepredador, indiceCaza, indiceAlimentacion,
                maxPresas, x0, y0);
        // Simular la población en el tiempo
        double t_final = 2017;  // Tiempo de simulación (en años)
        double dt = 0.1;  // Paso de tiempo (en años)
        // Ejecutar la simulación
        double[] result = LotkaVolterra.simular(t_final, dt, params);
        // Mostrar los resultados
        System.out.println("Población final de presas: " + result[0]);
        System.out.println("Población final de depredadores: " + result[1]);
        // Cerrar el scanner
        scanner.close();
    }
}