package DiscordBot.Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/14/2017.
 */
public class CommandContainer {

    private MessageReceivedEvent event;
    private String packageType;
    private String invoke;
    private String[] args;



    public CommandContainer(MessageReceivedEvent event, String packageType, String invoke, String[] args){
        this.event = event;
        this.packageType = packageType;
        this.invoke  = invoke;
        this.args = args;

    }


    public MessageReceivedEvent getEvent() {
        return event;
    }

    public String getPackageType() {
        return packageType;
    }

    public String getInvoke() {
        return invoke;
    }

    public String[] getArgs() {
        return args;
    }
}
