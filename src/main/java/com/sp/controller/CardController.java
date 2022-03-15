package com.sp.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.service.CardService;
import com.sp.entity.Card;

@RestController
public class CardController {
	
	private final CardService CardService;
	
	public CardController(CardService CardService) {
		this.CardService=CardService;
	}
	
	@GetMapping("/Cards")
	public Collection<Card> getCards(){
		return CardService.getCards();
		
	}
	
	@GetMapping("/Card/{id}")
	public Card getCard(@PathVariable String id){
		int current_id=Integer.valueOf(id);
		return CardService.getCard(current_id);
	}

	@GetMapping("/Cards/toSell")
	public Collection<Card> getCardsToSell(){
		return CardService.getCardsToSell();
		
	}
	
	@PostMapping("/Card")
	public Card addCard(@RequestBody Card m){
		return CardService.addCard(m);
	}

	@PutMapping("/Card")
	public Card updateCard(@RequestBody Card m){
		return CardService.updateCard(m);
	}
	

}
