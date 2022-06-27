class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char x:n.toCharArray()){
            max=Math.max(max,x-'0');
        }
        return max;
    }
}