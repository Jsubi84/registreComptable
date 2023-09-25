package com.project.registreComptable.Controller;

import java.io.Serializable;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.registreComptable.Model.Base;

public interface BaseController <E extends Base, ID extends Serializable>{
	public ResponseEntity<?>getAll();
	public ResponseEntity<?>getAll(Pageable pageable);
	public ResponseEntity<?>getOne(@PathVariable ID id);
	public ResponseEntity<?>save(@RequestBody E entity);
	public ResponseEntity<?>update(@PathVariable ID id, @RequestBody E entit);
	public ResponseEntity<?>delete(@PathVariable ID id);
}
