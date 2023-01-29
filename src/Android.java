public class Android implements Smarthphone and Linux{
    @Override
    public void call() {
      System.out.println("Android call");
    }

    @Override
    public void sms() {
        System.out.println("Android sms");
    }

    @Override
    public void internet() {
        System.out.println("Android internet");
    }
}
