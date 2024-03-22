package src;


public class Main {
    private static User user;

    public static User getUser() {
        if (user == null) {
            user = new User();
            user.setName("User");
            user.setAge(17);
        }
        return user;
    }

    public static void main(String[] args) {
        User unregisteredUser = getUser();
        System.out.println(unregisteredUser);
        User registeredUser =getUser();
        registeredUser.setName("Worro");
        registeredUser.setAge(27);
        System.out.println(registeredUser);
    }
}
