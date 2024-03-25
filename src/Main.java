package src;


import static src.User.getUser;

public class Main {


    public static void main(String[] args) {
        User unregisterdUser = getUser();
        System.out.println(unregisterdUser);

        User registeredUser = getUser();
        registeredUser.setName("Mario");
        registeredUser.setAge(21);
        System.out.println(registeredUser);
    }

}
