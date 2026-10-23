package Player;

public class CharacterSheet {
    private String characterName;
    private int level = 1;
    private int health = 100;
    private Inventory inventory = new Inventory();

    public CharacterSheet() {
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        characterName = characterName;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Inventory getInventory() {
        System.out.println("Nu visar jag dig mitt inventory");
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    //Metoder
    public void levelUp() {
        level++;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}
