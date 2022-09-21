class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        if(target.length!=arr.length)
            return false;
        int n=arr.length;
        for(int i=0;i<n;i++)
            if(target[i]!=arr[i])
                return false;
        return true;
    }
}