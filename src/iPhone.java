public class iPhone implements Smarthphone, iOS {
    @Override
    public void call() {
        System.out.println("iPhone call");
    }

    @Override
    public void sms() {
        System.out.println("iPhone sms");
    }

    @Override
    public void internet() {
        System.out.println("iPhone internet");
    }
}
