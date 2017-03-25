/**
 * Created by Nicu Osan on 25.03.2017.
 */
public class Problema3 {


    public static void main(String[] args) {
        int numere = 0;
        int sum = 0;
        do {
            numere = SkeletonJava.readIntConsole("Intriduceti numarul ");
            boolean cond = ((numere > 4) && numere < 11);
            if (cond) {
                sum = numere + sum;
            }

        }
        while (numere != 0);
        System.out.println(sum);
    }
}
