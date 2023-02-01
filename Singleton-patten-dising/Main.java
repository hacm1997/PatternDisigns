public class Main {
    public static void main(String[] args) {
        User user = User.getInstance();
        user.printName();
        user.name = "Pablo";
        user.printName();
        user.name = "Heiner";
        user.printName();
    }
}