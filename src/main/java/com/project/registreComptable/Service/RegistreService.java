package com.project.registreComptable.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.project.registreComptable.Model.Registre;


public interface RegistreService extends BaseService<Registre, Long> {
	
	List<Registre> getRegistreBySubcategoriaId(Long id) throws Exception;
	List<Registre> getRegistreByCategoria(Long categoria_id) throws Exception;
	List<Object[]> getResumAny(int year) throws Exception;
	int checkDeleteSubcategoria(Long id) throws Exception;
	List<Registre> findAllWithSort() throws Exception;
	List<Long> getRegistreRepeate(Double importReg, Date data, Long subcatId) throws Exception;
	Page<Registre> filtred(Date fi, Date inici, int subcat, Pageable pageable) throws Exception;
}
