package smallbear;

import java.util.Map;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.defaults.TeleportCommand;
import cn.nukkit.event.Listener;
import cn.nukkit.level.Location;
import cn.nukkit.plugin.PluginBase;
import EconomyAPI.src.onebone.economyapi.*;

public class TP extends PluginBase implements Listener {
	
    private TeleportCommand teleportManager;
    public Map<String, Location> deaths;
    public boolean loadWorlds;
	
	@Override
	public void onLoad() {
		this.getLogger().info("§a유저티피 플러그인 로딩중!");
	}
	public void onEnable() {
		this.getLogger().info("§a유저티피 플러그인 로딩완료!");
	}
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		String cmd = command.getName();
		if (cmd.equals("tpa")) {
			if(true)
				sender.getServer().getCommandMap().register(getName(), teleportManager);
				sender.getServer().getCommandMap().register("tpa", teleportManager);
				sender.getServer().getLevelByName(getName());
				//무엇이 맞을까요? 내일 새벽에 알려집니다!

			}
				return true;
		}
	}
