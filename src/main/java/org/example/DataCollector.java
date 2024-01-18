package org.example;

import java.util.HashMap;
import java.util.Map;

public class DataCollector {
    public Map<String, String> getMapData() {
//        Map m = new HashMap();
//        m.put("name", "meisam");
//        m.put("name", "meisam");
//        m.put("name", "meisam");
//        return m;
        return Map.ofEntries(
                Map.entry("name", "meisam"),
                Map.entry("lastname", "mohamadi"),
                Map.entry("number", "10")
        );
    }

}
