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
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      int [] integersToSort = {9, 7, 1, 6, 2, 3};
      System.out.print("Unsorted integers-->");
      printArray(integersToSort);
      System.out.println("");
      BubbleSort.sort(integersToSort);
      System.out.println("");
      printArray(integersToSort);
      
      System.out.println("");
      int [] integersToSort2 = {8, 1, 7, 2, 5};
      System.out.print("Unsorted integers-->");
      printArray(integersToSort2);
      System.out.println("");
      BubbleSort.sort(integersToSort2);
      System.out.println("");
      printArray(integersToSort2);
      
      System.out.println("");
      int [] integersToSort3 = {9, 7, 3, 1, 4};
      System.out.print("Unsorted integers-->");
      printArray(integersToSort3);
      System.out.println("");
      BubbleSort.sort(integersToSort3);
      System.out.println("");
      printArray(integersToSort3);
      
      System.out.println("");
      int [] integersToSort4 = {5, -5, -6, -4, 1, 7};
      System.out.print("Unsorted integers-->");
      printArray(integersToSort4);
      System.out.println("");
      BubbleSort.sort(integersToSort4);
      System.out.println("");
      printArray(integersToSort4);
      
      System.out.println("");
      int [] integersToSort5 = {42, 30, -5, 7, 1, 50};
      System.out.print("Unsorted integers-->");
      printArray(integersToSort5);
      System.out.println("");
      BubbleSort.sort(integersToSort5);
      System.out.println("");
      printArray(integersToSort5);
      
      SelectionSort selectionSort = new SelectionSort();
      
      System.out.println("");
      int [] integersToSort6 = {42, 30, -5, 7, 1, 50};
      System.out.println("Sorting integers by SELECTION SORT");
      printArray(integersToSort6);
      int[] sortedArray = selectionSort.sort(integersToSort6);
      System.out.println("");
      printArray(sortedArray);
      
      LinearSearch linearSearch = new LinearSearch();

      
}
   
public static void printArray(int [] integers) {
  int n = integers.length;
  for(int i = 0 ; i < n ; i++){
      System.out.print(integers[i] + " , ");
  }
  System.out.println(" ");
}
}
