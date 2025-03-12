package dstoianov.nlgrocerydealsapi.controller;

import dstoianov.nlgrocerydealsapi.model.GroceryDealCategory;
import dstoianov.nlgrocerydealsapi.service.GroceryDealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroceryDealController {
    GroceryDealService groceryDealService;

    @Autowired
    public GroceryDealController(GroceryDealService groceryDealService) {
        this.groceryDealService = groceryDealService;
    }

    @GetMapping("/deals")
    public List<GroceryDealCategory> getGroceryDeal() {
        return groceryDealService.getDeals();
    }
}
