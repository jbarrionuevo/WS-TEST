package controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mashape.unirest.http.exceptions.UnirestException;

import model.EmployeeList;
import service.EmployeeService;

@RestController
public class EmployeeController {

	@RequestMapping("/empleados")
	public EmployeeList empleados(
			@RequestParam(value = "profesion", required = false, defaultValue = "") String profesion)
			throws UnirestException, JsonParseException, JsonMappingException, IOException {
		EmployeeService employeeService = new EmployeeService();
		return employeeService.getEmployees(profesion);
	}
}