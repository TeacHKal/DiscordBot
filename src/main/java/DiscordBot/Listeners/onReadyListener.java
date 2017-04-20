package DiscordBot.Listeners;

import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 * Created by teach on 4/16/2017.
 * email: teach.inbox@gmail.com
 */
public class onReadyListener extends ListenerAdapter {

    public void onReady(ReadyEvent event){
        System.out.println("Logged as: " + event.getJDA().getSelfUser().getName());
    }
}
