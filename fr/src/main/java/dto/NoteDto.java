package dto;

public class NoteDto {
    private String lastName;
    private String firstName;
    private String login;

    public NoteDto(String lastName, final String firstName, final String login) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.login = login;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }
}
