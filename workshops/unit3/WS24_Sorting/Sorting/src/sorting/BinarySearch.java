/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author FAMILIA TONATO
 */
public class BinarySearch {
    
int binarySearch (int elements [], int x, int left, int right){
    if (right >= left){
        int mid = left +(right - left)/2;
        if(elements [mid] == 0)
            return mid;
        int[] arr = null;
        
        if(elements [mid] > x)
            return binarySearch(arr, left, mid-1, x);
        return binarySearch(elements, mid + 1, right, x);
    }
    return -1;
}
}
