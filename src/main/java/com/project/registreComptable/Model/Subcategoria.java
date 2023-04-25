package com.project.registreComptable.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper=false)
@Entity @Table(name = "subcategoria")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subcategoria extends Base{
	
	private static final long serialVersionUID = 1L;

	@Column(name = "nom")
	private String nom;
	
	@Column(name = "descripcio")
	private String descripcio;
}
