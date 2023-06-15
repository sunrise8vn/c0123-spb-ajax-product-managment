package com.cg.api;

import java.util.*;
import com.cg.exception.DataInputException;
import com.cg.model.Category;
import com.cg.model.Product;
import com.cg.model.dto.product.ProductCreateReqDTO;
import com.cg.model.dto.product.ProductCreateResDTO;
import com.cg.model.dto.product.ProductDTO;
import com.cg.service.category.ICategoryService;
import com.cg.service.product.IProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductAPI {

    @Autowired
    private IProductService productService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<ProductDTO> productDTOList = productService.findAllProductDTO();

        return new ResponseEntity<>(productDTOList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@ModelAttribute ProductCreateReqDTO productCreateReqDTO) {

        Category category = categoryService.findById(productCreateReqDTO.getCategoryId()).orElseThrow(() -> {
            throw new DataInputException("Danh mục không tồn tại");
        });

        Product product = productService.create(productCreateReqDTO, category);
        ProductCreateResDTO productCreateResDTO = product.toProductCreateResDTO();

        return new ResponseEntity<>(productCreateResDTO, HttpStatus.CREATED);
    }
}
