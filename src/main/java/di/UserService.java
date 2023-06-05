package di;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    public void createUser(String name){
        userRepository.save(name);
    }


}
