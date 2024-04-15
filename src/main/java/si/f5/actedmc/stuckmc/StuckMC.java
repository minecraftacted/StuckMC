package si.f5.actedmc.stuckmc;

import org.bukkit.plugin.java.JavaPlugin;

public final class StuckMC extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand(StuckCommand.COMMAND_NAME).setExecutor(new StuckCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
