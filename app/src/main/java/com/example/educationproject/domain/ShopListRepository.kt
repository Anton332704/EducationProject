package com.example.educationproject.domain

interface ShopListRepository {
    fun addItem(item: ShopItem)
    fun editItem(item: ShopItem)
    fun getItemById(id: Int): ShopItem
    fun getShopList(): List<ShopItem>
    fun removeItem(item: ShopItem)

}