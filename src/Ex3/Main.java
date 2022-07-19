
package Ex3;

/**
 * @author andri
 */
import java.util.Scanner;

public class Main {

   public static int biggerIndex(String[] words){
      int bigger = 0;
      int index = 0;

      for(int i = 0; i< words.length; i++){
         if(words[i].length()>bigger){
            bigger = words[i].length();
            index = i;
         }
      }
   return index;
   }

   public static void main(String[] args) {

      /**
       * entrar a frase
       * "palavra palavra pa lavra"
       * separar as palavras como valores em um vetor
       * ver qual das palavras tem mais chars
       * */

      Scanner input = new Scanner(System.in);

      String word = "";
      int i;

      //input
      System.out.println("Insira a frase:");
      word = input.nextLine();

      //cria um array para dividir
      String[] words = word.split( " ");

      //output
      for(i = 0; i< words.length; i++){
         System.out.println("[" + i + "] " + words[i]);
      }

      System.out.println("Maior palavra: " + words[biggerIndex(words)]);
   }
}
