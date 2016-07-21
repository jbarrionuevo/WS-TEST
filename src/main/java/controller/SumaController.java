package controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Suma;
import service.SumaService;

@RestController
public class SumaController {

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/suma")
	public Suma sumaa(@RequestParam(value = "number1", defaultValue = "0") Integer number1,
			@RequestParam(value = "number2", defaultValue = "0") Integer number2) {
		SumaService sumaService = new SumaService();
		return sumaService.getSuma(counter.incrementAndGet(), number1, number2);
	}
}
