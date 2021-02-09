package br.com.api.weather.model;

import java.util.List;

import lombok.Data;

@Data
public class Current {
	
	private String observation_time = "";
	private float temperature = 0;
	private float weather_code = 0;
	private List<String> weather_icons;
	private List<String> weather_descriptions;
	private float wind_speed  = 0;
	private float wind_degree = 0;
	private String wind_dir = "";
	private float pressure = 0;
	private float precip = 0;
	private float humidity = 0;
	private float cloudcover = 0;
	private float feelslike = 0;
	private float uv_index = 0;
	private float visibility = 0;
	private String is_day = "";

}
