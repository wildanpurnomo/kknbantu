package com.kkndesasendang.sendangsmartlearning.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.kkndesasendang.sendangsmartlearning.R
import com.kkndesasendang.sendangsmartlearning.model.GamaselaMaterialModel
import com.kkndesasendang.sendangsmartlearning.ui.rvAdapters.MaterialListAdapter
import kotlinx.android.synthetic.main.fragment_select_material.*

class SelectMaterialFragment : Fragment(), MaterialListAdapter.OnItemClickCallback {
    val args: SelectMaterialFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_material, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val materials = args.materials
        val topicName = args.topicName
        val rvAdapter = MaterialListAdapter()

        selectMaterialTitle.text = topicName
        selectMaterialList.layoutManager = LinearLayoutManager(requireContext())
        selectMaterialList.adapter = rvAdapter
        rvAdapter.setOnItemClickCallback(this)
        rvAdapter.updateDataset(materials)
    }

    override fun onItemClick(topic: GamaselaMaterialModel) {
        val action = SelectMaterialFragmentDirections.actionNavSelectSubMaterialToNavAudioVisual(topic)
        findNavController().navigate(action)
    }
}