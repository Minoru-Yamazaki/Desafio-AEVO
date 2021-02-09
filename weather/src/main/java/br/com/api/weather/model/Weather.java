package br.com.api.weather.model;

import lombok.Data;

@Data
public class Weather {
	
	private Request request;
	private Location location;
	private Current current;
	
}
