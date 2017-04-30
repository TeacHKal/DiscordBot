package EveOnline.Services;

import EveOnline.Class.Character;
import Helper.Util;

import java.util.HashMap;

/**
 * Created by teach on 4/22/2017.
 * email: teach.inbox@gmail.com
 */
public class CharacterEntityService {

    private static String xmlData;
    private static HashMap<String, String> data;
    private final static String URL_PATH = "zkillboard.com/api/stats/";
    private final static String SLASH = "/";

    private static final String ID = "id";
    private static final String ISK_DESTROYED = "iskDestroyed";
    private static final String ISK_LOST = "iskLost";
    private static final String POINTS_DESTROYED = "pointsDestroyed";
    private static final String POINTS_LOST = "pointsLost";
    private static final String SHIPS_DESTROYED = "shipsDestroyed";
    private static final String SHIPS_LOST = "shipsLost";
    private static final String SOLO_KILLS = "soloKills";
    private static final String SOLO_LOSSES = "soloLosses";
    private static final String TYPE = "type";

    private final static String[] nodes = {ID, ISK_DESTROYED, ISK_LOST, POINTS_DESTROYED, POINTS_LOST, SHIPS_DESTROYED,
            SHIPS_LOST, SOLO_KILLS, SOLO_LOSSES, TYPE};

    public String getXmlDataFromUrl(String type, String id){
        String fullURL = URL_PATH + type + SLASH + id + SLASH;
        String xmlString = Util.getInstance().getDataFromUrl(fullURL);

        return xmlString;
    }

    public static void setBasicDataFromXml(){
        HashMap<String, String> hmNodes = Util.getInstance().getNodesFromXmlString(nodes, xmlData);
        data =  hmNodes;
    }

    public CharacterEntityService(String type, String id) {
        this.xmlData = getXmlDataFromUrl(type, id);
        setBasicDataFromXml();
    }

    public static String getID() {
        return data.get(ID);
    }

    public float getIskDestroyed() {
        return Integer.valueOf(data.get(ISK_DESTROYED));
    }

    public float getIskLost() {
        return Integer.valueOf(data.get(ISK_LOST));
    }

    public int getPointsDestroyed() {
        return Integer.valueOf(data.get(POINTS_DESTROYED));
    }

    public int getPointsLost() {
        return Integer.valueOf(data.get(POINTS_LOST));
    }

    public int getShipsDestroyed() {
        return Integer.valueOf(data.get(SHIPS_DESTROYED));
    }

    public int getShipsLost() {
        return Integer.valueOf(data.get(SHIPS_LOST));
    }

    public int getSoloKills() {
        return Integer.valueOf(data.get(SOLO_KILLS));
    }

    public int getSoloLosses() {
        return Integer.valueOf(data.get(SOLO_LOSSES));
    }

    public String getTYPE() {
        return data.get(TYPE);
    }


}
