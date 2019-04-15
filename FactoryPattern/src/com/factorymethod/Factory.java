package com.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<String , Product> productHashMap = new HashMap<String, Product>();

    public Factory() {
        productHashMap.put("producta", new ProductA());
        productHashMap.put("productb", new ProductB());
    }

   Product createProduct(String type) {
        return productHashMap.get(type);
   }
}
