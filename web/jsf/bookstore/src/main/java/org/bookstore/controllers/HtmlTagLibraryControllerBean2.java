package org.bookstore.controllers;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIOutput;
import javax.faces.component.UISelectBoolean;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named("htmlTag2")
@RequestScoped
public class HtmlTagLibraryControllerBean2 {

    private String[] items;
    private static final SelectItem[] options = {
        new SelectItem("One"),
        new SelectItem("Two"),
        new SelectItem("Three"),
        new SelectItem("Four")
    };
    
    public SelectItem[] getOptions() {
    	return options; 
    }

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}
    
    

}
