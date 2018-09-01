package org.bookstore.controllers;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIOutput;
import javax.faces.component.UISelectBoolean;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named("htmlTag")
@RequestScoped
public class HtmlTagLibraryControllerBean {
	
	private String input;
	private String string001 = "S7R1NG 001";
	
    UIOutput booleanCheckText = null;
    UISelectBoolean booleanCheck = null;

    boolean check02 = false;

    private String shippingOption = "2";
    
    private String[] items;

	
	public String submit() {
		return "htmltag002"; 
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getString001() {
		return string001;
	}

	public void setString001(String string001) {
		this.string001 = string001;
	}

	public UIOutput getBooleanCheckText() {
		return booleanCheckText;
	}

	public void setBooleanCheckText(UIOutput booleanCheckText) {
		this.booleanCheckText = booleanCheckText;
	}

	public UISelectBoolean getBooleanCheck() {
		return booleanCheck;
	}

	public void setBooleanCheck(UISelectBoolean booleanCheck) {
		this.booleanCheck = booleanCheck;
	}

	public String getShippingOption() {
		return shippingOption;
	}

	public void setShippingOption(String shippingOption) {
		this.shippingOption = shippingOption;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] Items) {
		this.items = Items;
	}


    private static final SelectItem[] options = {
        new SelectItem("One"),
        new SelectItem("Two"),
        new SelectItem("Three"),
        new SelectItem("Four")
    };
    
    public SelectItem[] getOptions() {
    	return options; 
    }

	public boolean isCheck02() {
		return check02;
	}

	public void setCheck02(boolean check02) {
		this.check02 = check02;
	}

    
	
}
/*

			<!--
			<h:selectManyCheckbox id="selectManyCheckbox" layout="pageDirection" value="#{htmlTag.items}">
				<f:selectItems value="#{htmlTag.xxx}"/>
			</h:selectManyCheckbox>  
			-->
*/