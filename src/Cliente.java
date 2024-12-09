public class Cliente {
    public static void main(String[] args) {
        SocialNetwork redeSocial = new Facebook("Lucas", "123");
        redeSocial.post("Olá Facebook!");
        redeSocial = new Twitter("Sofia", "321");
        redeSocial.post("Olá Twitter!");

    }
}

