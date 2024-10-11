package exercise;

public class ChatClient {


    public void send(String message,Encryption encryptionAlgorithm){

        byte[] encryptedMessage = encryptionAlgorithm.encrypt(message);
//        send message implementation
        System.out.println("message sent !!");

    }

}
