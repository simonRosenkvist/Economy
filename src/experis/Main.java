package experis;

public class Main {

    public static void main(String[] args) {

        init();
    }

    public static void init() {
        APIHandler a = new APIHandler();
        System.out.println(a.call());
    }
}
