package EveOnline.Collection;

import DefaultCommand.Util.DefUtil;
import DiscordBot.Commands.Command;
import EveOnline.Commands.HelpCmd;
import EveOnline.Commands.PlayerInfoCmd;
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
        for(String command : EveOnlineUtil.EVE_HELP_CMDS){
            commands.put(command, new HelpCmd());
        }
    }

    public static void addPlayerInfoCmd(HashMap<String, Command> commands){
        for(String command : EveOnlineUtil.EVE_PLAYER_INFO_CMDS){
            commands.put(command, new PlayerInfoCmd());
        }
    }
}
