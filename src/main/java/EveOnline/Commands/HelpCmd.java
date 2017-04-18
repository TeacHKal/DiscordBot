package EveOnline.Commands;

import DiscordBot.Commands.Command;
import Helper.Util;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/17/2017.
 */
public class HelpCmd implements Command{
    @Override
    public void execute(MessageReceivedEvent messageReceivedEvent) {
        messageReceivedEvent.getTextChannel().sendMessage(Util.COMMAND_DOESNT_EXIST).queue();
    }
}
