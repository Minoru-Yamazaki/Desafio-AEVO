function pesquisar(){
    nome = document.getElementById('txtCity').value;               
    
    fetch('http://localhost:8080/city/' + nome)
    .then(response => response.json())
    .then(data => {

        //Informações da localização
        document.querySelector("#labelCity").innerHTML = data.location.name;
        document.querySelector("#labelCountry").innerHTML = data.location.country;
        document.querySelector("#labelRegion").innerHTML = data.location.region;
        document.querySelector("#labelTimezone_id").innerHTML = data.location.timezone_id;

        document.querySelector("#labelLat").innerHTML = data.location.lat;
        document.querySelector("#labelLon").innerHTML = data.location.lon;
        document.querySelector("#labelLocaltime").innerHTML = data.location.localtime;
        //informações do clima
        document.querySelector("#labelTemperature").innerHTML = `${data.current.temperature} ºC`;
        document.querySelector("#labelWeather_desc").innerHTML = data.current.weather_descriptions;
        document.querySelector("#labelWind_speed").innerHTML = `${data.current.wind_speed} km/h`;
        document.querySelector("#labelPressure").innerHTML = `${data.current.pressure} mb`;

        document.querySelector("#labelFeelslike").innerHTML = `${data.current.feelslike} ºC`;
        document.querySelector("#labelHumidity").innerHTML = `${data.current.humidity} %`;
        document.querySelector("#labelPrecip").innerHTML = `${data.current.precip} mm`;
        document.querySelector("#labelUv_index").innerHTML = `${data.current.uv_index} UV`;

        //document.getElementById("imagem").src = data.current.weather_icons;

        console.log(data)
    });
}  