public class Twitter extends SocialNetwork {
    public Twitter(String userName, String password) {
        super(userName, password);
    }

    @Override
    void loging(String userName, String password) {
        System.out.println("Logando o usuário [" + userName + "] no Twitter...");
    }

    @Override
    void sendData(String data) {
        System.out.println("Postando a mensagem " + '"' + data + '"' + " no Twitter.");
    }

    @Override
    void logout() {
        System.out.println("Saindo do Twitter...");
    }
}
