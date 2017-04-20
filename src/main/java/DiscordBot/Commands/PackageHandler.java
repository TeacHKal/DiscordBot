package DiscordBot.Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import static DiscordBot.DiscordBot.packages;

/**
 * Created by teach on 4/14/2017.
 * email: teach.inbox@gmail.com
 */
public class PackageHandler {

    public static void handleCommand(MessageReceivedEvent messageReceivedEvent){

        CommandContainer cmd = CommandParser.parse(messageReceivedEvent);

        if(packages.containsKey(cmd.getPackageType())){
            packages.get(cmd.getPackageType()).action(messageReceivedEvent, cmd.getInvoke(),
                    cmd.getArgs(), cmd.getPackageType());
        }
  }
}
