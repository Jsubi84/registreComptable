package com.project.registreComptable.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.registreComptable.Model.Subcategoria;

@Repository
public interface SubcategoriaRepository extends BaseRepository<Subcategoria, Long> {

   @Query(value="SELECT COUNT(*) AS Result FROM subcategoria AS s WHERE s.categoria_id= :id", nativeQuery=true)
    int checkDeleteCategoria(@Param("id")Long id);
   
}
