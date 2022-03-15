package com.sp.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sp.entity.Card;
import com.sp.entity.User;


@Service
public class MarketService {
	private final UserService UserService;
	private final CardService CardService;

	public MarketService(UserService UserService, CardService CardService) {
		this.UserService = UserService;
		this.CardService = CardService;
	}

	public void buy(Card card, int idBuyer) {
		//soustraire/ajouter argent buyer / owner
		User buyer = UserService.getUser(idBuyer);
		User Owner = UserService.getUser(card.getUserId());

		buyer.setArgent(buyer.getArgent() - card.getPrix());
		
		Owner.setArgent(Owner.getArgent() + card.getPrix());

		UserService.updateUser(buyer);
		UserService.updateUser(Owner);
		
		// update card owner
		card.setUserId(buyer.getId());

		CardService.updateCard(card);
	}

	public void sell(Card card,int prix){
		//update to sell statut
		card.setToSell(true);
		card.setPrix(prix);

		this.CardService.updateCard(card);
	}

}