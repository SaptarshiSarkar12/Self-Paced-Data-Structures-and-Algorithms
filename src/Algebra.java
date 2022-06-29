public class Algebra {
    public static void main(String[] args) {
        System.out.println("The difference between the functions are : " + functionDifference(2, 4));
    }

    public static double functionDifference(int x, int y){
        return (Math.pow(x, 2) + 2 * x + 4) - ((-Math.pow(y, 2)) - (20 * y) - 1);
    }
}
