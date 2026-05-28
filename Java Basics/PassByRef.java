public class PassByRef {
   public void reverse(int[] arr) {
   int left=0;
   int right = arr.length-1;
   while(left<right){
    int temp = arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    left++;
    right--;
   }
}
public static void main(String[] args) {
    PassByRef pbr = new PassByRef();
    int[] arr = {1, 2, 3, 4, 5};
    pbr.reverse(arr);
    for (int num : arr) {
        System.out.print(num + " ");
    }
}
}