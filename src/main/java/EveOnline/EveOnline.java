package EveOnline;

import DiscordBot.Commands.Command;
import EveOnline.Commands.ServerInfoCmd;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.HashMap;

/**
 * Created by teach on 4/17/2017.
 */
public class EveOnline {

    private static HashMap<String, Command> commands = new HashMap<>();

    public static void invokeCommand(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args){
        initializeCommands();
        if(commands.containsKey(invoke)) {
            commands.get(invoke).execute(messageReceivedEvent);
        }
        else{

        }


    }

    public static void initializeCommands() {
        commands.put("server", new ServerInfoCmd());
        commands.put("help", new HelpCmd());
    }
}
