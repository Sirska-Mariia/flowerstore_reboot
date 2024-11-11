package ucu.edu.ua.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getAllUsers() {
        return appUserRepository.findAll();
    }

    public void addUser(AppUser appUser) {
        Optional<AppUser> userOptional = appUserRepository.findUserByEmail(appUser.getEmail());
        if (userOptional.isPresent()) {
            throw new IllegalStateException("Email already taken");
        }
        appUserRepository.save(appUser);
    }
}
