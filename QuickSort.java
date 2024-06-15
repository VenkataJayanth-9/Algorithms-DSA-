public class QuickSort {
    public static void Algorithm(int[] array, int low, int high){
        if(low<high){
            int result = divide(array, low, high);
            Algorithm(array, low, result-1);
            Algorithm(array, result+1, high);
        }
    }
    public static int divide(int[] array, int low, int high){
        int pivort = array[high];
        int i = low-1;
        for(int j = low; j<high; j++){
            if(array[j]<=pivort){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] array = new int[]{4, 23, 10, 9, 12, 42, 82, 18};
        int size = array.length;
        Algorithm(array, 0, size-1);
        for(int i = 0; i<size; i++){
            System.out.println(array[i]+" ");
        }
    }
}
