class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int res=-1, mindist=Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++){
            if(points[i][0]==x || points[i][1]==y){
                int dist=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                if(dist<mindist){
                    mindist=dist;
                    res=i;
                }
            }
        }
        return res;
    }
}