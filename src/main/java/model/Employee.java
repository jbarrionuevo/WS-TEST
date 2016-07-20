package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
	public String name;
	public String profesion;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	@Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", profesion=" + profesion +
                '}';
    }
}
