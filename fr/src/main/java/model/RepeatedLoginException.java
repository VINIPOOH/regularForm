package model;

import dto.NoteDto;

public class RepeatedLoginException extends Exception {
    private NoteDto noteDto;

    public RepeatedLoginException(NoteDto noteDto) {
        this.noteDto = noteDto;
    }
}
