package a.StringArray;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jude on 4/6/16.
 */
public class TwoSumDataStructureDesign {

    Map<Integer, Integer> map = new HashMap<>();

    public void add(int number){
        if(map.containsKey(number)){
            map.put(number,map.get(number) + 1);
        } else {
            map.put(number, 1);
        }
    }

    public boolean find(int number){
        for (Integer i : map.keySet()){
            int target = number - i;
            if(map.containsKey(target)){
                if(i == target && map.get(target) < 2){
                    continue;
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Hello");

    }
}
