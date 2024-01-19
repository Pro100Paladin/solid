package homework;

public class Persister{
    private static User user = User.user;


    public Persister(User user){
        Persister.user = user;
        Persister.save();
    }

    public static void save(){
        System.out.println("Save user: " + user.name());
    }
}