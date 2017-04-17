package DiscordBot.Listeners;

import DiscordBot.BotUtil.BotUtil;
import DiscordBot.Commands.PackageHandler;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


/**
 * Created by teach on 4/14/2017.
 */
public class onMessageReceivedListener extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent messageReceivedEvent){
        if(messageReceivedEvent.getMessage().getContent().startsWith(BotUtil.PREFIX) && !messageReceivedEvent.getAuthor().isBot()){
            PackageHandler.handleCommand(messageReceivedEvent);
        }
    }
}
