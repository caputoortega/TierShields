package net.glaciar.tiershields;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class TierShields extends JavaPlugin {
    

    private static final Logger LOGGER=Logger.getLogger("TierShields");

    public void onEnable()
    {
      LOGGER.info("tiershields enabled");
    }
  
    public void onDisable()
    {
      LOGGER.info("tiershields disabled");
    }

}
