package Ex2;

import java.util.Scanner;

/**
 * descrição: mostre os números repetidos em um vetor simples.
 *
 * @author andri
 */
public class Main {

    public static void main(String[] args) {

        double[] v = new double[6];
        double[] r = new double[6];
        int i, j, k, c = 0;
        boolean equal = false;

        Scanner input = new Scanner(System.in);

        for (i = 0; i < 6; i++) {
            System.out.println("Insira um número:");
            v[i] = input.nextDouble();
        }

        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                if (i != j && v[i] == v[j]) {
                    equal = false;
                    for (k = 0; k < 6; k++) {
                        if (r[k] == v[i]) {
                            equal = true;
                            break;
                        }
                    }
                    if (equal == false) {
                        r[c] = v[i];
                        c++;
                    }
                }
            }
        }

        for (double a : r) {
            System.out.println("r " + a);
        }
    }
}
