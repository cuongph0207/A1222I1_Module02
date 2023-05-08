package module2.baitap.s14_thuat_toan_sap_xep.cai_dat_thuat_toan_sap_xep_chen;


import java.util.Arrays;

public class Main {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 6, 1, 8, 2, 4 };
        System.out.println("Mảng chưa sắp xếp: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }


}
