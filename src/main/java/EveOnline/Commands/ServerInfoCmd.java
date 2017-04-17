package EveOnline.Commands;

import DiscordBot.Commands.Command;
import EveOnline.Class.ServerInfo;
import EveOnline.Services.ServerInfoService;
import Helper.Util;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by teach on 4/16/2017.
 */
public class ServerInfoCmd implements Command{

    @Override
    public void invoke(MessageReceivedEvent messageReceivedEvent) {
        ServerInfo serverInfo = ServerInfoService.getServerInfo();

        StringBuilder sb = new StringBuilder();

        sb.append("Server Status: " + serverInfo.getServerStatus());
        sb.append(Util.NEW_LINE);
        sb.append("Players Online: " + serverInfo.getOnlinePlayers());
        sb.append(Util.NEW_LINE);
        sb.append("Server Time: " + serverInfo.getCurrentTime());
    }
}
