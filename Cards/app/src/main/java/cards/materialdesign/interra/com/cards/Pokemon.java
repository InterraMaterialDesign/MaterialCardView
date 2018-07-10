package cards.materialdesign.interra.com.cards;


public class Pokemon {

    private String name;
    private String type;
    private String ability;
    private int image;
    private boolean state;

    public Pokemon(String name, String type, String ability, int image) {
        this.name = name;
        this.type = type;
        this.ability = ability;
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    public boolean getState() {
        return this.state;
    }


}
