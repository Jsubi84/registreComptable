package com.project.registreComptable.Service;

import java.util.List;

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
	public List<Registre> getTipusRegistre(Boolean tipus)throws Exception {
		try {
			List<Registre> registres = registreRepository.getTipusRegistre(tipus);
			return registres;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	};

	@Override
	public Double getSumaByTipus(Boolean tipus, int year)throws Exception {
		try {
			return registreRepository.getSumaByTipus(tipus, year);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<Registre> getRegistreByMonthAndYear(int month, int year) throws Exception {
		try {
			return registreRepository.getRegistreByMonthAndYear(month, year);
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
}
