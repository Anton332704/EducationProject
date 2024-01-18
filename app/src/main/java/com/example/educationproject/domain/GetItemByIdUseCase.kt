package com.example.educationproject.domain

class GetItemByIdUseCase(private val shopListRepository: ShopListRepository) {
    fun getItemById(id: Int): ShopItem {
        return shopListRepository.getItemById(id)
    }
}