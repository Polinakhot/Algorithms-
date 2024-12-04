import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        Algorithms nums = new Algorithms("Numbers.txt");
        System.out.println(nums.odds());
    }
}
