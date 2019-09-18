package experis;

public class Main {
    static float prev;
    static float current;

    public static void main(String[] args) {

        init();

    }

    public static void init() {
        APIHandler api = new APIHandler();
        //ColorHandler color = new ColorHandler();
        current = api.call();
/*
        if (current < prev) {
            //make red
            System.out.println(color.makeRed(current.toString()));
        }
        else if ( current > prev) {
            //make green
            System.out.println(color.makeGreen(current.toString()));
        }
        else {
            //make white
        }
*/
        prev = current;

        System.out.println(api.call());

    }

}
