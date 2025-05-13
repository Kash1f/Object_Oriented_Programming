package JavaSmallProjects.DiceProgram;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(6) + 1;
        System.out.println("You rolled a " + x);

    }
}
