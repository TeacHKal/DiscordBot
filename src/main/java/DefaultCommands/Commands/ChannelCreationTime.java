package DefaultCommands.Commands;

import DiscordBot.Commands.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/17/2017.
 */
public class ChannelCreationTime extends Command {
    @Override
    public void execute(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args, String packageType) {

        java.util.Date utilDate = java.util.Date.from ( messageReceivedEvent.getChannel().getCreationTime().toInstant());
        messageReceivedEvent.getChannel().sendMessage(utilDate.toString());
    }
}
