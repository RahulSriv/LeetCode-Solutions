class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long max=0, sum=0;
        for(int i=0;i<beans.length;i++){
            sum+=beans[i];
            max=Math.max(max,(long)beans[i]*(beans.length-i));
        }
        return sum-max;
    }
}