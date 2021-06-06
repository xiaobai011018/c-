import java.util.ArrayList;

public class MyStack {
    private int[] elem;//数组
    private int top;//当前可以存放数据元素的下标-》栈顶指针

    public MyStack() {
        this.elem = new int[10];
    }

    /**
     * 入栈操作
     * @param item 入栈的元素
     */
    public void push(int item) {
        //1、判断当前栈是否是满的
        if (top==elem.length){
            System.out.println("栈已满");
            return;
        }
        //2、elem[top] = item  top++;
        elem[top++] = item;
    }

    /**
     * 出栈
     * @return 出栈的元素
     */
    public int pop() {
        return elem[--top];
    }

    /**
     * 得到栈顶元素，但是不删除
     * @return
     */
    public int peek() {
        return elem[top-1];
    }

    public boolean empty(){
        return top==-1;
    }

}