package com.project.registreComptable.Model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	
	@Column(name = "registres")
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(
			name = "sub_registres",
			joinColumns = @JoinColumn(name = "subcategoria_id"),
			inverseJoinColumns = @JoinColumn(name = "registre_id")
			)
	private List<Registre> registres = new ArrayList<Registre>();
}
