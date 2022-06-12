class Solution {
    public int minimumCardPickup(int[] cards) {
        int i=0, j=0, min=Integer.MAX_VALUE;
        Set<Integer> s=new HashSet<Integer>();
        while(j<cards.length){
            if(!s.contains(cards[j])){
                s.add(cards[j]);
                j++;
            }
            else{
                min=Math.min(j-i+1,min);
                s.remove(cards[i++]);
            }
        }
        if(i==0)
            return -1;
        return min;
    }
}