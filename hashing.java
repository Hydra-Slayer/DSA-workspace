import java.util.HashMap;

public class hashing {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String arr = "hello";

        for (int i = 0; i < arr.length(); i++) {
            if (map.get(arr.charAt(i)) == null) {
                map.put(arr.charAt(i), 1);
            } else {
                map.put(arr.charAt(i), map.get(arr.charAt(i)) + 1);
            }
        }
        System.out.println();
        System.out.println(map);
    }

}