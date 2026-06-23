package com.shreefruit.shreefruitapp.controller;

import com.shreefruit.shreefruitapp.model.SaleEntry;
import com.shreefruit.shreefruitapp.service.SaleEntryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class SaleEntryController {
    private final SaleEntryService service;

    @PostMapping
    public ResponseEntity<SaleEntry> saveSale(@RequestBody SaleEntry entry){
        return ResponseEntity.ok(service.saveSale(entry));
    }
    @GetMapping
    public ResponseEntity<List<SaleEntry>>getAllSales(){
        return ResponseEntity.ok(service.getAllSales());
    }
}
