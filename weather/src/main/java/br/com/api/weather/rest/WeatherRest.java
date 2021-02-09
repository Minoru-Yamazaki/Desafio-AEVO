package br.com.api.weather.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.weather.model.Weather;
import br.com.api.weather.services.WeatherServices;

@CrossOrigin("*")
@RestController // Indica que é o endpoint da aplicação
@RequestMapping("/city") // path ou caminho base para API
public class WeatherRest {
	
	@Autowired //Faz a injeção de dependências automáticas
	private WeatherServices services;
	
	@GetMapping(value = "/{city}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity getWeather(@PathVariable("city") String city) {//@RequestParam 
		
		Weather newWeather = this.services.getWeatherByCity(city);
		
		//retorna um JSON do objeto Address com status 288 (ok)
		return ResponseEntity.ok(newWeather);
	}

}
