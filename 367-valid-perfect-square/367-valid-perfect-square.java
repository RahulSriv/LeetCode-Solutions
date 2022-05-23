class Solution {
    public boolean isPerfectSquare(int num) {
        long low=0, high=num;
        long mid=low+(high-low)/2;
        while(low<=high){
            if(mid*mid==num)
                return true;
            else if(mid*mid>num)
                high=mid-1;
            else
                low=mid+1;
            mid=low+(high-low)/2;
        }
        return false;
    }
}

// double r=Math.sqrt(num);
//         if(r%1!=0)
//             return false;
//         return true;