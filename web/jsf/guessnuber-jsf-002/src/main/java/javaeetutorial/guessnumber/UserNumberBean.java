package javaeetutorial.guessnumber;

import java.io.Serializable;
import java.util.Random;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class UserNumberBean implements Serializable{
	
	private Integer userNumber;
	private Integer generatedNumber;
	private Integer max = 10;
 	private Integer min = 0;
	private String response = "";
	
	

	public UserNumberBean() {
		super();
		Random random = new Random();
		generatedNumber = random.nextInt(max - 1);
	}
	public Integer getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}
	public Integer getGeneratedNumber() {
		return generatedNumber;
	}
	public void setGeneratedNumber(Integer generatedNumber) {
		this.generatedNumber = generatedNumber;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public String getResponse() {
		if((userNumber == null) || (userNumber.equals(generatedNumber))) {
			response = "You guess it!";
		}else {
			response = "Try again!";
		}
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
}
