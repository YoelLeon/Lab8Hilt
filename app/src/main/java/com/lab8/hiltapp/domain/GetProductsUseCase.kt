package com.lab8.hiltapp.domain

import com.lab8.hiltapp.data.ProductRepository
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    operator fun invoke(): List<String> {
        return repository.getProducts()
    }
}
