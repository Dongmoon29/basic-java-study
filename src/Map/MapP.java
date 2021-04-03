package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapP {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "World");
        map.put("Hi", "World");
        map.put("안녕", "하세요");

        System.out.println(map.values());
        Collection col = new ArrayList();

    }
}
