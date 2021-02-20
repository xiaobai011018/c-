public class MyArrayList {
    public int[] elem;
    public int count;
    public static final int intNum = 10;
    public MyArrayList() {
        this.elem = new int[intNum];
        this.count = 0;
    }
        public void add(int pos, int data) {
            if (pos<0||pos>this.count) {
                return;
            }
            for (int i = this.count; i >=pos ; i--) {
                this.elem[i+1] = this.elem[i];
            }
            this.elem[pos] = data;
        }
    }

