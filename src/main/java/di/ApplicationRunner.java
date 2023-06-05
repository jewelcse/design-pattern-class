package di;

public class ApplicationRunner {

    public static void main(String[] args){


        UserRepository userRepository = new UserRepository();

        /*
        used for constructor injection
         */

//        UserService us = new UserService(userRepository);
//        us.createUser("admin");

        /*
        used for setter injection
         */
        UserService us = new UserService();
        us.setUserRepository(userRepository);

        us.createUser("admin");
    }
}
