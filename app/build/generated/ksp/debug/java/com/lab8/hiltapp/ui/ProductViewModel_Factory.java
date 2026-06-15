package com.lab8.hiltapp.ui;

import com.lab8.hiltapp.domain.GetProductsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class ProductViewModel_Factory implements Factory<ProductViewModel> {
  private final Provider<GetProductsUseCase> getProductsUseCaseProvider;

  public ProductViewModel_Factory(Provider<GetProductsUseCase> getProductsUseCaseProvider) {
    this.getProductsUseCaseProvider = getProductsUseCaseProvider;
  }

  @Override
  public ProductViewModel get() {
    return newInstance(getProductsUseCaseProvider.get());
  }

  public static ProductViewModel_Factory create(
      Provider<GetProductsUseCase> getProductsUseCaseProvider) {
    return new ProductViewModel_Factory(getProductsUseCaseProvider);
  }

  public static ProductViewModel newInstance(GetProductsUseCase getProductsUseCase) {
    return new ProductViewModel(getProductsUseCase);
  }
}
