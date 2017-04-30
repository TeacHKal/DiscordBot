package EveOnline;

import DiscordBot.Commands.Command;
import EveOnline.Collection.CommandCollection;
import EveOnline.Commands.*;
import Helper.Static;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import java.util.HashMap;

/**
 * Created by teach on 4/17/2017.
 */
public class EveOnline {

    private static HashMap<String, Command> commands = new HashMap<>();

    public static void invokeCommand(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args, String commandType){

        initializeCommands();

        if(commands.containsKey(invoke)) {
            commands.get(invoke).execute(messageReceivedEvent, invoke, args, commandType);
        }
        else{
            commands.get(Static.EVE_HELP_CMD).execute(messageReceivedEvent, invoke, args, commandType);
        }
    }


    private static void initializeCommands() {
        CommandCollection.addServerInfoCmd(commands);
        CommandCollection.addHelpCmd(commands);
        CommandCollection.addPlayerInfoCmd(commands);

    }
}
