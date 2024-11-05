package ultra.bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import ultra.bot.listener.MessageReciveListener;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        JDABuilder.createLight(ConfigHandler.getToken(), EnumSet.of(GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT))
                .addEventListeners(new MessageReciveListener())
                .build();
    }
}