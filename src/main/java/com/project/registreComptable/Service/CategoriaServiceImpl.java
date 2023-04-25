package com.project.registreComptable.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.registreComptable.Model.Categoria;
import com.project.registreComptable.Repository.BaseRepository;
import com.project.registreComptable.Repository.CategoriaRepository;


@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository) {
		super(baseRepository);
	}

}
