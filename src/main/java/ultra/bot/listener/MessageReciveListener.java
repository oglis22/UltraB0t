package ultra.bot.listener;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class MessageReciveListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        //Who is the coolest
        if (event.getMessage().getContentRaw().equals("Wer ist der coolste?")){
             event.getChannel().sendMessage("Qtiix und Oglis sind natürlich die coolsten").queue();
         }

        //Who asked
        if (event.getAuthor().getId().equals("772226536870117387") || event.getAuthor().getId().equals("771753261745176587")) {
            event.getChannel().sendMessage("Wer?").queue();
        }

        //Diss
        if (event.getMessage().getContentRaw().startsWith("diss")) {
            String[] arr = event.getMessage().getContentRaw().split("-");
            String name = arr[1];

            String[] disses = {"%name% du bist der Grund warum sogar mein Wlan Ruter eine pause braucht", "Selbst google hat keine Antworten was %name% von sich gibt"};

            int randomIndex = (int) (Math.random() * disses.length);

            event.getChannel().sendMessage(disses[randomIndex].replace("%name%", name)).queue();

        }

     }
 }
