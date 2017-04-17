package DiscordBot.Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/16/2017.
 */
public interface Command {
    void execute(MessageReceivedEvent messageReceivedEvent);

}
