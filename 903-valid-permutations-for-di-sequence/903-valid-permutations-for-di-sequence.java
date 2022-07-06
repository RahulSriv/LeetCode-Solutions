class Solution {
    public int numPermsDISequence(String str) {
        int n=str.length(), mod=(int)1e9+7;
        int[] dputil=new int[n+1];
        Arrays.fill(dputil, 1);
        for(int i=1;i<=n;i++){
            int[] save=new int[n+1];
            for(int j=0;j<=i;j++) {
                save[j]=(j==0?0:save[j-1]);
                if (str.charAt(i-1)=='D') {
                    save[j]+=(dputil[i-1]-(j==0?0:dputil[j-1]))%mod;
                    if (save[j]<0) {
                        save[j]+=mod;
                    }
                } 
                else {
                    save[j]+=(j==0?0:dputil[j-1]);
                }
                save[j]%=mod;
            }
            dputil=save;
        }
        return dputil[n];
    }
}