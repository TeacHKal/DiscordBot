package EveOnline.API.zKillboardAPI.Class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class Supers {

    @SerializedName("titans")
    @Expose
    private Titans titans;
    @SerializedName("supercarriers")
    @Expose
    private Supercarriers supercarriers;

    public Titans getTitans() {
        return titans;
    }

    public void setTitans(Titans titans) {
        this.titans = titans;
    }

    public Supercarriers getSupercarriers() {
        return supercarriers;
    }

    public void setSupercarriers(Supercarriers supercarriers) {
        this.supercarriers = supercarriers;
    }

}
