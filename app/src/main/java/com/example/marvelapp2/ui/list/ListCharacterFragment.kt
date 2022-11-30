package com.example.marvelapp2.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.marvelapp2.databinding.FragmentListCharacterBinding
import com.example.marvelapp2.ui.base.BaseFragment

class ListCharactearFragment :
    BaseFragment<FragmentListCharacterBinding, ListCharacterViewModel>() {

    override val viewmodel: ListCharacterViewModel by viewModels()


    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentListCharacterBinding =
        FragmentListCharacterBinding.inflate(inflater, container, false)
}