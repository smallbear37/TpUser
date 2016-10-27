package smallbear;

import java.util.Map;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.defaults.TeleportCommand;
import cn.nukkit.event.Listener;
import cn.nukkit.level.Location;
import cn.nukkit.plugin.PluginBase;
import me.onebone.economyapi.*;

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
	public boolean onCommand(Player sender, Command command, String label, String[] args) {
		String cmd = command.getName();
		if (cmd.equals("tpa")) {
			//이곳에 "sender가 getName()으로 위치이동 시키기
				EconomyAPI.getInstance().reduceMoney(sender, 1000);

			}
				return true;
		}
	}
