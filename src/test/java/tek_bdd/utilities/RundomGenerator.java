package tek_bdd.utilities;

public class RundomGenerator {
    public static String randomEmail(String prefix) {
        int random = (int) (Math.random() * 1000);
        return prefix + random + "@gmail.com";
    }
}