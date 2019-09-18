package experis;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static float prev;
    static float current;

    public static void main(String[] args) {

        init();

    }

    public static void init() {
        APIHandler a = new APIHandler();
        current = a.call();

        if (current < prev) {
            //make red
        }
        else if ( current > prev) {
            //make green
        }
        else {
            //make white
        }

        prev = current;

        System.out.println(a.call());

    }

    }
}
