package com.putera.aplikasitugas5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.putera.aplikasitugas5.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvNama.text = "Nama: Putera Bella Bangsa"
        binding.tvNpm.text = "NPM: 241111036"
        binding.tvEmail.text = "Email: puterabellabangsa@gmail.com"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
