package com.app.alphafront.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//@ManagedBean(name = "helloBean", eager = true)
@ManagedBean
@SessionScoped
public class HelloBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
