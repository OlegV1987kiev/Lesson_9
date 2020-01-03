public class Lesson_9_3 {
    public static void main(String[] args) {

        try {

            int a = args.length;

            System.out.println(a);
            int e = 10 / a;

            int[] c = {1};

            System.out.println(c[3]);

        } catch (Exception e) {

            System.out.println(e.getCause());

        }

    }
}
