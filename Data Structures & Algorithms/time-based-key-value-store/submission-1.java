class TimeMap {
    int min;
    Map<Integer, Map<String, List<String>>> structure;
    public TimeMap() {
        structure = new HashMap<Integer,Map<String, List<String>>>();
        min = Integer.MAX_VALUE;
    }
    
    public void set(String key, String value, int timestamp) {
        if(!structure.containsKey(timestamp)){
            min = Math.min(timestamp,min);
            structure.put(timestamp, new HashMap<String, List<String>>());
        }

        if(!structure.get(timestamp).containsKey(key)){
            Map<String, List<String>> m = structure.get(timestamp);
            m.put(key, new ArrayList<String>());
            structure.put(timestamp,m);
        }
        structure.get(timestamp).get(key).add(value);
    }
    
    public String get(String key, int timestamp) {
        if(timestamp<min){
            return "";
        }

        for(int i = timestamp ; i>=min ; i--){
            if(structure.containsKey(i) && structure.get(i).containsKey(key)){
               return structure.get(i).get(key).get(0);
            }
        }
        return "";
    }
}
