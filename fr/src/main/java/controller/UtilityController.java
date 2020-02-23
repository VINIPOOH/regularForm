package controller;

import view.ConsoleView;
import java.util.Scanner;


public class UtilityController {
    private Scanner scanner;
    private ConsoleView view;

    public UtilityController(Scanner scanner, ConsoleView view) {
        this.scanner = scanner;
        this.view = view;
    }
    //проверяет ввод пользователя
    String inputStringValueAndCheckRegularForms(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }
}
