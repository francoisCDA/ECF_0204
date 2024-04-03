package com.ut.ecommerce.searchservice.controller;

import com.ut.ecommerce.searchservice.dto.ResultSearch;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class SearchController {

    @GetMapping(value = "/search-suggestion",params = "q")
    public ResponseEntity<?> getSearchResult(@RequestParam("q") String searchParams) {
        System.out.printf(searchParams+"\n");
        ResultSearch[] arr = new ResultSearch[]{ new ResultSearch("Aaa") , new ResultSearch("Bbb"), new ResultSearch("Ccc")};
        return ResponseEntity.ok(arr);
    }

    @GetMapping(value = "/default-search-suggestion")
    public ResponseEntity<Object> getDefaultSearchResult() {
        System.out.println("default-search-suggestion access");;
        return ResponseEntity.ok(new ResultSearch());
    }

}
