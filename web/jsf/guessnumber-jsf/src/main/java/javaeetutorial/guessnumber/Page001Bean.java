package javaeetutorial.guessnumber;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Page001Bean {

	private String name;

	public Page001Bean() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void changeName(String name) {
		this.name = name;
	}
}
