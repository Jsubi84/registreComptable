package com.project.registreComptable.Repository;

import java.sql.Date;
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
    List<Registre> getRegistreByData(Date data);
    
    //JPQL
    //@Query(value="select r from Registre r where r.tipus= :tipus")
    //List<Registre> getTipusRegistre(@Param("tipus")Boolean tipus);
    
    //@Query(value="select r from Registre r JOIN r.subcategoria s WHERE s.categoria= :cat")
    @Query(value="select r from Registre r JOIN r.subcategoria s JOIN s.categoria c WHERE c.id= :cat")
    List<Registre> getRegistreByCategoria(@Param("cat")Long cat);
  
    //@Query(value="select SUM(importreg) AS total from Registre WHERE tipus= :tipus AND YEAR(data)= :year")
    //Double getSumaByTipus(@Param("tipus")Boolean sumaImport, @Param("year")int year);
 
    //@Query(value="SELECT * FROM registre WHERE MONTH(data) = :month and YEAR(data) = :year", nativeQuery=true)
    //List<Registre> getRegistreByMonthAndYear(@Param("month")int month, @Param("year")int year);
    
    //@Query(value = "SELECT MONTH(data) AS mes, SUM(CASE WHEN tipus = 1 THEN importreg END) AS ingres, SUM(CASE WHEN tipus = 0 THEN importreg END) AS despesa FROM registre WHERE YEAR(data)= :year GROUP BY MONTH(data)", nativeQuery=true)
    @Query(value = "SELECT MONTH(r.data) AS mes, SUM(CASE WHEN c.tipus = 1 THEN r.importreg END) AS ingres, SUM(CASE WHEN c.tipus = 0 THEN r.importreg END) AS despesa FROM registre as r JOIN subcategoria AS s ON r.subcategoria_id = s.id JOIN categoria AS c ON s.categoria_id = c.id WHERE YEAR(r.data)= :year GROUP BY MONTH(r.data)", nativeQuery=true) 
    List<Object[]> getResumAny( @Param("year")int year);
    
    @Query(value="SELECT COUNT(*) AS Result FROM registre AS r WHERE r.subcategoria_id= :id", nativeQuery=true)
    int checkDeleteSubcategoria(@Param("id")Long id);
}
