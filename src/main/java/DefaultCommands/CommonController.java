package DefaultCommands;

import DefaultCommands.Commands.ChannelCreationTime;
import DiscordBot.Commands.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import java.util.HashMap;

/**
 * Created by teach on 4/17/2017.
 */
public class CommonController {

    public static HashMap<String, Command> commands = new HashMap<>();

    public static void getCommandResponse(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args) {
        asdf();


    }


    public static void asdf(){
        commands.put("tt", new ChannelCreationTime());
       System.out.println(commands.get("tt"));
    }



}
