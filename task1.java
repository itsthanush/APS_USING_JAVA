package week1;
import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class task1 {
    public static void main(String[] args) {
    
        List<Student> students = Arrays.asList(
            new Student("Arun", 85),
            new Student("Bala", 92),
            new Student("Charan", 85),
            new Student("Divya", 95),
            new Student("Esha", 92),
            new Student("Farhan", 88)
        );

        int K = 3; 

        String result = students.stream()
                .sorted(Comparator.comparingInt((Student s) -> s.marks).reversed()
                        .thenComparing(s -> s.name))
                .limit(K)
                .map(s -> s.name)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
