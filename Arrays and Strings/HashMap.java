import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer>map = new HashMap<>();
        print(map);
        map.put("abc", 10);
        map.put("def", 15);
        map.put("xyz", 30);

        System.out.println("Size of map is: " +map.size());
        if(map.containsKey("abc")) {
            Integer a = map.get("abc");
            System.out.println("Value of Key \"abc\" is:- " +a);


        }
        map.clear();

        print(map);
    }
    public static void print(Map<String,Integer>map)
    {
        if(map.isEmpty())
        {
            System.out.println("Map is Empty");
        }
        else{
            System.out.println(map);
        }
    }
}