public abstract class SocialNetwork {
    String userName;
    String password;

    public SocialNetwork(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void post(String msg) {
        loging(userName, password);
        sendData(msg);
        logout();
    }

    abstract void loging(String userName, String password);
    abstract void sendData(String data);
    abstract void logout();
}
