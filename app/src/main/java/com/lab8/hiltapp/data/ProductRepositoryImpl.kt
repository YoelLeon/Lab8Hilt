package com.lab8.hiltapp.data

import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor() : ProductRepository {
    override fun getProducts(): List<String> {
        return listOf(
            "Laptop Dell XPS 15",
            "Monitor LG UltraWide 34\"",
            "Teclado Mecánico Keychron K2",
            "Mouse Logitech MX Master 3",
            "Auriculares Sony WH-1000XM5",
            "Webcam Logitech C920",
            "SSD Samsung 970 EVO 1TB",
            "RAM Corsair 32GB DDR5"
        )
    }
}
