public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30};
        int[] brr = new int[]{30,50,10};
        ArrayDemo obj = new ArrayDemo();
        boolean result = obj.isSorted(arr);
        if(result){
            System.out.println("sorted");
        }
        else {
            System.out.println("unsorted");
        }
        result = obj.isSorted(brr);
        if(result){
            System.out.println("sorted");
        }
        else {
            System.out.println("unsorted");
        }
    }
    public boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i+1]){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
