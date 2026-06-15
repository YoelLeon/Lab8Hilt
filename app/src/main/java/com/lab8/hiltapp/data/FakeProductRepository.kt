package com.lab8.hiltapp.data

import javax.inject.Inject

class FakeProductRepository @Inject constructor() : ProductRepository {
    override fun getProducts(): List<String> {
        return listOf(
            "[FAKE] Producto de prueba A",
            "[FAKE] Producto de prueba B",
            "[FAKE] Producto de prueba C"
        )
    }
}
