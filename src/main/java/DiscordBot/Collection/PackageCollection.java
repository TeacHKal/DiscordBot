package DiscordBot.Collection;

import DefaultCommand.Util.DefUtil;
import DiscordBot.Packages.DefaultPackage;
import DiscordBot.Packages.EveOnlinePackage;
import DiscordBot.Packages.Package;
import EveOnline.Util.EveOnlineUtil;
import java.util.HashMap;

/**
 * Created by teach on 4/22/2017.
 * email: teach.inbox@gmail.com
 */
public class PackageCollection {

    public static void addPackageEveOnline(HashMap<String, Package> packages){
        for(String command : EveOnlineUtil.EVE_PACKAGE_CMDS){
            packages.put(command, new EveOnlinePackage());
        }
    }

    public static void addPackageDefaultCommand(HashMap<String, Package> packages){
        for(String command : DefUtil.DEFAULT_PACKAGE_CMDS){
            packages.put(command, new DefaultPackage());
        }
    }
}
