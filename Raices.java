package CYL;

/**
 *
 * @author ivanam
 */
public class Raices {
    double a, b,c, discriminante,numeradorx1, numeradorx2, resultadox1, resultadox2;
    boolean error;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String FormulaGeneral() {
       double bCuadrada = b * b;
        double ac4 = 4 * a * c;
        double discriminante = bCuadrada - ac4;
        double denominador = 2 * a;
        if (discriminante == 0) {
            String resultado = "" + -b / denominador;
            return (resultado);
        } else if (discriminante >= 1) {
            double numeradorx1 = -b + Math.sqrt(discriminante);
            double numeradorx2 = -b - Math.sqrt(discriminante);
            double resultadox1 = numeradorx1 / denominador;
            double resultadox2 = numeradorx2 / denominador;
            return (resultadox1 + " , " + resultadox2);
        } else {
            double numReal = -b / denominador;
            double numImaginario = Math.sqrt(-discriminante) / denominador;
            return (numReal + " +/- " + numImaginario + "i");
        }

    }
}//class
