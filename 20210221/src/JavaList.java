import java.util.Arrays;

public class JavaList {
    public int[] elem;
    public int useSize;
    public JavaList() {
        this.elem = new int[10];
        this.useSize = 0;
    }
    public boolean contains(int toFind) {
        for (int i = 0; i <this.useSize ; i++) {
            if (toFind==elem[i]) {
                return true;
            }
        }
        return false;
    }
    public int search(int toFind) {
        for (int i = 0; i <this.useSize ; i++) {
            if(elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    public boolean isList() {
        if (this.useSize==0) {
            return true;
        }
        return false;
    }
    public int getPos(int pos) {
        if(isList()) {
            throw new RuntimeException("顺序表为空");
        }
        if(pos<0||pos>=this.useSize) {
            throw new RuntimeException("pos不合法");
        }
        return this.elem[pos];
    }
    public int checkData(int data) {
        for (int i = 0; i <this.useSize ; i++) {
            if(data==elem[i]) {
                return i;
            }
        }
        throw new RuntimeException("数据不存在");
    }
    public void delete(int data) {
            for (int i = checkData(data); i <useSize-1 ; i++) {
                elem[i] = elem[i+1];
            }
            this.useSize--;
        }
        public void clear() {
            this.useSize=0;
        }
    public boolean isFull() {
        if(this.useSize==this.elem.length) {
            return true;
        }
        return false;
    }
    public void Display() {
        for (int i = 0; i <this.useSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    public void add(int pos,int data) {
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        if(pos<0||pos>this.useSize) {
            return;
        }
        for (int i = this.useSize-1; i >=pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        useSize++;
    }
}
