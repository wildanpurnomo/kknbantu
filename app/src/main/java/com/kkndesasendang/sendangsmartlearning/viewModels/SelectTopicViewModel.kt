package com.kkndesasendang.sendangsmartlearning.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kkndesasendang.sendangsmartlearning.R
import com.kkndesasendang.sendangsmartlearning.model.GamaselaMaterialModel
import com.kkndesasendang.sendangsmartlearning.model.GamaselaTopicModel
class SelectTopicViewModel: ViewModel() {
    private val topics: MutableLiveData<ArrayList<GamaselaTopicModel>> by lazy {
        MutableLiveData<ArrayList<GamaselaTopicModel>>()
    }

    fun setTopics() {
        val topicModels = arrayListOf<GamaselaTopicModel>()

        // Grammar
        topicModels.add(GamaselaTopicModel("Grammar", arrayListOf(
                GamaselaMaterialModel("Cara Menghubungkan Dua Ide Kontras", "**❖\tPenjelasan** \n" +
                        "\n" +
                        "*Although, even though, in spite of and despite* dapat digunakan untuk menghubungkan dua ide atau makna yang berbeda dalam suatu kalimat utuh. Kata-kata ini juga bisa untuk menunjukkan salah satu fakta yang membuat fakta yang lainnya memiliki makna yang berbeda. kata-kata ini dapat digunakan di awal atau di tengah kalimat.\n" +
                        "\n" +
                        "**Example :** \n" +
                        "\n" +
                        "Despite the rain, we enjoyed the festival.\n" +
                        "(Meskipun hujan turun, kami menikmati festival itu).\n" +
                        "\n" +
                        "We enjoyed the festival, despite the rain.\n" +
                        "(Kami menikmati festival itu, meskipun hujan turun).\n" +
                        "\n" +
                        "Perbedaan yang paling mendasar antara, Although, even though, in spite of and despite adalah penggunaan dengan struktur yang berbeda pada kalimat.\n" +
                        "\n" +
                        "*In spite of / Despite*\n" +
                        "\n" +
                        "Sesudah kata In spite of dan Despite kita gunakan Noun, Gerund, dan Pronoun.\n" +
                        "\n" +
                        "**Example :**\n" +
                        "1.\t*They never made much money, in spite of their success.*\n" +
                        "(Mereka tidak mendapatkan banyak uang terlepas/meskipun dari kesuksesan mereka).\n" +
                        "\n2.\t*Despite having a headache, I had a great birthday.*\n" +
                        "(Walaupun sedang sakit kepala, saya mengalami pesta ulang tahun yang luar biasa).\n" +
                        "\n" +
                        "3.\t*In spite of the pain in his leg, he completed the marathon.*\n" +
                        "(Walaupun terasa nyeri pada kakinya, dia dapat menyelesaikan maraton).\n" +
                        "\n" +
                        "Catatan bahwa hal umum untuk menggunakan In spite of dan Despite jika menunjukkan sebuah fakta.\n" +
                        "\n" +
                        "1.\t*In spite of the fact that he worked very hard, he didn't pass the exam.*\n" +
                        " (Meskipun faktanya dia bekerja keras, , dia tidak lulus dari ujian).\n" +
                        "\n" +
                        "*Although / Even though*\n" +
                        "Sesudah Although dan Even though, kita harus menggunakan Subject dan Verb. Even though agak kuat dan lebih memiliki empati ketimbang Although.\n" +
                        "\n" +
                        "**Example :**\n" +
                        "1.\t*I enjoyed the course, although I would have liked more grammar practice.*\n" +
                        "(saya menikmati pelajaran tersebut, walaupun saya agak lebih menyukai praktek grammar.)\n" +
                        "\n" +
                        "2.\t*Although we saw each other every day, we didn't really know each other.*\n" +
                        "(Meskipun kami melihat satu dengan yang lain setiap hari, kami tidak terlalu tahu satu dengan yang lain).\n"),
                GamaselaMaterialModel("Cara Menggunakan Just, Yet, Still, dan Already", "•\tPenjelasan\n" +
                        "\n" +
                        "Dalam Bahasa Inggris kita sering menjumpai kata-kata seperti : *just, yet, still and already.* Kita sering menggunakan 4 kata tersebut dalam tensis Present Perfect Tense karena kata-kata tersebut mewakili kondisi saat ini. Pembahasan kali ini kita fokuskan pada arti dan penggunaan 4 kata ini pada tensis Present Perfect Tense.\n" +
                        "\n" +
                        "**Just**\n" +
                        "\n" +
                        "Just kita gunakan dalam Present Perfect Tense yang memiliki arti baru saja (waktu yang singkat sebelum kejadian saat itu).\n" +
                        "\n" +
                        "**Example :**\n" +
                        "1.\t*I've just seen Susan coming out of the cinema.*\n" +
                        "(Aku baru saja melihat Susan keluar dari bioskop).\n" +
                        "\n" +
                        "2.  *Mike's just called. Can you ring him back, please?*\n" +
                        "    (Mike baru saja menelpon, dapatkah kamu menelpon balik dia?).\n" +
                        "\n" +
                        "3. *Have you just taken my pen?*\n" +
                        "   (Sudahkah kamu mengambil pulpen ku barusan / baru saja?)\n" +
                        "\n" +
                        "**Yet**\n" +
                        "\n" +
                        "Yet dalam Present Perfect Tense memiliki arti “hingga saat ini/sampai saat ini”. Dalam konteks ini kata Yet hanya digunakan dalam kalimat negative atau kalimat tanya.\n" +
                        "\n" +
                        "**Example :**\n" +
                        "1. *Have you finished your homework yet?*\n" +
                        "    (Sudahkah kamu menyelesaikan PR mu sampai saat ini?)\n" +
                        "\n" +
                        "2. *I have not eaten Samyang yet*\n" +
                        "    (aku belum pernah makan Samyang sampai saat ini)\n" +
                        "\n" +
                        "3. *He hasn't arrived yet.*\n" +
                        "    (Dia belum datang sampai saat ini)\n" +
                        "\n" +
                        "**Still**\n" +
                        "\n" +
                        "Kata ini digunakan untuk membicarakan sesuatu yang belum selesai terjadi, khususnya ketika kita memprediksinya akan selesai lebih awal. Kata ‘still’ biasanya muncul di tengah-tengah kalimat. Kata ini juga sering digunakan di tenses lainnya dan penggunaannya seperti pada present perfect. Kata ini lazim digunakan pada bentuk kalimat negatif.\n" +
                        "\n" +
                        "**Example :**\n" +
                        "1. *Lionel Messi still has not played for Barcelona.*\n" +
                        "   (Lionel Messi masih belum bermain untuk Barcelona)\n" +
                        "\n" +
                        "2. *Innes still has not come home.\n" +
                        "   (Innes masih belum pulang ke rumah)\n" +
                        "\n" +
                        "3. Rany still has not finished the assignment\n" +
                        "   (Rany masih belum menyelesaikan tugas itu)\n" +
                        "\n" +
                        "**Already**\n" +
                        "\n" +
                        "Kata already digunakan dalam Present Perfect Tense yang memiliki arti sudah. Kita menggunakan kata ini ketika sesuatu sudah terjadi sebelum hal lain terjadi.\n" +
                        "\n" +
                        "**Example :**\n" +
                        "1. Hagung already used his chance to get the discount in online shop.\n" +
                        "   (Hagung sudah menggunakan kesempatannya untuk mendapatkan diskon di toko\n" +
                        "    Online)\n" +
                        "\n" +
                        "2. Dhiya has already spent my salary and it's two weeks before payday.\n" +
                        "   (Dhiya sudah menghabiskan seluruh gajinya dan itu tepat 2 minggu sebelum\n" +
                        "    Gajian)\n" +
                        "\n" +
                        "3. The train has already come before 10 o’clock \n" +
                        "   (Kereta itu sudah datang sebelum jam 10)\n"),
                GamaselaMaterialModel("Cara Menggunkan Kata So dan Such", "\uF076\tPenjelasan\n" +
                        "Kita dapat menggunakan so dan such untuk memperkuat makna dari adjectives, adverbs dan nouns.\n" +
                        "\n" +
                        "Adjectives and adverbs\n" +
                        "Kita dapat menggunakan So + adjective and adverb untuk membuat makna kalimat semakin kuat.\n" +
                        "\n" +
                        "Example : \n" +
                        "1.\tIt's so hot today!\n" +
                        "(Hari ini sangat panas sekali)\n" +
                        "\n" +
                        "2. Afifah looks so young in that photo.\n" +
                        "   (Afifah terlihat sangat muda di foto ini)\n" +
                        "\n" +
                        "3. Azalea walks so fast\n" +
                        "   (Azalea berjalan sangat cepat)\n" +
                        "\n" +
                        "Jika kita membuat bentuk perbandingan dari adjective and adverb kita menggunakan so much untuk memperkuat maknanya.\n" +
                        "\n" +
                        "**Example :**\n" +
                        "1.\t*They were so much more innocent when they were younger.*\n" +
                        "(Mereka Nampak terlihat lebih polos ketika mereka lebih muda)\n" +
                        "\n" +
                        "2. *I work so much more quickly when I can concentrate.*\n" +
                        "    (saya bekerja sangat lebih cepat ketika saya konsentrasi)\n" +
                        "\n" +
                        "Nouns\n" +
                        "Kita dapat menggunakan such + noun untuk membuat makna kalimat semakin kuat \n" +
                        "\n" +
                        "*Example :* \n" +
                        "1. *You're such an angel!*\n" +
                        "   (Kamu seperti seorang malaikat)\n"),
                GamaselaMaterialModel("Cara Menghubungkan Dua Ide Kontras", "❖\tPenjelasan \n" +
                        "\n" +
                        "Although, even though, in spite of and despite dapat digunakan untuk menghubungkan dua ide atau makna yang berbeda dalam suatu kalimat utuh. Kata-kata ini juga bisa untuk menunjukkan salah satu fakta yang membuat fakta yang lainnya memiliki makna yang berbeda. kata-kata ini dapat digunakan di awal atau di tengah kalimat.\n" +
                        "\n" +
                        "Example : \n" +
                        "\n" +
                        "Despite the rain, we enjoyed the festival.\n" +
                        "(Meskipun hujan turun, kami menikmati festival itu).\n" +
                        "\n" +
                        "We enjoyed the festival, despite the rain.\n" +
                        "(Kami menikmati festival itu, meskipun hujan turun).\n" +
                        "\n" +
                        "Perbedaan yang paling mendasar antara, Although, even though, in spite of and despite adalah penggunaan dengan struktur yang berbeda pada kalimat.\n" +
                        "\n" +
                        "In spite of / Despite\n" +
                        "\n" +
                        "Sesudah kata In spite of dan Despite kita gunakan Noun, Gerund, dan Pronoun.\n" +
                        "\n" +
                        "Example :\n" +
                        "1.\tThey never made much money, in spite of their success.\n" +
                        "(Mereka tidak mendapatkan banyak uang terlepas/meskipun dari kesuksesan mereka).\n" +
                        "\n" +
                        "2.\tDespite having a headache, I had a great birthday.\n" +
                        "(Walaupun sedang sakit kepala, saya mengalami pesta ulang tahun yang luar biasa).\n" +
                        "\n" +
                        "3.\tIn spite of the pain in his leg, he completed the marathon.\n" +
                        "(Walaupun terasa nyeri pada kakinya, dia dapat menyelesaikan maraton).\n" +
                        "\n" +
                        "Catatan bahwa hal umum untuk menggunakan In spite of dan Despite jika menunjukkan sebuah fakta.\n" +
                        "\n" +
                        "1.\t In spite of the fact that he worked very hard, he didn't pass the exam.\n" +
                        " (Meskipun faktanya dia bekerja keras, , dia tidak lulus dari ujian).\n" +
                        "\n" +
                        "Although / Even though\n" +
                        "Sesudah Although dan Even though, kita harus menggunakan Subject dan Verb. Even though agak kuat dan lebih memiliki empati ketimbang Although.\n" +
                        "\n" +
                        "Example : \n" +
                        "1.\tI enjoyed the course, although I would have liked more grammar practice.\n" +
                        "(saya menikmati pelajaran tersebut, walaupun saya agak lebih menyukai praktek grammar.)\n" +
                        "\n" +
                        "2.\tAlthough we saw each other every day, we didn't really know each other.\n" +
                        "(Meskipun kami melihat satu dengan yang lain setiap hari, kami tidak terlalu tahu satu dengan yang lain).\n"),
                GamaselaMaterialModel("Cara Menggunakan Kata Wish dan If Only", "\uF076\tPenjelasan\n" +
                        "\n" +
                        "Kita menggunakan wish and if only untuk kalimat pengharapan dalam betuk present or the past tense. If only biasanya lebih kuat dari pada wish.\n" +
                        "\n" +
                        "\tDalam bentuk Present Tense\n" +
                        "\t\n" +
                        "\tKita dapat menggunakan wish/if only + kata kerja bentuk past untuk membicarakan situasi terkini yang kita inginkan berbeda dari kenyataan yang sebenarnya\n" +
                        "\n" +
                        "\tExample :\n" +
                        "1. I wish you didn't live so far away.\n" +
                        "   (aku berharap kamu tidak akan bertempat tinggal terlalu jauh)\n" +
                        "\n" +
                        "2. If only we knew what to do.\n" +
                        "   (Seandainya kita tahu apa yang kita lakukan)\n" +
                        "\n" +
                        "3. Farhan wishes he could afford a holiday.\n" +
                        "   (Farhan berharap dia bisa mendapat libur)\n" +
                        "\n" +
                        "Dalam bentuk past tense\n" +
                        "\n" +
                        "\tKita dapat menggunakan wish/if only + bentuk past perfect tense untuk membicarakan sesuatu yang kita ingin ubah dimasa lampau\n" +
                        "\n" +
                        "\tExample :\n" +
                        "1. They wish they hadn't eaten so much chocolate. They're feeling very sick now.\n" +
                        "   (Mereka berharap tidak telah memakan cokelat terlalu banyak. Mereka merasa sakit sekarang).\n" +
                        "\n" +
                        "2. If only I had studied harder when I was at school.\n" +
                        "   (Seandainya aku telah belajar giat ketika aku duduk di bangku sekolah)\n" +
                        "\n" +
                        "3. Ivan wish he had trained consistent. Ivan is not success as a top football player\n" +
                        "   (Ivan berharap dia telah berlatih konsisten. Ivan tidak berhasil menjadi pemain sepak bola hebat) \n"),
                GamaselaMaterialModel("Conditional Sentences", "Dalam bahasa Indonesia, *conditional sentence* bisa disebut juga sebagai kalimat pengandaian.\n\n Sesuai dengan namanya, kalimat ini digunakan untuk mengungkapkan suatu keinginan, harapan, dan pengandaian atau rencana yang mungkin dapat atau tidak dapat terwujud.\n\n Namun, *conditional sentence* ternyata memiliki beberapa tipe yang kondisinya ternyata berbeda-beda. \n\n Nah pada artikel kali ini, mari kita belajar lebih dalam tentang *conditional sentence* tipe 0,1,2,dan 3.\n\n" +
                        "Secara sederhana, *conditional sentence* merupakan kalimat majemuk yang berisikan kondisi mengenai sebuah pengandaian, imajinasi, atau suatu kejadian yang belum terjadi. \n\n Dalam kalimat bahasa Inggris, kalimat pengandaian ini diawali dengan **‘if’** sebagai penanda bahwa kondisinya memang belum terjadi. Bentuk *conditional sentence* adalah *“If-clause + main clause”.* \n\n Jika kamu perhatikan, *if-clause* merupakan bagian dari kalimat pengandaiannya. Sedangkan *main clause*, biasanya berisi konsekuensi atau akibat dari kondisi pengandaian sebelumnya. \n\n *Conditional sentence* dibagi menjadi beberapa tipe. Di antaranya adalah:\n\n" +
                        "**Conditional Sentence Type 0**\n\n" +
                        "Tipe ini biasanya disebut sebagai *zero conditional sentences.* \n\n Tipe kalimat ini digunakan ketika hasil atau konsekuensi dari kondisi terwujud alias memaparkan sebuah kebeneran *(general truth)* dan fakta ilmiah. \n\n Kalimat ini biasanya berbentuk present tense dengan rumus: *if + simple present, simple present.* \n\n Contoh kalimatnya adalah:\n\n" +
                        "•\t*If it rain, the grass gets wet.*\n\n" +
                        "•\t*I feel sick if I eat too much.*\n\n" +
                        "•\t*If you don’t brush your teeth, you get cavities.*\n\n" +
                        "•\t*The grass wet if it rains.*\n\n" +
                        "**Conditional sentence type 1**\n\n" +
                        "*First conditional sentence* merupakan bentuk kalimat pengandaian yang digunakan ketika hasil atau konsekuensi memiliki kemungkinan untuk terjadi di masa depan. \n\n Hal ini bisa terjadi karena masih ada kondisi realistik yang masuk akal untuk kemungkinan terjadi. \n\n Maka dari itu, bentuk kalimat dari *conditional sentence* tipe pertama ini memiliki bentuk kalimat *simple future* alias kalimat yang akan datang. \n\n Rumus dari kalimat ini adalah: *if + simple present, simple future “will” / imperative.* \n\n contohnya adalah:\n\n" +
                        "•\t*If I meet him, I will introduce myself.*\n\n" +
                        "•\t*If you rest, you will feel better.*\n\n" +
                        "•\t*I will cook dinner tonight if you clean the house.*\n\n" +
                        "**Conditional sentence type 2**\n\n" +
                        "*Second conditional sentences* merupakan tipe kalimat pengandaian yang digunakan ketika *result* atau konsekuensi memiliki sedikit harapan terwujud walaupun kecil kemungkinannya. \n\n Jadi bisa dikatakan kalau kalimat pengandaian tipe kedua ini belum tentu terjadi namun juga bisa menjadi kenyataan. \n\n Dalam bentuk kalimat ini, rumus yang digunakan adalah *if + simple past/were, would/could/might + bare infinitive.* \n\n Penggunaan would/could/might berfungsi untuk menjelaskan seberapa besar sebuah kondisi itu akan terjadi. \n\n Contoh dari *Conditional sentence type 2* adalah:\n\n" +
                        "**Conditional Sentence Type 3**\n\n" +
                        "*Third conditional sentence* merupakan sebuah kalimat pengandaian ketika sebuah kondisi tidak mungkin terwujud sama sekali. \n\n Hal ini bisa digambarkan karena kondisi yang sangat mustahil atau hanya sebuah mimpi atau imajinasi. \n\n Dalam tipe kalimat pengandaian yang ketiga ini, bentuk kalimat menggunakan *past perfect* yang dilengkapi dengan **modal auxiliary** seperti *would, could, dan should.* Rumus yang digunakan adalah *if + past perfect, would/should/could/might + have + past participle.* \n\n Contoh kalimat:\n\n" +
                        "•\t*If  had locked the car, the thief wouldn’t have stolen my car.*\n\n" +
                        "•\t*If she hadn’t taken the course, she wouldn’t have gotten the scholarship.*\n\n" +
                        "•\t*If you had remembered to invite me, I would have attended your party.*\n\n" +
                        "Nah, itu dia penjelasan mengenai conditional sentence atau alimat pengandaian yang bisa digunakan dalam percakapan sehari-hari. \n\n Semoga bermanfaat!\n"),
                GamaselaMaterialModel("Future Continous dan Future Perfect", "Hai gaes pada materi kali ini kita akan mempelajari tentang future tenses.\n\n Seperti namanya tenses ini membicarakan tentang masa depan, tetapi bukan itu saja.\n\n Ada beberapa future tenses dalam Bahasa Inggris, namun pada kesempatan kali ini kita ingin membahas tentang *Future Continous* dan *Future Perfect.*\n\n" +
                        "**Future Continous**\n\n" +
                        "*Future continuous tense* adalah tenses yang digunakan untuk menyatakan suatu kegiatan atau peristiwa yang akan sedang terjadi di masa yang akan datang.\n\n Kalau simple future hanya mengabarkan bahwa sebuah peristiwa akan terjadi, future continuous menyatakan bahwa peristiwa itu akan sedang berlangsung.\n\n Selain itu Future continuous juga menyatakan tindakan baru , berbeda atau sementara di masa depan.\n\n" +
                        "**Rumus *Future Continuous tense***:\n\n" +
                        "•Positif : S + will be + V ing\n\n" +
                        "•Negatif : S + will + not + be + V ing\n\n" +
                        "•\tTanya : Will + S + be + V ing\n\n" +
                        "**Contoh kalimat *Future Continous**:\n\n" +
                        "•\tI will be eating out with her this afternoon. (Aku akan makan diluar bersama dia nanti sore)\n\n" +
                        "•\tTry to call before 8 o'clock. After that, we'll be watching the match (Cobalah untuk menelpon sebelum jam 8 malam. Setelah itu, kami sedang menonton pertandingan)\n\n" +
                        "•\tToday we're taking the bus but next week we'll be taking the train. (Hari ini kita naik bus, tapi minggu depan kita naik kereta\n\n\n" +
                        "**Future Perfect**\n\n" +
                        "Future perfect tense ini biasa dipakai untuk menjelaskan kegiatan atau peristiwa yang telah terjadi atau akan selesai dilakukan di masa yang akan datang.\n\n" +
                        "**Rumus *future perfect tense***:\n" +
                        "•Positif : S + will + have + V3\n\n" +
                        "•Negatif : S + will + not + have + V3\n\n" +
                        "•Tanya : will + S + have + V3\n\n" +
                        "**Contoh kalimat *future perfect tense***:\n\n" +
                        "\n•\tThe guests are coming at 8 p.m. I'll have finished cooking by then. (Para tamu datang jam 8 malam. Aku sudah selesai memasak saat itu)\n\n" +
                        "\n•\tI will have finished my study this year (Saya akan menyelesaikan studi saya tahun ini)\n\n" +
                        "\n•\tWill you have gone to bed when I get back? (Apakah kamu akan pergi tidur ketika saya kembali?)"),
                GamaselaMaterialModel("Future Plan dalam Bahasa Inggris", "Ketika kita berbicara dan bertanya tentang rencana atau future plan dalam bahasa Inggris, kita bisa menggunakan “will” dan “be going to” dan present contionus. Tidak hanya itu, kita juga bisa menggunakan bentuk present continuous tense. Untuk materi kali ini, kita akan belajar cara menggunakan will dan be going to untuk membicarakan rencana  masa depan, atau future plan.\n\n" +
                        "Kita menggunakan bentuk kata kerja yang berbeda untuk membicarakan rencana kami di masa depan dalam bahasa Inggris. Hal ini tergantung pada jenis rencana itu: rencana spontan, rencana yang telah ditentukan sebelumnya, atau pengaturan rencana.\n\n" +
                        "**Will**\n\n" +
                        "Kita dapat menggunakan “will” untuk berbicara tentang rencana spontan yang diputuskan pada saat berbicara.\n" +
                        "•\tI can't decide what to wear tonight. I know! I'll wear my black shirt.\n" +
                        "•\tThere's no food. I'll buy some when I go to the shops.\n\n" +
                        "**Be going to**\n\n" +
                        "Kita dapat menggunakan “be going to” untuk berbicara tentang rencana yang diputuskan sebelum saat berbicara.\n" +
                        "•\tI'm going to wear my black shirt tonight. \n" +
                        "•\tI'm going to go to the supermarket after work. What do we need? \n\n" +
                        "**Present Continous**\n\n" +
                        "Kita dapat menggunakan Present Continous ketika rencana telah diatur atau sudah dikonfirmasi dengan setidaknya satu orang lain dan kita mengetahui rencana waktu dan tempat.\n" +
                        "•\tI'm meeting Jane at 8 o'clock on Saturday. \n" +
                        "•\tWe're having a party next Saturday. Would you like to come? \n" +
                        "Kita juga dapat menggunakan Present Continous untuk menanyakan tentang rencana masa depan orang lain \n" +
                        "•\t*Are you doing anything interesting this weekend?*\n"),
                GamaselaMaterialModel("Modals", "Modals merupakan bentuk kata yang membantu kata kerja. Untuk menggunakan modal, kalian harus diikuti oleh verb (kata kerja). Maka dari itu, modal sering juga disebut dengan kata kerja ganti.\n\nModals dalam bahasa inggris kerap kali digunakan dalam beberapa kesempatan. Terdapat sejumlah modals yang perlu diketahui karena setiap modal digunakan untuk menyatakan hal yang berbeda.\n\nApa saja jenis modal yang ada? Bagaimana penggunaannya dalam kalimat? Mari kita simak penjelasannya di bawah ini\n\n" +
                        "Pada dasarnya, modal terbagi menjadi dua jenis yaitu present dan past modals. Dibawah ini merupakan pemaparan dari kedua jenis modal:"+
                        "<table border=1><tr><th>Present</th><th>Past</th></tr><tr><td>Can (Bisa) </td><td>Could</td></tr><tr><td>Will(Akan)</td><td>Would</td></tr><tr><td>Shall (Akan)</td><td>Should</td></tr> <tr><td>May (Boleh / Mungkin)</td><td>Might</td></tr> <tr><td>Must (Harus / Pasti)</td><td>Had to</td></tr></table>\n\n"+
                        "**Rumus Menggunakan Modals**\n\n" +
                        "•\tKata Positive\n\n" +
                        "Subject + Modal + Verb 1\n\n" +
                        "•\tKata Negative\n\n" +
                        "Subject + Modal + Not + Verb 1\n\n" +
                        "•\tKata Tanya\n\n" +
                        "Modal + Subject + Verb 1 + ?\n\n" +
                        "**Cara Menggunakan Modals dan Contoh**\n\n" +
                        "Setiap modals memiliki fungsi sendiri saat digunakan, contohnya seperti dibawah ini:\n\n" +
                        "\t1.*Can / Could*\n\n" +
                        "•\tMengakui Kemampuan\n\n" +
                        "*She can sing very well* (Dia bisa menyanyi dengan merdu.)\n\n" +
                        "*He could bake.* (Dia bisa memanggang kue.)\n\n" +
                        "•\tMengatakan Tentang Kemungkinan\n\n" +
                        " *I can come to see you after work.* (Aku bisa datang menemuimu setelah aku pulang kerja.)\n\n" +
                        "*I could not visit my parents this week.* (Aku gak bisa datang menjenguk orangtuaku minggu ini.)\n\n" +
                        "•\tMemberikan Izin\n\n" +
                        " *You can use my computer.* (Kamu boleh menggunakan komputer aku.)\n\n" +
                        "*He can borrow my textbook.* (Dia boleh meminjam bukuku.)\n\n" +
                        "•\tMeminta Izin dengan Sopan\n\n" +
                        "*Could you please lend me your laptop?* (Bolehkah aku meminjam laptop kamu?)\n\n" +
                        "*Can you drive me to the nearest mall please?* (Bisakah kamu mengantarku ke mall terdekat?)\n\n" +
                        "\t2. *May/Might*\n\n" +
                        "•\tMengatakan Kemungkinan \n\n" +
                        "*She did not come to the party, it might be because she doesn’t want to come.* (Dia tidak datang ke pesta ini, mungkin itu karena dia gak mau datang.)\n\n" +
                        "*He may be in trouble because of what happened yesterday.* (Dia mungkin lagi dalam masalah karena apa yang terjadi kemarin.)\n\n" +
                        "•\tMemberikan Izin\n\n" +
                        " *May I ask you some questions first?* (Bolehkah aku menanyakan beberapa pertanyaan dahulu?)\n\n" +
                        " *You may meet her now.* (Kamu boleh bertemu dengannya sekarang.)\n\n" +
                        "\t3. *Must / Had To*\n\n" +
                        "•\tMenyatakan Keharusan\n\n" +
                        "*You must keep this as a secret.* (Kamu harus jaga ini sebagai rahasia.)\n\n" +
                        "*I had to pay all of these bills.* (Aku harus membayar semua tagihan ini.)\n\n" +
                        " \n" +
                        "•\tMenyatakan Kepastian\n\n" +
                        " After running around the whole town you must be so tired now. 7(Setelah berlari keliling kota ini, kamu pasti lelah sekali sekarang.)\n" +
                        "\t4. *Shall*\n\n" +
                        "•\tMenyatakan Rencana\n\n" +
                        " *I shall go to bed at 8.* (Aku akan tidur jam 8.)\n\n" +
                        "*We shall not meet each other again.* (Kita tidak akan bertemu lagi.)\n\n" +
                        "•\tMemberikan Saran \n\n" +
                        "*Shall we go to Bali next week?* (Bagaimana kalau kita pergi ke Bali minggu depan?)\n\n" +
                        "*You shall do the assignment tonight.* (Kamu bisa mengerjakan tugas itu nanti malam.)\n\n" +
                        "\t5. *Will*\n\n" +
                        "•\tMenanyakan Rencana\n\n" +
                        "*I will tell you about it later on.* (Nanti aku ceritakan.)\n\n" +
                        "*She will go to the theater.* (Dia bakal pergi ke bioskop.)\n\n" +
                        "•\tMerelakan sesuatu\n\n" +
                        "*I will help you.* (Aku akan membantumu.)\n\n" +
                        "*I will let you go.* (Aku akan merelakanmu pergi.)\n\n" +
                        "•\tMengatakan Perkiraan (Prediksi)\n\n" +
                        "*She said that she will get me new shoes if she got some extra money.* (Dia bilang dia akan membelikanku sepatu baru kalau dia mendapatkan uang lebih.)\n\n" +
                        "*I will not come if the sun is too much.* (Aku tidak akan datang kalo mataharinya panas banget.)\n" +
                        "\n" +
                        "\t6. *Would*\n\n" +
                        "•\tMenyatakan Suatu Rencana di Masa Lalu.\n\n" +
                        " *I would go to your home last week but you were not home.* (Aku mau datang kerumahmu minggu lalu tapi kamu sedang tidak dirumah.)\n\n" +
                        "*She would do that if she had money back then.* (Dia mau melakukan itu kalau dia punya uang waktu itu.)\n\n" +
                        "•\tMeminta dengan Sopan\n\n" +
                        "*Would you please lend me your credit card?* (Maukah kamu meminjamkan aku kartu kreditmu?)\n\n" +
                        "*Would you please let me do it by myself?* (Bisakah kamu membiarkanku mengerjakan ini sendirian?)\n\n" +
                        "\t7. *Should*\n\n" +
                        "•\tMengungkapkan Saran\n\n" +
                        "*She should eat regularly so that she won’t get sick (Baiknya, dia makan dengan teratur agar dia sehat.)\n\n"),
                GamaselaMaterialModel("Modifying Comparisons dalam Bahasa Inggris", "Apakah kalian tahu bagaimana menggunakan frasa seperti much shorter than, almost as fit as dan exactly the same as. Terdapat beberapa cara yang bisa digunakan untuk membandingkan sesuatu untuk menunjukan perbedaan besar atau kecil dalam Bahasa Inggris.\n\n" +
                        "**Perbandingan**\n\n" +
                        "•\tKita dapat menggunakan kata sifat komparatif (comparative adjectives) untuk membandingkan sesuatu.\n\n" +
                        "Contoh:\n\n" +
                        "*Jim is taller than Harry.*\n\n" +
                        "*You're more clever than I am.*\n\n" +
                        "*His second book is more interesting than his first book.*\n\n" +
                        "•\tKita dapat menggunakan as, “as” dengan kata sifat untuk mengatakan dua hal sama atau berbeda dan “as” untuk mengatakan satu hal lebih kurang dari yang lain\n" +
                        "Contoh:\n\n" +
                        "*Her hair is as long as yours*\n\n" +
                        "*It's not as sunny as yesterday.*\n\n" +
                        "\n" +
                        "Kita juga dapat menggunakan ekspresi yang berbeda seperti *different from, similar to dan the same as.*\n\n" +
                        "\n" +
                        "*England is different from the United Kingdom.*\n\n" +
                        "*His motorcycle is similar to mine.*\n\n" +
                        "*The results from the first test are the same as the results from the second.*\n\n" +
                        "\n" +
                        "Untuk Menunjukan perbedaan yang besar\n\n" +
                        "•\tKita dapat menggunakan kata much, *so much, a lot, even* atau *far* dengan kata sifat komparatif.\n\n" +
                        "Contoh:\n\n" +
                        "*Sales in July were a lot higher than sales in June.*\n\n" +
                        "*He was far less experienced than the other applicant.*\n\n" +
                        "•\tKita dapat menggunakan *nowhere near* dengan  *as … as.*\n\n" +
                        "Contoh:\n\n" +
                        "*The interview was nowhere near as difficult as the written exam.*\n\n" +
                        "•\tKita dapat menggunakan *very, really, completely or totally with different from.*\n\n" +
                        "Contoh:\n\n" +
                        "*They may be twins, but they're completely different from each other.*\n\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Untuk Menunjukan perbedaan yang kecil\n\n" +
                        "•\tKita dapat menggunakan kata *slightly, a little, a bit, a little bit* atau *not much* dengan kata sifat komparatif\n\n" +
                        "Contoh:\n\n" +
                        " *The number of registrations has been slightly lower than we expected.*\n\n" +
                        "*Houses in my city are not much more expensive than flats.*\n\n" +
                        "\n" +
                        "•\tKita dapat menggunakan kata *almost, nearly, not quite, roughly, more* atau *less* atau *about with as … as* dan *the same as.*\n\n" +
                        "Contoh:\n\n" +
                        " *She's almost as old as I am.*\n\n" +
                        "*The figures for May are more or less the same as the figures for June.*\n\n" +
                        "\n" +
                        "•\tKita dapat menggunakan kata *very* atau *really with similar to.*\n\n" +
                        "Contoh:\n\n" +
                        "*My son looks really similar to my father when he was that age.*\n\n" +
                        "Untuk menunjukan tidak ada perbedaan\n\n" +
                        "•\tKita dapat menggunakan kata *exactly, the same as atau just as … as* untuk menunjukan tidak ada perbedaan\n\n" +
                        "Contoh:\n\n" +
                        "*My grandma's cakes still taste exactly the same as when I was a child!*\n\n" +
                        " *A new phone can be just as expensive as a new computer these days*\n\n"),
                GamaselaMaterialModel("Participle Clauses ", "*Participle clauses* (klausa partisipatif) memungkinkan kita untuk menyampaikan informasi dengan cara yang lebih ekonomis. \n\n Mereka dibentuk menggunakan *present particples (going, reading, seeing, walking, etc), past participles (gone, read, seen, walked, etc.)* atau *perfect participles.*\n\n" +
                        "*Participle clauses* tidak memilik *tenses* yang spesifik. \n\n *Tenses* tersebut terindikasi pada kata kerja *(verb)* pada klausa utama. \n\n *Participle clauses* biasanya digunakan pada teks tertulis, khususnya pada literatur, gaya akademik atau jurnalistik.\n\n" +
                        "\t1. Present participle clauses\n\n" +
                        "Berikut beberapa cara umum untuk menggunakan *present participle clauses*. Perhatikan bahwa *present participle* memiliki arti yang mirip dengan kata kerja aktif.\n\n" +
                        "•\tUntuk memberikan hasil dari suatu aksi.\n\n" +
                        "Contoh: *The bomb exploded, destroying the building.*\n\n" +
                        "•\tUntuk memberikan alasan untuk sebuah aksi\n\n" +
                        "*Knowing she loved reading, Richard bought her a book.*\n\n" +
                        "•\tUntuk membicarakan tentang aksi yang terjadi pada saat yang sama dengan aksi lain.\n\n" +
                        "*Standing in the queue, I realised I didn't have any money.*\n\n" +
                        "•\tUntuk menambahkan informasi tentang subyek klausa utama\n\n" +
                        "*Starting in the new year, the new policy bans cars in the city centre.*\n\n" +
                        "\t2. Past participle clauses\n\n" +
                        "Berikut beberapa cara umum untuk menggunakan *Past participle clauses*. Perhatikan bahwa *Past participle* memiliki arti yang mirip dengan kata kerja pasif.\n\n" +
                        "•\tUntuk memberikan alasan terhadpa sebuah aksi\n\n" +
                        "*Worried by the news, she called the hospital.*\n\n" +
                        "•\tUntuk menambahkan informasi terhadap subyek klausa utama\n\n" +
                        "*Filled with pride, he walked towards the stage.*\n\n" +
                        "\t3. Perfect participle clauses\n\n" +
                        "*Perfect participle clauses* menunjukan bahwa aksi yang dideskripsikan telah selesai sebelum aksi pada klausa utama. *Perfect participles* dapat disusun untuk membuat makna aktif atau pasif.\n" +
                        "•\t*Having got dressed, he slowly went downstairs.*\n\n" +
                        "•\t*Having finished their training, they will be fully qualified doctors.*\n\n" +
                        "•\t*Having been made redundant, she started looking for a new job.*\n\n" +
                        "\n" +
                        "\t4. Participle clauses setelah konjungsi dan preposisi\n\n" +
                        "Hal ini umum untuk *participle clauses*, terutama dengan *-ing*, untuk mengikuti konjungsi dan preposisi seperti *before, after, instead of, on, since, when, while and in spite of.*\n\n" +
                        "•\t*Before cooking, you should wash your hands.*\n\n" +
                        "•\t*Instead of complaining about it, they should try doing something positive.*\n\n" +
                        "•\t*On arriving at the hotel, he went to get changed.*\n\n" +
                        "•\t*While packing her things, she thought about the last two years.*\n\n" +
                        "•\t*In spite of having read the instructions twice, I still couldn’t understand how to use it.\n\n"),
                GamaselaMaterialModel("*Passive Voice* (Kalimat Pasif) dalam Bahasa Inggris", "Pada pembelajaran Bahasa Inggris, ada yang disebut dengan *passive voice* atau kalimat pasif. \n\n Pada kalimat pasif, biasanya kalimat ini dibuat dengan kata kerja, dimana *subject* tidak menunjukkan sebuah kegiatan atau aksi. \n\n Subject pada kalimat pasif berperan sebagai recipient atau penerima aksi.\n\n" +
                        "Hal yang harus dipahami didalam mempelajari *Passive Voice* adalah kata kerja *(Verb)* karena semua kalimat Aktif yang dapat diubah ke dalam Passive Voice adalah kalimat yang menggunakan kata kerja *(Verb)* dan kata kerja tersebut adalah kata kerja bentuk ke-3 (Verb 3).\n\n" +
                        "•\t**Rumus Passive Voice:**\t\n" +
                        "Subject + to be (am/is/are) + Past Participle\n" +
                        "\n" +
                        "•\tBentuk to be:\n" +
                        "1. is/am/are + V3      --- di...( kebiasaan)\n" +
                        "2. was/were + V3      --- di... ( lampau)\n" +
                        "3. been + V3             --- telah di...\n" +
                        "4. being + V3           --- sedang di....\n" +
                        "5. to be + V3            --- untuk di....\n" +
                        "\n")

        )))

        // Reading
        topicModels.add(GamaselaTopicModel("Reading", arrayListOf(
                GamaselaMaterialModel("A Conference Programme", "A.\t**Preparation**\n\n" +
                        "\n![](https://learnenglish.britishcouncil.org/sites/podcasts/files/styles/article/public/RS7864_ThinkstockPhotos-845387230-hig.jpg?itok=POvps-rt)\n\n" +
                        "\ti. To Consider\n" +
                        ":\tTo think carefully about something.\n\n" +
                        "\tii. To Adapt\n" +
                        ":\tTo change your behavior for new conditions.\n\n" +
                        "\tiii. To Explore\n" +
                        ":\tTo look into or discuss something in detail.\n\n" +
                        "\tiv. An Employee\n" +
                        ":\tA worker.\n\n" +
                        "\tv. The Positives\n" +
                        ":\tThe good things about something.\n\n" +
                        "\tvi. Uncertain\n" +
                        ":\tUnsure, unclear, unknown.\n\n" +
                        "\t vii. To Ensure\n" +
                        ":\tTo make sure something happens.\n\n" +
                        "\tviii. Development\n" +
                        ":\tChange, growth or progress.\n\n"),
                GamaselaMaterialModel("A Flyer For A Gym", "A.\t**Preparation**\n\n" +
                        "\ti. A Gym\n" +
                        "•\tA building or club where people go to do physical exercise.\n\n" +
                        "\tii. Fitness\n" +
                        "•\tThe state of being healthy and strong.\n\n" +
                        "\tiii. A Training Plan\n" +
                        "•\tA document that gives details about how and when you will do physical exercise.\n\n" +
                        "\tiv. A Fee\n" +
                        "•\tMoney you pay so that you can do something such as join an organization.\n\n" +
                        "\tv. An Instructor\n" +
                        "•\tA person who teaches a skill or a sport.\n\n" +
                        "\n" +
                        "B.\t**Reading**\n\n BEST BODY FITNESS\n\n" +
                        "\n![](https://learnenglish.britishcouncil.org/sites/podcasts/files/RS7190_ThinkstockPhotos-77736542-hig2.jpg)\n\n" +
                        "**About us**\n\n" +
                        "*You don't want just a gym membership. You want a membership that means something. And that means you need support, expert help and a community.*\n\n" +
                        "*Best Body Fitness isn't just a gym: it's a full-service fitness membership made for you.*\n\n" +
                        "**Here's how it works:**\n\n" +
                        "\n" +
                        "STEP ONE: Your assessment\n\n" +
                        "*We begin with an assessment session. This is a chance for you to see what we do at Best Body. Our assessment plans are no-cost and no-risk. We'll also make a training plan specifically for you.*\n\n" +
                        "STEP TWO: Your training\n\n" +
                        "*When you decide to become a Best Body member, we show you what to do, how to do it and why you are doing it. After a few sessions with an expert private trainer you will feel comfortable working out on your own. But don't worry, we'll always be nearby if you have questions.*\n\n" +
                        "\n" +
                        "STEP THREE: Your membership\n\n" +
                        "*Membership works on a month-to-month basis. There are no sign-up fees and no cancellation fees. Start and stop whenever you want. And the best part? Our fees are the most competitive in the whole downtown area.*\n" +
                        "\n" +
                        "STEP FOUR: Your community\n\n" +
                        "*At Best Body Fitness, we see everyone as part of a big team. And when you work with a team, you can do great things. Join any of our specialised classes, led by expert instructors. Come to our nutrition classes. Participate in our regular social events. Everything is included in your fee.*\n\n" +
                        "*Finally, we wanted to share with you some reasons why our members say that they have chosen us over any other fitness centre in the city.*\n\n" +
                        "\n" +
                        "It's so EASY\n\n" +
                        "•\t*Easy to start, stop, cancel or refund a membership*\n\n" +
                        "•\t*Easy to access – we're open 24/7, we never close*\n\n" +
                        "•\t*Easy to do exercise – we have lots of equipment, no long wait*\n\n" +
                        "•\t*Easy results – our trainers and equipment give you success, fast*\n\n" +
                        "•\t*Easy to find – in the centre of town, near public transport and with parking*\n\n" +
                        "\n" +
                        "It's WONDERFUL\n\n" +
                        "•\t*Wonderful members*\n\n" +
                        "•\t*Wonderful trainers and staff*\n\n" +
                        "•\t*Wonderful equipment*\n\n" +
                        "•\t*Wonderful energy*\n\n" +
                        "•\t*Wonderful location*\n\n" +
                        "\n" +
                        "*Come and visit us for a personal tour!*\n"),
                GamaselaMaterialModel("Sebuah Undangan untuk Wawancara Kerja", "\"\\n![](https://learnenglish.britishcouncil.org/sites/podcasts/files/styles/article/public/RS4829_GettyImages_451846939-hig.jpg?itok=VVIk1t9S)\\n\\n\" +" +
                        "**To: Grace Yang**\n\n" +
                        "*Date: 6 September*\n\n" +
                        "*Subject: Invitation to job interview*\n\n" +
                        "*Dear Grace,*\n\n" +
                        "*Thank you for your application for the position of sales manager.*\n\n" +
                        "*We would like to invite you for an interview at 10 a.m. on Monday 21 September at our offices at The Shard, 32 London Bridge Street, London.*\n\n" +
                        "*You will meet with our head of sales, Susan Park, and the interview will last for about 45 minutes. During this time, you will have the opportunity to find out more about the position and learn more about our company.*\n\n" +
                        "*Please bring your CV and references to the interview. You will also need to show a form of ID at reception to receive a visitor's pass. Please ask for me as soon as you arrive.*\n\n" +
                        "*If you have any questions or if you wish to reschedule, please call me on 555-1234 or email me by 12 September.*\n\n" +
                        "*I look forward to meeting you.\n\n" +
                        "*Best regards,*\n\n" +
                        "*Anna Green*\n\n" +
                        "*Human Resources Assistant*\n\n"),
                GamaselaMaterialModel("Memberikan Ulasan pada Buku \"The Martian\"", "**a.\tPreparation**\n\n" +
                        "\ti. Social Media\n" +
                        "•\tWebsites and apps like Facebook, Twitter, and Instagram.\n\n" +
                        "\tii. Ironically\n" +
                        "•\tIn a funny or strange way because it’s unexpected.\n\n" +
                        "\tiii. Unlike\n" +
                        "•\tDifferent from.\n\n" +
                        "\tiv. To Miss Out On\n" +
                        "•\tTo not get the benefits of.\n\n" +
                        "\tv. Addiction\n" +
                        "•\tNeeding something too much or in unhealthy way.\n\n" +
                        "\tvi. Early Adopters\n" +
                        "•\tPeople who are the first to buy or use new technology.\n\n" +
                        "\tvii. Constantly\n" +
                        "•\tAll the time without a break.\n\n" +
                        "\tviii. To Be Cut Off From\n" +
                        "•\tTo have no access to.\n\n" +
                        "\n" +
                        "**b.\tReading\n**" +
                        "\n" +
                        "\n![](https://learnenglish.britishcouncil.org/sites/podcasts/files/styles/article/public/RS7372_ThinkstockPhotos-534325168-hig_0.jpg?itok=jas_QF4z)\n\n" +
                        "*Today's grandparents are joining their grandchildren on social media, but the different generations' online habits couldn't be more different. The over-55s are joining Facebook in increasing numbers, meaning that they will soon be the site's second biggest user group, with 3.5 million users aged 55–64 and 2.9 million over-65s.*\n\n" +
                        "*Sheila, aged 59, says, 'I joined to see what my grandchildren are doing, as my daughter posts videos and photos of them. It's a much better way to see what they're doing than waiting for letters and photos in the post. That's how we did it when I was a child, but I think I'm lucky I get to see so much more of their lives than my grandparents did.'*\n\n" +
                        "*Ironically, Sheila's grandchildren are less likely to use Facebook themselves. Children under 17 are leaving the site – only 2.2 million users are under 17 – but they're not going far from their smartphones. Chloe, aged 15, even sleeps with her phone. 'It's my alarm clock so I have to,' she says. 'I look at it before I go to sleep and as soon as I wake up.'*\n\n" +
                        "*Unlike her grandmother's generation, Chloe's age group is spending so much time on their phones at home that they are missing out on spending time with their friends in real life. Sheila, on the other hand, has made contact with old friends from school she hasn't heard from in forty years. 'We use Facebook to arrange to meet all over the country,' she says. 'It's changed my social life completely.'*\n\n" +
                        "*Teenagers might have their parents to thank for their smartphone and social media addiction as their parents were the early adopters of the smartphone. Peter, 38 and father of two teenagers, reports that he used to be on his phone or laptop constantly. 'I was always connected and I felt like I was always working,' he says. 'How could I tell my kids to get off their phones if I was always in front of a screen myself?' So, in the evenings and at weekends, he takes his SIM card out of his smartphone and puts it into an old-style mobile phone that can only make calls and send text messages. 'I'm not completely cut off from the world in case of emergencies, but the important thing is I'm setting a better example to my kids and spending more quality time with them.'*\n\n" +
                        "*Is it only a matter of time until the generation above and below Peter catches up with the new trend for a less digital life?\n" +
                        "\n"),
                GamaselaMaterialModel("Menulis Surat untuk Teman Baru", "\n![](https://learnenglish.britishcouncil.org/sites/podcasts/files/styles/article/public/RS7845_ThinkstockPhotos-920597582-hig.jpg?itok=GPOIrrcO)\n\n" +
                        "*Hi azalea*\n\n" +
                        "*How are you? It was so nice to meet you last week in Solo at the sales meeting. How was the rest of your trip? Did you see any koala? I hope you got home to Malang OK.*\n\n" +
                        "*Anyway, I have the documents about the new Klaten offices. We're going to be open in three months. I moved here from Jakarta just last week. They are very nice offices, and the location is perfect. There are lots of restaurants, cafés and banks in the area. There's also public transport; we are next to an U2 (that is the name for the metro here). Maybe you can come and see them one day? I would love to show you here, especially in the hot season.*\n\n" +
                        "*Here's a photo of you and me at the restaurant in Solo. That was a very fun night! Remember the singing Englishman? Crazy! Please send me any other photos you have of that night. Good memories.*\n\n" +
                        "*Please give me your email address and I will send you the documents.*\n\n" +
                        "*Bye for now*\n\n" +
                        "*Angga*\n\n"),
                GamaselaMaterialModel("Surat dari Seorang Teman", "\n![](https://learnenglish.britishcouncil.org/sites/podcasts/files/styles/article/public/RS7846_ThinkstockPhotos-580115322-hig.jpg?itok=LTnlIvkV)\n\n" +
                        "*Hi Samia,*\n\n" +
                        "*Just a quick email to say that sounds like a great idea. Saturday is better for me because I'm meeting my parents on Sunday. So if that's still good for you, why don't you come here? Then you can see the new flat and all the work we've done on the kitchen since we moved in. We can eat at home and then go for a walk in the afternoon. It's going to be so good to catch up finally. I want to hear all about your new job!*\n\n" +
                        "*Our address is 52 Charles Road, but it's a bit difficult to find because the house numbers are really strange here. If you turn left at the post office and keep going past the big white house on Charles Road, there's a small side street behind it with the houses 50–56 in. Don't ask me why the side street doesn't have a different name! But call me if you get lost and I'll come and get you.*\n\n" +
                        "*Let me know if there's anything you do/don't like to eat. Really looking forward to seeing you!*\n\n" +
                        "*See you soon!*\n\n" +
                        "*Gregor*\n"),
                GamaselaMaterialModel("Buku Panduan Wisata", "\n![](https://learnenglish.britishcouncil.org/sites/podcasts/files/styles/article/public/RS7898_ThinkstockPhotos-847176158-hig.jpg?itok=1cGPX5-o)\n\n" +
                        "Whether you're travelling to the islands or the mountains of Thailand, you're likely to spend at least one night in its capital city on the way. Bangkok might be noisy and polluted but it's also an exciting city with plenty of things to see and do. Why not make it a longer stay?\n" +
                        "*Where to stay*\n\n" +
                        "*The Khao San Road was a famous traveller spot even before Leonardo di Caprio's character in the film The Beach stayed there. But it's noisy, not very pretty and not very Thai. For something more authentic, Phra Kanong offers an alternative place to stay, with its fantastic street markets where everyday Bangkok people eat, work and live. It's not as convenient for the main tourist sites, but it has a Skytrain station so you can be at the Grand Palace in 20 minutes.*\n\n" +
                        "*How to get around*\n\n" +
                        "*Bangkok's traffic can be a nightmare. Sure, you can easily take a taxi – if you want to spend hours stuck in traffic jams – but there are two much better ways to get around the city. To explore the temples and historical sites, catch an express boat river taxi or a longtail boat along the Chao Phraya river and the canals. For the modern part of the city, the Skytrain is a fast, cheap way to travel from the river to the shopping malls and nightlife of Sukhumvit, and the famous Chatuchak street market.*\n\n" +
                        "*Where to eat*\n\n" +
                        "*The simple answer is: everywhere! Thai street food is among the best in the world, and for around \$5 you can eat a filling and delicious meal. Some food stands have little plastic seats where you can sit and eat and they cook the same dish over and over, like fried chicken on rice or Pad Thai noodles. Head for Chinatown – Yaowarat Street – and choose whatever looks most interesting from the many excellent Chinese and Thai restaurants and food stands.*\n\n" +
                        "*What to do*\n\n" +
                        "*After you've seen the main sites like the Giant Buddha at the temple of Wat Pho and the spectacular Grand Palace, and shopped at Chatuchak market, check out the snake farm and watch the live snake show. You can even touch a snake yourself if you want to!*\n\n"),
                GamaselaMaterialModel("Cara Mengenali Berita Hoaks", "\n![]()\n\n" +
                        "*Every time you're online, you are bombarded by pictures, articles, links and videos trying to tell their story. Unfortunately, not all of these stories are true. Sometimes they want you to click on another story or advertisement at their own site, other times they want to upset people for political reasons. These days it's so easy to share information.*\n\n *These stories circulate quickly, and the result is … fake news.*\n\n" +
                        "There is a range of fake news: from crazy stories which people easily recognise to more subtle types of misinformation. Experts in media studies and online psychology have been examining the fake news phenomenon. Read these tips, and don't get fooled!*\n\n" +
                        "\t1. Check the source\n" +
                        "*Look at the website where the story comes from. Does it look real? Is the text well written? Are there a variety of other stories or is it just one story? Fake news websites often use addresses that sound like real newspapers, but don't have many real stories about other topics. If you aren't sure, click on the 'About' page and look for a clear description of the organisation.*\n\n" +
                        "\t2. Watch out for fake photos\n" +
                        "*Many fake news stories use images that are Photoshopped or taken from an unrelated site. Sometimes, if you just look closely at an image, you can see if it has been changed. Or use a tool like Google Reverse Image search. It will show you if the same image has been used in other contexts.*\n\n" +
                        "\t3. Check the story is in other places\n" +
                        "*Look to see if the story you are reading is on other news sites that you know and trust. If you do find it on many other sites, then it probably isn't fake (although there are some exceptions), as many big news organisations try to check their sources before they publish a story.*\n\n" +
                        "\t4. Look for other signs\n" +
                        "*There are other techniques that fake news uses. These include using ALL CAPS and lots of ads that pop up when you click on a link. Also, think about how the story makes you feel. If the news story makes you angry, it's probably designed to make you angry.*\n\n" +
                        "*If you know these things about online news, and can apply them in your everyday life, then you have the control over what to read, what to believe and most importantly what to share. If you find a news story that you know is fake, the most important advice is: don't share it!*\n\n"),
                GamaselaMaterialModel("Encyclopedia Entry", "**a.\tPreparation**\n" +
                        "\ti. A Dome\n" +
                        "❖\t*A rounded roof with a circle-shaped base.*\n\n" +
                        "\tii. Precious Stone\n" +
                        "❖\t*valuable stones like diamonds, rubies and emeralds.*\n\n" +
                        "\tiii. A Pathway\n" +
                        "❖\t*a narrow track for walking on.*\n\n" +
                        "\tiv. A Fountain\n" +
                        "❖\t*a structure in a garden or park that pushes water into the air.*\n\n" +
                        "\tv. Marble\n" +
                        "❖\t*a type of hard smooth stone that is often used for decoration.*\n" +
                        "\tvi. An Archway\n" +
                        "❖\t*a curved structure, often over an entrance or passage.*\n\n" +
                        "**b.\tReading**\n" +
                        "\n![](https://learnenglish.britishcouncil.org/sites/podcasts/files/RS7232_ThinkstockPhotos-519330110-hig.jpg)\n\n" +
                        "**The Taj Mahal**\n\n" +
                        "*The Taj Mahal (pronounced /ˌtɑːdʒ mə'hɑːl/) is a famous mausoleum next to the river Yamuna in the Indian city of Agra. A mausoleum is a building where people bury the dead. The name Taj Mahal means 'the crown of palaces'.*\n\n" +
                        "1.\t*The most famous part of the Taj Mahal is the large white dome in the centre. It is 35 metres high and is surrounded by four smaller domes. The rooms inside the building are decorated with beautiful archways and precious stones in the walls. The buildings are surrounded by gardens with pathways, pools, fountains and green gardens.*\n\n" +
                        "2.\t*The construction of the Taj Mahal began in 1632 and finished in 1653. It was built with materials from all over India and Asia, but the main material is white marble. Historians believe that the materials were transported by over 1,000 elephants for the construction.*\n\n" +
                        "3.\t*The emperor Shah Jahan built the Taj Mahal as a burial place for his wife, Mumtaz Mahal. According to legend, he wanted to build another Taj Mahal in black on the other side of the river, but this never happened. During the Indian Rebellion of 1857, many parts of the Taj Mahal were damaged by British soldiers, who took some of the precious stones from its walls. Over the years, the Taj Mahal has suffered from environmental damage, and there have been many government attempts to conserve its beauty.*\n\n" +
                        "4.\t*The Taj Mahal is one of India's most famous landmarks. There are millions of visitors to the mausoleum every year. The Taj Mahal is almost always included in lists of famous buildings to visit and is considered one of the New Seven Wonders of the World. It is also a UNESCO World Heritage Site.*\n\n"),
        )))

        // Writing
        topicModels.add(GamaselaTopicModel("Writing", arrayListOf(
                GamaselaMaterialModel("A Class Forum", "•\t**Penjelasan**\n"+
                        "Belajar bagaimana menulis sebuah teks yang disuguhkan dalam kelas\n\n\tDalam forum kelas khususnya kelas bahasa inggris mata pelajaran menulis, tentunya bakal disuguhkan materi-materi bacaan lalu setelah membaca bacaan tersebut kita diminta menjawab pertanyaan, umumnya blank space (kotak kosong) yang harus isi sesuai bacaan tersebut, pernyataan benar atau salah, etc\n\n" +
                        "•\t**Tips**\n\n1.\tBacalah bacaan tersebut dengan teliti dan hati-hati\n" +
                        "2.\tJika tidak bisa memahami isi bacaan secara detail tidak mengapa, pahamilah apa yang diminta dalam soal\n" +
                        "3.\tDalam forum kelas kamu boleh menulis dengan gaya informal\n" +
                        "4.\tTapi biasanya menulis dengan gaya informal kamu akan kehilangan fokus untuk kalimat awal jadi tetap pada kaidah penulisan yang berlaku.\n" +
                        "\n" +
                        "•\t**Contoh bacaan :** \n" +
                        "\n" +
                        "1. *So cool to read about everyone's home tradition they miss the most! I'm from England but I've been living in the States for five years and the thing I miss the most is Bonfire Night on November 5th.*\n" +
                        "\n" +
                        "2. *The best thing about Bonfire Night is the fireworks, oh, and the bonfires! … and the history behind it. Basically, Guy Fawkes and his friends tried to blow up the Houses of Parliament and kill King James I. They nearly did it too – they hired a room under the House of Parliament and filled it with explosives. But someone told the royal palace. The authorities found Guy Fawkes in the room guarding the explosives, and he was sentenced to torture and death.*\n" +
                        "\n" +
                        "3. *So it's a tradition that celebrates the fact that the king survived. It also means people don't forget what happens if you plot against your country. There's a kind of poem about it that starts 'Remember, remember the fifth of November, gunpowder, treason and plot.' That's why we build a 'guy' – a life-size model of Guy Fawkes – and burn it on the bonfire. Pretty dark and horrible when you think about it!*"),
                GamaselaMaterialModel("A Professional Profile", "•\t**Penjelasan**\n\n" +
                        "\n" +
                        "*Professional profile* biasanya digunakan jika kita ingin melamar kerja mungkin di Indonesia lebih terkenal dengan istilah CV (Curriculum Vitae) atau resume. \n\n Tentunya para pelamar kerja akan membuat professional profilenya sebagus mungkin, nah berikut tips dan contoh professional profile ya gaissss.\n" +
                        "\n" +
                        "•\t**Tips**\n" +
                        "1.\tProfessional Profile kalian harus dan wajib banget singkat, padat dan jelas.\n" +
                        "2. Tuliskan gelar atau jabatan yang lengkap dibawah nama mu\n" +
                        "3.\tRingkasan profile mu kalau bisa dalam paragraph yang singkat\n" +
                        "4.\tGunakan bahasa yang menarik dan elegan untuk mempromosikan dirimu\n" +
                        "5. cantumkan kelebihanmu atau keahlianmu dalam bidang tertentu\n" +
                        "\n" +
                        "•\t**Contoh Professional profile**\n" +
                        "\n" +
                        "*__David Beddingfield__*\n\n" +
                        "*__Digital Marketing Manager__*\n\n" +
                        "______________________________\n\n" +
                        "*__Summary__*\n\n" +
                        "*Over the past six years I have held various roles in the field of digital marketing and communication and currently lead a small team in the Fast-Moving Consumer Goods (FMCG) sector. I have a proven track record of planning and implementing successful digital marketing campaigns across a range of channels.*   \n\n" +
                        "______________________________\n" +
                        "*__Experience__*\n\n" +
                        "**Digital Marketing Manager**\n\n" +
                        "Krunch Ltd\n\n" +
                        "Jan 2017 – Present\n\n" +
                        "*My role involves strategic focus on all areas of digital marketing within the company and working closely with the main marketing and communications teams. I design and lead all our digital marketing campaigns.*\n" +
                        "**Digital Marketing Executive**\n\n" +
                        "Krunch Ltd\n\n" +
                        "June 2014 – Dec 2016\n\n" +
                        "*I was responsible for overall social media strategy. I worked on many campaigns to drive engagement with the customers of our breakfast cereals and bars to build brand loyalty. I also led on three key product launches.*\n" +
                        "**Digital Marketing Assistant**\n\n" +
                        "Food2Grab Ltd\n\n" +
                        "Sept 2013 – May 2014\n\n" +
                        "*In this role I developed my existing knowledge and skills in the fields of social media and consumer goods. I supported the design of multi-channel marketing campaigns to promote brand awareness of our healthy snack range.*\n"),
                GamaselaMaterialModel("A Report on A Student Meeting", "•\t**Penjelasan**\n\n" +
                        "Dalam pelajaran bahasa inggris khususnya writing dikenal dengan beberapa teks, salah satunya report teks. Ini berfungsi untuk menggambarkan sesuatu secara umum sebagai hasil dari pengamatan atau penelitian.\n\n" +
                        "•\t**Tips**\n" +
                        "1.\tMulailah dengan mengarah pada report teks dan pertanyakan report tersebut dari mana berasal dan apa topiknya.\n" +
                        "2. Gunakan anak judul untuk membuat kerangka yang jelas dengan metode logis contoh :\n" +
                        "\t- Pendahuluan\n" +
                        "\t- Pokok masalah\n" +
                        "\t- Kesimpulan dan Rekomendasi\n" +
                        "3. Gunakan style gambaran yang bersifat umum\n" +
                        "4. Gunakan bahasa yang obyektif untuk menyimpulkan report\n\n" +
                        "Contoh *A Report on A Student Meeting*" +
                        "*__Improvements to Oak Hall__*\n\n" +
                        "**Introduction**\n\n" +
                        "*This report aims to describe problems in Oak Hall of Residence and discuss possible maintenance work to solve them. The two biggest issues were discussed at a meeting on 12 May, which was attended by 165 of the 250 students who live in the building.*\n\n" +
                        "**Issue 1: temperature in rooms**\n\n" +
                        "*A number of students complained that the second-floor bedrooms are too hot. Concerns were raised about lack of sleep and students finding it hard to study in their rooms. Air conditioning was suggested as a possible solution.*\n\n" +
                        "*However, there is no budget left for installing air conditioning this academic year. Also, installation can only be carried out during holidays as students cannot be present in the building while the work takes place.*\n\n" +
                        "**Issue 2: improving wheelchair access to Oak Café**\n\n" +
                        "*It was noted that wheelchair users can only access Oak Café from the back and not the front entrance nearer the lifts. This makes access to the café difficult for wheelchair users. The university is looking to improve its wheelchair access in general by installing ramps in key areas and work can take place during term time with no issues for staff or students.*\n\n" +
                        "**Conclusion and recommendations**\n\n" +
                        "*Taking the factors mentioned into account, August would be the best time for the installation of air conditioning. Until then, the university could consider supplying fans to each second-floor room so students can sleep and study comfortably.*\n\n" +
                        "*The front of the café is recommended as an ideal place to install a wheelchair ramp. This work can take place immediately and should be a priority.*"),
                GamaselaMaterialModel("A Restoran Review", "•\t**Penjelasan**\n\n" +
                        "Ketika kita selesai memesan dan menikmati berbagai menu yang ada di restoran, pihak restoran meminta pelanggan setianya untuk membuat review bisa saran, masukan atau bahkan kritik guna membangun dan tetap mempertahankan citra dan restoran tersebut. \n" +
                        "\n" +
                        "•\t**Tips**\n" +
                        "1. Gunakan gaya menulis yang informal atau semi-formal.\n" +
                        "2.\tdalam judul langsung beri maksud dan pendapat kamu tentang restoran tersebut secara singkat.\n" +
                        "3.\ttulis mengenai bagian penting pengalaman kamu ketika berkunjung di restoran tersebut, entah itu mengenai dekorasi, menu, atau pelayanannya.\n" +
                        "4. susun ide-ide kamu dalam bentuk sebuah paragraph.\n" +
                        "5. tulis mengenai hal baik dan hal buruk selama kamu berkunjung ke restoran tersebut.\n" +
                        "\t**Contoh**\n" +
                        "\n" +
                        "*__Vega, New York__*\n\n" +
                        "*Reviewed yesterday*\n\n" +
                        "★★★☆☆\n\n" +
                        "*__Great mains, pity about the chips__*\n\n" +
                        "*Came for lunch with my sister. We loved our Thai-style mains which were amazing with lots of flavour, very impressive for a vegetarian restaurant.*\n\n" +
                        "*But the service was below average and the chips were too terrible to finish.*\n\n" +
                        "*When we arrived at 1.40, we had to wait 20 minutes while they got our table ready. OK, so we didn't have a reservation, but the restaurant was only half full. There was no reason to make us wait at all.*\n\n" +
                        "*We ordered the chips as a side dish and they looked delicious. But, when we tasted them, they were overcooked and swimming in oil so we left most of them. We expected a lot more for \$10!*\n\n" +
                        "*When the waiter asked if everything was ok, we said we really didn't like the chips and he said 'That's funny, I love them' and that was it. He didn't offer us anything else or take them off our bill. Also, when we didn't leave a tip, he looked annoyed.*\n" +
                        "*I was really excited about visiting Vega, and the mains were just fantastic, but the rest of the experience was really disappointing.*\n"),
                GamaselaMaterialModel("A Thank-You Message", "•\t**Penjelasan**\n\n" +
                        "Dalam relasi professional ucapan terimakasih sangat diperlukan guna mengapresiasi seseorang, biasanya ucapan terimakasih dilontarkan melalui email atau pesan singkat jika jarak menghalangi untuk mengucapkannya\n" +
                        "\n" +
                        "•\t**Tips**\n" +
                        "1.\tMemulai dengan kata-kata yang baik atau ramah\n" +
                        "\t- *I hope you're well.*\n" +
                        "2.\tbiasanya menggunakan kata-kata informal dan bebas \n" +
                        "\t- *Hi Maria, …*\n" +
                        "*- Thanks for your help.*\n" +
                        "3.\tTulis pesan dengan singkat, padat dan jelas\n" +
                        "4. Sisipkan hal positif yang telah dia atau kolega mu kerjakan\n" +
                        "\t-  *Your expertise was vital for this project.*\n" +
                        "*-  We couldn't have finished it successfully without your help.*\n" +
                        "5. Akhiri dengan komentar positif dan kemungkinan untuk bekerja sama kembali\n" +
                        "\t*- I hope to work with you more closely in future.*\n" +
                        "*- I look forward to working with you again.*\n" +
                        "\n" +
                        "•\tContoh\n" +
                        "\n" +
                        "*From: Paco*\n" +
                        "*To: Maria*\n" +
                        "*Subject: Thanks*\n" +
                        "\n" +
                        "*Hi Maria,*\n" +
                        "\n" +
                        "*I hope you're well.*\n" +
                        "\n" +
                        "*I'm just writing to say thanks for your help on the project last month. We really appreciate you stepping in to support us. I know you had to put in extra hours to catch up on your own work, so thank you very much.*  \n" +
                        "\n" +
                        "*Your expertise was vital for this project and we couldn't have finished it successfully without you. You really helped us and we hope to work with you again on future projects.*\n" +
                        "\n" +
                        "*I'll be in touch again soon about possible future collaborations. I look forward to working with you more closely this year.*\n" +
                        "\n" +
                        "*All the best,*\n" +
                        "\n" +
                        "*Paco*\n"),
                GamaselaMaterialModel("Menulis E-Mail Resmi", "Pernah nggak sih kamu kesulitan saat menulis email dalam bahasa Inggris?\n\n" +
                        "Menyusun sebuah email dengan bahasa Inggris yang formal dalam acara yang bersifat resmi tidaklah mudah.\n\n" +
                        "Penulisan isi email dalam kondisi demikian membutuhkan ketelitian, diksi yang baik, dan kemampuan menerjemahkan kata yang mumpuni, karena setelah sebuah email dikirim, email tidak dapat dihapus atau ditarik kembali.\n\n" +
                        "Untuk kasus tertentu, email bahkan dapat digunakan sebagai dasar hukum ataupun bukti dalam persidangan. Dengan demikian, meminimalisir kesalahan merupakan hal yang penting.\n\n" +
                        "Agar kamu dapat melakukan hal tersebut, mari kita simak penjelasnya di bawah ini. \n\n" +
                        "**Format Standar Dari Sebuah Email Formal Dalam Bahasa Inggris**\n\n" +
                        "\t1. Pengantar\n Caramu menuliskan pengantar email akan bergantung kepada hubunganmu dengan orang yang menerima email, namun semua email harus diawali dengan salam pembuka. Dalam sebuah email resmi, salam pembuka yang paling cocok untuk mengawali email adalah:\n" +
                        "\n" +
                        "•\t*Dear Mr/Mrs/Ms* (nama belakang si penerima, e.g. Mr Widjojo)\n\n" +
                        "•\t*Dear Sir/Madam* (jika kamu tidak mengetahui nama penerima) atau bisa juga *‘To whom it may concern’*\n\n" +
                        "\n" +
                        "Selanjutnya, kamu perlu menuliskan kalimat pembuka yang menjelaskan maksud dan tujuan dari email tersebut. Kalimat ini harus konsisten dengan subyek email. Kamu dapat memperkenalkan dirimu secara singkat seperti misalnya “Hi, my name is…..”. Hindari kalimat yang panjang karena akan membuat orang malas membacanya kemudian lanjutkan kalimatmu dengan:\n" +
                        "\n" +
                        "•\t*I am writing with regard to…* (subyek email)\n\n" +
                        "•\t*I am writing in connection with…* (subyek email)\n\n" +
                        "•\t*I am writing in reference to…*\n\n" +
                        "\n" +
                        "Jika kamu menulis email untuk mengirimkan sebuah informasi, kamu dapat mengawalinya dengan kalimat berikut:\n" +
                        "\n" +
                        "•\t*I am writing to let you know…*\n\n" +
                        "•\t*I am delighted to tell you…* (jika kamu menyampaikan kabar baik)\n\n" +
                        "•\t*I regret to inform you that…* (jika kamu menyampaikan kabar buruk)\n\n" +
                        "\n" +
                        "Jika kamu hendak membalas email yang telah kamu terima sebelumnya, kamu dapat mengatakan:\n" +
                        "\n" +
                        "•\t*I am writing in response to…*\n\n" +
                        "•\t*I am writing in reply to…*\n\n" +
                        "•\t*I am writing to thank you for…* (jika kamu ingin berterima kasih pada penerima email)\n" +
                        "•\t\n" +
                        "\n" +
                        "\t 2.Teks Utama\n" +
                        "Untuk bagian ini, tidak ada formula yang pasti karena isi dari teks utama akan bervariasi tergantung dari apa yang hendak kamu komunikasikan kepada penerima. \n\n Beberapa aturan dasar untuk ini adalah teksnya sebaiknya dibagi ke dalam paragraf pendek-pendek dan hindari kata singkatan atau akronim, yang sebaiknya hanya digunakan untuk email yang bersifat tidak resmi saja.\n" +
                        "\n" +
                        "Berdasarkan pesan yang hendak kamu kirimkan, ada beberapa kalimat yang dapat kamu letakkan untuk mengakhiri teks utama sekaligus email ini, seperti misalnya:\n" +
                        "\n" +
                        "•\t*I look forward to hearing from you soon*\n" +
                        "•\t*Thank you in advance\n*" +
                        "•\t*For further information, please do not hesitate to contact me*\n" +
                        "•\t*Please let me know if you have any questions*\n" +
                        "•\t*Thanks for your attention\n*" +
                        "\n" +
                        "\t3. Penutup\n" +
                        "Kata penutup yang umum digunakan dalam email adalah sebagai berikut:\n\n" +
                        "•\t*Best regards*\n\n" +
                        "•\t*Kind regards*\n\n" +
                        "•\t*Yours faithfully* (jika kamu mengawali email dengan ‘Dear Sir/Madam’ karena kamu tidak mengetahui nama penerima)\n\n" +
                        "•\t*Yours sincerely* (jika kamu mengawali email dengan ‘Dear Mr/Mrs/Ms + nama belakang)\n\n" +
                        "•\t*Regards*\n\n" +
                        "**Contoh Email resmi dalam Bahasa Inggris**\n\n" +
                        "*Subject: Web Content Creator position*\n\n" +
                        "*Dear Sir/Madam,* \n\n" +
                        "*With reference to your job ad in Linkedin, I would like to submit my application for the position of Web Content Editor in your company.* \n\n" +
                        "*I graduated in Communication Sciences at the University of X and worked for several years in a Digital Agency as a Content Specialist. I believe my skills and experience are in line with the requirements for the job position. I will be glad to introduce myself in an interview, that will allow you to better evaluate my possible recruitment.* \n\n" +
                        "*Please find attached a copy of my resume. I look forward to hearing from you.*\n\n" +
                        "*Yours faithfully,*\n\n" +
                        "*John Traore*\n"),
                GamaselaMaterialModel("Mendeskripsikan Bar Chart dalam Bahasa Inggris", "Halo guys, siapa yang suka belajar statistik? \n\n Dalam ilmu statistika, kamu akan sering menemukan grafik batang dalam proses penyajian data. \n Tahukah kamu, dalam Bahasa Inggris, grafik batang disebut dengan Bar Chart. \n\n Kamu sudah bisa membaca Bar Chart dalam Bahasa Inggris lalu membuat laporannya? Kalau belum kamu harus menguasai materi ini. \n\n Yuk, sekarang kita coba membedah Bar Chart dalam Bahasa Inggris. Sebelumnya mari kita lihat contoh grafik batang dibawah ini. \n\n " +
                        "\n![](https://learnenglish.britishcouncil.org/sites/podcasts/files/Writing-B1-Describing-a-bar-chart-2.png)\n\n\n" +
                        "**Deskripsi Bar Chart:**\n" +
                        "*The chart shows the sales revenue of a selection of home video entertainment formats in the USA in 2017. It also shows the percentage change from the previous year. Online video streaming was the most popular format in 2017. US consumers spent \$9.8 billion on services such as Netflix, which was a rise of 32 per cent from the previous year. For the average American, this accounted for nearly half of their spending on video entertainment at home. At the same time, customers were moving away from the three physical formats in the chart. DVD and Blu-ray sales dropped by 14 per cent over the twelve-month period to \$4.5 billion in 2017, and rent-by-post revenues went down by 20 per cent to \$0.5 billion. DVD rental shops saw the largest decline, as spending fell by 21 per cent to just \$0.4 billion.*\n" +
                        "*Overall, there was a clear downward trend in spending on physical video formats, as they all showed relatively low sales and they were all in decline. However, there was an upward trend in paying for streaming.*\n" +
                        "\n" +
                        "*Please note: This page was designed for writing practice only. Information in the chart may not be accurate.*\n\n" +
                        "**Tips dalam mendeskripsikan grafik batang (Bar chart):**\n\n" +
                        "1.\tPada paragraf pertama, berikan detail dasar tentang bagan termasuk apa yang ditampilkan, di mana dan kapan rujukan. \n" +
                        "2.\tKetika kamu mendeskripsikan data bagan, usahakan untuk spesifik. Contoh pada kalimat: “Online video streaming was the most popular format in 2017. US consumers spent \$9.8 billion.”\n" +
                        "3.\tTren adalah perubahan dari waktu ke waktu. Untuk mendeskripsikan tren, fokuslah pada apa yang meningkat atau menurun dibandingkan beberapa waktu di masa lalu. Contoh pada kalimat: “... which was a rise of 32 per cent from the previous year.”\n" +
                        "4.\tJika beberapa kategori menunjukan tren yang sama, bicarakan keduanya secara bersama, contoh dalam paragraf. “Contoh kalimat: customers were moving away from the three physical formats in the chart.”\n" +
                        "5.\tJika terdapat angka, sebutkan satuan pengukuran, contoh kalimat. US consumers spent \$9.8 billion.\n" +
                        "6.\tTuliskan kesimpulan dari apa yang kamu pelajari dari keseluruhan data tersebut\n"),
                GamaselaMaterialModel("Menuliskan Resolusi Tahun Baru dalam Bahasa Inggris", "Pernahkan kalian mencoba untuk menuliskan resolusi tahun baru atau mendapat tugas untuk menuliskan resolusi? \n\n" +
                        "Nah pada kesempatan kali ini, kita akan belajar tentang tips untuk menulis resolusi tahun baru. Selain itu, pada akhir materi aka nada contoh resolusi tahun baru dalam Bahasa Inggris yang bisa menjadi bahan belajar kalian.\n\n" +
                        "Bagaimana tips untuk menulis resolusi tahun baru dalam Bahasa Inggris? Mari sama-sama kita cek dibawah ini.\n\n" +
                        "**Tips Menulis Resolusi Tahun Baru dalam Bahasa Inggris**\n\n" +
                        "•\t Sebelum  kamu mulai untuk menulis,, buatlah rencana.\n\n" +
                        "Pertama, tuliskan berbagai ide yang mungkin bisa kamu masukan. Lalu, pilih yang terbaik dan paling menarik. \n\n •\tJangan menulis semua idemu dalam satu bagian. Buat satu bagian dalam setiap ide. Tulis judul untuk setiap bagian untuk menunjukan pembaca isi dari bagian tersebut \n\n •\t Buat pembaca tetap tertarik dengan membaca dengan “berbicara langsung kepada mereka”. Contohnya dengan mengajukan pertanyaan. \n •\t Setelah Anda selesai menulis, bacalah dan periksa apakah ada kesalahan. \n\n" +
                        "Contoh Resolusi Tahun Baru \n\n" +
                        "*I like to start every year with my New Year's resolutions. Then I read them next 1 January and see how well I did!* \n \n *Here are my resolutions this year.*\n \n" +
                        "1.\t**Get fit!!**\n\n *I say this every year but I hope writing it in public will make it more real. I'm aiming for three runs a week – I think I can do it! I think a fitness tracking app might help me achieve it. Or I could find a running partner. If anyone who's reading this wants to be my partner, let me know!*\n\n" +
                        "2.\t**Save 10 per cent of my salary a month**\n\n *Having no savings is starting to worry me and 10 per cent is realistic. It's not too much, but it's not too little that I won't see it add up. I'll put the money into a special bank account that will make it grow … Actually, I don't know much about that so maybe my next resolution should be to find out how to invest money!!*\n\n" +
                        "3.\t**Cook more**\n\n *I'd like to start inviting friends for dinner and cooking for them. I think once a month is a good plan. By the end of the year I want to have five dishes I can cook really well so people will say, 'Have you ever had Darren's delicious cooking?' Who wants to be my first guest?*"),
                GamaselaMaterialModel("Reflective Writing", "*Reflective Writing* merupakan tulisan yang isinya mencerminkan renungan-renungan  pribadi atau personal yg diungkapkan secara hampir spontan sesuai dengan  apa yg dirasakan di benak atau hati pada saat tertentu. \n\n Sifat dan isi tulisan ini  hampir sama dengan  catatan harian. Namun demikian jika catatan harian lebih merupakan  tulisan yang berisi lintasan-lintasan  pikiran yang terpisah-pisah dan melompat-lompat dari satu tema ke tema lainnya. \n\n Maka *reflective writing* berupa  catatan-catatan  yang  yang lebih ekstensif,  terencana,  sebagai  tulisan yang utuh dan sistematis serta didukung data dan pengalaman nyata. \n\n Pada kesempatan kali ini, kita akan membahas tentang *Reflective writing* dan contohnya, namun pertama-tama mari kita lihat tips dalam menulis *Reflective writing* di bawah ini.\n\n" +
                        "**Tips menulis Reflective Writing**\n" +
                        "•\tReflective writing lebih bersifat personal. Kamu dapat menggunakan sudut pandang orang pertama seperti (I ... , My ... , dl.)\n\n" +
                        "•\tPikirkan pengalaman tersebut secara mendetail. Jelaskan apa yang berjalan dengan baik dan apa yang menantang, dan katakan apa yang kamu pelajari dalam prosesnya.\n\n" +
                        "•\tGunakan struktur penulisan sebagai berikut:\n" +
                        "1.\tPengantar singkat tentang situasi tersebut\n" +
                        "2.\tEvaluasi hal terpenting tentang pengalaman, termasuk solusi masalah\n" +
                        "3.\tKatakan apa yang akan Anda lakukan secara berbeda di lain waktu\n" +
                        "4.\tKatakan apa yang Anda pelajari secara keseluruhan.\n\n" +
                        "•\tTetap fokus pada proses pembelajaran Anda dan apa yang akan Anda lakukan dengan lebih baik di masa depan.\n\n" +
                        "**Contoh *Reflective writing***\n\n" +
                        "*In January I spent three weeks volunteering as an English teacher in my town. I've been thinking about becoming an English teacher for a while so it was a good opportunity to see what it's like. The students had all just arrived to start a new life in the UK and they had a range of levels from beginner to intermediate. They came from a variety of countries and had very different backgrounds and experiences.*\n\n" +
                        "*For me, the most important thing was the relationship with the students. I was nervous at first and did not feel confident about speaking in front of people. However, I found it easy to build good relationships with the students as a class and as individuals and I soon relaxed with them. It was a challenge to encourage the lower-level students to speak in English, but at least they understood a lot more at the end of the course.*\n\n" +
                        "*At first, planning lessons took a really long time and I was not happy with the results. Classes seemed to be too difficult for some students and too easy for others, who finished quickly and got bored. I found it was better to teach without a course book, adapting materials I found online to suit their needs. I learned to take extra activities for students who finished early and that was much better.*\n\n" +
                        "*I still need to continue improving my lesson planning. I would like more ideas for teaching mixed-ability groups and I want to plan the whole course better next time. That way students have a focus.*"),

        )))

        // Vocab
        topicModels.add(GamaselaTopicModel("Vocab", arrayListOf(
                GamaselaMaterialModel("Bathrooms", "❖*bath*\t:\t kamar mandi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3813_95230427-int.jpg)\n\n" +
                        "❖*tap*\t:\t keran air\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3814_127033155-int.jpg)\n\n" +
                        "❖*toothbrush*\t:\t sikat gigi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3816_158580025-int.jpg)\n\n" +
                        "❖*washbasin*\t:\t wastafel\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3817_177349168-int.jpg)\n\n" +
                        "❖*mirror*\t:\t cermin\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3820_181655171-int.jpg)\n\n" +
                        "❖*toilet*\t:\t kloset\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3819_179301706-int.jpg)\n\n" +
                        "❖*toilet paper*\t:\t tisu kloset\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3822_459279213-int.jpg)\n\n" +
                        "❖*soap*\t:\t sabun\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3906_459889899-int.jpg)\n\n" +
                        "❖*towel*\t:\t handuk\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3824_460140705-int.jpg)\n\n" +
                        "❖*shower*\t:\t pancuran untuk mandi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3818_178492537-int.jpg)\n\n" +
                        "❖*shampoo*\t:\t pencuci rambut\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS5006_100169746-int.jpg)\n\n"),
                GamaselaMaterialModel("Body parts 1 & 2", "❖*head*\t:\t kepala\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/head_RS7486_ThinkstockPhotos-512524088.jpg)\n\n" +
                        "❖*back*\t:\t punggung\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/back_RS7404_ThinkstockPhotos-90616032.jpg)\n\n" +
                        "❖*foot*\t:\t telapak kaki\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/foot_RS3849_153187442.jpg)\n\n" +
                        "❖*ear*\t:\t telinga\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/ear.jpg)\n\n" +
                        "❖*throat*\t:\t kerongkongan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/throat_RS3843_121902506_0.jpg)\n\n" +
                        "❖*arm*\t:\t lengan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/arm_RS4527_466199853.jpg)\n\n" +
                        "❖*leg*\t:\t kaki\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/leg_RS4526_452222669.jpg)\n\n" +
                        "❖*mouth*\t:\t mulut\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/mouth_RS7497_ThinkstockPhotos-525345237.jpg)\n\n" +
                        "❖*finger*\t:\t jari\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/finger_RS4534_450796329.jpg)\n\n" +
                        "❖*nose*\t:\t hidung\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/nose_RS4535_488259937.jpg)\n\n" +
                        "❖*hand*\t:\t tangan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/hand_RS7454_ThinkstockPhotos-200549078-001.jpg)\n\n" +
                        "❖*eye*\t:\t mata\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/eye_RS3844_122255030.jpg)\n\n" +
                        "❖*forehead*\t:\t dahi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/forehead_RS4477_179286230.jpg)\n\n" +
                        "❖*elbow*\t:\t siku\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/elbow_RS4527_466199853.jpg)\n\n" +
                        "❖*teeth*\t:\t gigi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/teeth_RS3847_137037670.jpg)\n\n" +
                        "❖*face*\t:\t wajah\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/face_RS4835_465246327.jpg)\n\n" +
                        "❖*toes*\t:\t jari kaki\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/toes_RS758_149613729.jpg)\n\n" +
                        "❖*knee*\t:\t lutut\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/knee_RS4763_stk62644cor.jpg)\n\n" +
                        "❖*wrist*\t:\t pergelangan tangan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/wrist_RS4527_466199853.jpg)\n\n" +
                        "❖*fingernails*\t:\t kuku jari tangan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/fingernails_RS7454_ThinkstockPhotos-200549078.jpg)\n\n" +
                        "❖*eyebrows*\t:\t alis\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/eyebrows_RS6662_528183469.jpg)\n\n" +
                        "❖*tongue*\t:\t lidah\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/tongue_RS202_450745551.jpg)\n\n" +
                        "❖*ankle*\t:\t pergelangan kaki\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/ankle_RS3849_153187442.jpg)\n\n" +
                        "❖*thumb*\t:\t ibu jari\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/thumb.jpg)\n\n"),
                GamaselaMaterialModel("Health", "❖*bandage*\t:\t perban\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS758_149613729-22390.jpg)\n\n" +
                        "❖*nurse*\t:\t perawat\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS753_78617005-22390.jpg)\n\n" +
                        "❖*dentist*\t:\t dokter gigi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS761_159097086--22390.jpg)\n\n" +
                        "❖*medicine*\t:\t obat\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS757_138197596-22390.jpg)\n\n" +
                        "❖*plaster*\t:\t plester\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS759_151541239-22390.jpg)\n\n" +
                        "❖*tablets*\t:\t obat tablet/pil\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS760_157011364-22390.jpg)\n\n" +
                        "❖*injection*\t:\t suntikan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS754_118529908-22390.jpg)\n\n" +
                        "❖*ambulance*\t:\t ambulan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS762_160879861-22390.jpg)\n\n" +
                        "❖*doctor*\t:\t dokter\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS755_134147372-22390.jpg)\n\n" +
                        "❖*x-ray*\t:\t sinar-x\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6054_504030513-22390.jpg)\n\n" +
                        "❖*hospital*\t:\t rumah sakit\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS756_137875947-22390.jpg)\n\n" +
                        "❖*chemist*\t:\t apoteker\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS4715_176981204-22390.jpg)\n\n"),
                GamaselaMaterialModel("Kitchens", "❖*tin opener*\t:\t pembuka kaleng\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/tinopener.jpg)\n\n" +
                        "❖freezer*\t:\t lemari pembeku\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/freezer.jpg)\n\n" +
                        "❖*dishwasher*\t:\t tempat cuci piring\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/dishwasher.jpg)\n\n" +
                        "❖*fridge*\t:\t kulkas\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/fridge_0.jpg)\n\n" +
                        "❖*bin*\t:\t tempat sampah\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/bin_1.jpg)\n\n" +
                        "❖*frying pan*\t:\t penggorengan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/fryingpan.jpg)\n\n" +
                        "❖*microwave*\t:\t pemanas mikro\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/microwave.jpg)\n\n" +
                        "❖*toaster*\t:\t pemanggang roti\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/toaster.jpg)\n\n" +
                        "❖*oven*\t:\t pemanggang\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/oven.jpg)\n\n" +
                        "❖*sponge*\t:\t spons\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/sponge.jpg)\n\n" +
                        "❖*saucepan*\t:\t panci\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/saucepan.jpg)\n\n" +
                        "❖*sink*\t:\t wastafel\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/sink_1.jpg)\n\n"),
                GamaselaMaterialModel("Vegetables", "❖*carror*\t:\t wortel\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2776_98426592-int.jpg)\n\n" +
                        "❖*potato*\t:\t kentang\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2784_458843307-int.jpg)\n\n" +
                        "❖*tomato*\t:\t tomat\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2782_158876982-int.jpg)\n\n" +
                        "❖*onion*\t:\t bawang\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2781_158655979-int.jpg)\n\n" +
                        "❖*cabbage*\t:\t kubis\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2778_137588291-int.jpg)\n\n" +
                        "❖*peas*\t:\t kacang polong\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2779_153509972-int.jpg)\n\n" +
                        "❖*aubergine*\t:\t terong\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2783_164648720-int.jpg)\n\n" +
                        "❖*lettuce*\t:\t selada\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2775_96891608-int.jpg)\n\n" +
                        "❖*cucumber*\t:\t timun\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2773_91516166-int.jpg)\n\n" +
                        "❖*sweetcorn*\t:\t jagung manis\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2780_153696983-int.jpg)\n\n" +
                        "❖*cauliflower*\t:\t bunga kol\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2774_91779450-int.jpg)\n\n" +
                        "❖*pepper*\t:\t paprika/lada\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2777_134393890-int.jpg)\n\n" +
                        "❖*broccoli*\t:\t brokoli\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7494_ThinkstockPhotos-519936451-22401.jpg)\n\n" +
                        "❖*cassava*\t:\t singkong\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7455_ThinkstockPhotos-454312339-22401.jpg)\n\n" +
                        "❖*artichoke*\t:\t jantung arthicoke\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7430_ThinkstockPhotos-146797714-22401.jpg)\n\n" +
                        "❖courgettes**\t:\t cukini\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7457_ThinkstockPhotos-472495922-22401.jpg)\n\n" +
                        "❖*pumpkin*\t:\t labu\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7490_ThinkstockPhotos-517359245-22401.jpg)\n\n" +
                        "❖*ginger*\t:\t jahe\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7520_ThinkstockPhotos-613534674--22401.jpg)\n\n" +
                        "❖*garlic*\t:\t bawang putih\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7492_ThinkstockPhotos-517895450-22401.jpg)\n\n" +
                        "❖*green beans*\t:\t kacang hijau\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7424_ThinkstockPhotos-140236373-22401.jpg)\n\n" +
                        "❖*leeks*\t:\t daun bawang\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7437_ThinkstockPhotos-152940127-22401.jpg)\n\n" +
                        "❖*spinach*\t:\t bayam\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7507_ThinkstockPhotos-540533462-22401.jpg)\n\n" +
                        "❖*chard*\t:\t chard\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7429_ThinkstockPhotos-140786282-22401.jpg)\n\n" +
                        "❖*radish*\t:\t lobak\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7417_ThinkstockPhotos-121137414-22401.jpg)\n\n"),
                GamaselaMaterialModel("Appearance", "❖*short hair*\t:\t berambur pendek\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2shorthair-RS3851_rbrb_2214-low.jpg)\n\n" +
                        "❖*baid*\t:\t botak\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2bald-RS4529_86518460-int.jpg)\n\n" +
                        "❖*goatee*\t:\t berjanggut\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2goatee-RS7541_ThinkstockPhotos-LS019902-int.jpg)\n\n" +
                        "❖*long hair*\t:\t berambut panjang\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2longhair-RS7483_ThinkstockPhotos-509467989.jpg)\n\n" +
                        "❖*curly hair*\t:\t berambut keriting\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2curlyhair-RS199_186525958-int.jpg)\n\n" +
                        "❖*toddler*\t:\t anak kecil baru berjalan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2toddler-RS7484_ThinkstockPhotos-509663372-low.jpg)\n\n" +
                        "❖*straight hair*\t:\t berambut lurus\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2straighthair-RS4536_121247977-low.jpg)\n\n" +
                        "❖*beard*\t:\t berjanggut\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2beard-RS7496_ThinkstockPhotos-524263927-int.jpg)\n\n" +
                        "❖*teenager*\t:\t remaja\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2teenager-RS3177_483688031-low.jpg)\n\n" +
                        "❖*grey hair*\t:\t berambut kelabu\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2grayhair-RS3008_177390307.jpg)\n\n" +
                        "❖*dreadlocks*\t:\t berambut gimbal\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2dreadlocks-RS7427_ThinkstockPhotos-140448659-int.jpg)\n\n" +
                        "❖*moustache*\t:\t berkumis\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/2mustache-RS7433_ThinkstockPhotos-149151684.jpg)\n\n"),
                GamaselaMaterialModel("Hotels", "❖*bedrooms*\t:\t kamar tidur\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS800_104287144-int.jpg)\n\n" +
                        "❖*twin bed*\t:\t dua kasur\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS806_179289890-int.jpg)\n\n" +
                        "❖*manager*\t:\t pengelola\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS810_dv1794016-int.jpg)\n\n" +
                        "❖*reception*\t:\t penerima\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS803_153784665-int.jpg)\n\n" +
                        "❖*double bed*\t:\t kasur ganda\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS798_92269267-int.jpg)\n\n" +
                        "❖*single bed*\t:\t kasung tunggal\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS801_121298544-int.jpg)\n\n" +
                        "❖*lift*\t:\t lift/pengangkat\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS799_92376065-int.jpg)\n\n" +
                        "❖*pillow*\t:\t bantal\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS804_158226409-int.jpg)\n\n" +
                        "❖*toilet*\t:\t toilet/kamar kecil\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS809_200323862-001-int.jpg)\n\n" +
                        "❖*bathroom*\t:\t kamar mandi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS807_179533510-int.jpg)\n\n" +
                        "❖*towel*\t:\t handuk\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS805_161050974-int.jpg)\n\n" +
                        "❖*shower*\t:\t pancuran air mandi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS802_146915011-int.jpg)\n\n"),
                GamaselaMaterialModel("Air Travel", "❖*Airport*\t:\t bandara\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS276_110926970-int_0.jpg)\n\n" +
                        "❖*check in desk*\t:\t meja *check in*\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS275_57571553-int_0.jpg)\n\n" +
                        "❖*boarding card*\t:\t kartu pemberangkatan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS285_179066476-int_0.jpg)\n\n" +
                        "❖*baggage*\t:\t bagasi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS5003_162977602-int.jpg)\n\n" +
                        "❖*overhead locker*\t:\t penyimpanan bagian atas\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS283_176985134-int.jpg)\n\n" +
                        "❖*seat belt*\t:\t sabuk pengaman\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS282_164464429-int.jpg)\n\n" +
                        "❖*meal*\t:\t makanan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS284_177514860-int.jpg)\n\n" +
                        "❖*water*\t:\t air\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS280_153974516-int.jpg)\n\n" +
                        "❖*departures board*\t:\t papan/layar pemberangkatan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS277_113591519-int.jpg)\n\n" +
                        "❖*gate*\t:\t pintu pemberangkatan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS279_123507381-int.jpg)\n\n" +
                        "❖*plane*\t:\t pesawat\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS281_164343750-int.jpg)\n\n" +
                        "❖*duty free*\t:\t bebas pajak\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS294_dv1291037-int.jpg)\n\n"),
                GamaselaMaterialModel("Around Town", "❖*crossing*\t:\t penyebrangan jalan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS359_161170572-int.jpg)\n\n" +
                        "❖*traffic lights*\t:\t lampu lalu lintas\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS354_138084937-int.jpg)\n\n" +
                        "❖*roundabour*\t:\t bundaran\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS355_140445410-int.jpg)\n\n" +
                        "❖*crossroads*\t:\t perempatan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS5066_156209451-int.jpg)\n\n" +
                        "❖*signpost*\t:\t penanda jalan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS357_153723349-int.jpg)\n\n" +
                        "❖**street lights\t:\t lampu jalan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS4443_104694886-int.jpg)\n\n" +
                        "❖*traffic*\t:\t arus lalu lintas\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS353_122400087-int_1.jpg)\n\n" +
                        "❖*police officer*\t:\t petugas polisi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS5867_179285569-22395.jpg)\n\n" +
                        "❖*junction*\t:\t persimpangan jalan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS5066_156209451-22395.jpg)\n\n" +
                        "❖*motorway*\t:\t jalan tol\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS353_122400087-22395.jpg)\n\n" +
                        "❖*kerb*\t:\t trotoar\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS5597_ThinkstockPhotos-99120952-22395.jpg)\n\n" +
                        "❖*ambulance*\t:\t ambulan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS762_160879861-22395.jpg)\n\n" +
                        "❖*bus stop*\t:\t pemberhentian bis\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS356_147261735-int_0.jpg)\n\n"),
                GamaselaMaterialModel("Cars", "❖*number plate*\t:\t nomor plat\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/numberplate-RS4970_87664869-22409.jpg)\n\n" +
                        "❖*boot*\t:\t bagasi mobil\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/boot-RS5955_200361245-001-22409.jpg)\n\n" +
                        "❖*mirror*\t:\t kaca spion\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/mirror-RS5637_103582817-22409.jpg)\n\n" +
                        "❖*turn signal*\t:\t lampu sen\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/turnsignal-RS4970_87664869-22409.jpg)\n\n" +
                        "❖*bonnet*\t:\t kap mesin\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/bonnet-RS4970_87664869-22409.jpg)\n\n" +
                        "❖*headlights*\t:\t lampu depan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/headlights-RS2959_99901920-22409.jpg)\n\n" +
                        "❖*wiper*\t:\t penghapus/lap kaca depan mobil\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/wiper-RS816_86505029-22409.jpg)\n\n" +
                        "❖*steering wheel*\t:\t setir mobil\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/steeringwheel2-RS7221_ThinkstockPhotos-470316641-22409.jpg)\n\n" +
                        "❖*warning triangle*\t:\t segitiga peringatan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/warningtriangle-RS3243_487674057-22409.jpg)\n\n" +
                        "❖*wheel*\t:\t ban\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/wheel-RS2766_154402254-22409.jpg)\n\n" +
                        "❖*windscreen*\t:\t kaca depan mobil\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/windscreen-RS816_86505029-22409.jpg)\n\n" +
                        "❖*bumper*\t:\t bumper\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/bumper-RS2959_99901920-22409.jpg)\n\n"),
                GamaselaMaterialModel("Bicycles & Motorbikes", "❖*chain*\t:\t rantai\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/chain-RS3262_488721921-int.jpg)\n\n" +
                        "❖*spokes*\t:\t jari-jari\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/spokes-RS2917_78484458-int.jpg)\n\n" +
                        "❖*brakes*\t:\t rem\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/brakes-RS2917_78484458-int.jpg)\n\n" +
                        "❖*petrol*\t:\t bensin\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/petrol-RS7465_ThinkstockPhotos-494612854-int.jpg)\n\n" +
                        "❖*gear*\t:\t gigi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/gears-RS925_177409470-int.jpg)\n\n" +
                        "❖*helmet*\t:\t helm\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/helmet-RS6307_455669235-int.jpg)\n\n" +
                        "❖*pump*\t:\t pompa\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/pump-RS3262_488721921-int.jpg)\n\n" +
                        "❖*tyre*\t:\t ban\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/tyre-RS3262_488721921-int.jpg)\n\n" +
                        "❖*pedal*\t:\t pedal\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/pedal-RS925_177409470-int.jpg)\n\n" +
                        "❖*headlight*\t:\t lampu depan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/headlight-RS2767_167291143-int.jpg)\n\n" +
                        "❖*handlebars*\t:\t setang\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/handlebars-RS2917_78484458-int.jpg)\n\n" +
                        "❖*saddle*\t:\t pelana\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/saddle-RS2917_78484458-int.jpg)\n\n"),
                GamaselaMaterialModel("Beaches", "❖*surf*\t:\t berselancar\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS332_149084780-int.jpg)\n\n" +
                        "❖*sunglasses*\t:\t kacamata hitam\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS337_176952703-int.jpg)\n\n" +
                        "❖*sun hat*\t:\t topi pantai\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS331_123951804-int.jpg)\n\n" +
                        "❖*towel*\t:\t handuk\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS340_453218471-int.jpg)\n\n" +
                        "❖*sun cream*\t:\t krim matahari\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS333_153016603-int.jpg)\n\n" +
                        "❖*shell*\t:\t cangkang kerang\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS339_450605105-int.jpg)\n\n" +
                        "❖*sand*\t:\t pasir\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS336_156839760-int.jpg)\n\n" +
                        "❖*wave*\t:\t ombak\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS341_dv131001-int.jpg)\n\n" +
                        "❖*bag*\t:\t tas\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS334_153786927-int.jpg)\n\n" +
                        "❖*surfboard*\t:\t papan selancar\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS338_178052720-int.jpg)\n\n" +
                        "❖*boat*\t:\t perahu\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS330_92708108-int.jpg)\n\n" +
                        "❖*crab*\t:\t kepiting\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS335_155664690-int.jpg)\n\n"),
                GamaselaMaterialModel("Containers", "❖*box*\t:\t kotak\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS376_136501735-int.jpg)\n\n" +
                        "❖*packet*\t:\t paket\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS5008_101195570-int.jpg)\n\n" +
                        "❖*can*\t:\t kaleng minuman\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS375_120659763-int.jpg)\n\n" +
                        "❖*carton*\t:\t wadah dari karton\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS379_152028252-int.jpg)\n\n" +
                        "❖*tub*\t:\t wadah kotak\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS377_138111633-int_0.jpg)\n\n" +
                        "❖*bottle*\t:\t botol\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS380_153859468-int.jpg)\n\n" +
                        "❖*tin*\t:\t kaleng\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS382_183443226-int.jpg)\n\n" +
                        "❖*bowl*\t:\t mangkok\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS378_148327997-int.jpg)\n\n" +
                        "❖*jug*\t:\t kendi/teko\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS381_178002993-int.jpg)\n\n" +
                        "❖*jar*\t:\t wadah botol\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS374_120086955-int.jpg)\n\n" +
                        "❖*tube*\t:\t tabung\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS383_skd187295sdc-int.jpg)\n\n"),
                GamaselaMaterialModel("Football", "❖*pitch*\t:\t lapangan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS701_153525697-int.jpg)\n\n" +
                        "❖*centre cirle*\t:\t lingkaran tengah\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS704_166148365-int.jpg)\n\n" +
                        "❖*penalty box*\t:\t kotak pinalti\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS697_138038575-int.jpg)\n\n" +
                        "❖*corner flag*\t:\t bendera sudut\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS702_154424044-int.jpg)\n\n" +
                        "❖*cup*\t:\t piala\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS679_84591671-int.jpg)\n\n" +
                        "❖*whistle*\t:\t peluit\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS684_96223989-int.jpg)\n\n" +
                        "❖*goal*\t:\t tujuan/gawang/gol\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS703_159069122-int.jpg)\n\n" +
                        "❖*referee*\t:\t wasit\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS691_104774260-int.jpg)\n\n" +
                        "❖*linesman*\t:\t penjaga garis\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS686_99712424-int_0.jpg)\n\n" +
                        "❖*fan*\t:\t penggemar\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS700_149343957-int.jpg)\n\n" +
                        "❖*kit*\t:\t perlengkapan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS682_87570161-int.jpg)\n\n" +
                        "❖*team*\t:\t kelompok\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS677_78777203-int.jpg)\n\n"),
                GamaselaMaterialModel("Gardens", "❖*greenhouse*\t:\t rumah kaca\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS744_137864313-web-22404.jpg)\n\n" +
                        "❖*garage*\t:\t garasi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS749_155471243-web-22404.jpg)\n\n" +
                        "❖*flower*\t:\t bunga\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS742_104707181-web-22404.jpg)\n\n" +
                        "❖*gate*\t:\t gerbang\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS747_147710376-web-22404.jpg)\n\n" +
                        "❖*lawnmower*\t:\t mesin pemotong rumput\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS743_122399072-web-22404.jpg)\n\n" +
                        "❖*grass*\t:\t rumput\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS748_155333336-web-22404.jpg)\n\n" +
                        "❖*hammock*\t:\t tempat tidur gantung\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS5821_168344861-int-22404.jpg)\n\n" +
                        "❖*barbecue*\t:\t panggangan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS752_160958342-web-22404.jpg)\n\n" +
                        "❖*lawn*\t:\t halaman rumput\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS745_80701586-web-22404.jpg)\n\n" +
                        "❖*tree*\t:\t pohon\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS746_142276738-web-22404.jpg)\n\n" +
                        "❖*hedge*\t:\t pagar\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS4704_176461926-22404.jpg)\n\n"),
                GamaselaMaterialModel("Tools", "❖*rake*\t:\t penyapu rumput\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7406_ThinkstockPhotos-97479198-22396.jpg)\n\n" +
                        "❖*spade*\t:\t sekop\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7413_ThinkstockPhotos-111934526-22396.jpg)\n\n" +
                        "❖*nail*\t:\t paku\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3148_483170199a-22396.jpg)\n\n" +
                        "❖*ruler*\t:\t meteran\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7532_ThinkstockPhotos-640255038-22396.jpg)\n\n" +
                        "❖*hammer*\t:\t palu\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3148_483170199-22396.jpg)\n\n" +
                        "❖*utility knife*\t:\t pisau *cutter*\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3152_483205135-22396.jpg)\n\n" +
                        "❖*drill*\t:\t alat bor\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3060_466165173-22396.jpg)\n\n" +
                        "❖*saw*\t:\t gergaji\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7489_ThinkstockPhotos-516041479-22396.jpg)\n\n" +
                        "❖*spanner*\t:\t kunci pas\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7425_ThinkstockPhotos-140272733-22396.jpg)\n\n" +
                        "❖*screw*\t:\t sekrup\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7439_ThinkstockPhotos-157866701-22396.jpg)\n\n" +
                        "❖*pliers*\t:\t tang\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7472_ThinkstockPhotos-496552128-22396.jpg)\n\n" +
                        "❖*screwdriver*\t:\t obeng\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7481_ThinkstockPhotos-504424734-22396.jpg)\n\n"),
                GamaselaMaterialModel("Meat and Fish", "❖*beef*\t:\t daging sapi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/beef%201_0.jpg)\n\n" +
                        "❖*chicken*\t:\t daging ayam\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/Chicken.jpg)\n\n" +
                        "❖*duck*\t:\t daging bebek\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/Duck_0.jpg)\n\n" +
                        "❖*bacon*\t:\t daging babi asap\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/Bacon.jpg)\n\n" +
                        "❖*fish*\t:\t daging ikan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS899_157990167-int.jpg)\n\n" +
                        "❖*prawns*\t:\t udang\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS898_155219892-int.jpg)\n\n" +
                        "❖*crabs*\t:\t daging kepiting\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS888_91483687-int.jpg)\n\n" +
                        "❖*burgers*\t:\t daging *burger*\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS891_93233292-int.jpg)\n\n" +
                        "❖*sausage*\t:\t sosis\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS893_119628068-int.jpg)\n\n" +
                        "❖*ham*\t:\t daging babi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/Ham.jpg)\n\n"),
                GamaselaMaterialModel("Farm Animals", "❖*goat*\t:\t kambing\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS314_93209836-22388.jpg)\n\n" +
                        "❖*duck*\t:\t bebek\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS901_174388306-22388.jpg)\n\n" +
                        "❖*pig*\t:\t babi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS902_174392221-22388.jpg)\n\n" +
                        "❖*chicken*\t:\t ayam\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS890_93077566-22388.jpg)\n\n" +
                        "❖*horse*\t:\t kuda\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS315_93212393-22388.jpg)\n\n" +
                        "❖*dog*\t:\t anjing\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS318_117338084-22388.jpg)\n\n" +
                        "❖*rabbit*\t:\t kelinci\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS321_140467961-22388.jpg)\n\n" +
                        "❖*cat*\t:\t kucing\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS320_121684937-22388.jpg)\n\n" +
                        "❖*mouse*\t:\t tikus\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS322_147097126-22388.jpg)\n\n" +
                        "❖*cow*\t:\t sapi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS894_135697258-22388.jpg)\n\n" +
                        "❖*sheep*\t:\t domba\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3026_450576811-22388.jpg)\n\n"),
                GamaselaMaterialModel("Wild Animals", "❖*cheetah*\t:\t cetah\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6832_93209580-22400.jpg)\n\n" +
                        "❖*tiger*\t:\t harimau\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6831_93209560-22400.jpg)\n\n" +
                        "❖*panda*\t:\t panda\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6787_93216450-22400.jpg)\n\n" +
                        "❖*squirrel*\t:\t tupai\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS5590_ThinkstockPhotos-470919435-22400.jpg)\n\n" +
                        "❖*fox*\t:\t rubah\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6927_117313778-22400.jpg)\n\n" +
                        "❖*elephant*\t:\t gajah\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3515_529784041-22400.jpg)\n\n" +
                        "❖*lion*\t:\t singa\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3034_455624449-22400.jpg)\n\n" +
                        "❖*rhino*\t:\t badak\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6921_105927227-22400.jpg)\n\n" +
                        "❖*anteater*\t:\t trenggiling\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6789_93218211-22400.jpg)\n\n" +
                        "❖*polar bear*\t:\t beruang kutub\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2967_119841852-low-22400.jpg)\n\n" +
                        "❖*reindeer*\t:\t rusa kutub\n\n"+
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3853_93213623-22400.jpg)\n\n" +
                        "❖*budgie*\t:\t burung budgie\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS4898_101492203-22394.jpg)\n\n" +
                        "❖*swallow*\t:\t burung walet\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS323_155036952-22394.jpg)\n\n" +
                        "❖*cockroach*\t:\t kecoak\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS319_119783827-22394.jpg)\n\n" +
                        "❖*spider*\t:\t laba-laba\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3294_489814293-22394.jpg)\n\n" +
                        "❖*crab*\t:\t kepiting\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6942_144874275-22394.jpg)\n\n" +
                        "❖*beetle*\t:\t kumbang\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3116_481910467-22394.jpg)\n\n" +
                        "❖*frog*\t:\t katak\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6928_117318017-22394.jpg)\n\n" +
                        "❖*millipede*\t:\t kaki seribu\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6065_492701398-22394.jpg)\n\n" +
                        "❖*penguin*\t:\t pinguin\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6788_93216785-22394.jpg)\n\n" +
                        "❖*flea*\t:\t kutu\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS2937_92377818-22394.jpg)\n\n" +
                        "❖*dove*\t:\t merpati\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6559_475685008-22394.jpg)\n\n"),
                GamaselaMaterialModel("Christmast In UK", "❖*santa*\t:\t santa\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3860_154402027-int.jpg)\n\n" +
                        "❖*reindeer*\t:\t rusa kutub\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3853_93213623-int.jpg)\n\n" +
                        "❖*sleigh*\t:\t kereta luncur\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3852_90937313-int.jpg)\n\n" +
                        "❖*snowman*\t:\t manusia salju\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3862_200210347-001-int.jpg)\n\n" +
                        "❖*tinsel*\t:\t perada\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3859_153515587-int.jpg)\n\n" +
                        "❖*holly*\t:\t daun holly\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3858_152515996-int.jpg)\n\n" +
                        "❖*mince pie*\t:\t kue pastel berisi manisan\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3855_119212178-int.jpg)\n\n" +
                        "❖*christmas pudding*\t:\t puding natal\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3856_135219542-int.jpg)\n\n" +
                        "❖*present*\t:\t hadiah\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3857_140057651-int.jpg)\n\n" +
                        "❖*christmas tree*\t:\t pohon natal\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS5041_78818440-int.jpg)\n\n" +
                        "❖*cracker*\t:\t *cracker* natal\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3854_95248177-int.jpg)\n\n" +
                        "❖*stocking*\t:\t kaus kaki\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3861_177058328-int.jpg)\n\n"),
                GamaselaMaterialModel("Fruit", "❖*pomegranate*\t:\t delima\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7415_ThinkstockPhotos-119503418-22389.jpg)\n\n" +
                        "❖*cherry*\t:\t ceri\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7477_ThinkstockPhotos-502380215-22389.jpg)\n\n" +
                        "❖*guava*\t:\t jambu biji\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7453_ThinkstockPhotos-188069750-22389.jpg)\n\n" +
                        "❖*nectarine*\t:\t nectarine\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7456_ThinkstockPhotos-472095722-22389.jpg)\n\n" +
                        "❖*watermelon*\t:\t semangka\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7434_ThinkstockPhotos-150866319-22389.jpg)\n\n" +
                        "❖*lychee*\t:\t leci\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7534_ThinkstockPhotos-642217096-22389.jpg)\n\n" +
                        "❖*blueberry*\t:\t beri biru\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS6601_466225445-22389.jpg)\n\n" +
                        "❖*kiwi*\t:\t kiwi\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7524_ThinkstockPhotos-624288452-22389.jpg)\n\n" +
                        "❖*clementine*\t:\t jeruk nipis\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7480_ThinkstockPhotos-504384796-22389.jpg)\n\n" +
                        "❖*passion fruit*\t:\t markisa\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS3282_489649175-22389.jpg)\n\n" +
                        "❖*papaya*\t:\t pepaya\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7531_ThinkstockPhotos-639744008-22389.jpg)\n\n" +
                        "❖*fig*\t:\t buah ara\n\n" +
                        "\n![](https://gamedata.britishcouncil.org/sites/default/files/attachment/RS7526_ThinkstockPhotos-628525716-22389.jpg)\n\n"),
        )))

        topics.value = topicModels
    }

    fun getTopics(): LiveData<ArrayList<GamaselaTopicModel>> {
        return topics
    }
}