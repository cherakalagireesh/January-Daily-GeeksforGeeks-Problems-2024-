//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.maxOdd(s));
        }
    }
}
// } Driver Code Ends


class Solution {

    String maxOdd(String s) {
        
        int length  = s.length();
        
        for( int i = length - 1 ; i >= 0 ; i--)
        {
            int currNum = s.charAt(i) - '0';
            
            if(currNum % 2 == 1)
                return s.substring(0, i + 1);
        }
        
        return "";
    }
}