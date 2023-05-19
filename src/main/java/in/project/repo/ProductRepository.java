package in.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
