package com.project.registreComptable.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.registreComptable.Model.Subcategoria;
import com.project.registreComptable.Repository.BaseRepository;
import com.project.registreComptable.Repository.SubcategoriaRepository;


@Service
public class SubcategoriaServiceImpl extends BaseServiceImpl<Subcategoria, Long> implements SubcategoriaService {
	
	@Autowired
	private SubcategoriaRepository subcategoriaRepository;
	
	public SubcategoriaServiceImpl(BaseRepository<Subcategoria, Long> baseRepository) {
		super(baseRepository);
	}

}
