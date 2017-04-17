package DiscordBot;

import DiscordBot.BotUtil.BotUtil;
import DiscordBot.Commands.CommandParser;
import DiscordBot.Commands.Packages.PackageInterface;
import DiscordBot.Commands.Packages.DefaultPackage;
import DiscordBot.Commands.Packages.EveOnlinePackage;
import DiscordBot.Listeners.onMessageReceivedListener;
import DiscordBot.Listeners.onReadyListener;
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
    public static HashMap<String, PackageInterface> packages = new HashMap<>();

    public static void connect(String botToken) throws LoginException, InterruptedException, RateLimitedException {

        jdaBuilder = new JDABuilder(AccountType.BOT);
        jdaBuilder.setStatus(OnlineStatus.DO_NOT_DISTURB).setGame(Game.of(BotUtil.PLAYING));
        jdaBuilder.setToken(botToken);
        jdaBuilder.setAutoReconnect(true);

        initializeListeners();
        initializePackages();

        jdaBuilder.buildBlocking();
    }


    public static void initializePackages() {
        packages.put("cmd", new DefaultPackage());
        packages.put("eve", new EveOnlinePackage());
    }

    public static void initializeListeners() {
        jdaBuilder.addEventListener(new onMessageReceivedListener());
        jdaBuilder.addEventListener(new onReadyListener());
    }

    @Override
    public void onEvent(Event event) {

    }
}

