package com.project.registreComptable.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;

import com.project.registreComptable.Model.Base;
import com.project.registreComptable.Repository.BaseRepository;


public abstract class BaseServiceImpl<E extends Base, ID extends Serializable>implements BaseService<E, ID> {

	protected BaseRepository <E, ID> baseRepository;
	
	public BaseServiceImpl(BaseRepository <E, ID> baseRepository) {
		this.baseRepository = baseRepository;
	}
	
	@Override
	@Transactional
	public List<E> findAll() throws Exception {
		try {
			List<E> entities = baseRepository.findAll();
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	@Override
	@Transactional
	public Page<E> findAll(Pageable pageable) throws Exception {
		try {
			Page<E> entities = baseRepository.findAll(pageable);
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Page<E> findAll(Specification<E> spec, Pageable pageable) throws Exception {
		try {
			Page<E> entities = baseRepository.findAll(spec, pageable);
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	
	@Override
	@Transactional
	public E findById(ID id) throws Exception {
		try {
			Optional<E> entityOptional = baseRepository.findById(id) ;
			return  entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E save(E entity) throws Exception {
		try {
			return baseRepository.save(entity);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E update(ID id, E entity) throws Exception {
		try {
			E entityUpdate = this.findById(id);
			entityUpdate = baseRepository.save(entity);
			return entityUpdate ;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Boolean delete(ID id) throws Exception {
		try {
			if (baseRepository.existsById(id)) {
				baseRepository.deleteById(id);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
}
