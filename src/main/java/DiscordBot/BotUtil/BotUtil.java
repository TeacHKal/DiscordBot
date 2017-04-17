package DiscordBot.BotUtil;

/**
 * Created by teach on 4/16/2017.
 */
public class BotUtil {

    public final static String PREFIX = "!";
    public final static String EMPTY_SPACE = " ";
    public final static String PLAYING = getGame();

    private static String getGame (){
        return "Type " + PREFIX + "help";
    }

}
