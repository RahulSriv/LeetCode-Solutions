// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> a=new ArrayList<String>();
    public List<String> getSubSequences(String op, String ip){
        if(ip.length()==0){
           a.add(op);
        }
        else { 
            getSubSequences(op+ip.charAt(0),ip.substring(1));
            getSubSequences(op,ip.substring(1));
        }
        return a;
    }
    public List<String> AllPossibleStrings(String s)
    {
        
        a=getSubSequences("",s);
        Collections.sort(a);
        a.remove(0);
        return a;
    }
}