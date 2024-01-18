package com.example.educationproject.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addItem(item: ShopItem) {
        shopListRepository.addItem(item)
    }
}