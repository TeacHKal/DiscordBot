package EveOnline;

import DiscordBot.Commands.Command;
import EveOnline.Commands.ServerInfoCmd;

import java.util.HashMap;

/**
 * Created by teach on 4/17/2017.
 */
public class EveOnline {

    HashMap<String, Command> commands = new HashMap<>();



    public void initializeCommands() {
        commands.put("serverInfo", new ServerInfoCmd());

    }
}
