
public class StackMain
{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();

        //stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();

    }


}