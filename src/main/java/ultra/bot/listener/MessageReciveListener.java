package ultra.bot.listener;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageReciveListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        //Who is the coolest
        if (event.getMessage().getContentRaw().equals("Wer ist der coolste?")){
             event.getChannel().sendMessage("Qtiix und Oglis sind natürlich die coolsten nicht so wie Ludwig!").queue();
         }

        //Who asked
        if (event.getAuthor().getId().equals("772226536870117387")) {
            event.getChannel().sendMessage("Wer?").queue();
        }

        //Diss
        if (event.getMessage().getContentRaw().startsWith("diss")) {
            String[] arr = event.getMessage().getContentRaw().split("-");
            String name = arr[1];

            String[] disses = {"name%", "asdasd"};

        }

     }
 }
