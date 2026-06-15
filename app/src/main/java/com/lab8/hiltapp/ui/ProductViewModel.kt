package com.lab8.hiltapp.ui

import androidx.lifecycle.ViewModel
import com.lab8.hiltapp.domain.GetProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase
) : ViewModel() {

    private val _products = MutableStateFlow<List<String>>(emptyList())
    val products: StateFlow<List<String>> = _products.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    init {
        loadProducts()
    }

    fun loadProducts() {
        _isLoading.value = true
        _products.value = getProductsUseCase()
        _isLoading.value = false
    }
}
