package EveOnline.Services;

import EveOnline.Class.ServerInfo;
import Helper.Static;
import Helper.Util;

import java.util.HashMap;

/**
 * Created by teach on 4/16/2017.
 * email: teach.inbox@gmail.com
 */
public class ServerInfoService {
    private final static String URL_PATH = "https://api.eveonline.com/server/ServerStatus.xml.aspx";

    private final static String CURRENT_TIME_NODE = "currentTime";
    private final static String SERVER_OPEN_NODE = "serverOpen";
    private final static String ONLINE_PLAYERS_NODE = "onlinePlayers";
    private final static String[] NODES = {CURRENT_TIME_NODE, SERVER_OPEN_NODE, ONLINE_PLAYERS_NODE};

    private final static String SERVER_STATUS_ONLINE = "Online";
    private final static String SERVER_STATUS_OFFLINE = "Offline";

    ServerInfoService instance;

    public ServerInfoService serverInfoService(){
        if(instance == null){
            ServerInfoService serverInfoService = new ServerInfoService();
        }
        return instance;
    }

    public static ServerInfo getServerInfo(){
        String xmlString = Util.getInstance().getDataFromUrl(URL_PATH);
        HashMap<String, String> hmNodes = Util.getInstance().getNodesFromXmlString(NODES, xmlString);
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
