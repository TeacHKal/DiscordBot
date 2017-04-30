package EveOnline.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by teach on 4/22/2017.
 * email: teach.inbox@gmail.com
 */
public class EveOnlineUtil {

    final static int BILLION = 1000000000;

    public  static String[] EVE_PACKAGE_CMDS = {"eve", "e"};

    public static final String[] EVE_PLAYER_INFO_CMDS = {"player","p"};
    public static final String[] EVE_SERVER_INFO_CMDS = {"server", "s", "serverinfo"};
    public static final String[] EVE_CORP_INFO_CMDS = {"corporation", "corp", "c"};
    public static final String[] EVE_ALLIANCE_INFO_CMDS = {"alliance", "ally", "a"};
    public static final String[] EVE_HELP_CMDS = {"help", "hlp", "h"};
    public static final String EVE_HELP_CMD = "help";


    public static String iskToBilString(float iskDestroyed){

        float iskDestroyedInBils = iskDestroyed / BILLION;
        String iskDestroyedInBilsStr = Float.toString(iskDestroyedInBils);

        return iskDestroyedInBilsStr;
    }

}
