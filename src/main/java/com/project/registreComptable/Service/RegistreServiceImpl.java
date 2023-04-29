package com.project.registreComptable.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.registreComptable.Model.Registre;
import com.project.registreComptable.Repository.BaseRepository;
import com.project.registreComptable.Repository.RegistreRepository;


@Service
public class RegistreServiceImpl extends BaseServiceImpl<Registre, Long> implements RegistreService {
	
	@Autowired
	private RegistreRepository registreRepository;
	
	public RegistreServiceImpl(BaseRepository<Registre, Long> baseRepository) {
		super(baseRepository);
	}

}
