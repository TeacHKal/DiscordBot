package DiscordBot.Commands;

import DiscordBot.BotUtil.BotUtil;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.Arrays;

/**
 * Created by teach on 4/14/2017.
 */
public class CommandParser {


    public static CommandContainer parse(MessageReceivedEvent messageReceivedEvent){
        String beheaded = removePrefix(messageReceivedEvent.getMessage().getContent());
        String commandPackageType = commandPackageType(beheaded);
        String invoke = getInvoke(beheaded);
        String[] args = getArgs(beheaded);

        return new CommandContainer(messageReceivedEvent, commandPackageType, invoke, args);
    }


    public static String removePrefix(String rawString){
        String detruncate = rawString.replaceFirst(BotUtil.PREFIX, "");
        return detruncate;
    }


    public static String commandPackageType(String beheaded){
        String[] splited = beheaded.split(BotUtil.EMPTY_SPACE);
        String commandType = splited[0];

        return commandType;

    }


    public static String getInvoke(String beheaded){
        String[] splited = beheaded.split(BotUtil.EMPTY_SPACE);
        String commandType = splited[1];

        return commandType;

    }

    public static String[] getArgs(String beheaded){
        String[] splited = beheaded.split(BotUtil.EMPTY_SPACE);
        String[] args = Arrays.copyOfRange(splited, 2, splited.length);

        return args;
    }


}
