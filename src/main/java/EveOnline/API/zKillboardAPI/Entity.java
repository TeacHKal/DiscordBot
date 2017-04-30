package EveOnline.API.zKillboardAPI;

import EveOnline.API.zKillboardAPI.Class.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class Entity {

    public transient static final String PLAYER = "characterID";
    public transient static final String CORPORATION = "corporationID";
    public transient static final String ALLIANCE = "allianceID";

    //@SerializedName("calcTrophies")
    //@Expose
    //private Boolean calcTrophies;
    //@SerializedName("groups")
    //@Expose
    //private Groups groups;
    //@SerializedName("id")
    //@Expose
    //private int id;
    @SerializedName("iskDestroyed")
    @Expose
    private float iskDestroyed;
    @SerializedName("iskLost")
    @Expose
    private float iskLost;
    //@SerializedName("months")
    //@Expose
    //private Months months;
    @SerializedName("pointsDestroyed")
    @Expose
    private int pointsDestroyed;
    @SerializedName("pointsLost")
    @Expose
    private int pointsLost;
    //@SerializedName("sequence")
    //@Expose
    //private int sequence;
    @SerializedName("shipsDestroyed")
    @Expose
    private int shipsDestroyed;
    @SerializedName("shipsLost")
    @Expose
    private int shipsLost;
    @SerializedName("soloKills")
    @Expose
    private int soloKills;
    @SerializedName("soloLosses")
    @Expose
    private int soloLosses;
    //@SerializedName("topAllTime")
    //@Expose
    //private Object topAllTime;
    //@SerializedName("trophies")
    //@Expose
    //private Trophies trophies;
    //@SerializedName("type")
    //@Expose
    //private String type;
    @SerializedName("activepvp")
    @Expose
    private Activepvp activepvp;
    @SerializedName("info")
    @Expose
    private Info info;

//    public Boolean getCalcTrophies() {
//        return calcTrophies;
//    }

//    public void setCalcTrophies(Boolean calcTrophies) {
//        this.calcTrophies = calcTrophies;
//    }
//
//    public Groups getGroups() {
//        return groups;
//    }
//
//    public void setGroups(Groups groups) {
//        this.groups = groups;
//    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public float getIskDestroyed() {
        return iskDestroyed;
    }

    public void setIskDestroyed(Float iskDestroyed) {
        this.iskDestroyed = iskDestroyed;
    }

    public float getIskLost() {
        return iskLost;
    }

    public void setIskLost(Float iskLost) {
        this.iskLost = iskLost;
    }

//    public Months getMonths() {
//        return months;
//    }
//
//    public void setMonths(Months months) {
//        this.months = months;
//    }

    public int getPointsDestroyed() {
        return pointsDestroyed;
    }

    public void setPointsDestroyed(int pointsDestroyed) {
        this.pointsDestroyed = pointsDestroyed;
    }

    public int getPointsLost() {
        return pointsLost;
    }

    public void setPointsLost(int pointsLost) {
        this.pointsLost = pointsLost;
    }

//    public int getSequence() {
//        return sequence;
//    }
//
//    public void setSequence(int sequence) {
//        this.sequence = sequence;
//    }

    public int getShipsDestroyed() {
        return shipsDestroyed;
    }

    public void setShipsDestroyed(int shipsDestroyed) {
        this.shipsDestroyed = shipsDestroyed;
    }

    public int getShipsLost() {
        return shipsLost;
    }

    public void setShipsLost(int shipsLost) {
        this.shipsLost = shipsLost;
    }

    public int getSoloKills() {
        return soloKills;
    }

    public void setSoloKills(int soloKills) {
        this.soloKills = soloKills;
    }

    public int getSoloLosses() {
        return soloLosses;
    }

    public void setSoloLosses(int soloLosses) {
        this.soloLosses = soloLosses;
    }

//    public Object getTopAllTime() {
//        return topAllTime;
//    }
//
//    public void setTopAllTime(Object topAllTime) {
//        this.topAllTime = topAllTime;
//    }
//
//    public Trophies getTrophies() {
//        return trophies;
//    }
//
//    public void setTrophies(Trophies trophies) {
//        this.trophies = trophies;
//    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
    public Activepvp getActivepvp() {
        return activepvp;
    }

    public void setActivepvp(Activepvp activepvp) {
        this.activepvp = activepvp;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

}
