public class Main {
    public static void main(String[] args) {

        Stack stack = new StackArray();
        stack.push("String");
        stack.push(12);
        stack.peek();
        System.out.println("Pop= " + stack.pop());
        stack.peek();
        System.out.println("Pop= " + stack.pop());
        System.out.println("Is empty " + stack.isEmpty());
        stack.peek();
        System.out.println("Pop= " + stack.pop());
        StackLinkedList stack1 = new StackLinkedList();
        stack1.push(5);
        stack1.push("It is a String");
        stack1.peek();
        System.out.println(stack1.top.getItem());
        System.out.println(stack1.top.getNext().getNext());
    }
}