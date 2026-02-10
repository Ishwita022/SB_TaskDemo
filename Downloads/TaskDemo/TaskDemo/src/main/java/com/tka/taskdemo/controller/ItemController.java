package com.tka.taskdemo.controller;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.taskdemo.entity.Item;
import com.tka.taskdemo.service.ItemService;
@RestController
@RequestMapping("/api/items")
public class ItemController {
private final ItemService itemService;
	


	public ItemController(ItemService itemService) {
	super();
	this.itemService = itemService;
}

@PostMapping("/addItem")
	public Item addItem(@Valid @RequestBody Item item){
	return itemService.addItem(item);
//		return new ResponseEntity<Item>(savedItem, HttpStatus.CREATED);
	
}


@GetMapping("/{id}")
public Item getItemById(@PathVariable Long id) {
    return itemService.getItemById(id);
}
	@GetMapping("/all")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
}

