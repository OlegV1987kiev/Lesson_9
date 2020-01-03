import java.util.*;

public class Lesson_9_7 {
    private String first, last;

    public Lesson_9_7(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public static void main(String[] args){
        Set<Lesson_9_7> s = new HashSet<>();
        s.add(new Lesson_9_7("Donald", "Duck"));
        System.out.println(s.contains(new Lesson_9_7("Donald", "Duck")));
    }
    }

