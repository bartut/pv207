package com.pv207.project;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class PhotoCategoriesSelect implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.List<java.lang.String> categories;

	public PhotoCategoriesSelect() {
	}

	public java.util.List<java.lang.String> getCategories() {
		return this.categories;
	}

	public void setCategories(java.util.List<java.lang.String> categories) {
		this.categories = categories;
	}

	public PhotoCategoriesSelect(java.util.List<java.lang.String> categories) {
		this.categories = categories;
	}

}