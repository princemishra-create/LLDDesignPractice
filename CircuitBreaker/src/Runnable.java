import java.util.Random;

public class Runnable {
    public StatusCode execute() {
        Random rand = new Random();
        int randomNum = rand.nextInt(10);
        return randomNum < 7 ? StatusCode.FAIL : StatusCode.SUCCESS;
    }
}