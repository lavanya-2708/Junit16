package arrays;

import java.util.Hashtable;

public class HashTableConsept {
    public static void main(String[] args) {
        Hashtable h=new Hashtable();
        h.put("A","Test");
        h.put("B","Hello");
        h.put("c","World");

        System.out.println(h.size());

        h.put(1,100);
        h.put(2,300);

        System.out.println(h.size());
        System.out.println(h.get("c"));
    }
}
