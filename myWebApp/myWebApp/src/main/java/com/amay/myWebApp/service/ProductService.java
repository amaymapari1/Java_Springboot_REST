package com.amay.myWebApp.service;

import com.amay.myWebApp.model.Product;
import com.amay.myWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    List<Product> products= new ArrayList<>(Arrays.asList(new Product(101,"Iphone",5000),
            new Product(102,"Nikon",3000),
            new Product(103,"Cycle",2000)));

    public List<Product> getProducts(){
        //return products;
        return repo.findAll();
    }

    public Product getProductById(int prodID){
//        return products.stream()
//                .filter(p -> p.getProdID()==prodID)
//                .findFirst().get();
        return repo.findById(prodID).orElse(new Product());
    }

    public void addProduct(Product prod){
//         products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index=0;
//
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdID()==prod.getProdID()){
//                index=i;
//            }
//        }
//        products.set(index,prod);
          repo.save(prod);
    }

    public void deleteProduct(int prodID) {
//        int index=0;
//
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdID()==prodID){
//                index=i;
//            }
//        }
//        products.remove(index);
        repo.deleteById(prodID);
    }
}
