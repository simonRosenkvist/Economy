package experis;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static float prev;
    static float current;

    public static void main(String[] args) {

        init();

    }

    public static void init() {
        APIHandler api = new APIHandler();
        ColorHandler color = new ColorHandler();
        current = api.call();

        int delay = 0;   // delay for 0 sec.
        int interval = 5000;  // iterate every 5 sec.
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                current = api.call();

                if (current > prev) {
                    color.makeRed(String.valueOf(current));
                }

                    else  if (current < prev) {
                        color.makeGreen(String.valueOf(current));
                    }

                        else {
                            System.out.println(current);
                        }

                             prev = current;
            }
        }, delay, interval); // end timer


    }

}
