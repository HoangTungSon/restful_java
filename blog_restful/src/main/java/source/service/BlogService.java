package source.service;

import source.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findById(Long id);

    Blog findByCategory(String category);

    void save(Blog blog);

    void remove(Long id);
}
