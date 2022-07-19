package Ex4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Descrição: Remova os caracteres repetidos em uma palavra;
 *
 * Resolução: Comparar index por index (a não ser com ele mesmo), se a letra se
 * repete. Comparar unicode para ver se é igual retornar a palavra sem nada
 * 
 * possivel resolução
 * for(int i = 0; i<palavra.length();i++){
int contador = 0
   for(int i2 = 0; i<palavra.length();i2++}
     if(palavra[i2] = palavra[i]) contador++
 }
if(contador > 0){
   for(int i3 = 0;i<palavra.length();i3++){
     if(palavra[i3] = palavra[i]) palavra.remove(i3)
}
}
}
 * @author andri
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String in = "";
        String answer = "";
        char letter;
        int i, j, cont = 0;

        System.out.println("Insira sua palavra:");
        in = input.nextLine();

        char[] letters = in.toCharArray();
        for (i = 0; i < letters.length; i++) {
            System.out.println("[" + i + "] " + letters[i]);
        }

        for (i = 0; i < letters.length; i++) {
            for (j = 0; j < letters.length; j++) {
                if (letters[i] != letters[j]) {
                    cont++;
                }
            }
            if (cont == letters.length) {
                answer += letters[i];
            }
        }

        System.out.println("Resposta: " + answer);
    }
}
