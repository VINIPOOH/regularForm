import controller.ConsoleController;
import model.Model;
import view.ConsoleView;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ConsoleController controller = new ConsoleController (new Model(), new ConsoleView());
        controller.start();
    }
}
