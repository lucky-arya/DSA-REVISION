public class ReverseAnArray{
    public void reverse(int[] arr, int n) {
        helper(arr, 0, n-1);
    }

    private void helper(int arr[],int left,int right){
        if(left>=right){
            return;
        }

        arr[left] =  arr[left] ^ arr[right];
        arr[right] = arr[left] ^ arr[right];
        arr[left] = arr[left] ^ arr[right];

        helper(arr, left+1, right-1);
        
    }


    public void printArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseAnArray r = new ReverseAnArray();
        int arr[] = {1,2,3,4,5};
        r.reverse(arr, arr.length);

        r.printArray(arr);
        

    }
}