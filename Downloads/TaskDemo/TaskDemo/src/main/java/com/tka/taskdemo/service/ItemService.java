package com.tka.taskdemo.service;

import java.util.List;

import com.tka.taskdemo.entity.Item;

public interface ItemService {
	
		// abstract method
	 Item addItem(Item item);
	public Item getItemById(Long id);
	 List<Item> getAllItems();
	
	 
	 
	 
}



