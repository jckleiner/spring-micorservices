package com.greydev.moviecatalogservice.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greydev.moviecatalogservice.model.CatalogItem;

@RestController
public class MovieCatalogResource {

	@GetMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId) {
		System.out.println("user id is: " + userId);

		List<CatalogItem> list = new ArrayList<>();

		CatalogItem item1 = new CatalogItem("CATALOG", "desc", 5);
		list.add(item1);
		return list;
	}

}
