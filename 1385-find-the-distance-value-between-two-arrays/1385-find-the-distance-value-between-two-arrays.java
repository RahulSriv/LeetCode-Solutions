class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ct=0;
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for(int x:arr2){
            ts.add(x);
        }
        for(int i=0;i<arr1.length;i++){
            int from=arr1[i]-d;
            int to=arr1[i]+d;
            Set<Integer> sub=ts.subSet(from,to+1);
            if(sub.size()==0)
                ct++;
        }
        return ct;
    }
}

// int ct=0;
//         for(int i=0;i<arr1.length;i++){
//             int flag=1;
//             for(int j=0;j<arr2.length;j++){
//                 if(Math.abs(arr1[i]-arr2[j])<=d){
//                     flag=0;
//                     break;
//                 }
//             }
//             if(flag==1)
//                     ct++;
//         }
//         return ct;