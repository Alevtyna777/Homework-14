public class Main {
    public static void main(String[] args) {
        iPhone iPhone = new iPhone();
        iPhone.call();

        iPhone.sms();

        iPhone.internet();

        Android android =  new Android();
        android.call();

        android.sms();

        android.internet();
    }
}