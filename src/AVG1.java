/**
 * Created by Nicu Osan on 25.03.2017.
 */
public class AVG1 {

    public static void main(String[] args) {
        double a;
        double suma = 0;
        int calcul = 0;
        do {
            a = SkeletonJava.readDoubleConsole("Introduce-ti un numar: ");
            suma = suma + a;
            calcul++;
        } while (a != 0);
        System.out.println("Suma este " + suma + " care v-a fii impatita la " + (calcul - 1));
        System.out.println("Media numerelore este " + suma / (calcul - 1));
    }
}
}
