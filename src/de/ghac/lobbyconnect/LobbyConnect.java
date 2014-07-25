package de.ghac.lobbyconnect;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.plugin.Plugin;

public class LobbyConnect extends Plugin{
    private BungeeCord bc;
    @Override
    public void onLoad()
    {
        //static
        
        bc=BungeeCord.getInstance();
        bc.getLogger().info("[LobbyConnect] Loaded.");
        
    }
        
    @Override
    public void onEnable(){
     RestClient client;   
     bc.getLogger().info("Enabled LobbyConnect.");
     /* Register Listener */
     }
    
    @Override
    public void onDisable(){
     bc.getLogger().info("Disabled LobbyConnect.");
    }
        

}
