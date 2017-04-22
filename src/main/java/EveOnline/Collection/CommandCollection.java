package EveOnline.Collection;

import DefaultCommand.Util.DefUtil;
import DiscordBot.Commands.Command;
import EveOnline.Commands.HelpCmd;
import EveOnline.Commands.ServerInfoCmd;
import EveOnline.Util.EveOnlineUtil;

import java.util.HashMap;

/**
 * Created by teach on 4/17/2017.
 */
public class CommandCollection {
    public static void addServerInfoCmd(HashMap<String, Command> commands){
        for(String command : EveOnlineUtil.EVE_SERVER_INFO_CMDS){
            commands.put(command, new ServerInfoCmd());
        }
    }

    public static void addHelpCmd(HashMap<String, Command> commands){
        for(String command : DefUtil.DEFAULT_PACKAGE_CMDS){
            commands.put(command, new HelpCmd());
        }
    }
}
