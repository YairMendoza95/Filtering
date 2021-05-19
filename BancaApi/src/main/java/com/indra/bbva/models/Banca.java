package com.indra.bbva.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANCA")
public class Banca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDBANCA")
	private Integer idBanca;

	@Column(name = "DIVISION")
	private String division;

	@Column(name = "BANCACORPORATIVA")
	private Integer bancaCorporativa;

	@Column(name = "BANCACOMERCIAL")
	private Integer bancaComercial;

	@Column(name = "CENTROSCORPORATIVOS")
	private Integer centrosCorporativos;

	@Column(name = "CONTACTCENTER")
	private Integer contactCenter;

	@Column(name = "EMPRESAS")
	private Integer empresas;

	@Column(name = "GOBIERNO")
	private Integer gobierno;

	@Column(name = "GOBIERNOCENTRO")
	private Integer gobiernoCentro;

	@Column(name = "PYME")
	private Integer pyme;

	@Column(name = "TOTAL")
	private Integer total;

	public Banca() {
	}

	public Banca(Integer idBanca) {
		this.idBanca = idBanca;
	}

	public Banca(String division) {
		this.division = division;
	}

	public Banca(String division, Integer bancaCorporativa, Integer bancaComercial, Integer centrosCorporativos,
			Integer contactCenter, Integer empresas, Integer gobierno, Integer gobiernoCentro, Integer pyme,
			Integer total) {
		this.division = division;
		this.bancaCorporativa = bancaCorporativa;
		this.bancaComercial = bancaComercial;
		this.centrosCorporativos = centrosCorporativos;
		this.contactCenter = contactCenter;
		this.empresas = empresas;
		this.gobierno = gobierno;
		this.gobiernoCentro = gobiernoCentro;
		this.pyme = pyme;
		this.total = total;
	}

	public Banca(Integer idBanca, String division, Integer bancaCorporativa, Integer bancaComercial,
			Integer centrosCorporativos, Integer contactCenter, Integer empresas, Integer gobierno,
			Integer gobiernoCentro, Integer pyme, Integer total) {
		this.idBanca = idBanca;
		this.division = division;
		this.bancaCorporativa = bancaCorporativa;
		this.bancaComercial = bancaComercial;
		this.centrosCorporativos = centrosCorporativos;
		this.contactCenter = contactCenter;
		this.empresas = empresas;
		this.gobierno = gobierno;
		this.gobiernoCentro = gobiernoCentro;
		this.pyme = pyme;
		this.total = total;
	}

	public Integer getIdBanca() {
		return idBanca;
	}

	public void setIdBanca(Integer idBanca) {
		this.idBanca = idBanca;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Integer getBancaCorporativa() {
		return bancaCorporativa;
	}

	public void setBancaCorporativa(Integer bancaCorporativa) {
		this.bancaCorporativa = bancaCorporativa;
	}

	public Integer getBancaComercial() {
		return bancaComercial;
	}

	public void setBancaComercial(Integer bancaComercial) {
		this.bancaComercial = bancaComercial;
	}

	public Integer getCentrosCorporativos() {
		return centrosCorporativos;
	}

	public void setCentrosCorporativos(Integer centrosCorporativos) {
		this.centrosCorporativos = centrosCorporativos;
	}

	public Integer getContactCenter() {
		return contactCenter;
	}

	public void setContactCenter(Integer contactCenter) {
		this.contactCenter = contactCenter;
	}

	public Integer getEmpresas() {
		return empresas;
	}

	public void setEmpresas(Integer empresas) {
		this.empresas = empresas;
	}

	public Integer getGobierno() {
		return gobierno;
	}

	public void setGobierno(Integer gobierno) {
		this.gobierno = gobierno;
	}

	public Integer getGobiernoCentro() {
		return gobiernoCentro;
	}

	public void setGobiernoCentro(Integer gobiernoCentro) {
		this.gobiernoCentro = gobiernoCentro;
	}

	public Integer getPyme() {
		return pyme;
	}

	public void setPyme(Integer pyme) {
		this.pyme = pyme;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Banca [idBanca=" + idBanca + ", division=" + division + ", bancaCorporativa=" + bancaCorporativa
				+ ", bancaComercial=" + bancaComercial + ", centrosCorporativos=" + centrosCorporativos
				+ ", contactCenter=" + contactCenter + ", empresas=" + empresas + ", gobierno=" + gobierno
				+ ", gobiernoCentro=" + gobiernoCentro + ", pyme=" + pyme + ", total=" + total + "]";
	}
}
