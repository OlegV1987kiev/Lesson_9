public class Lesson_9_2 {
    public static void main(String[] args) {

        System.out.println(divideByZero());

    }
    private static int divideByZero() {

        int a = 5;

        int b = 0;

        try {

            return a / b;

        } catch (ArithmeticException ae) {

            System.out.println("Division by zero");

            System.err.println(ae.getClass() + ". Exception get message: " + ae.getMessage());

        }

        return 0;

    }

}

