package com.amrfawzi.ShopManageMentApp.controllers;

import com.amrfawzi.ShopManageMentApp.models.Category;
import com.amrfawzi.ShopManageMentApp.models.Order;
import com.amrfawzi.ShopManageMentApp.models.Product;
import com.amrfawzi.ShopManageMentApp.services.CategoryService;
import com.amrfawzi.ShopManageMentApp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public String getAllOrders(Model model) {
        List<Order> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "order/list";
    }

    @GetMapping("/{id}")
    public String getOrderById(@PathVariable Long id, Model model) {
        Order order = orderService.getOrderById(id);
        model.addAttribute("order", order);
        return "order/details";
    }

    @GetMapping("/create")
    public String showOrderForm(Model model) {
        Order order = new Order();
        model.addAttribute("order", order);
        return "order/create";
    }

    @PostMapping("/create")
    public String createOrder(@ModelAttribute Order order) {
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

}
