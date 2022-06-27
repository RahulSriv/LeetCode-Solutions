class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char x:n.toCharArray()){
            if(x=='9')
                return 9;
            max=Math.max(max,x-'0');
        }
        return max;
    }
}