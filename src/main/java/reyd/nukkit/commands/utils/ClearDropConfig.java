package reyd.nukkit.commands.utils;

import cn.nukkit.utils.Config;
import reyd.nukkit.ClearDropAndMobs;

import java.io.File;

public class ClearDropConfig {

    private ClearDropAndMobs clearDropAndMobs;
    private File file;
    private Config config;

    public ClearDropConfig(ClearDropAndMobs clearDropAndMobs){
        this.clearDropAndMobs = clearDropAndMobs;
        this.file = new File(clearDropAndMobs.getDataFolder(), "ConfigCD.yml");
        this.config = new Config(this.file, 2);
    }

    public void createDefaultConfig(){
        addDefault("reyd.command.msg.permission", "§cYou don't have Permission for this command");
        addDefault("reyd.command.msg.args", "§c/remove §d<help>");
        addDefault("reyd.command.msg.default", "§c/remove §d<help>");
        addDefault("reyd.entity.msg.all", "§aIn The Level was all Entities removed §d| §6Count: §e");
        addDefault("reyd.entity.msg.drop", "§aIn The Level was all EntitiesDrop/Item removed §d| §6Count: §e");
        addDefault("reyd.hostile_mobs.msg.zombie", "§aIn The Level was Zombie Entities removed §d| §6Count: §e");
        addDefault("reyd.hostile_mobs.msg.skeleton", "§aIn The Level was Skeleton Entities removed §d| §6Count: §e");
        addDefault("reyd.hostile_mobs.msg.creeper", "§aIn The Level was Creeper Entities removed §d| §6Count: §e");
        addDefault("reyd.hostile_mobs.msg.spider", "§aIn The Level was Spider Entities removed §d| §6Count: §e");
        addDefault("reyd.passive_mobs.msg.chicken", "§aIn The Level was Chicken Entities removed §d| §6Count: §e");
        addDefault("reyd.passive_mobs.msg.cow", "§aIn The Level was Cow Entities §d| §6Count: §e");
        addDefault("reyd.passive_mobs.msg.pig", "§aIn The Level was Pig Entities removed §d| §6Count: §e");
        addDefault("reyd.passive_mobs.msg.sheep", "§aIn The Level was Sheep Entities removed §d| §6Count: §e");
        addDefault("reyd.command.msg.help", "§e--- §dClearDropAndMobs §e---");
        addDefault("reyd.command.msg.help1", "§c/remove §d<entity> §e|| §cExamples: §a/remove zombie");
        addDefault("reyd.command.msg.help2", "§aAvailable entities: §fall, drop, zombie, skeleton, creeper, spider, chicken, cow, pig, sheep");
    }

    public String getPermission(){
        return this.config.getString("reyd.command.msg.permission");
    }

    public String getAll(){
        return this.config.getString("reyd.entity.msg.all");
    }

    public String getDrop(){
        return this.config.getString("reyd.entity.msg.drop");
    }

    public String getDefault(){
        return this.config.getString("reyd.command.msg.default");
    }

    public String getArgs(){
        return this.config.getString("reyd.command.msg.args");
    }

    public String getZombie(){
        return this.config.getString("reyd.hostile_mobs.msg.zombie");
    }

    public String getSkeleton(){
        return this.config.getString("reyd.hostile_mobs.msg.skeleton");
    }

    public String getCreeper(){
        return this.config.getString("reyd.hostile_mobs.msg.creeper");
    }

    public String getSpider(){
        return this.config.getString("reyd.hostile_mobs.msg.spider");
    }

    public String getChicken(){
        return this.config.getString("reyd.passive_mobs.msg.chicken");
    }

    public String getCow(){
        return this.config.getString("reyd.passive_mobs.msg.cow");
    }

    public String getPig(){
        return this.config.getString("reyd.passive_mobs.msg.pig");
    }

    public String getSheep(){
        return this.config.getString("reyd.passive_mobs.msg.sheep");
    }

    public String getHelp(){
        return this.config.getString("reyd.command.msg.help");
    }

    public String getHelp1(){
        return this.config.getString("reyd.command.msg.help1");
    }

    public String getHelp2(){
        return this.config.getString("reyd.command.msg.help2");
    }

    public void addDefault(String path, Object object){
        if(!this.config.exists(path)){
            this.config.set(path, object);
            this.config.save(this.file);
        }
    }

}
