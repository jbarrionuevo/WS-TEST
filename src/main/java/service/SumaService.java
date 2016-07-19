package service;

import model.Suma;

public class SumaService {

	public Suma getSuma(Long id, Integer int1, Integer int2) {
		Suma suma = new Suma(id, int1, int2);
		return suma;
	}
}
