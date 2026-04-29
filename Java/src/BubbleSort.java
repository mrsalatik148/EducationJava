//Simple bubble sort algorithm :3

class BubSort {

    void main() {
        int[] array = {1,3,124,82,9,33};
        bubbleSort(array);
        for (int num : array) {
            IO.println(num  + " ");
        }
    }

    public int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }
}