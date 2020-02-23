package controller;


import model.Model;
import model.RepeatedLoginException;
import view.ConsoleView;

import java.util.Scanner;


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
        try {
            model.addNote(inputNoteNoteBook.getNote());
        } catch (RepeatedLoginException e) {
            this.start();
        }
    }

}
