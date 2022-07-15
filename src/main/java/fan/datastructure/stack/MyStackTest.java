package fan.datastructure.stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(3);
        myStack.push(1);
        myStack.push("张三");
        myStack.push(2);
        myStack.push("李四");

        System.out.println(myStack.peek()); // 李四
        System.out.println(myStack.isEmpty()); // false
        System.out.println(myStack.size()); // 4
        for (int i = 0; i < 4; i++) {
            System.out.println(myStack.pop());
        }
    }
}
