package br.com.api.weather.model;

import lombok.Data;

@Data
public class Location {

	private String name = "";
	private String country = "";
	private String region = "";
	private String lat = "";
	private String lon = "";
	private String timezone_id = "";
	private String localtime = "";
	private float localtime_epoch = 0;
	private String ut_offset = "";
	
}
		 

