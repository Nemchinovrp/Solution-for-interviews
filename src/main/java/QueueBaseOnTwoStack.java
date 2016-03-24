import java.util.Stack;

public class QueueBaseOnTwoStack<T> {
    Stack<T> s1;
    Stack<T> s2;
    int size = 0;

    public QueueBaseOnTwoStack(int size) {
        this.size = size;
        s1 = new Stack<T>();
        s2 = new Stack<T>();
    }

    public void add(T o) {
        s1.push(o);

    }

    public void flushQueue() {
        for (int i = 0; i < size; i++) {
            s2.push(s1.pop());
        }

    }

    public Object popQueue() {
        return s2.pop();
    }

    public static void main(String[] args) {
        QueueBaseOnTwoStack<Integer> queue = new QueueBaseOnTwoStack<Integer>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.flushQueue();
        System.out.println(queue.popQueue());
        System.out.println(queue.popQueue());
        System.out.println(queue.popQueue());
        System.out.println(queue.popQueue());
        QueueBaseOnTwoStack<String> queueS = new QueueBaseOnTwoStack<String>(4);
        queueS.add("Один");
        queueS.add("Два");
        queueS.add("Три");
        queueS.add("Четыре");
        queueS.flushQueue();
        System.out.println(queueS.popQueue());
        System.out.println(queueS.popQueue());
        System.out.println(queueS.popQueue());
        System.out.println(queueS.popQueue());
    }
}
