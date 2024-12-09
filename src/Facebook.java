public class Facebook extends SocialNetwork {
    public Facebook(String userName, String password) {
        super(userName, password);
    }

    @Override
    void loging(String userName, String password) {
        System.out.println("Logando o usuário [" + userName + "] no Facebook...");
    }

    @Override
    void sendData(String data) {
        System.out.println("Postando a mensagem " + '"' + data + '"' + " no Facebook.");
    }

    @Override
    void logout() {
        System.out.println("Saindo do Facebook...");
    }
}
