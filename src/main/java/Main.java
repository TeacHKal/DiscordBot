import DiscordBot.BotUtil.Creds;
import DiscordBot.DiscordBot;
import EveOnline.API.zKillboardAPI.Entity;
import EveOnline.Services.EntityIDService;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

/**
 * Created by teach on 4/13/2017.
 * email: teach.inbox@gmail.com
 */


public class Main {

    public static void main (String[] args) throws LoginException, InterruptedException, RateLimitedException

    {
        String idString = EntityIDService.getInstance().getEntityID("teach", Entity.PLAYER);
        System.out.println("->>> -" + idString + "- <<<-");

        DiscordBot.connect(Creds.BOT_TOKEN);



    }
}
