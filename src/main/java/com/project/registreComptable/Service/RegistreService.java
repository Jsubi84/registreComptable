package com.project.registreComptable.Service;

import java.util.List;

import com.project.registreComptable.Model.Registre;

public interface RegistreService extends BaseService<Registre, Long> {
	
	List<Registre> getRegistreBySubcategoriaId(Long id) throws Exception;
	List<Registre> getRegistreByCategoria(Long categoria_id) throws Exception;
	List<Object[]> getResumAny(int year) throws Exception;
	int checkDeleteSubcategoria(Long id) throws Exception;
	List<Registre> findAllWithSort() throws Exception;
	
}
