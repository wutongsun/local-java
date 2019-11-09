package springboot.jpa.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.jpa.demo.entity.User;

public interface UserRepository extends JpaRepository <User,Integer> {

}
