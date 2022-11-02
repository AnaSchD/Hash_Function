import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TaskOfCollection {

    private static Set<String> task = new HashSet<>();
    private final int STUDENTS = 15;

    public static String generatePairNumbers() {
        int x;
        int y;
        Random ran = new Random();
        x = ran.nextInt(10);
        y = ran.nextInt(10);
        return x + "*" + y;
    }

    public static void main(String[] args) {
        int count = 0;
        while (count < 15) {
            String pairNumber = generatePairNumbers();
            String inverseNumber = pairNumber.charAt(2) + "*"+ pairNumber.charAt(0);
            if (!task.contains(pairNumber) && !task.contains(inverseNumber)) {
                task.add(pairNumber);
                count++;
            }
        }
        System.out.println(task);

    }


}
