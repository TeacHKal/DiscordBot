package EveOnline.Services;

import EveOnline.Class.ServerInfo;
import Helper.Util;

import java.util.HashMap;

/**
 * Created by teach on 4/16/2017.
 */
public class ServerInfoService {
    final static String URL_PATH = "https://api.eveonline.com/server/ServerStatus.xml.aspx";
    final static String CURRENT_TIME_NODE = "currentTime";
    final static String SERVER_OPEN_NODE = "serverOpen";
    final static String ONLINE_PLAYERS_NODE = "onlinePlayers";
    final static String SERVER_STATUS_ONLINE = "Online";
    final static String SERVER_STATUS_OFFLINE = "Offline";
    final static String[] nodes = {CURRENT_TIME_NODE, SERVER_OPEN_NODE, ONLINE_PLAYERS_NODE};

    public static ServerInfo getServerInfo(){
        String xmlString = Util.getInstance().getDataFromUrl(URL_PATH);
        HashMap<String, String> hmNodes = Util.getInstance().getNodesFromXmlString(nodes, xmlString);
        ServerInfo serverInfo = new ServerInfo(hmNodes.get(CURRENT_TIME_NODE),
                getServerStatus(hmNodes.get(SERVER_OPEN_NODE)), hmNodes.get(ONLINE_PLAYERS_NODE));

        return serverInfo;
    }

    private static String getServerStatus(String booleanStatus){
        if(Boolean.valueOf(booleanStatus.toLowerCase())){
            return SERVER_STATUS_ONLINE;
        }
        return SERVER_STATUS_OFFLINE;
    }


}
