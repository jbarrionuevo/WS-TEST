package service;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import model.Employee;
import model.EmployeeList;

public class EmployeeService {

	public EmployeeList getEmployees(String profesion)
			throws UnirestException, JsonParseException, JsonMappingException, IOException {
		String baseUrl = "http://localhost:8089/empleados";
		String resultFromGetToBaseUrl = Unirest.get(baseUrl).asString().getBody();

		ObjectMapper mapper = new ObjectMapper();
		List<Employee> employees = mapper.readValue(resultFromGetToBaseUrl, new TypeReference<List<Employee>>() {
		});

		Iterator<Employee> itEmployee = employees.iterator();

		if (profesion.equals("") == false) {
			while (itEmployee.hasNext()) {
				Employee employee = itEmployee.next();
				if (employee.profesion.equals(profesion) == false) {
					itEmployee.remove();
				}
			}
		}
		EmployeeList employeeList = new EmployeeList(employees);
		return employeeList;
	}
}
