package com.schmowser.crnkkotlin

import io.crnk.core.queryspec.QuerySpec
import io.crnk.core.repository.ResourceRepositoryBase
import io.crnk.core.resource.list.ResourceList
import org.springframework.stereotype.Repository
import java.util.concurrent.atomic.AtomicLong


@Repository
class CardRepositoryImpl : ResourceRepositoryBase<Card, Long>(Card::class.java) {
    private val cards: MutableMap<Long, Card> = HashMap()

    @Synchronized
    override fun delete(id: Long) {
        cards.remove(id)
    }

    @Synchronized
    override fun <S : Card> save(card: S): S {
        if (card.id == null) {
            card.id = ID_GENERATOR.getAndIncrement()
        }
        cards[card.id!!] = card
        return card
    }

    @Synchronized
    override fun findAll(querySpec: QuerySpec): ResourceList<Card> {
        return querySpec.apply(cards.values)
    }

    companion object {
        private val ID_GENERATOR = AtomicLong(124)
    }
}