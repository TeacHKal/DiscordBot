package EveOnline.API.zKillboardAPI.Class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class Characters {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("count")
    @Expose
    private int count;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
