package com.kkndesasendang.sendangsmartlearning.ui.learn.selectMaterial;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.AudioVisualContentModel;
import com.kkndesasendang.sendangsmartlearning.model.AudioVisualMaterialModel;
import com.kkndesasendang.sendangsmartlearning.model.MaterialModel;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectMaterialViewModel extends ViewModel {
    private MutableLiveData<ArrayList<MaterialModel>> materialList = new MutableLiveData<>();

    public void setMaterialList() {
        ArrayList<MaterialModel> materialModels = new ArrayList<>();
        // Fruits
        materialModels.add(new AudioVisualMaterialModel("Buah-Buahan", new ArrayList<>(Arrays.asList(
                new AudioVisualContentModel("apple.png", R.raw.apple),
                new AudioVisualContentModel("avocado.png", R.raw.avocado),
                new AudioVisualContentModel("banana.png", R.raw.banana),
                new AudioVisualContentModel("cherry.png", R.raw.cherry),
                new AudioVisualContentModel("coconut.png", R.raw.coconut),
                new AudioVisualContentModel("custard_apple.png", R.raw.custard_apple),
                new AudioVisualContentModel("grape.png", R.raw.grape),
                new AudioVisualContentModel("guava.png", R.raw.guava),
                new AudioVisualContentModel("kurma.png", R.raw.kurma),
                new AudioVisualContentModel("lychee.png", R.raw.leci),
                new AudioVisualContentModel("mango.png", R.raw.mangga),
                new AudioVisualContentModel("mangosteen.png", R.raw.mangosteen),
                new AudioVisualContentModel("melon.png", R.raw.melon),
                new AudioVisualContentModel("orange.png", R.raw.orange),
                new AudioVisualContentModel("pineapple.png", R.raw.nanas),
                new AudioVisualContentModel("soursop.png", R.raw.soursop),
                new AudioVisualContentModel("starfruit.png", R.raw.star),
                new AudioVisualContentModel("strawberry.png", R.raw.strawberry),
                new AudioVisualContentModel("watermelon.png", R.raw.watermelon)
        ))));

        // Animals
        materialModels.add(new AudioVisualMaterialModel("Hewan-Hewanan", new ArrayList<>(Arrays.asList(
                new AudioVisualContentModel("badak.png", R.raw.badak),
                new AudioVisualContentModel("beruang.png", R.raw.beruang),
                new AudioVisualContentModel("elang.png", R.raw.elang),
                new AudioVisualContentModel("gajah.png", R.raw.gajah),
                new AudioVisualContentModel("harimau.png", R.raw.harimau),
                new AudioVisualContentModel("ikan.png", R.raw.ikan),
                new AudioVisualContentModel("jerapah.png", R.raw.jerapah),
                new AudioVisualContentModel("kambing.png", R.raw.kambing),
                new AudioVisualContentModel("keledai.png", R.raw.keledai),
                new AudioVisualContentModel("kelinci.png", R.raw.kelinci),
                new AudioVisualContentModel("kucing.png", R.raw.kucing),
                new AudioVisualContentModel("kuda.png", R.raw.kuda),
                new AudioVisualContentModel("monyet.png", R.raw.monyet),
                new AudioVisualContentModel("rusa.png", R.raw.rusa),
                new AudioVisualContentModel("sapi.png", R.raw.sapi),
                new AudioVisualContentModel("serigala.png", R.raw.serigala),
                new AudioVisualContentModel("singa.png", R.raw.singa),
                new AudioVisualContentModel("tikus.png", R.raw.tikus),
                new AudioVisualContentModel("ular.png", R.raw.ular),
                new AudioVisualContentModel("unta.png", R.raw.unta)
        ))));

        // Vegetables
        materialModels.add(new AudioVisualMaterialModel("Sayur-sayuran", new ArrayList<>(Arrays.asList(
                new AudioVisualContentModel("bawang-bombay.png", R.raw.bawang_bombay),
                new AudioVisualContentModel("bawang-putih.png", R.raw.bawang_putih),
                new AudioVisualContentModel("bayam.png", R.raw.bayam),
                new AudioVisualContentModel("buncis.png", R.raw.buncis),
                new AudioVisualContentModel("cabai.png", R.raw.cabai),
                new AudioVisualContentModel("jagung.png", R.raw.jagung),
                new AudioVisualContentModel("kacang.png", R.raw.kacang),
                new AudioVisualContentModel("kentang.png", R.raw.kentang),
                new AudioVisualContentModel("kubis.png", R.raw.kubis),
                new AudioVisualContentModel("lobak.png", R.raw.lobak),
                new AudioVisualContentModel("paprika.png", R.raw.paprika),
                new AudioVisualContentModel("sawi-hijau.png", R.raw.sawi_hijau),
                new AudioVisualContentModel("selada.png", R.raw.selada),
                new AudioVisualContentModel("seledri.png", R.raw.selederi),
                new AudioVisualContentModel("singkong.png", R.raw.singkong),
                new AudioVisualContentModel("terong.png", R.raw.terong),
                new AudioVisualContentModel("timun.png", R.raw.timun),
                new AudioVisualContentModel("tomat.png", R.raw.tomat),
                new AudioVisualContentModel("ubi-jalar.png", R.raw.ubi_jalar),
                new AudioVisualContentModel("wortel.png", R.raw.wortel)
        ))));

        this.materialList.setValue(materialModels);
    }

    public LiveData<ArrayList<MaterialModel>> getMaterialList() {
        return materialList;
    }
}
