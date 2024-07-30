import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListDemo {
   public static void main(String[] args) {
    List<String> strings = new ArrayList<>(); 
    // ArrayList.class implements List.class

    strings.add("hello");
    strings.add("abc");
    strings.remove("abd");
    System.out.println(strings.size());  //2

    // ArrayList.class has All methods defined in List.Class
    // ArrayList MAY implement more than one interface
    // ArrayList MAY have its own method, which did not define in interfaces

    // Ploymorphism
    // 1. Scope of strings(obj reference) - compile time
    // 2. method Implementation -run time

    //Collection
    Collection<String> strings2 = new ArrayList<>();
    strings2.add("hello");

    strings2 = new HashSet<>();
    System.out.println(strings2.size()); //0

    Set<String> strings3 = new HashSet<>();
    //Error: strings3= new arrayList<>();  // NOT OK, ArrayList.class did not implement Set Interface
    strings3.add("hello");//ingore duplicate

    System.out.println(strings);

    //so, the implmentation of ArrayList.add() differ form HashSet.add() becuse HashSet.add() ingore duplicate

    Map<String,String> string4 = new HashMap<>();
   }
}
