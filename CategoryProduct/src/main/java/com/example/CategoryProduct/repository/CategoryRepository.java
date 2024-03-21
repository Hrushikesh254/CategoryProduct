package com.example.CategoryProduct.repository;
//
import com.example.CategoryProduct.model.Category;
import com.example.CategoryProduct.service.CategoryService;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // You can define additional methods here if needed
}
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    // Optional for constructor injection in newer Spring versions
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getCategoryById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category createCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category updateCategory(Long id, Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		
	}

    // Other methods
}
