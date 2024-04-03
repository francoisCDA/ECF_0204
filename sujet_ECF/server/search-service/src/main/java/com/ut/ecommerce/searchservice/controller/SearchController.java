package com.ut.ecommerce.searchservice.controller;

import com.ut.ecommerce.searchservice.dto.ResultSearch;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping(value = "/search-suggestion",params = "q")
    public ResponseEntity<?> getSearchResult(@RequestParam("q") String searchParams) {
        System.out.printf(searchParams+"\n");

        return ResponseEntity.ok(new Object());
    }

    @GetMapping(value = "/default-search-suggestion")
    public ResponseEntity<Object> getDefaultSearchResult() {
        System.out.println("default-search-suggestion access");;
        return ResponseEntity.ok(new Object());
    }

}
