package com.tecforte.blog.repository;
import com.tecforte.blog.domain.Blog;
import com.tecforte.blog.domain.Entry;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Entry entity.
 */
//@SuppressWarnings("unused")
@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

	@Query("select e from Entry e where e.blog = ?#{principal.id}")
    List<Entry> findAllByBlogId(Long id);
	

}
