package DiscordBot.Packages;

import EveOnline.EveOnline;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/16/2017.
 */
public class EveOnlinePackage implements PackageInterface {
    @Override
    public void action(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args) {
        EveOnline.invokeCommand(messageReceivedEvent, invoke, args);
    }

}