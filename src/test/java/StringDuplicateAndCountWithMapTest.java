import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicateAndCountWithMapTest {

    @Test
    public void TestDuplicateInString(){

        String str= "Java python language are the Java and python language";

        Map<String,Integer> map = new HashMap<>();

        for(String word : str.split(" ")){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word,1);
            }
        }

        //System.out.println(map);

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue()
            );
        }

    }

}

