package me.jiyoon.springbootdeveloper.repository;

import me.jiyoon.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
