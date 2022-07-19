package Ex5;

import java.util.ArrayList;

/**
 * 
 * @author andri
 */
public class Main {
    public static void main(String[] args) {
        
        int i, cont = 0, average = 0;
        
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(2);
        numbers.add(2);
        numbers.add(4);
        
        
        for(i=0; i<numbers.size(); i++){
            average += numbers.get(i)*(i+1);
        }
        
        average = average/numbers.size();
        
        System.out.println(average);
    }
}
