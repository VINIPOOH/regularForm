package model;


import dto.NoteDto;

import java.util.ArrayList;


public class Model {
    private ArrayList<NoteDto> noteDtos=new ArrayList<>();

    public Model() {
        this.noteDtos.add(new NoteDto("asdasdasd","sdassda","qqqqqqqq","333-33-33"));
    }

    public void addNote(NoteDto noteDto) throws RepeatedLoginException {
        if(checkLoginOnUnique(noteDto)){
            noteDtos.add(noteDto);
        }else {
            throw new RepeatedLoginException(noteDto);
        }
    }
    private boolean checkLoginOnUnique(NoteDto noteDto){
        for (NoteDto n: noteDtos){
            if (n.getLogin().equals(noteDto.getLogin())){
                return false;
            }
        }
        return true;
    }
}
