package RV411.io.reddino.repository;

import RV411.io.reddino.model.RefreshToken;
import RV411.io.reddino.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken,Long> {
    Optional<RefreshToken> findByToken(String token);

    void deleteByToken(String token);
}
