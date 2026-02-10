package com.tka.taskdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.taskdemo.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>  {

}
