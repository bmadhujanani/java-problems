package com.sorting.techniques;

package com.example.Sorting.QuickSort;
import java.util.Arrays;
public class QuickSort {
  public static int partition(int[] arr, int left, int right) {
      int pivot = arr[left];
      int i = left;
      int j = right;
      while (i < j) {
          while (i <= right && arr[i] <= pivot) {
              i++;
          }
          while (j >= left && arr[j] > pivot) {
              j--;
          }
          if (i < j) {
              swap(arr, i, j);
          }
      }
      swap(arr, j, left);
      //System.out.println(Arrays.toString(arr));
      return j;
  }

  public static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }

  public static void quickSort(int[] arr, int left, int right) {
      if (left < right) {
          int pivot = partition(arr, left, right);
          quickSort(arr, left, pivot - 1);
          quickSort(arr, pivot + 1, right);
      }
  }

  public static void main(String[] args) {
      int[] arr = {5, 12, 4, 9, 2, 7, 1, 10};
      quickSort(arr, 0, arr.length - 1);
      System.out.println(Arrays.toString(arr));
  }
}
