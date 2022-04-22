package br.com.storeproductapi.Controller;

import br.com.storeproductapi.constant.Constant;
import br.com.storeproductapi.model.Product;
import br.com.storeproductapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping(Constant.URL_PRODUCT)
    public void insert (@RequestBody Product product){
        productService.insert(product);
    }

    @GetMapping(Constant.URL_PRODUCT)
    public List<Product> findAll(){
        return productService.findAll();
    }
}
