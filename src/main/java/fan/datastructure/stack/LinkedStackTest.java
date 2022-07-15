package fan.datastructure.stack;

public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack<Object> linkedStack = new LinkedStack<>();
        linkedStack.push("张三");
        linkedStack.push(1);
        linkedStack.push(2);

        linkedStack.pop();
        System.out.println("栈顶元素：" + linkedStack.peek());
        System.out.println("链表长度：" + linkedStack.getLength());
        linkedStack.queryAll();
    }
}
