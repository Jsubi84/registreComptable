package com.project.registreComptable.Service;

import java.util.List;

import com.project.registreComptable.Model.Registre;

public interface RegistreService extends BaseService<Registre, Long> {
	
	List<Registre> getRegistreBySubcategoriaId(Long id) throws Exception;
	List<Registre> getRegistreByCategoria(Long categoria_id) throws Exception;
	List<Registre> getTipusRegistre(Boolean tipus) throws Exception;
	Double getSumaByTipus(Boolean tipus, int year) throws Exception;
}