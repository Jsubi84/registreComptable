package com.project.registreComptable.Model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper=false)
@Entity @Table(name = "registre")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registre extends Base{
	
	private static final long serialVersionUID = 1L;

	@Column(name = "tipus")
	private Boolean tipus;
	
	@Column(name = "data")
	private LocalDate data;
	
	@Column(name = "import")
	private LocalDate importReg;	
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "fk_subcategoria")
	private Subcategoria subcategoria;
}
