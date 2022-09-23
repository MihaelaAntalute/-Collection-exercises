package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExemple {
    public static void main(String[] args) {
        Map<Integer, String> productsMap = new HashMap<>();
        productsMap.put(1000, "Notebook");
        productsMap.put(2000, "phone");
        productsMap.put(3000, "keyboard");
        System.out.println(productsMap);

        System.out.println(productsMap.get(2000));
        productsMap.remove(1000);
        System.out.println(productsMap);

        productsMap.putIfAbsent(1000, "mouse");
        System.out.println(productsMap);

        System.out.println(productsMap.keySet());
        for(Integer code : productsMap.keySet()){
            System.out.println(productsMap.get(code));
        }
        for (String productName : productsMap.values()) {
            System.out.println(productName);
        }
        for (Map.Entry<Integer, String> entry : productsMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        Map<String, Set<String>> synonims = new HashMap<>();
        Set<String> set1 = new HashSet<>();
        set1.add("mirabolant");
        set1.add("extraordinar");
        synonims.put("frumos", set1);

        Set<String> set2 = new HashSet<>();
        set2.add("perspicace");
        set2.add("iute");
        synonims.put("rapid", set2);

        Set<String> set3 = new HashSet<>();
        set3.add("facil");
        set3.add("lejer");
        synonims.put("simplu", set3);
        System.out.println(synonims);

        String newString = "a";
        String newKey = "simplu";
        //adaugam in valoarea de la newKey(adica in set)pe newString
        //intai verificam
        if(!synonims.containsKey(newKey)){
            Set<String> value = new HashSet<>();
            value.add(newString);
            synonims.put(newKey,value);
        }else {
            synonims.get(newKey).add(newString);
        }
       System.out.println(synonims);




    }

}


