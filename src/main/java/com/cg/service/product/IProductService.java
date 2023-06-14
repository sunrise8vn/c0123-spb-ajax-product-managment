package com.cg.service.product;

import java.util.*;
import com.cg.model.Category;
import com.cg.model.Product;
import com.cg.model.dto.ProductCreateReqDTO;
import com.cg.model.dto.ProductDTO;
import com.cg.service.IGeneralService;

public interface IProductService extends IGeneralService<Product, Long> {

    List<ProductDTO> findAllProductDTO();

    Product create(ProductCreateReqDTO productCreateReqDTO, Category category);
}
