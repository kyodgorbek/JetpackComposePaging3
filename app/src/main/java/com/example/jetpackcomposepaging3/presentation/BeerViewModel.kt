package com.example.jetpackcomposepaging3.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.cachedIn
import androidx.paging.map
import com.example.jetpackcomposepaging3.data.local.BeerEntity
import com.example.jetpackcomposepaging3.data.mappers.toBeer
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class BeerViewModel @Inject constructor(
    private val pager: Pager<Int, BeerEntity>
)
    :ViewModel() {

  val beerPagingFlow = pager
      .flow
      .map { pageData->
          pageData.map { it.toBeer() }

      }
      .cachedIn(viewModelScope)

}