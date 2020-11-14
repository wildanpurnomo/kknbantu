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

        // Alfabet
        materialModels.add(new AudioVisualMaterialModel("Huruf", new ArrayList<>(Arrays.asList(
                new AudioVisualContentModel("a.png", R.raw.a),
                new AudioVisualContentModel("b.png", R.raw.b),
                new AudioVisualContentModel("c.png", R.raw.c),
                new AudioVisualContentModel("d.png", R.raw.d),
                new AudioVisualContentModel("e.png", R.raw.e),
                new AudioVisualContentModel("f.png", R.raw.f),
                new AudioVisualContentModel("g.png", R.raw.g),
                new AudioVisualContentModel("h.png", R.raw.h),
                new AudioVisualContentModel("i.png", R.raw.i),
                new AudioVisualContentModel("j.png", R.raw.j),
                new AudioVisualContentModel("k.png", R.raw.k),
                new AudioVisualContentModel("l.png", R.raw.l),
                new AudioVisualContentModel("m.png", R.raw.m),
                new AudioVisualContentModel("n.png", R.raw.n),
                new AudioVisualContentModel("o.png", R.raw.o),
                new AudioVisualContentModel("p.png", R.raw.p),
                new AudioVisualContentModel("q.png", R.raw.q),
                new AudioVisualContentModel("r.png", R.raw.r),
                new AudioVisualContentModel("s.png", R.raw.s),
                new AudioVisualContentModel("t.png", R.raw.t),
                new AudioVisualContentModel("u.png", R.raw.u),
                new AudioVisualContentModel("v.png", R.raw.v),
                new AudioVisualContentModel("w.png", R.raw.w),
                new AudioVisualContentModel("x.png", R.raw.x),
                new AudioVisualContentModel("y.png", R.raw.y),
                new AudioVisualContentModel("z.png", R.raw.z)
                ))));

        // Family
        materialModels.add(new AudioVisualMaterialModel("Keluarga", new ArrayList<>(Arrays.asList(
                new AudioVisualContentModel("bibi.png", R.raw.aunt),
                new AudioVisualContentModel("saudara-laki-laki.png", R.raw.brother),
                new AudioVisualContentModel("sepupu.png", R.raw.cousin),
                new AudioVisualContentModel("ayah.png", R.raw.father),
                new AudioVisualContentModel("nenek.png", R.raw.grandma),
                new AudioVisualContentModel("kakek.png", R.raw.grandpa),
                new AudioVisualContentModel("ibu.png", R.raw.mother),
                new AudioVisualContentModel("saudara-perempuan.png", R.raw.sister),
                new AudioVisualContentModel("paman.png", R.raw.uncle)
        ))));

        // Numbers
        materialModels.add(new AudioVisualMaterialModel("Angka", new ArrayList<>(Arrays.asList(
                new AudioVisualContentModel("satu.png", R.raw.one),
                new AudioVisualContentModel("dua.png", R.raw.two),
                new AudioVisualContentModel("tiga.png", R.raw.three),
                new AudioVisualContentModel("empat.png", R.raw.four),
                new AudioVisualContentModel("lima.png", R.raw.five),
                new AudioVisualContentModel("enam.png", R.raw.six),
                new AudioVisualContentModel("tujuh.png", R.raw.seven),
                new AudioVisualContentModel("delapan.png", R.raw.eight),
                new AudioVisualContentModel("sembilan.png", R.raw.nine),
                new AudioVisualContentModel("sepuluh.png", R.raw.ten),
                new AudioVisualContentModel("sebelas.png", R.raw.eleven),
                new AudioVisualContentModel("dua-belas.png", R.raw.twelve),
                new AudioVisualContentModel("tiga-belas.png", R.raw.thirteen),
                new AudioVisualContentModel("empat-belas.png", R.raw.fourteen),
                new AudioVisualContentModel("lima-belas.png", R.raw.fifteen),
                new AudioVisualContentModel("enam-belas.png", R.raw.sixteen),
                new AudioVisualContentModel("tujuh-belas.png", R.raw.seventeen),
                new AudioVisualContentModel("delapan-belas.png", R.raw.eighteen),
                new AudioVisualContentModel("sembilan-belas.png", R.raw.nineteen),
                new AudioVisualContentModel("dua-puluh.png", R.raw.twenty)
        ))));

        // Verb
        materialModels.add(new AudioVisualMaterialModel("Kata Kerja", new ArrayList<>(Arrays.asList(
                new AudioVisualContentModel("membangun.png", R.raw.build),
                new AudioVisualContentModel("membeli.png", R.raw.buy),
                new AudioVisualContentModel("menelpon.png", R.raw.call),
                new AudioVisualContentModel("mendaki.png", R.raw.climb),
                new AudioVisualContentModel("menangis.png", R.raw.cry),
                new AudioVisualContentModel("minum.png", R.raw.drink),
                new AudioVisualContentModel("menyetir.png", R.raw.drive),
                new AudioVisualContentModel("makan.png", R.raw.eat),
                new AudioVisualContentModel("tertawa.png", R.raw.laugh),
                new AudioVisualContentModel("bermain.png", R.raw.play),
                new AudioVisualContentModel("berlari.png", R.raw.run),
                new AudioVisualContentModel("berbelanja.png", R.raw.shop),
                new AudioVisualContentModel("bernyanyi.png", R.raw.sing),
                new AudioVisualContentModel("duduk.png", R.raw.sit),
                new AudioVisualContentModel("tidur.png", R.raw.sleep),
                new AudioVisualContentModel("berbicara.png", R.raw.speak),
                new AudioVisualContentModel("menyapu.png", R.raw.sweep),
                new AudioVisualContentModel("berenang.png", R.raw.swim),
                new AudioVisualContentModel("berpikir.png", R.raw.think),
                new AudioVisualContentModel("bekerja.png", R.raw.work),
                new AudioVisualContentModel("menguap.png", R.raw.yawn)
        ))));

        this.materialList.setValue(materialModels);
    }

    public LiveData<ArrayList<MaterialModel>> getMaterialList() {
        return materialList;
    }
}
