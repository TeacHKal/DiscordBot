package DiscordBot.Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import static DiscordBot.DiscordBot.packages;

/**
 * Created by teach on 4/14/2017.
 */
public class PackageHandler {

    public static void handleCommand(MessageReceivedEvent messageReceivedEvent){

        CommandContainer cmd = CommandParser.parse(messageReceivedEvent);

        if(packages.containsKey(cmd.getCommandPackageType())){
            packages.get(cmd.getCommandPackageType()).action(messageReceivedEvent, cmd.getInvoke(), cmd.getArgs());
        }
  }
}
