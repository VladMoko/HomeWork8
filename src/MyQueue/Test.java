package MyQueue;

public class Test {
    public static void main(String[] args) {
        Methord<String> test = new MyQueue<String>();
        test.add("String");
        test.add("Char");
        test.add("Int");
        System.out.println(test.get(0));
        System.out.println();

        //Int
        test.remove(0);
        System.out.println(test.get(0));
        System.out.println();

        //2
        System.out.println(test.size());
        System.out.println();

        //Char
        System.out.println(test.peek());
        System.out.println();

        //Char
        System.out.println(test.poll());
        System.out.println();

        //null
        test.clear();
        System.out.println(test.get(0));
    }
}
