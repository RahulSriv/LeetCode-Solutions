class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
        int ct=0;
        for(int i=0;i<boxTypes.length;i++){
            while(truckSize>0 && boxTypes[i][0]>0){
                truckSize--;
                boxTypes[i][0]--;
                ct+=boxTypes[i][1];
            }
        }
        return ct;
    }
}