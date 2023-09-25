package com.project.registreComptable.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import com.project.registreComptable.Model.Categoria;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long>{
	
	Page<Categoria> findAll(Pageable pagable);
    
}
