package EveOnline.API.zKillboardAPI.Class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class Trophies {

    @SerializedName("levels")
    @Expose
    private int levels;
    @SerializedName("max")
    @Expose
    private int max;

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

}
