package DiscordBot.Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/16/2017.
 */
public abstract class Command {

    abstract public void execute(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args, String packageType);

    public static void unknownCommand(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args, String packageType){

    }
}
