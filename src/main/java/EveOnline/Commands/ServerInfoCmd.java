package EveOnline.Commands;

import DiscordBot.Commands.Command;
import EveOnline.Class.ServerInfo;
import EveOnline.Model.ServerInfoModel;
import EveOnline.Services.ServerInfoService;
import Helper.Static;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/16/2017.
 * email: teach.inbox@gmail.com
 */
public class ServerInfoCmd extends Command {

    @Override
    public void execute(MessageReceivedEvent messageReceivedEvent, String invoke, String[] args, String packageType) {

        String serverInfo = ServerInfoModel.getServerInfoMessage();

        messageReceivedEvent.getChannel().sendMessage(serverInfo).queue();
        System.out.println(serverInfo);
    }
}
