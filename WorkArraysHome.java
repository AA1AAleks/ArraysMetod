package ArraysMetod;
import java.util.HashMap;
import java.util.Map;

public class WorkArraysHome {
    public static void main(String[] args) {

        HashMap<String, Integer> nemeAndAge = new HashMap<>();

         nemeAndAge.put("Ivan", 44);

        for (Map.Entry<String, Integer> entry : nemeAndAge.entrySet()){
            System.out.println("Key and Value: " + entry.getKey() + " " + entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : nemeAndAge.entrySet()){
            System.out.println("Key and Value: " + " " + entry.getValue() + " " + entry.getKey());
        }
    }

}
