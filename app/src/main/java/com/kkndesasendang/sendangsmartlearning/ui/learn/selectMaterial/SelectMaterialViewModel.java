package com.kkndesasendang.sendangsmartlearning.ui.learn.selectMaterial;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.AudioVisualContent;
import com.kkndesasendang.sendangsmartlearning.model.AudioVisualMaterial;
import com.kkndesasendang.sendangsmartlearning.model.Grade;
import com.kkndesasendang.sendangsmartlearning.model.Material;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectMaterialViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Material>> materialList = new MutableLiveData<>();

    public void setMaterialList() {
        ArrayList<Material> materials = new ArrayList<>();
        // Fruits
        materials.add(new AudioVisualMaterial("Buah-Buahan", new ArrayList<>(Arrays.asList(
                new AudioVisualContent("apple", R.raw.apple),
                new AudioVisualContent("avocado", R.raw.avocado),
                new AudioVisualContent("banana", R.raw.banana),
                new AudioVisualContent("cherry", R.raw.cherry),
                new AudioVisualContent("coconut", R.raw.coconut),
                new AudioVisualContent("custard_apple", R.raw.custard_apple),
                new AudioVisualContent("grape", R.raw.grape),
                new AudioVisualContent("guava", R.raw.guava),
                new AudioVisualContent("kurma", R.raw.kurma),
                new AudioVisualContent("lychee", R.raw.leci),
                new AudioVisualContent("mango", R.raw.mangga),
                new AudioVisualContent("mangosteen", R.raw.mangosteen),
                new AudioVisualContent("melon", R.raw.melon),
                new AudioVisualContent("orange", R.raw.orange),
                new AudioVisualContent("pineapple", R.raw.nanas),
                new AudioVisualContent("soursop", R.raw.soursop),
                new AudioVisualContent("starfruit", R.raw.star),
                new AudioVisualContent("strawberry", R.raw.strawberry),
                new AudioVisualContent("watermelon", R.raw.watermelon)
        ))));

        // Animals
        materials.add(new AudioVisualMaterial("Hewan-Hewanan", new ArrayList<>(Arrays.asList(
                new AudioVisualContent("badak", R.raw.badak),
                new AudioVisualContent("beruang", R.raw.beruang),
                new AudioVisualContent("elang", R.raw.elang),
                new AudioVisualContent("gajah", R.raw.gajah),
                new AudioVisualContent("harimau", R.raw.harimau),
                new AudioVisualContent("ikan", R.raw.ikan),
                new AudioVisualContent("jerapah", R.raw.jerapah),
                new AudioVisualContent("kambing", R.raw.kambing),
                new AudioVisualContent("keledai", R.raw.keledai),
                new AudioVisualContent("kelinci", R.raw.kelinci),
                new AudioVisualContent("kucing", R.raw.kucing),
                new AudioVisualContent("kuda", R.raw.kuda),
                new AudioVisualContent("monyet", R.raw.monyet),
                new AudioVisualContent("rusa", R.raw.rusa),
                new AudioVisualContent("sapi", R.raw.sapi),
                new AudioVisualContent("serigala", R.raw.serigala),
                new AudioVisualContent("singa", R.raw.singa),
                new AudioVisualContent("tikus", R.raw.tikus),
                new AudioVisualContent("ular", R.raw.ular),
                new AudioVisualContent("unta", R.raw.unta)
        ))));

        this.materialList.setValue(materials);
    }

    public LiveData<ArrayList<Material>> getMaterialList() {
        return materialList;
    }
}
