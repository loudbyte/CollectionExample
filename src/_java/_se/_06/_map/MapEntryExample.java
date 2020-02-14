package _java._se._06._map;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class MapEntryExample {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        Iterator iter = props.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
