package EveOnline.API.zKillboardAPI.Service;

import EveOnline.API.zKillboardAPI.Entity;
import EveOnline.API.zKillboardAPI.Player;
import Helper.Util;
import com.google.gson.Gson;

/**
 * Created by teach on 4/22/2017.
 * email: teach.inbox@gmail.com
 */
public class EntityService {

    private final static String URL_PATH = "https://zkillboard.com/api/stats/";
    private final static String SLASH = "/";


    private static String getDataFromUrl(String entityID, String entityType){
        String fullURL = URL_PATH + entityType + SLASH + entityID + SLASH;
        String dataString = Util.getInstance().getDataFromUrl(fullURL);
        return dataString;
    }


    private static Entity getPlayerObjectFromString(String jsonString) {
        Gson gson = new Gson();
        Entity entity = null;

            entity = gson.fromJson(jsonString, Entity.class);

        return entity;
    }

    public static Entity getPlayer(String entityID){
        String dataString = getDataFromUrl(entityID, Entity.PLAYER);
        return getPlayerObjectFromString(dataString);
    }
}
