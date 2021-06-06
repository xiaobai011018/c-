import java.util.Stack;

class Node {
    public int val;
    public Node next;
    public Node(int val) {
        this.val = val;
    }
}
class MyQueue2 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue2() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(empty()){
            return -1;
        }
        if(stack2.isEmpty()){
            for(int i = 0;i<stack1.size();i++){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(empty()){
            return -1;
        }
        if(stack2.isEmpty()){
            for(int i = 0;i<stack1.size();i++){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
public class MyQueue {
    private Node first;
    private Node last;
    //入队
    public void offer(int val) {
        if (first==null){
            first = new Node(val);
            last = first;

            return;
        }
        //尾插法  需要判断是不是第一次插入
        first.next = new Node(val);
        first = first.next;
    }
    //出队
    public int poll() {
        if (first==null){
            throw new RuntimeException("队列为空");
        }
        //1判断是否为空的
        int val = first.val;
        this.first = this.first.next;
        return val;
    }
    //得到队头元素但是不删除
    public int peek() {
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        //不要移动first
        int val = first.val;
        return val;
    }
    //队列是否为空
    public boolean isEmpty() {
        return first==null;
    }
}