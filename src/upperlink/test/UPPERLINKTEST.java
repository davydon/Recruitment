/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upperlink.test;

import java.util.HashSet;

/**
 *
 * @author USER
 */
public class UPPERLINKTEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        
    }
    public int solution(int[] A) 
{
    int i = 0,
        count = 0,
        N = A.length;
    int[] B = new int[100001];      // Initially all entries are zero

    for (i = 0; i < N; i++)         // Copy all entries > 0 into array B ...
        if (A[i] > 0 && A[i] < 100001)
        {
            B[A[i]] = A[i];         // ... putting value x at index x in B ...
            count++;                // ... and keep a count of positives
        }

    for (i = 1; i < count + 1; i++) // Find first empty element in B 
        if (B[i] == 0)              
            return i;               // Index of empty element = missing int 

                                    // No unfilled B elements above index 0 ? 
    return count + 1;               // => return int above highest filled element
}
 
    
}
