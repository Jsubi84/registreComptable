package com.project.registreComptable.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.registreComptable.Model.Registre;
import com.project.registreComptable.Model.Subcategoria;
import com.project.registreComptable.Repository.BaseRepository;
import com.project.registreComptable.Repository.RegistreRepository;


@Service
public class RegistreServiceImpl extends BaseServiceImpl<Registre, Long> implements RegistreService {
	
	@Autowired
	private RegistreRepository registreRepository;
	
	public RegistreServiceImpl(BaseRepository<Registre, Long> baseRepository) {
		super(baseRepository);
	}
	
	@Override
	public List<Registre> findAllWithSort() throws Exception {
		try {
			List<Registre> registres = registreRepository.findAll(Sort.by("data").descending());
			return registres;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	@Override
	public List<Registre> getRegistreBySubcategoriaId(Long id) throws Exception {
		try {
			List<Registre> registres = registreRepository.getRegistreBySubcategoriaId(id);
			return registres;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<Registre> getRegistreByCategoria(Long categoria_id) throws Exception {
		try {
			List<Registre> registres = registreRepository.getRegistreByCategoria(categoria_id);
			return registres;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
		@Override
	public List<Object[]> getResumAny(int year) throws Exception {
		try {
			return registreRepository.getResumAny(year);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public int checkDeleteSubcategoria(Long id) throws Exception {
		try {
			return registreRepository.checkDeleteSubcategoria(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	@Override
	public List<Long> getRegistreRepeate(Double importReg, Date data, Long subcatId)throws Exception {
		try {
			return registreRepository.getRegistreRepeate(importReg, data, subcatId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Page<Registre> filtred(Date fi, Date inici, int subcat, Pageable pageable) throws Exception {
		try {
			return registreRepository.findByDataAndSubcategoria(fi, inici, subcat, pageable);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	
	
}
