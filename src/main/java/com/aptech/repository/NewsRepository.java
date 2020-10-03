package com.aptech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aptech.entity.NewsEntity;

@Repository
public interface NewsRepository extends JpaRepository<NewsEntity, Long>{
	public NewsEntity findOneById(Long id);
}
