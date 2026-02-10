package com.tka.taskdemo.service;

import com.tka.taskdemo.repository.ItemRepository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.taskdemo.entity.Item;
@Service 
public class ServiceImpl  implements ItemService{
private final ItemRepository itemRepository;
	
	// constructor for initialize a value from insert data
	public ServiceImpl(ItemRepository itemRepository) {
		
		this.itemRepository = itemRepository;
	}


	@Override
	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}
	
	@Override
	public Item getItemById(Long id) {
		// TODO Auto-generated method stub
		 return itemRepository.findById(id).orElse(null);
	}

	
	@Override
	public List<Item> getAllItems(){
	    return itemRepository.findAll();
	}
	

}
