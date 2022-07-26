package cd.get.ready.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        Map<String, Integer> map = new HashMap<String,Integer>();
        Set<String> set = new TreeSet<String>();
        for (String string:input) {
            map.merge(string,1,Integer::sum);
            if(map.get(string) > 1){
                set.add(string);
            }

        }
        return set.size();

    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        Set<Integer> set = new TreeSet<Integer>();
        for (Integer ints:input) {
            map.merge(ints,1,Integer::sum);
            if(map.get(ints) > 1){
                set.add(ints);
            }

        }
        return set.size();
    }
}
