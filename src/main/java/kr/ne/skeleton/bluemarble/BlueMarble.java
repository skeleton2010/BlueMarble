package kr.ne.skeleton.bluemarble;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class BlueMarble extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[BlueMarble] plugin Enabled");

    }

    @Override
    public void onDisable() {
        System.out.println("[BlueMarble] plugin Disabled");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;

        if (label.equals("bluemarble")) {
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("start")) {
                    p.sendTitle(ChatColor.WHITE + "빈" + ChatColor.GOLD + "부" + ChatColor.GREEN + "격" + ChatColor.GREEN + "차", "", 0, 100, 0);
                    p.sendActionBar(ChatColor.BOLD + "본서버의 개발자는 본미니게임을 만드는데 아이디어를 내지않았음을 알림니다.");
                }
                if (args[0].equalsIgnoreCase("help")) {
                    p.sendMessage(ChatColor.GOLD + "-----------------------------------------------------" + ChatColor.BOLD );
                    p.sendMessage(ChatColor.GOLD + "1" + ChatColor.BOLD );
                    p.sendMessage(ChatColor.GOLD + "2" + ChatColor.BOLD );
                    p.sendMessage(ChatColor.GOLD + "3" + ChatColor.BOLD );
                    p.sendMessage(ChatColor.GOLD + "4" + ChatColor.BOLD );
                    p.sendMessage(ChatColor.GOLD + "-----------------------------------------------------" + ChatColor.BOLD );
                }
            }
        }
        return true;
    }
}
