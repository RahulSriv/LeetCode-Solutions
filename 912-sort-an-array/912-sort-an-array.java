class Solution {
    public void merge(int[] nums, int l, int m, int r){
        int n1=m-l+1;
        int n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i=0,j=0;
        while(i<n1){
            left[i]=nums[l+i];
            i++;
        }
        while(j<n2){
            right[j]=nums[m+1+j];
            j++;
        }
        i=0;
        j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j])
                nums[k++]=left[i++];
            else
                nums[k++]=right[j++];
        }
        while(i<n1)
            nums[k++]=left[i++];
        while(j<n2)
            nums[k++]=right[j++];
    }
    public void sort(int[] nums, int l, int r){
        if(l<r){
            int m=l+(r-l)/2;
            sort(nums,l,m);
            sort(nums,m+1,r);
            merge(nums,l,m,r);
        }
    }
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1); 
        return nums;
    }
}