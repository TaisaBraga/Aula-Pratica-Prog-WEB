package config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import entities.User;
import repositories.UserRepository;

@Component
public class TestConfig implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {
	  User userOne = new User("Maria Brown", "maria@gmail.com", "988888888", "123456");
	  User userTwo = new User("Alex Green", "alex@gmail.com", "977777777", "123456");
	  userRepository.saveAll(Arrays.asList(userOne,userTwo));
  }
}
