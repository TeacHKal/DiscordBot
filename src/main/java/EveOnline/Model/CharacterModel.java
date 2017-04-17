package EveOnline.Model;

import EveOnline.Class.Character;

/**
 * Created by teach on 4/14/2017.
 */

public class CharacterModel {

    final static int NUMBER_OF_KILLS_FOR_STATS = 200;
    final static String NEW_LINE = "\n";
    final static String TWO_DECIMAL = "%.02f";
    final static String NO_STATS = "N/A";
    final static int BILLION = 1000000000;

    //========================================================================
    private String killDeathEff(int kills, int deaths)
    {
        if (!isAvaiableForStats(kills)) {
            return NO_STATS;
        }

        float kdEff = 100 - (deaths * 100) / kills;
        String kdEffStr = String.format(TWO_DECIMAL, kdEff);

        return kdEffStr;
    }

    //========================================================================
    private String killDeathRatio(int kills, int deaths)
    {
        if (!isAvaiableForStats(kills)) {
            return NO_STATS;
        }

        float kdRatio = kills / deaths;
        String kdRatioStr = String.format(TWO_DECIMAL, kdRatio);

        return kdRatioStr;
    }

    //========================================================================
    public String getPlayerInfoString(Character character)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Character: " + character.getName());
        sb.append("Corporation: " + character.getCorporation());
        sb.append("Alliance: " + character.getAlliance());
        sb.append(NEW_LINE);
        sb.append("Ships Killed: " + character.getShipKill());
        sb.append("Isk Destroyed: " + this.iskDestroyedToBilString(character.getIskDestroyed()));
        sb.append("Ships Lost: " + character.getShipLost());
        sb.append("Eff: " + this.killDeathEff(character.getShipKill(), character.getShipLost()));
        sb.append("K/D Ratio: " + this.killDeathRatio(character.getShipKill(), character.getShipLost()));

        return sb.toString();
    }

    //========================================================================
    private boolean isAvaiableForStats(int kills){
        if(kills < NUMBER_OF_KILLS_FOR_STATS){
            return true;
        }
        return false;
    }

    //========================================================================
    private String iskDestroyedToBilString(float iskDestroyed){

        float iskDestroyedInBils = iskDestroyed / BILLION;
        String iskDestroyedInBilsStr = Float.toString(iskDestroyedInBils);

        return iskDestroyedInBilsStr;
    }

    //========================================================================
}
