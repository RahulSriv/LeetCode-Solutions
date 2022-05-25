class Solution {
    public double average(int[] salary) {
        double sum=0;
        double min=salary[0], max=salary[0];
        for(int x:salary){
            sum+=x;
            if(x>max)
                max=x;
            if(x<min)
                min=x;
        }
        sum-=(max+min);
        return sum/(salary.length-2);
    }
}