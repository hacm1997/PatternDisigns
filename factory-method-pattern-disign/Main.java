import factory.User;
import factory.UserFactory;
import factory.UserType;

public class Main {
    public static void main(String[] args) {
        User normal = UserFactory.getUser(UserType.Normal, "James", "Rodrígez");
        System.out.println("Normal User:");
        System.out.println(normal.getFullName());
        System.out.println(normal.status());
        System.out.println(String.format("Show ads: %s", normal.showAds()));
        System.out.println("----------------");
        User premium = UserFactory.getUser(UserType.Premium, "Heiner", "Acosta");
        System.out.println("Premium User:");
        System.out.println(premium.getFullName());
        System.out.println(premium.status());
        System.out.println(String.format("Show ads: %s", premium.showAds()));
    }
}