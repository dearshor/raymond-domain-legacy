package com.raymond.domain;

// Generated 2011-11-5 17:09:59 by Hibernate Tools 3.2.4.GA

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.jsigner.annotations.Domain;

/**
 * Keywords generated by hbm2java
 */
@Domain(value = { "raymond-domain" })
@Entity
@Table(name = "Keywords", schema = "RAYMOND_APP")
public class Keywords implements java.io.Serializable {

	private int id;
	private Serializable value;
	private Set<ProductKeywords> productKeywordses = new HashSet<ProductKeywords>(
			0);

	public Keywords() {
	}

	public Keywords(int id, Serializable value) {
		this.id = id;
		this.value = value;
	}

	public Keywords(int id, Serializable value,
			Set<ProductKeywords> productKeywordses) {
		this.id = id;
		this.value = value;
		this.productKeywordses = productKeywordses;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Value", nullable = false)
	public Serializable getValue() {
		return this.value;
	}

	public void setValue(Serializable value) {
		this.value = value;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "keywords")
	public Set<ProductKeywords> getProductKeywordses() {
		return this.productKeywordses;
	}

	public void setProductKeywordses(Set<ProductKeywords> productKeywordses) {
		this.productKeywordses = productKeywordses;
	}

}
