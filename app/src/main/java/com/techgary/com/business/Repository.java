package com.techgary.com.business;

import com.techgary.com.domain.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gary on 10/5/2014.
 */
public class Repository {
    private List<Product> Products = new ArrayList<Product>();

    public Repository(List<Product> products) {
        Products = products;
    }

    public Product getProduct(int index){
        if(this.Products.size()>0){
            return Products.get(index);
        }else{
            return null;
        }
    }

    public int getCount(){
        return this.Products.size();
    }
}
