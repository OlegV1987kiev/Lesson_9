import java.util.Scanner;
public class Lesson_9_6 {
    public static void main(String[] args) {

        readData();

    }

    private static void readData() {

        Scanner in = new Scanner(System.in);

        StringBuilder myBuilder = new StringBuilder();

        try {

            while (true) {

                myBuilder.append(Integer.valueOf(in.nextInt())).append(" ");

            }

        } catch (Exception e) {

            System.out.println(myBuilder.toString());

        }

    }
}
