package EveOnline.API.zKillboardAPI.Class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class Activepvp implements Serializable{

    @SerializedName("systems")
    //@Expose
    private Systems systems;
    @SerializedName("kills")
    //@Expose
    private Kills kills;

    public Systems getSystems() { return systems; }

    public void setSystems(Systems systems) { this.systems = systems; }

    public Kills getKills() {
        return kills;
    }

    public void setKills(Kills kills) {
        this.kills = kills;
    }

}