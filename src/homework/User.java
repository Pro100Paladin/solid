package homework;

public record User(String name) {
    static User user = new User("Bob");


    public void report() {
        System.out.println("Report for user: " + name);
    }
}