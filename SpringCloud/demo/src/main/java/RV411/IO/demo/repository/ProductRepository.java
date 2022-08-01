package RV411.IO.demo.repository;

import RV411.IO.demo.entity.Category;
import RV411.IO.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findByCategory(Category category);
}
