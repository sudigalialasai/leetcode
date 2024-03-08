class Solution {
    public int maxFrequencyElements(int[] nums) {
         Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
      

      
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            int element = entry.getKey();

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                
            }
        }
        
        int count=0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            if(entry.getValue()==maxFrequency) count+=maxFrequency;
        }
        
        

        return count;
        
    }
}