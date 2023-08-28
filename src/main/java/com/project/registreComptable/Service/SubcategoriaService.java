package com.project.registreComptable.Service;

import com.project.registreComptable.Model.Subcategoria;

public interface SubcategoriaService extends BaseService<Subcategoria, Long> {
	
	int checkDeleteCategoria(Long id) throws Exception;
	
}
