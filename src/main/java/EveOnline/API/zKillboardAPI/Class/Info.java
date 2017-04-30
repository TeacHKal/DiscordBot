package EveOnline.API.zKillboardAPI.Class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class Info {

    @SerializedName("allianceID")
    @Expose
    private int allianceID;
    @SerializedName("corporationID")
    @Expose
    private int corporationID;
    @SerializedName("factionID")
    @Expose
    private int factionID;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("killID")
    @Expose
    private int killID;
    @SerializedName("lastApiUpdate")
    @Expose
    private LastApiUpdate lastApiUpdate;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("secStatus")
    @Expose
    private double secStatus;
    @SerializedName("type")
    @Expose
    private String type;

    public int getAllianceID() {
        return allianceID;
    }

    public void setAllianceID(int allianceID) {
        this.allianceID = allianceID;
    }

    public int getCorporationID() {
        return corporationID;
    }

    public void setCorporationID(int corporationID) {
        this.corporationID = corporationID;
    }

    public int getFactionID() {
        return factionID;
    }

    public void setFactionID(int factionID) {
        this.factionID = factionID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKillID() {
        return killID;
    }

    public void setKillID(int killID) {
        this.killID = killID;
    }

    public LastApiUpdate getLastApiUpdate() {
        return lastApiUpdate;
    }

    public void setLastApiUpdate(LastApiUpdate lastApiUpdate) {
        this.lastApiUpdate = lastApiUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSecStatus() {
        return secStatus;
    }

    public void setSecStatus(double secStatus) {
        this.secStatus = secStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
