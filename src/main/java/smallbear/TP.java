package smallbear;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerChatEvent;
import cn.nukkit.level.Location;
import cn.nukkit.plugin.PluginBase;
import EconomyAPI.*;

public class TP extends PluginBase implements Listener {
	
	@Override
	public void onLoad() {
		this.getLogger().info("§a유저티피 플러그인 로딩중!");
	}
	public void onEnable() {
		this.getLogger().info("§a유저티피 플러그인 로딩완료!");
	}
	 @EventHandler
	 public Location getPlayer(PlayerChatEvent event){	
		 if(event.getMessage() == "/tpa"+getName());
		 event.getPlayer().teleportImmediate(getPlayer(event));
		 EconomyAPI::getInstance()->addMoney($player,$1000);
		return null;
	 }

}
