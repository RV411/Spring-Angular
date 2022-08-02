package RV411.io.reddino.repository;

import RV411.io.reddino.model.Post;
import RV411.io.reddino.model.User;
import RV411.io.reddino.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote,Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
