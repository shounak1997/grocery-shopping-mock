package com.sprint.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.sprint.entities.OrderEntity;


//@RepositoryRestResource(collectionResourceRel="cgProducts",path="pathProducts")
public interface OrderDAO extends JpaRepository<OrderEntity,Integer>
{	
	
	//public List<OrderEntity> findBy
	
	@Query("SELECT order FROM OrderEntity order  WHERE order.amount>=:pri")
	public List<OrderEntity> getByAmount(@Param("pri") double amount);

}

