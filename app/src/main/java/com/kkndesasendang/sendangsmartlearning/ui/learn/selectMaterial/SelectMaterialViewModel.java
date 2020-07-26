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
                new AudioVisualContent("apple.png", R.raw.apple),
                new AudioVisualContent("avocado.png", R.raw.avocado),
                new AudioVisualContent("banana.png", R.raw.banana),
                new AudioVisualContent("cherry.png", R.raw.cherry),
                new AudioVisualContent("coconut.png", R.raw.coconut),
                new AudioVisualContent("custard_apple.png", R.raw.custard_apple),
                new AudioVisualContent("grape.png", R.raw.grape),
                new AudioVisualContent("guava.png", R.raw.guava),
                new AudioVisualContent("kurma.png", R.raw.kurma),
                new AudioVisualContent("lychee.png", R.raw.leci),
                new AudioVisualContent("mango.png", R.raw.mangga),
                new AudioVisualContent("mangosteen.png", R.raw.mangosteen),
                new AudioVisualContent("melon.png", R.raw.melon),
                new AudioVisualContent("orange.png", R.raw.orange),
                new AudioVisualContent("pineapple.png", R.raw.nanas),
                new AudioVisualContent("soursop.png", R.raw.soursop),
                new AudioVisualContent("starfruit.png", R.raw.star),
                new AudioVisualContent("strawberry.png", R.raw.strawberry),
                new AudioVisualContent("watermelon.png", R.raw.watermelon)
        ))));

        // Animals
        materials.add(new AudioVisualMaterial("Hewan-Hewanan", new ArrayList<>(Arrays.asList(
                new AudioVisualContent("badak.png", R.raw.badak),
                new AudioVisualContent("beruang.png", R.raw.beruang),
                new AudioVisualContent("elang.png", R.raw.elang),
                new AudioVisualContent("gajah.png", R.raw.gajah),
                new AudioVisualContent("harimau.png", R.raw.harimau),
                new AudioVisualContent("ikan.png", R.raw.ikan),
                new AudioVisualContent("jerapah.png", R.raw.jerapah),
                new AudioVisualContent("kambing.png", R.raw.kambing),
                new AudioVisualContent("keledai.png", R.raw.keledai),
                new AudioVisualContent("kelinci.png", R.raw.kelinci),
                new AudioVisualContent("kucing.png", R.raw.kucing),
                new AudioVisualContent("kuda.png", R.raw.kuda),
                new AudioVisualContent("monyet.png", R.raw.monyet),
                new AudioVisualContent("rusa.png", R.raw.rusa),
                new AudioVisualContent("sapi.png", R.raw.sapi),
                new AudioVisualContent("serigala.png", R.raw.serigala),
                new AudioVisualContent("singa.png", R.raw.singa),
                new AudioVisualContent("tikus.png", R.raw.tikus),
                new AudioVisualContent("ular.png", R.raw.ular),
                new AudioVisualContent("unta.png", R.raw.unta)
        ))));

        this.materialList.setValue(materials);
    }

    public LiveData<ArrayList<Material>> getMaterialList() {
        return materialList;
    }
}
