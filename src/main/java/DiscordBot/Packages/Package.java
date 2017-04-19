package DiscordBot.Packages;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/16/2017.
 */
public abstract class Package {
    public abstract void action(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args, String packageType);
}
