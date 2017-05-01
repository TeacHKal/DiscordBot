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
    private final static String JSON_ARRAY_BRACKETS = "[]";
    private final static String JSON_OBJECT_BRACKETS = "{}";


    private static String getDataFromUrl(String entityID, String entityType){
        String fullURL = URL_PATH + entityType + SLASH + entityID + SLASH;
        String dataString = Util.getInstance().getDataFromUrl(fullURL);
        return dataString;
    }


    private static Entity getPlayerObjectFromString(String jsonString) {
        Gson gson = new Gson();
        Entity entity = null;
            try {
                entity = gson.fromJson(jsonString, Entity.class);
            }catch (Exception e){
                System.out.println("ERROR: " + e.toString());
            }

        return entity;
    }

    public static Entity getPlayer(String entityID){
        String dataString = getDataFromUrl(entityID, Entity.PLAYER);

        // When there is no data for an object it replace object brackets "{}" to array brackets "[]"
        // So the method above fix that. Replace array "[]" with object "{}"
        dataString = stringReplace(dataString, JSON_ARRAY_BRACKETS, JSON_OBJECT_BRACKETS);

        return getPlayerObjectFromString(dataString);
    }

    private static String stringReplace(String string, String oldPart, String newPart){
        return string.replace(oldPart, newPart);
    }
}
