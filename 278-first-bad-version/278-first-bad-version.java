/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1, end=n;   
        while(start<n){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)==true && (isBadVersion(mid-1)==false || mid==1)){
                return mid;
            }
            else if(isBadVersion(mid)==true && (isBadVersion(mid-1)==true)){
                end=mid-1;
            }
            else if(isBadVersion(mid)==false){
                start=mid+1;
            }
        }
        return n;
    }
}