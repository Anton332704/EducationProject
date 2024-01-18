package com.example.educationproject.data

import com.example.educationproject.domain.ShopItem
import com.example.educationproject.domain.ShopListRepository

object ShopListRepositoryImpl: ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()
    private var autoIncrementalId = 0

    override fun addItem(item: ShopItem) {
        if(item.id == ShopItem.UNDEFINED_ID) {
            item.id = autoIncrementalId++
        }
        shopList.add(item)
    }

    override fun editItem(item: ShopItem) {
        val oldElement = getItemById(item.id)
        shopList.remove(oldElement)
        addItem(item)
    }

    override fun getItemById(id: Int): ShopItem {
        return shopList.find { it.id == id } ?: throw RuntimeException("Element with id $id not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }

    override fun removeItem(item: ShopItem) {
        shopList.remove(item)
    }
}