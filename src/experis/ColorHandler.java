package experis;

public class ColorHandler {

    private static final String ANSI_BRIGHT_RED    = "\u001B[91m";
    private static final String ANSI_BRIGHT_GREEN  = "\u001B[92m";
    private static final String[] FOREGROUNDS = { ANSI_BRIGHT_RED, ANSI_BRIGHT_GREEN };


    public ColorHandler(){

    }

    public void makeRed(String message){
        String setColor = FOREGROUNDS[0];
        System.out.println(setColor + message);
    }

    public void makeGreen(String message){
        String setColor = FOREGROUNDS[1];
        System.out.println(setColor + message);
    }

}
