package br.com.api.weather.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.api.weather.model.Weather;
import lombok.extern.slf4j.Slf4j;

@Slf4j // Annotation para retornar logs
@Service // Indica que essa classe é um Service
public class WeatherServices {

	public Weather getWeatherByCity(String city) {
		
		log.info("method=getWeatherByCity, city={}", city);
		
		RestTemplate restTemplate = new RestTemplate(); // Faz uma chamada para uma API externa
		ResponseEntity<Weather> weather =
				// Faz uma chamada do tipo GET e retorna a resposta em uma classe (weather)
				restTemplate.getForEntity("http://api.weatherstack.com/current?access_key=076803f2eb88b011d99fcbb09d4fa79d&query=" 
				+ city + "/json/", Weather.class);
		
		if(weather.getStatusCode().isError()) {// Verifica o status da request! Se der erro é disparado uma Exeption
			throw new RuntimeException("Desculpe, Ocorreu algum erro!");
		}
		return weather.getBody(); //Se deu tudo certo retorna o JSON, mas em forna de objeto.
	}

}
