package di;

public class UserService {

    /*
    constructor injection implemented
     */

//    private final UserRepository userRepository;
//    public UserService(UserRepository repository) {
//        this.userRepository = repository;
//    }

    /*
    setter injection implemented
     */
    private UserRepository userRepository;
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void createUser(String name){
        userRepository.save(name);
    }


}
