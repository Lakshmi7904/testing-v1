import java.util.HashMap;

public class TwoSum_Problem {

    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("Ravikiran",36);
        mp.put("Madhuri",34);
        mp.put("Avyan",5);
        mp.put("Anayra",2);
        for(String key:mp.keySet()){
            System.out.println(key+","+mp.get(key));
        }
        mp.remove("Madhuri");
        System.out.println("=====================");
        for(String key:mp.keySet()){
            System.out.println(key+","+mp.get(key));
        }
        mp.remove("Ravikiran");
        System.out.println("=====================");
        for(String key:mp.keySet()){
            System.out.println(key+","+mp.get(key));
            System.out.println("checking the merge request");

        }
    }
}
