package akhilmanthina.botvinik;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    public static void main(String[] args) {
        // Insert your bot's token here
        String token = "NjczMDQ1ODgxNzE2NzM2MDQw.XjUZXw.0L5WRnXqWuhs2zivJ5V2myvVTeM";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();

        // Add a listener which answers with "Pong!" if someone writes "!ping"
        api.addMessageCreateListener(event -> {
            String message = event.getMessageContent();
            if (message.contains("!say")) {
                String[] messageContent = message.substring(4).split(" ");

                for (String arg: messageContent) {
                    event.getChannel().sendMessage(arg)
                }


                //event.getChannel().sendMessage("Pong!");
            }

        });

        // Print the invite url of your bot
        //System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }
}
