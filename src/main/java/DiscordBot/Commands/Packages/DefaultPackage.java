package DiscordBot.Commands.Packages;

import Common.CommonController;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/16/2017.
 */
public class DefaultPackage implements PackageInterface {

    @Override
    public void action(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args) {
        CommonController.getCommandResponse(messageReceivedEvent, invoke, args);
    }

}
