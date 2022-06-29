import java.util.Arrays;

public class Test {
    public class ABC{
        public static void main(String[] args) {
            System.out.println("hello, i am nested !");
        }
    }
    public static void main(String[] args) {
        Pair<String,Double>[ ] holdings;
        holdings = new Pair[25]; // correct, but warning about unchecked cast
        holdings[0] = new Pair<>("ORAL", 32.07);

        System.out.println(Arrays.toString(holdings));
        System.out.println(holdings[0].getFirst());

        ABC.main(new String[]{"1", "2"});
        
    }
}

class Pair<A, B>{
    A first;
    B second;
    public Pair(A a, B b) { // constructor
        first = a;
        second = b;
    }

    public A getFirst( ) {
        return first;
    }
    public B getSecond( ) {
        return second;
    }
}
