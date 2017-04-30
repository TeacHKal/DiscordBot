package EveOnline.Model;

import EveOnline.Class.ServerInfo;
import EveOnline.Services.ServerInfoService;
import Helper.Static;
import Helper.UtilDateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class ServerInfoModel {

    public static String getServerInfoMessage(){

        ServerInfoService.getServerInfo();

        ServerInfo serverInfo = ServerInfoService.getServerInfo();

        StringBuilder sb = new StringBuilder();
        sb.append("Server Status: ");
        sb.append(serverInfo.getServerStatus());
        sb.append(Static.NEW_LINE);
        sb.append("Players Online: ");
        sb.append(serverInfo.getOnlinePlayers());
        sb.append(Static.NEW_LINE);
        sb.append("Server Time: ");
        try {
            Date parsedDate = UtilDateTime.parseDateFormat1(serverInfo.getCurrentTime());
            String newDateFormat = UtilDateTime.getTimeDate11(parsedDate);

            sb.append(newDateFormat);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return sb.toString();

    }

}

