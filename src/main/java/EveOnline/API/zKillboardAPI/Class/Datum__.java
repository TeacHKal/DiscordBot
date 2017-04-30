package EveOnline.API.zKillboardAPI.Class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class Datum__ {

    @SerializedName("kills")
    @Expose
    private int kills;
    @SerializedName("characterID")
    @Expose
    private int characterID;
    @SerializedName("characterName")
    @Expose
    private String characterName;
    @SerializedName("corporationID")
    @Expose
    private int corporationID;
    @SerializedName("corporationName")
    @Expose
    private String corporationName;
    @SerializedName("cticker")
    @Expose
    private String cticker;
    @SerializedName("allianceID")
    @Expose
    private int allianceID;
    @SerializedName("allianceName")
    @Expose
    private String allianceName;
    @SerializedName("aticker")
    @Expose
    private String aticker;
    @SerializedName("shipTypeID")
    @Expose
    private int shipTypeID;
    @SerializedName("shipName")
    @Expose
    private String shipName;
    @SerializedName("groupID")
    @Expose
    private String groupID;
    @SerializedName("groupName")
    @Expose
    private String groupName;
    @SerializedName("solarSystemID")
    @Expose
    private int solarSystemID;
    @SerializedName("solarSystemName")
    @Expose
    private String solarSystemName;
    @SerializedName("sunTypeID")
    @Expose
    private String sunTypeID;
    @SerializedName("solarSystemSecurity")
    @Expose
    private String solarSystemSecurity;
    @SerializedName("systemColorCode")
    @Expose
    private String systemColorCode;
    @SerializedName("regionID")
    @Expose
    private int regionID;
    @SerializedName("regionName")
    @Expose
    private String regionName;

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCorporationID() {
        return corporationID;
    }

    public void setCorporationID(int corporationID) {
        this.corporationID = corporationID;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    public String getCticker() {
        return cticker;
    }

    public void setCticker(String cticker) {
        this.cticker = cticker;
    }

    public int getAllianceID() {
        return allianceID;
    }

    public void setAllianceID(int allianceID) {
        this.allianceID = allianceID;
    }

    public String getAllianceName() {
        return allianceName;
    }

    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }

    public String getAticker() {
        return aticker;
    }

    public void setAticker(String aticker) {
        this.aticker = aticker;
    }

    public int getShipTypeID() {
        return shipTypeID;
    }

    public void setShipTypeID(int shipTypeID) {
        this.shipTypeID = shipTypeID;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getSolarSystemID() {
        return solarSystemID;
    }

    public void setSolarSystemID(int solarSystemID) {
        this.solarSystemID = solarSystemID;
    }

    public String getSolarSystemName() {
        return solarSystemName;
    }

    public void setSolarSystemName(String solarSystemName) {
        this.solarSystemName = solarSystemName;
    }

    public String getSunTypeID() {
        return sunTypeID;
    }

    public void setSunTypeID(String sunTypeID) {
        this.sunTypeID = sunTypeID;
    }

    public String getSolarSystemSecurity() {
        return solarSystemSecurity;
    }

    public void setSolarSystemSecurity(String solarSystemSecurity) {
        this.solarSystemSecurity = solarSystemSecurity;
    }

    public String getSystemColorCode() {
        return systemColorCode;
    }

    public void setSystemColorCode(String systemColorCode) {
        this.systemColorCode = systemColorCode;
    }

    public int getRegionID() {
        return regionID;
    }

    public void setRegionID(int regionID) {
        this.regionID = regionID;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

}
