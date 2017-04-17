package DiscordBot.Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/14/2017.
 */
public class CommandContainer {

    private MessageReceivedEvent event;
    private String commandPackageType;
    private String invoke;
    private String[] args;



    public CommandContainer(MessageReceivedEvent event, String commandPackageType, String invoke, String[] args){
        this.event = event;
        this.commandPackageType = commandPackageType;
        this.invoke  = invoke;
        this.args = args;

    }


    public MessageReceivedEvent getEvent() {
        return event;
    }

    public String getCommandPackageType() {
        return commandPackageType;
    }

    public String getInvoke() {
        return invoke;
    }

    public String[] getArgs() {
        return args;
    }
}
