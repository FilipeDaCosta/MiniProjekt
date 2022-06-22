import java.util.Map;

public class KeyValue {
    private String sectionKey;
    private String sectionValue;
    private Map<String,String> keyValueMap;

    public KeyValue(String sectionKey, String sectionValue){
        addKeyValueToMap(sectionKey, sectionValue);
    }

    private void addKeyValueToMap(String sectionKey, String sectionValue) {
        keyValueMap.put(sectionKey, sectionValue);
    }
}
