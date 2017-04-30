import DiscordBot.BotUtil.Creds;
import DiscordBot.DiscordBot;
import EveOnline.Services.CharacterIdService;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

/**
 * Created by teach on 4/13/2017.
 */


public class Main {

    public static void main (String[] args) throws LoginException, InterruptedException, RateLimitedException

    {
        int idString = CharacterIdService.getInstance().getEntityID("teach");
        System.out.println("->>> -" + idString + "- <<<-");

        DiscordBot.connect(Creds.BOT_TOKEN);



    }
}
