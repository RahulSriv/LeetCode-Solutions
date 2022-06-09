class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++){
            m.put(numbers[i],i);
        }
        for(int i=0;i<numbers.length;i++){
            if(m.containsKey(target-numbers[i]) && i!=m.get(target-numbers[i])){
                res[0]=i+1;
                res[1]=m.get(target-numbers[i])+1;
                break;
            }
        }
        return res;
    }
}