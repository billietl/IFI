package music.service;

import java.io.Serializable;
import java.util.List;

import music.domain.Product;

public interface ProductManager extends Serializable{

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    
}