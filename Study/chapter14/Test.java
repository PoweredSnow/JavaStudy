public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
    }
}
