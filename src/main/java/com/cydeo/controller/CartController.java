package com.cydeo.controller;

import com.cydeo.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
    private final CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("/cart-list")
    public String carList(Model model){

        model.addAttribute("cartList", cartService.retrieveCartList());

        return "cart/cart-list";
    }
}
