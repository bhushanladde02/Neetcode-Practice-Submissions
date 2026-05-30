class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> out = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        Queue<int[]> queue = new PriorityQueue<int[]>((a,b)->b[1]-a[1]);

        Set<Integer> key = map.keySet();

        for(Integer i : key){
            int[] a = {i, map.get(i)};
            queue.offer(a);
        }

        while(k>0){
            out.add(queue.poll()[0]);
            k--;
        }
        int[] intArray = out.stream()
                                  .mapToInt(Integer::intValue) // or .mapToInt(i -> i)
                                  .toArray();


        return intArray;
    }
}
