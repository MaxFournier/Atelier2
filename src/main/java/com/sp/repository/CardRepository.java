package com.sp.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sp.entity.Card;

public interface CardRepository extends CrudRepository<Card, Integer> {
    List<Card> findByToSell(boolean state);
    List<Card> findByUserId(int id);
}
