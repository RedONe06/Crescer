package Ex1;

import java.util.Scanner;

/**
 * descrição: Mostre a soma da diagonal secundária de uma matriz quadrática
 *
 * @author andri
 */
public class Main {

    public static void main(String[] args) {

        double[][] m = new double[3][3];
        int i, j, c = 2, s = 0;
        
        Scanner input = new Scanner(System.in);
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                m[i][j] = input.nextDouble();
            }
            if(i == 2){
                s += m[i][c - i];
            }
        }
        
        System.out.println(s);

    }
}
