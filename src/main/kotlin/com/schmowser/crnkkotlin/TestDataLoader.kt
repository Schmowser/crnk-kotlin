package com.schmowser.crnkkotlin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct


@Configuration
class TestDataLoader {

    @Autowired
    private lateinit var cardRepository: CardRepositoryImpl

    @PostConstruct
    fun setup() {
        cardRepository.save(Card(121L, "Playing Card"))
        cardRepository.save(Card(122L, "Debit Card"))
        cardRepository.save(Card(123L, "Wild Card"))
        cardRepository.save(Card(124L, "Penalty Card"))
    }
}