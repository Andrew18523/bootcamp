import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    HashMap<Integer,String> nameMap = new HashMap<>();

    nameMap.put(100, "Andrew");

    //We can get vaue by key
    System.out.println(nameMap.get(100));//"Andrew"

    // You CANNOT get key by VALUE
    // Error: System.out.println(nameMap.get("Andrew")); //null

    // No ordering
    nameMap.put(1010, "Candy");
    nameMap.put(-45, "Sally");
    System.out.println(nameMap.get(-45));

    // Key + value -> Entry
    // A map consists of many entries
    // Loop for entries
    for (Map.Entry<Integer,String> entry: nameMap.entrySet()){
      System.out.println("Key="+entry.getKey()+",value="+entry.getValue());
    }

    //Handle duplicated key -> overwrite the value if the key exists
    nameMap.put(1010,"Peter");
    System.out.println(nameMap);//{1010=Peter, 100=Andrew, -45=Sally}
    nameMap.put(null,"ABC");
    System.out.println(nameMap);//{null=ABC, 1010=Peter, 100=Andrew, -45=Sally}

    //remove
    String oldValue = nameMap.remove(-45);
    System.out.println(nameMap); //{null=ABC, 1010=Peter, 100=Andrew}
    System.out.println(oldValue); //"Sally"

    System.out.println(nameMap.containsKey(1010)); //true

    // Loop keyset()
    for (Integer x :nameMap.keySet()){
      System.out.println(x);
    }
     // Loop values()
    for (String x :nameMap.values()){
      System.out.println(x);
    }

    System.out.println(nameMap.size()); //3
    System.out.println(nameMap.containsValue("Peter")); //true

  }
}
