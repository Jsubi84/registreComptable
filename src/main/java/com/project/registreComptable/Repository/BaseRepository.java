package com.project.registreComptable.Repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.project.registreComptable.Model.Base;

@NoRepositoryBean
public interface BaseRepository<E extends Base, ID extends Serializable> extends JpaRepository<E, ID>{

}
