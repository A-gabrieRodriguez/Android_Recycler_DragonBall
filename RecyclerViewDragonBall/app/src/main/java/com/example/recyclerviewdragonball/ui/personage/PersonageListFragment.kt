package com.example.recyclerviewdragonball.ui.personage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.recyclerviewdragonball.R
import com.example.recyclerviewdragonball.databinding.FragmentPersonageListBinding
import com.example.recyclerviewdragonball.repository.DictionaryRepository

class PersonageListFragment : Fragment() {
    private val viewModelFactory by lazy {
        val repository = DictionaryRepository()
        PersonageViewModelFactory(repository)
    }
    private val viewModel: PersonageViewModel by viewModels {
        viewModelFactory
    }
    private lateinit var binding: FragmentPersonageListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_personage_list, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val wordListRecyclerView = binding.wordListRecyclerView
        val wordAdapter = PersonageAdapter()
        wordListRecyclerView.apply {
            adapter = wordAdapter
        }
        viewModel.personage.observe(viewLifecycleOwner) { data ->
            wordAdapter.setData(data)
            wordListRecyclerView.smoothScrollToPosition(data.lastIndex)
        }
    }

}