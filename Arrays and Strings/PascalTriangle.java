// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:
// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Time complexity: O(n)
// Space Complexity: O(n)

import java.util.ArrayList;
import java.util.List;
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>res = new ArrayList<List<Integer>>();
        List<Integer>row, pre = null;
        for(int i=0; i<numRows; ++i){
            row = new ArrayList<Integer>();
            for(int j=0; j<=i; ++j)
                if(j == 0 || j==i)
                    row.add(1);
            else
                row.add(pre.get(j-1) + pre.get(j));
            pre=row;
            res.add(row);
        }
        return res;
        
    }
}
