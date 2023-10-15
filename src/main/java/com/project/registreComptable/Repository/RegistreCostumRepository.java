package com.project.registreComptable.Repository;

import java.sql.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.project.registreComptable.Model.Registre;


@Repository
public interface RegistreCostumRepository {
	
	Page<Registre> findByDataAndSubcategoria(Date inici, Date fi,  int subcat, Pageable page);

}
