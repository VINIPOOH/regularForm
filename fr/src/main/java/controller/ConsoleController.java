package controller;


import model.Model;
import view.ConsoleView;

import java.util.Scanner;

/**
 * Created by student on 26.09.2017.
 */
public class ConsoleController {
    private Model model;
    private ConsoleView view;

    public ConsoleController(Model model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(view, sc);
        inputNoteNoteBook.inputNote(view.regularTemplates);
    }
}
