package EveOnline.API.zKillboardAPI.Class;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class TopAllTime {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("data")
    @Expose
    private Datum__ data;
    //private List<Datum__> data = new ArrayList<Datum__>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public List<Datum__> getData() {
//        return data;
//    }
    public Datum__ getData() {
        return data;
    }

    //public void setData(List<Datum__> data) {
    //    this.data = data;
   // }
    public void setData(Datum__ data) {
        this.data = data;
    }

}
