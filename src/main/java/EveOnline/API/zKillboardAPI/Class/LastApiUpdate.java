package EveOnline.API.zKillboardAPI.Class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class LastApiUpdate {

    @SerializedName("sec")
    @Expose
    private int sec;
    @SerializedName("usec")
    @Expose
    private int usec;

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getUsec() {
        return usec;
    }

    public void setUsec(int usec) {
        this.usec = usec;
    }

}
