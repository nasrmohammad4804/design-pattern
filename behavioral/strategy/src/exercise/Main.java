package exercise;

public class Main {
    public static void main(String[] args) {

        ChatClient chatClient = new ChatClient();

        chatClient.send("hi everyone",new DESEncryption());
    }
}
