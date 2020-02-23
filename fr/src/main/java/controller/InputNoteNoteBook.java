package controller;


import dto.NoteDto;
import view.ConsoleView;

import java.util.ResourceBundle;
import java.util.Scanner;


public class InputNoteNoteBook implements TextConstant, RegexConstantLinks{
    private ConsoleView view;
    private Scanner sc;

    private String lastName;
    private String firstName;
    private String login;

    public InputNoteNoteBook(ConsoleView view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote(ResourceBundle regularTemplates) {
        UtilityController utilityController =
                new UtilityController(sc, view);

        this.lastName =
                utilityController.inputStringValueAndCheckRegularForms
                        (LAST_NAME_INVITE_MASSAGE, regularTemplates.getString(LAST_NAME_TEMPLATE));
        this.firstName =
                utilityController.inputStringValueAndCheckRegularForms
                        (NAME_INVITE_MASSAGE, regularTemplates.getString(NAME_TEMPLATE));
        this.login=
                utilityController.inputStringValueAndCheckRegularForms
                        (LOGIN_INPUT_MASSAGE, regularTemplates.getString(LOGIN_TEMPLATE));
    }
    public NoteDto getNote(){
        return new NoteDto(lastName,firstName,login);
    }
}
