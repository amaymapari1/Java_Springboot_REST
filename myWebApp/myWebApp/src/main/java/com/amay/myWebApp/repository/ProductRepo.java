package com.amay.myWebApp.repository;

import com.amay.myWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> { //classname(model),primary key type

}
