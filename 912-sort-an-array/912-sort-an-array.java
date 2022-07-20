class Solution {
    public void merge(int[] nums, int l, int m, int r){
        int i, j, n1=m-l+1, n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(i=0;i<n1;i++)
            left[i]=nums[i+l];
        for(j=0;j<n2;j++)
            right[j]=nums[m+1+j];
        int k=l;
        i=0; 
        j=0;
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
    public void mergeSort(int[] nums, int l, int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergeSort(nums,l,m);
            mergeSort(nums,m+1,r);
            merge(nums,l,m,r);
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}