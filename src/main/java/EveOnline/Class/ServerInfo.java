package EveOnline.Class;

/**
 * Created by teach on 4/17/2017.
 */
public class ServerInfo {

    private String currentTime;
    private String serverStatus;
    private String onlinePlayers;


    public ServerInfo(String currentTime, String serverStatus, String onlinePlayers) {
        this.currentTime = currentTime;
        this.serverStatus = serverStatus;
        this.onlinePlayers = onlinePlayers;
    }

    public String getCurrentTime() {
        return currentTime;
    }
    public String getServerStatus() {
        return serverStatus;
    }
    public String getOnlinePlayers() {
        return onlinePlayers;
    }
}
