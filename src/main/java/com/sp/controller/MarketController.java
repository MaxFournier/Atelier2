package com.sp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.service.MarketService;
import com.sp.entity.Card;

@RestController
public class MarketController {
	
	private final MarketService MarketService;
	
	public MarketController(MarketService MarketService) {
		this.MarketService=MarketService;
	}
	
	@PutMapping("/Market/buy/{buyerId}")
	public void buy(@PathVariable int buyerid,@RequestBody Card card ){
		MarketService.buy(card, buyerid);
	}
	
	@PutMapping("/Market/sell/{price}")
	public void sell(@RequestBody Card card,@PathVariable int price ){
		MarketService.sell(card, price);
	}

}
