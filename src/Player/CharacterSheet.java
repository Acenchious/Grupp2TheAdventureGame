package Player;

public class CharacterSheet {
    private String userName;
    private int age;

    public CharacterSheet(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
