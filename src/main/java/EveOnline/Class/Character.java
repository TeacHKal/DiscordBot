package EveOnline.Class;

/**
 * Created by teach on 4/14/2017.
 */

public class Character {

    private String name;
    private String corporation;
    private String alliance;
    private int shipKill;
    private int shipLost;
    private float iskDestroyed;
    private int activeShipDestroyed;

    private int characterID;

    //========================================================================
    public Character()
    {



    }



    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    public String getAlliance() {
        return alliance;
    }

    public void setAlliance(String alliance) {
        this.alliance = alliance;
    }

    public int getShipKill() {
        return shipKill;
    }

    public void setShipKill(int shipKill) {
        this.shipKill = shipKill;
    }

    public int getShipLost() {
        return shipLost;
    }

    public void setShipLost(int shipLost) {
        this.shipLost = shipLost;
    }

    public float getIskDestroyed() {
        return iskDestroyed;
    }

    public void setIskDestroyed(float iskDestroyed) {
        this.iskDestroyed = iskDestroyed;
    }

    public int getActiveShipDestroyed() {
        return activeShipDestroyed;
    }

    public void setActiveShipDestroyed(int activeShipDestroyed) {
        this.activeShipDestroyed = activeShipDestroyed;
    }





}
