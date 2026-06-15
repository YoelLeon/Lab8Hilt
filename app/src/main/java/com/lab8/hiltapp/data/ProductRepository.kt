package com.lab8.hiltapp.data

interface ProductRepository {
    fun getProducts(): List<String>
}
