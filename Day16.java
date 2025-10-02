// Reverse Array Problem

public class Day16 {
    public void swap(char arr , int left , int right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;


    }

    public void reverse(char arr , int left , int right){
        int left = 0 , right = arr.length - 1;
        while(left <= right){
            swap(arr,left,right);

        }
        right--;
        left++;
    }
}
