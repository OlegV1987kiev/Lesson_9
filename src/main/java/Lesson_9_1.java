public class Lesson_9_1 {
    public static void main(String[] args) throws Exception {

        int number = 0;

        if (number < 0) {

            System.out.println("Number < 0");

        } else if (number  > 0) {

            System.out.println("Number > 0");

        } else if (number == 0) {

            throw new Exception();

        }

    }
}
