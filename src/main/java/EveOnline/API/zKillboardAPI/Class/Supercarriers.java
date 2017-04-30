package EveOnline.API.zKillboardAPI.Class;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class Supercarriers {
    @SerializedName("data")
    @Expose
    private List<Datum_> data = new ArrayList<Datum_>();
    @SerializedName("title")
    @Expose
    private String title;

    public List<Datum_> getData() {
        return data;
    }

    public void setData(List<Datum_> data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
