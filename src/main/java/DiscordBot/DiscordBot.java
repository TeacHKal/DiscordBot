package DiscordBot;

import DiscordBot.BotUtil.BotUtil;
import DiscordBot.Packages.Package;
import DiscordBot.Packages.DefaultPackage;
import DiscordBot.Packages.EveOnlinePackage;
import DiscordBot.Listeners.onMessageReceivedListener;
import DiscordBot.Listeners.onReadyListener;
import Helper.Static;
import net.dv8tion.jda.core.*;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.EventListener;

import javax.security.auth.login.LoginException;
import java.util.HashMap;

/**
 * Created by teach on 4/14/2017.
 */
public class DiscordBot implements EventListener {

    static JDABuilder jdaBuilder;
    public static HashMap<String[], Package> packages = new HashMap<>();

    public static void connect(String botToken) throws LoginException, InterruptedException, RateLimitedException {

        jdaBuilder = new JDABuilder(AccountType.BOT);
        jdaBuilder.setStatus(OnlineStatus.DO_NOT_DISTURB).setGame(Game.of(BotUtil.PLAYING));
        jdaBuilder.setToken(botToken);
        jdaBuilder.setAutoReconnect(true);

        initializeListeners();
        initializePackages();

        jdaBuilder.buildBlocking();
    }


    private static void initializePackages() {
        packages.put(Static.EVE_PACKAGE_CMDS, new EveOnlinePackage());
        packages.put(Static.DEFAULT_PACKAGE_CMDS, new DefaultPackage());
    }

    private static void initializeListeners() {
        jdaBuilder.addEventListener(new onMessageReceivedListener());
        jdaBuilder.addEventListener(new onReadyListener());
    }

    @Override
    public void onEvent(Event event) {

    }
}

