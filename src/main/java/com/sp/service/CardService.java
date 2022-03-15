package com.sp.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.sp.entity.Card;

import com.sp.repository.CardRepository;

@Service
public class CardService {
	private final CardRepository CardRepository;

	public CardService(CardRepository CardRepository) {
		this.CardRepository = CardRepository;
	}

	public Card getCard(int id) {
		Optional<Card> mOpt = CardRepository.findById(id);
		return mOpt.get();
	}

	public List<Card> getCards() {
		List<Card> mL = new ArrayList<Card>();
		for (Card m : CardRepository.findAll()) {
			mL.add(m);
		}

		return mL;
	}

	public List<Card> getCardsToSell() {
		List<Card> mL = new ArrayList<Card>();
		for (Card m : CardRepository.findAll()) {
			mL.add(m);
		}

		return mL;
	}

	List<Card> findByToSell(boolean state){
		return CardRepository.findByToSell(state);
	}

	List<Card> findByUserId(int id){
		return CardRepository.findByUserId(id);
	}

	public Card addCard(Card card) {
		return CardRepository.save(card);
	}

	public Card updateCard(Card card){

		return CardRepository.save(card);
	}

	public void generateCard(int userId){
		List<Card> all = getCards();
		Random rand = new Random();

		int numberOfElements = 5;
		all.size();

		for (int i = 0; i < numberOfElements; i++) {
			int randomIndex = rand.nextInt( all.size() );
			Card randomcard = all.get(randomIndex);
			randomcard.setUserId(userId);
			CardRepository.save(randomcard);
		}

	}

}
