package exercise;

public class DESEncryption implements Encryption{
    @Override
    public byte[] encrypt(String message) {
        System.out.println("message encrypted by "+this.getClass().getSimpleName()+" algorithm");
        return new byte[0];
    }
}
