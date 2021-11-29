public class Stack<E> { // 栈
    private Object[] datas;
    private int maxSize;    // 最大个数
    private int currentSize;    // 当前存储数据个数

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        datas = new Object[maxSize];
    }

    // 入栈
    public void push(E data) {
        if (currentSize < maxSize) {
            datas[currentSize++] = data;
        } else {
            System.out.println("栈已满！");
        }
    }

    // 出栈
    public E pop() throws Exception {
        if (currentSize == 0) {
            throw new Exception("栈空！");
        }
        return (E) datas[--currentSize];
    }
}
