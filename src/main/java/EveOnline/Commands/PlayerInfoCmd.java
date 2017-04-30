package EveOnline.Commands;

import DiscordBot.Commands.Command;
import EveOnline.Model.PlayerInfoModel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/16/2017.
 * email: teach.inbox@gmail.com
 */
public class PlayerInfoCmd extends Command {
    @Override
    public void execute(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args, String packageType) {

        String playerInfoString = PlayerInfoModel.getPlayerInfoString()
        messageReceivedEvent.getChannel().sendMessage(playerInfoString).queue();
        System.out.println(playerInfoString);
    }
}
