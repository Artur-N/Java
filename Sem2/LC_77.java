// Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].
// You may return the answer in any order

package Sem2;

import java.util.ArrayList;
import java.util.List;

public class LC_77 {
    static List<Integer> path = new ArrayList<>();
    static List<List<Integer>> ans = new ArrayList<>(); 

    public static void main(String[] args) {
        combine(4, 2, 0, 1);
        System.out.println(ans);
    }
    
    
    public static void combine(int n, int k, int index, int numb) {
        if (index == k) {
            ans.add(new ArrayList<>(path));
            return;
        }
        
        if (numb > n) {
            return;
        }
        
        for (int i = numb; i < n; i++) {
            path.add(i);
            combine(n, k, index + 1, i + 1);
            path.remove(path.size()-1);    
        }
        return;
            
            
    }    
        
    
} 
