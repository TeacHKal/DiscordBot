package EveOnline.Commands;

import DiscordBot.Commands.Command;
import Helper.Static;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/17/2017.
 */
public class HelpCmd extends Command {
    @Override
    public void execute(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args, String packageType) {
        //String msg = "Command " + invoke " does't exist. Plese yose"
        messageReceivedEvent.getTextChannel().sendMessage(Static.COMMAND_DOESNT_EXIST).queue();
    }
}
