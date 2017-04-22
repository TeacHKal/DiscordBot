package DiscordBot.Packages;

import DefaultCommand.CommonController;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/16/2017.
 */
public class DefaultPackage extends Package {


    @Override
    public void action(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args, String packageType) {
        CommonController.getCommandResponse(messageReceivedEvent, invoke, args);
    }
}
