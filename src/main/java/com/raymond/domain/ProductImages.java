package com.raymond.domain;

// Generated 2011-11-5 17:09:59 by Hibernate Tools 3.2.4.GA

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProductImages generated by hbm2java
 */
@Entity
@Table(name = "ProductImages", schema = "RAYMOND_APP")
public class ProductImages implements java.io.Serializable {

	private int id;
	private Products products;
	private String type;
	private Serializable title;
	private Serializable description;
	private Serializable fileName;

	public ProductImages() {
	}

	public ProductImages(int id, Products products, String type,
			Serializable title, Serializable description, Serializable fileName) {
		this.id = id;
		this.products = products;
		this.type = type;
		this.title = title;
		this.description = description;
		this.fileName = fileName;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ProductID", nullable = false)
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Column(name = "Type", nullable = false, length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "Title", nullable = false)
	public Serializable getTitle() {
		return this.title;
	}

	public void setTitle(Serializable title) {
		this.title = title;
	}

	@Column(name = "Description", nullable = false)
	public Serializable getDescription() {
		return this.description;
	}

	public void setDescription(Serializable description) {
		this.description = description;
	}

	@Column(name = "FileName", nullable = false)
	public Serializable getFileName() {
		return this.fileName;
	}

	public void setFileName(Serializable fileName) {
		this.fileName = fileName;
	}

}