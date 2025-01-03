public class LotkaVolterra {

    // Método para resolver el sistema de ecuaciones
    public static double[] lotkaVolterra(double x, double y, Parametros params, double dt) {
        // Cálculo de la tasa de cambio de las presas
        double dxdt = params.natalidadPresa * x - params.mortalidadPresa * x - params.indiceCaza * x * y;

        // Cálculo de la tasa de cambio de los depredadores
        double dydt = params.indiceAlimentacion * params.indiceCaza * x * y - params.mortalidadDepredador * y;

        // Limitar la población de presas al máximo permitido en el ecosistema
        if (x > params.maxPresas) {
            x = params.maxPresas;
        }

        // Actualizar las poblaciones
        double x_new = x + dxdt * dt;
        double y_new = y + dydt * dt;

        return new double[]{x_new, y_new};
    }

    // Método para simular la población de presas y depredadores durante un periodo de tiempo
    public static double[] simular(double t_final, double dt, Parametros params) {
        double x = params.x0;
        double y = params.y0;
        double t = 0;

        // Simular la evolución hasta el tiempo t_final
        while (t < t_final) {
            double[] newPopulations = lotkaVolterra(x, y, params, dt);
            x = newPopulations[0];
            y = newPopulations[1];
            t += dt;
        }

        return new double[]{x, y};
    }
}