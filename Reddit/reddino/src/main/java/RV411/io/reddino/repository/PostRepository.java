package RV411.io.reddino.repository;

import RV411.io.reddino.model.Post;
import RV411.io.reddino.model.Subreddit;
import RV411.io.reddino.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
