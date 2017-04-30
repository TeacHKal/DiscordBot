package EveOnline.API.zKillboardAPI.Model;

import EveOnline.API.zKillboardAPI.Entity;
import EveOnline.API.zKillboardAPI.Player;
import EveOnline.API.zKillboardAPI.Service.EntityService;
import EveOnline.Services.EntityIDService;

/**
 * Created by teach on 4/14/2017.
 * email: teach.inbox@gmail.com
 */

public class PlayerModel {

    private final static int NUMBER_OF_KILLS_FOR_STATS = 200;
    private final static String NEW_LINE = "\n";
    private final static String TWO_DECIMAL = "%.02f";
    private final static String NO_STATS = "N/A";
    private final static String SPACE = " ";
    private final static String SPACEX = " | ";
    private final static String SPACE_IN_URL = "%20";


    //========================================================================
    private static String getKillDeathEff(int kills, int deaths)
    {
        if (!isAvailableForStats(kills)) {
            return NO_STATS;
        }

        float kdEff = 100 - (deaths * 100) / kills;
        String kdEffStr = String.format(TWO_DECIMAL, kdEff);

        return kdEffStr;
    }

    //========================================================================
    private static String getKillDeathRatio(int kills, int deaths)
    {
        if (!isAvailableForStats(kills)) {
            return NO_STATS;
        }

        float kdRatio = kills / deaths;
        String kdRatioStr = String.format(TWO_DECIMAL, kdRatio);

        return kdRatioStr;
    }

    //========================================================================
    public static String getPlayerInfoString(String[] argsOfName)
    {
        String playerName = getNameForUrl(argsOfName);
        String playerId = EntityIDService.getInstance().getEntityID(playerName, Entity.PLAYER);
        Entity player =  EntityService.getPlayer(playerId);

        StringBuilder sb = new StringBuilder();

        if(player.getInfo() == null){
            return noSuchPlayer(argsOfName);
        }

        sb.append("Character: ");
        sb.append(player.getInfo().getName());
        //sb.append(SPACEX);

        //sb.append("Corporation: " + player.getInfo().get
        //sb.append("Alliance: " +

        sb.append(NEW_LINE);
        sb.append("Ships Killed: ");
        sb.append(player.getShipsDestroyed());
        sb.append(SPACEX);

        sb.append("Isk Destroyed: ");
        sb.append(player.getShipsDestroyed());
        sb.append(SPACEX);

        sb.append("Ships Lost: ");
        sb.append(player.getShipsLost());
        sb.append(SPACEX);

        sb.append("Eff: ");
        sb.append(getKillDeathEff(player.getShipsDestroyed(), player.getShipsLost()));
        sb.append(SPACEX);

        sb.append("K/D Ratio: ");
        sb.append(getKillDeathRatio(player.getShipsDestroyed(), player.getShipsLost()));
        sb.append(SPACEX);

        return sb.toString();
    }

    //========================================================================
    private static boolean isAvailableForStats(int kills){
        if(kills < NUMBER_OF_KILLS_FOR_STATS){
            return false;
        }
        return true;
    }

    //========================================================================
    private static String getNameForUrl(String[] argsOfName){

        String name = "";
        for (int i = 0; i < argsOfName.length; i++){
            name += argsOfName[i];
            // If it's last, don't put a space
            if(i != argsOfName.length - 1){
                name += SPACE_IN_URL;
            }
        }

        return name;
    }

    //========================================================================
    private static String noSuchPlayer(String[] argsOfName){
        StringBuilder sb = new StringBuilder();
        sb.append("Character '");
        for (int i = 0; i < argsOfName.length; i++){
            sb.append(argsOfName[i]);
            // If it's last, don't put a space
            if(i != argsOfName.length - 1){
                sb.append(SPACE);
            }
        }
        sb.append("' doesn't exist.");

        return sb.toString();
    }


}
