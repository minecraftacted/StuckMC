package si.f5.actedmc.stuckmc;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StuckCommand implements CommandExecutor {
    public static final String COMMAND_NAME = "stuck";

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if(!(command.getName().equalsIgnoreCase(COMMAND_NAME))) {
            return false;
        }
        if(!(commandSender instanceof Player)) {
            return false;
        }
        Player player = (Player) commandSender;
        Location location = player.getWorld().getSpawnLocation();
        location.setX(location.getX()+0.5);
        location.setZ(location.getZ()+0.5);
        player.teleport(location);
        return true;
    }
}
