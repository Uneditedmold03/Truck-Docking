import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Terminal> terminalarray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        Terminal Lastplats = new Terminal();
        Menu intake = new Menu();

        for (Terminal looptoprint : terminalarray) {
            System.out.println(looptoprint);
        }



    }
}