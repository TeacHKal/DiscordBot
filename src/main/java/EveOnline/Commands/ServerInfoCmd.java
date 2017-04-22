package EveOnline.Commands;

import DiscordBot.Commands.Command;
import EveOnline.Class.ServerInfo;
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

        ServerInfo serverInfo = ServerInfoService.getServerInfo();

        StringBuilder sb = new StringBuilder();
        sb.append("Server Status: ");
        sb.append(serverInfo.getServerStatus());
        sb.append(Static.NEW_LINE);
        sb.append("Players Online: ");
        sb.append(serverInfo.getOnlinePlayers());
        sb.append(Static.NEW_LINE);
        sb.append("Server Time: ");
        sb.append(serverInfo.getCurrentTime());

        messageReceivedEvent.getChannel().sendMessage(sb.toString()).queue();

        System.out.println(sb.toString());
    }
}
