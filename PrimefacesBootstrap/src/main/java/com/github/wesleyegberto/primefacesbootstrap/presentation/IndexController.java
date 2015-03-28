package com.github.wesleyegberto.primefacesbootstrap.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.github.wesleyegberto.primefacesbootstrap.business.entity.Hero;

@Named
@RequestScoped
public class IndexController {

	public void showMessage() {
		System.out.println("Hello!");
	}

	public Map<Integer, Integer> getValues() {
		Map<Integer, Integer> values = new HashMap<>();
		values.put(1, 1);
		values.put(2, 2);
		values.put(3, 3);
		return values;
	}

	public List<String> pesquisaPorNome(String filtro) {
		return Arrays.asList(new String[] { "ASP .Net MVC", "CakePHP",
				"Django", "Java EE", "Ruby on Rails" });
	}
	
	public List<Hero> getHeroes() {
		List<Hero> heroes = new ArrayList<>();
		
		heroes.add(new Hero("Batman", 56));
		heroes.add(new Hero("Superman", 89));
		heroes.add(new Hero("Hulk", 90));
		heroes.add(new Hero("Sentry", 98));
		heroes.add(new Hero("Thor", 98));
		
		return heroes;
	}

}
