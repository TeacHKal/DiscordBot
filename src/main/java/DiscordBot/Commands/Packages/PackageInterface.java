package DiscordBot.Commands.Packages;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/16/2017.
 */
public interface PackageInterface {
    void action(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args);
}
