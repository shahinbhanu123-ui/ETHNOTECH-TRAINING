
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Rahul");
        students.add("Sha");
        students.add("Sannu");

        System.out.println(students);

        students.addFirst("Hemanth");
        students.addLast("Ravi");

        System.out.println(students);

        students.remove("Sha");
        System.out.println(students);

        System.out.println("Size: " + students.size());
    }
}

