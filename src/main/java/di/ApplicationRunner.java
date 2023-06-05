package di;

public class ApplicationRunner {

    public static void main(String[] args){
        UserRepository userRepository = new UserRepository();
        UserService us = new UserService(userRepository);
        us.createUser("admin");
    }
}
