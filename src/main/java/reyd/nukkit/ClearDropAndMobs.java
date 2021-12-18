package reyd.nukkit;

import cn.nukkit.command.CommandMap;
import cn.nukkit.command.SimpleCommandMap;
import cn.nukkit.plugin.PluginBase;
import reyd.nukkit.commands.CommandClearDrop;
import reyd.nukkit.commands.utils.ClearDropConfig;

public class ClearDropAndMobs extends PluginBase {

    private static ClearDropConfig clearDropConfig;
    private static ClearDropAndMobs instance;

    @Override
    public void onEnable() {
        this.getLogger().info("§lClearDropAndMobs: §aON");
        registerCommand();

        instance = this;

        clearDropConfig = new ClearDropConfig(this);
        clearDropConfig.createDefaultConfig();

    }

    @Override
    public void onDisable() {
        this.getLogger().info("§ClearDropAndMobs: §cOFF");
    }

    public void registerCommand(){
        instance = this;
        SimpleCommandMap simpleCommandMap = getServer().getCommandMap();
        simpleCommandMap.register("help", new CommandClearDrop("remove", "remove drop/entity", "/remove <help>"));
    }

    public static ClearDropConfig getClearDropConfig(){
        return clearDropConfig;
    }

    public static ClearDropAndMobs getInstance(){
        return instance;
    }

}
