package com.project.registreComptable.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.project.registreComptable.Model.Registre;

@Repository
public interface RegistreRepository extends BaseRepository<Registre, Long>{
	
    //@Query(value="select * from registre r where r.id= :id", nativeQuery=true)
    List<Registre> getRegistreBySubcategoriaId(Long id);
    
    //Native
    //@Query(value="select * from registre r where r.data= :data", nativeQuery=true)
    List<Registre> getRegistreByData(LocalDate data);
    
    //JPQL
    @Query(value="select r from Registre r where r.tipus= :tipus")
    List<Registre> getTipusRegistre(@Param("tipus")Boolean tipus);
    
   // @Query(value="select r from Registre r JOIN r.subcategoria s WHERE s.categoria= :cat")
    @Query(value="select r from Registre r JOIN r.subcategoria s JOIN s.categoria c WHERE c.id= :cat")
    List<Registre> getRegistreByCategoria(@Param("cat")Long cat);
    
    @Query(value="select SUM(importreg) AS total from Registre WHERE tipus= :tipus AND YEAR(data)= :year")
    Double getSumaByTipus(@Param("tipus")Boolean sumaImport, @Param("year")int year);
    
}
