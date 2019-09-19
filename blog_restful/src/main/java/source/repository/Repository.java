package source.repository;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    T findById(Long id);

    T findByCategory(String category);

    void save(T model);

    void remove(Long id);
}
