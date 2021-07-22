public class TestHeap {
    public void  createHeap(int[] array){
        for (int parent = array.length-1; parent >= 0; parent--) {
            int child = 2*parent+1;
            while (child<array.length){
                if (child+1<array.length){
                    child = array[child]>array[child+1]?child:child+1;
                    if (array[child]>array[parent]){
                        int tmp = array[child];
                        array[child] = array[parent];
                        array[parent] = tmp;
                    }else {
                        break;
                    }
                }else {
                    if (array[child]>array[parent]){
                        int tmp = array[child];
                        array[child] = array[parent];
                        array[parent] = tmp;
                    }else {
                        break;
                    }
                }
                parent = child;
                child = 2*parent+1;
            }
        }
    }
}
