import java.util.*;

public class GroupAnagrams{
     public static List<List<String>> groupAnagrams(String[] strs){ 
        Map<String,List<String>> map = new HashMap<>();
        
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            
            String key = new String(arr);
            
            map.computeIfAbsent(key,k -> new ArrayList<>()).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
    
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));
    }
}