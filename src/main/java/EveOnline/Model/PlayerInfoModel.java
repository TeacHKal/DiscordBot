package EveOnline.Model;

import EveOnline.Class.Character;
import EveOnline.Util.EveOnlineUtil;

/**
 * Created by teach on 4/14/2017.
 * email: teach.inbox@gmail.com
 */

public class PlayerInfoModel {

    final static int NUMBER_OF_KILLS_FOR_STATS = 200;
    final static String NEW_LINE = "\n";
    final static String TWO_DECIMAL = "%.02f";
    final static String NO_STATS = "N/A";


    //========================================================================
    private static String killDeathEff(int kills, int deaths)
    {
        if (!isAvaiableForStats(kills)) {
            return NO_STATS;
        }

        float kdEff = 100 - (deaths * 100) / kills;
        String kdEffStr = String.format(TWO_DECIMAL, kdEff);

        return kdEffStr;
    }

    //========================================================================
    private static String killDeathRatio(int kills, int deaths)
    {
        if (!isAvaiableForStats(kills)) {
            return NO_STATS;
        }

        float kdRatio = kills / deaths;
        String kdRatioStr = String.format(TWO_DECIMAL, kdRatio);

        return kdRatioStr;
    }

    //========================================================================
    public static String getPlayerInfoString(Character character)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Character: " + character.getName());
        sb.append("Corporation: " + character.getCorporation());
        sb.append("Alliance: " + character.getAlliance());
        sb.append(NEW_LINE);
        sb.append("Ships Killed: " + character.getShipKill());
        sb.append("Isk Destroyed: " + EveOnlineUtil.iskToBilString(character.getIskDestroyed()));
        sb.append("Ships Lost: " + character.getShipLost());
        sb.append("Eff: " + killDeathEff(character.getShipKill(), character.getShipLost()));
        sb.append("K/D Ratio: " + killDeathRatio(character.getShipKill(), character.getShipLost()));

        return sb.toString();
    }

    //========================================================================
    private static boolean isAvaiableForStats(int kills){
        if(kills < NUMBER_OF_KILLS_FOR_STATS){
            return true;
        }
        return false;
    }

    //========================================================================


    //========================================================================
}
