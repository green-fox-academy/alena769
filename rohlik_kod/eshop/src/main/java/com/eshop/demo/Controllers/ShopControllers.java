package com.eshop.demo.Controllers;

import com.eshop.demo.Classes.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class ShopControllers {
    private List<ShopItem> shopItemList;
    private String currency;

    public ShopControllers() {
        this.shopItemList = new ArrayList<>();
        ShopItem shoes = new ShopItem("Nike", "shoes", 200.00, 10);
        this.shopItemList.add(shoes);
        ShopItem shoes1 = new ShopItem("Adidos", "the more stripes the better, like nike", 20.00, 100);
        this.shopItemList.add(shoes1);
        ShopItem handBag = new ShopItem("Fifo", "coconut hand bag", 20000.00, 1);
        this.shopItemList.add(handBag);
        ShopItem pants = new ShopItem("H&M", "pats for sports", 200.00, 0);
        this.shopItemList.add(pants);
        this.currency = "CZK";
    }

    @GetMapping(value = "/home")
    public String home(Model model) {
        model.addAttribute("shopItemList", this.shopItemList);
        model.addAttribute("currency", this.currency);

        return "index";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        List<ShopItem> onlyAvailable = this.shopItemList.stream().filter(ShopItem -> ShopItem.getQuantity() > 0).collect(Collectors.toList());
        model.addAttribute("shopItemList", onlyAvailable);
        model.addAttribute("currency", this.currency);

        return "index";
    }

    @GetMapping(value = "/cheapest")
    public String cheapestFirst(Model model) {
        List<ShopItem> cheapestFirst = this.shopItemList.stream().sorted(Comparator.comparingDouble(ShopItem::getPrice)).collect(Collectors.toList());
        model.addAttribute("shopItemList", cheapestFirst);
        model.addAttribute("currency", this.currency);

        return "index";
    }

    @GetMapping(value = "/nike")
    public String contains(Model model) {
        List<ShopItem> containsNike = this.shopItemList.stream().filter(name -> name.getName().equals("Nike")).collect(Collectors.toList());
        model.addAttribute("shopItemList", containsNike);
        model.addAttribute("currency", this.currency);

        return "index";
    }

    @GetMapping(value = "/average")
    public String average(Model model) {
        int sum = this.shopItemList.stream().mapToInt(ShopItem::getQuantity).sum();
        Integer average = sum / this.shopItemList.size();
        model.addAttribute("average", average);

        return "average";
    }

    @GetMapping(value = "/expensive")
    public String mostExpensive(Model model) {
        String nameOfMostExpensive = this.shopItemList.stream().max(Comparator.comparing(ShopItem::getPrice)).get().getName();
        model.addAttribute("nameOfMostExpensive", nameOfMostExpensive);
        model.addAttribute("currency", this.currency);

        return "mostExpensive";
    }

    @PostMapping(value = "/search")
    public String search(Model model, @RequestParam String search) {
        List<ShopItem> searchResult = this.shopItemList.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains(search.toLowerCase())
                        || shopItem.getDescription().toLowerCase().contains(search.toLowerCase()))
                .collect(Collectors.toList());
        model.addAttribute("shopItemList", searchResult);
        model.addAttribute("currency", this.currency);

        return "index";
    }

    @GetMapping(value = "/eur")
    public String eurConversion(Model model) {
       this.shopItemList.forEach(ShopItem::priceConvert);
      String currency = this.currency = "EUR";
      model.addAttribute("shopItemList", this.shopItemList);
      model.addAttribute("currency", currency);

        return "index";
    }
}
