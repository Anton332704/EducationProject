package com.example.educationproject.domain

class RemoveItemUseCase(private val shopListRepository: ShopListRepository) {
    fun removeItem(item: ShopItem) {
        shopListRepository.removeItem(item)
    }
}