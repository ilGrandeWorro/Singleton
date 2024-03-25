package src;

public class User {
    private static User user;

    public static User getUser() {
        if (user == null) {
            user = new User("Unregistered user",0);
        }
        return user;
    }

    private static String name;
    private static int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
