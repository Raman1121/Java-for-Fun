import java.util.*;

public class Map {

    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raman", 100);
        map.put("Aditya", 50);
        map.put("Manas", 80);

        //If only interested in keys
        for(String key : map.keySet()){
            System.out.print(key);
            System.out.print("\t");
        }

        System.out.println("");

        //If only interested in Values
        for(Integer values : map.values()){
            System.out.print(values);
            System.out.print("\t");
        }
    }
}
