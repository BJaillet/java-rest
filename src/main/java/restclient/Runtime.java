package restclient;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class Runtime {
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(restTemplate.getForObject("http://localhost:8080/webAppli/rest/find/id/26/nom/banane", Client.class).toString());
		
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		map.add("nom", "yo");
		map.add("email", "yes");
		map.add("age", "15");
		System.out.println(map);
		System.out.println(restTemplate.postForObject("http://localhost:8080/webAppli/rest/addClient", map, Client.class));
	}
}
