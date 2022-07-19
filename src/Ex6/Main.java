package Ex6;

import java.util.ArrayList;

/**
 * @author andri
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<Integer> result = new ArrayList();
        int i=0, sum = 0, bigger = 0;

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        while(i<numbers.size()){
            for(int j = 0; j<numbers.size();j++){
                sum+=numbers.get(j);
            }
            result.add(sum-numbers.get(i));
            sum = 0;
            if(result.get(i)>bigger){
                bigger = result.get(i);
            }
            i++; 
        }
        System.out.println(bigger);

    }
}
