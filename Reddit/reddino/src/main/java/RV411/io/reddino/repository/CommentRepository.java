package RV411.io.reddino.repository;

import RV411.io.reddino.model.Comment;
import RV411.io.reddino.model.Post;
import RV411.io.reddino.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
