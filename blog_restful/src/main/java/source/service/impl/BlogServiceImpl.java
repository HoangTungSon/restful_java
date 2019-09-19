package source.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import source.model.Blog;
import source.repository.BlogRepository;
import source.service.BlogService;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public Blog findByCategory(String category) {
        return blogRepository.findByCategory(category);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }
}
