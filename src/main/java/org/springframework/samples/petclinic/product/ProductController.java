package org.springframework.samples.petclinic.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    private static final String CREATE_OR_UPDATE_FORM = "products/createOrUpdateProductForm";


    @GetMapping("/create")
    public ModelAndView createOrUpdateProductForm() {
        ModelAndView mv = new ModelAndView(CREATE_OR_UPDATE_FORM);
        Product product = new Product();
        mv.addObject("product", product);
        return mv;
    }
}
