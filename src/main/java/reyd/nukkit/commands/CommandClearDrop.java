package reyd.nukkit.commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.entity.Entity;
import cn.nukkit.entity.EntityRideable;
import cn.nukkit.entity.item.EntityItem;
import cn.nukkit.entity.mob.EntityCreeper;
import cn.nukkit.entity.mob.EntitySkeleton;
import cn.nukkit.entity.mob.EntitySpider;
import cn.nukkit.entity.mob.EntityZombie;
import cn.nukkit.entity.passive.EntityChicken;
import cn.nukkit.entity.passive.EntityCow;
import cn.nukkit.entity.passive.EntityPig;
import cn.nukkit.entity.passive.EntitySheep;
import reyd.nukkit.ClearDropAndMobs;

import java.util.Locale;

public class CommandClearDrop extends Command {

    private ClearDropAndMobs clearDropAndMobs;

    public CommandClearDrop(String name, String description, String usageMessage) {
        super(name, description, usageMessage);
    }

    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;

            if(player.hasPermission("cmd.cleardropandmob") || player.isOp()){

                if (args.length == 1){

                    int amount = 0;

                    switch (args[0].toLowerCase()){

                        case "help": {
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getHelp());
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getHelp1());
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getHelp2());
                            break;
                        }

                        case "all":

                            for (Entity all : player.getLevel().getEntities()){
                                if(!(all instanceof Player)){
                                    all.getLevel().removeEntity(all);
                                    amount +=1;
                                }
                            }
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getAll() + " " + amount);
                            break;

                        case "zombie": {
                            for(Entity zombie : player.getLevel().getEntities()){
                                if(!(zombie instanceof Player)){
                                    if (zombie instanceof EntityZombie){
                                        zombie.getLevel().removeEntity(zombie);
                                        amount += 1;
                                    }
                                }
                            }
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getZombie() + " " + amount);
                            break;
                        }

                        case "skeleton": {
                            for(Entity skeleton : player.getLevel().getEntities()){
                                if(!(skeleton instanceof Player)){
                                    if (skeleton instanceof EntitySkeleton){
                                        skeleton.getLevel().removeEntity(skeleton);
                                        amount += 1;
                                    }
                                }
                            }
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getSkeleton() + " " + amount);
                            break;
                        }

                        case "creeper": {
                            for(Entity creeper : player.getLevel().getEntities()){
                                if(!(creeper instanceof Player)){
                                    if (creeper instanceof EntityCreeper){
                                        creeper.getLevel().removeEntity(creeper);
                                        amount += 1;
                                    }
                                }
                            }
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getCreeper() + " " + amount);
                            break;
                        }

                        case "spider": {
                            for(Entity spider : player.getLevel().getEntities()){
                                if(!(spider instanceof Player)){
                                    if (spider instanceof EntitySpider){
                                        spider.getLevel().removeEntity(spider);
                                        amount += 1;
                                    }
                                }
                            }
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getSpider() + " " + amount);
                            break;
                        }

                        case "chicken": {
                            for(Entity chicken : player.getLevel().getEntities()){
                                if(!(chicken instanceof Player)){
                                    if (chicken instanceof EntityChicken){
                                        chicken.getLevel().removeEntity(chicken);
                                        amount += 1;
                                    }
                                }
                            }
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getChicken() + " " + amount);
                            break;
                        }

                        case "cow": {
                            for(Entity cow : player.getLevel().getEntities()){
                                if(!(cow instanceof Player)){
                                    if (cow instanceof EntityCow){
                                        cow.getLevel().removeEntity(cow);
                                        amount += 1;
                                    }
                                }
                            }
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getCow() + " " + amount);
                            break;
                        }

                        case "pig": {
                            for(Entity pig : player.getLevel().getEntities()){
                                if(!(pig instanceof Player)){
                                    if (pig instanceof EntityPig){
                                        pig.getLevel().removeEntity(pig);
                                        amount += 1;
                                    }
                                }
                            }
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getPig() + " " + amount);
                            break;
                        }

                        case "sheep": {
                            for(Entity sheep : player.getLevel().getEntities()){
                                if(!(sheep instanceof Player)){
                                    if (sheep instanceof EntitySheep){
                                        sheep.getLevel().removeEntity(sheep);
                                        amount += 1;
                                    }
                                }
                            }
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getSheep() + " " + amount);
                            break;
                        }

                        case "drop": {
                            for(Entity drop :player.getLevel().getEntities()){
                                if(!(drop instanceof Player)){
                                    if (drop instanceof EntityItem){
                                        drop.getLevel().removeEntity(drop);
                                        amount += 1;
                                    }
                                }
                            }
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getDrop() + " " + amount);
                            break;
                        }

                        default: {
                            player.sendMessage(ClearDropAndMobs.getClearDropConfig().getDefault());
                        }
                    }

                } else {
                    player.sendMessage(ClearDropAndMobs.getClearDropConfig().getArgs());
                }

            } else {
                player.sendMessage(ClearDropAndMobs.getClearDropConfig().getPermission());
            }

        }

        return true;
    }
}
