package MyStack;

public class Test {
    public static void main(String[] args) {
        Methods<String> test = new MyStack<String>();

        test.push("String");
        test.push("Char");
        test.push("Int");

        //3
        System.out.println(test.size());

        //Int
        test.remove(1);
        System.out.println(test.get(1));

        //Int
        System.out.println(test.peek());

        //Int
        System.out.println(test.pop());

        //null
        test.clear();
        System.out.println(test.get(0));
    }
}
