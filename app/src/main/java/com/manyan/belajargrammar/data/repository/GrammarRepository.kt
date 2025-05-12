// data/GrammarRepository.kt
package com.manyan.belajargrammar.data.repository

import com.manyan.belajargrammar.data.model.GrammarContent
import com.manyan.belajargrammar.data.model.Section

object GrammarRepository {
    val grammarList = listOf(
        GrammarContent(
            route = "Adjective", title = "Adjective", useCases = listOf(
                Section(
                    title = "Pengertian", content = listOf(
                        """
                        Apa itu Kata Sifat yang dalam bahasa Inggris di sebut Adjective ?
                        Pengertian kata sifat atau adjectives adalah kata yang berfungsi untuk memberikan informasi lebih dari suatu kata benda (noun).

                        Kata sifat dalam bahasa Inggris pun dapat menggambarkan atau memodifikasi kata ganti (pronoun). Contoh kata sifat (adjektif) adalah beautiful (cantik), old (tua),elegant (anggun), blue (biru), dan easy (mudah).

                        Selain itu, kata sifat juga mampu mendeskripsikan kuantitas dari suatu kata benda. Contoh kata sifat tipe ini di antaranya many, few, dan hundreds.
                        
                        Bagaimana Cara Membedakan Adjectives dan Adverbs?
                        Perbedaan adjektiva dan adverbia dapat dilihat dari fungsi dan juga komponen lain yang mengikutinya. Berikut beberapa perbedaan kata sifat (adjective) dan kata keterangan (adverb):

                        1. Kata sifat berperan sebagai tambahan informasi untuk noun (baik subjek ataupun objek) serta pronoun, sedangkan adverb berfungsi untuk menjelaskan verb, adverb, dan adjective.

                        2. Kata adjektiva selalu diikuti dengan to be atau kata kerja bantu seperti is, am, are, was, were, be, been, dan to be.

                        3. Adjektiva dalam kalimat biasanya diikuti oleh senses of verb yang berperan sebagai linking verb atau auxiliary verb, yang mana ini berlaku saat menjelaskan noun atau pronoun sebagai subjek kalimat.

                        Contoh senses of verb adalah taste, seem, sound, smell, look, feel dan lain sebagainya. Oh ya, sense of verb adalah suatu kata yang bisa dilakukan oleh panca indra makhluk hidup, guys.

                        4. Secara umum, adverb bentuknya bisa jadi adjective jika pada akhir kata ditambah akhiran –ly. Sebagai contohnya quick (adjective) menjadi quickly (adverb), sad (adjective) menjadi sadly (adverb), simple (adjective) menjadi simply (adverb), final (adjective) menjadi finally (adverb), dan lain sebagainya.
                        
                        Apa Perbedaan Adjectives dengan Verb?
                        Metode yang akan mempermudah kamu dalam belajar perbedaan adjectives dan verb adalah dengan sering membaca dan menganalisis sebuah kalimat. Tapi, di bawah ini Aku bakal kasih kamu bocorannya, kok. Ini dia perbedaan kata sifat dan kata kerja dalam bahasa Inggris:

                        1. Verb adalah action word yang menyatakan adanya suatu aktivitas dari subjek. Sementara itu, adjective hanyalah kata keterangan.

                        2. Kata sifat memberi tahu kita lebih banyak tentang noun, sedangkan kata kerja memberikan kita pemaparan lebih tentang kondisi, pengalaman, pikiran, atau keadaan suatu subjek.
                        
                        Jenis-Jenis Kata Sifat Bahasa Inggris 
                        Ada 7 jenis kata sifat dalam bahasa Inggris yang harus kamu pahami.

                        Jenis-jenis adjectives tersebut adalah absolute adjectives, attributive and predicative adjectives, appositive adjectives, comparative and superlative adjectives, compound adjectives, demonstrative adjectives, denominal adjectives, dan participial adjectives.

                        Yuk, pahami masing-masing penjelasan beserta contohnya di bawah ini!
                        
                        1. Absolute Adjectives
                        Absolute adjectives adalah sekelompok kata sifat yang tidak memiliki perbandingan atau sudah merupakan gambaran yang paling tinggi. Contoh kata sifat bahasa Inggris dengan bentuk absolute adjectives:

                        - The girl is dead. (Gadis itu meninggal)
                        - Jack is alive. (Jack hidup)
                        - Henry is starving. (Henry kelaparan)
                        - Dinosaurs are extinct. (Dinosaurus punah)
                         
                        Contoh kata sifat di atas adalah kata sifat absolut karena tidak dapat dibandingkan. Kita tidak bisa mengatakan, “That boy is deader than the girl” (anak laki-laki itu lebih meninggal daripada gadis itu).

                        Kita tidak bisa mengatakan seseorang is deader (lebih meninggal) daripada seseorang. Kita juga tidak bisa mengatakan seseorang is the deadest (paling meninggal) dalam sekelompok kata benda.
                        
                        Kita bisa mengatakan bahwa absolute adjectives berada di tingkatan yang sama dengan superlative adjectives. Tapi, kita bisa memberi ukuran terhadap absolute adjectives dengan menambahkan adverb (kata yang menggambarkan kata kerja) bermakna “hampir”: almost, nearly, dan virtually. Berikut contohnya dalam sebuah kalimat adjective:

                        - “Alex is almost dead.” (Alex hampir meninggal.)
                        - “Elephants are nearly extinct.” (Gajah-gajah hampir punah)
                        
                        2. Attributive and Predicative Adjectives
                        Attributive adjectives biasanya ada sebelum kata benda, dan berfungsi untuk menggambarkan atau mengubah keadaan kata benda tersebut menjadi lebih rinci, tanpa adanya linking verb. Contohnya seperti kalimat adjective di bawah ini:

                        - “I was very angry hours ago.” (Luna sangat marah beberapa jam yang lalu)
                        - “I love my fat cat.” (Aku suka kucing gemukku.)
                        - “What a kindhearted guy, he is.” (Sungguh pria yang baik hati)
                        - “I adore my handmade jug from Bali.” (Aku sangat menyukai kendi buatan tangan dari Bali)
                        - “We discussed about moving last week. The discussion was very bad, rash, and wasting time.” (Kami berdiskusi tentang pindahan minggu yang lalu. Diskusi itu sangat buruk, terburu-buru dan buang-buang waktu)
                         

                        Dari contoh di atas, bisa kita lihat bersama-sama, kata sifat fat merupakan attributive adjective karena posisinya berada di sebelum kata benda cat, dan memberi gambaran yang merinci.

                        Kemudian, predicative adjectives adalah kata sifat yang biasanya tidak muncul sebelum kata benda, melainkan muncul setelah adanya linking verb (be, become, grow, look, atau seem). Perhatikan contoh kalimat adjective berikut:
                        - Her answers are correct.
                        - The situation became tense quickly.
                        - She grew cold toward him
                        - That dress looks beautiful on you
                        - They seemed bored at the party
                    """.trimIndent()
                    )
                )
            ), signalWords = listOf("beautiful", "quick", "happy")
        ),
        GrammarContent(
            route = "Adverb", title = "Adverb", useCases = listOf(
                Section(
                    title = "Pengertian", content = listOf(
                        """
                      Apa yang Dimaksud dengan Adverb?
                      Adverb adalah kata keterangan atau kata tambahan yang memberikan gambaran lebih jelas dan detail untuk verb (kata kerja), adjective (kata sifat), atau adverb yang lainnya. Beberapa kata keterangan juga dapat memodifikasi frasa, klausa, atau bahkan memodifikasi keseluruhan kalimat.
                      
                      Apa Fungsi dari Adverb? Seperti pada penjelasan di atas, adverb berfungsi untuk menjelaskan kata kerja, kata sifat, sentence, noun phrase, atau adverb yang lainnya. Jadi kalau kamu bertanya, kapan harus menggunakan adverb? Yap, kamu dapat menggunakannya untuk memberikan informasi yang lebih jelas sesuai dengan tujuan dari kalimat itu sendiri sebagai contoh.
                      - Untuk menerangkan kata kerja ? Sintya can run fast atau You speak Japanese fluently
                      - Untuk menerangkan kata sifat ? I am very happy atau Angga Yunanda is very handsome
                      - Untuk menerangkan kata keterangan lainnya ? Sintya can run very fast atau They walk too slow
                      
                      Ada berapa jenis-jenis Adverb dalam Bahasa Inggris?
                      1. Adverb of Manner, ini digunakan untuk menerangkan suatu pekerjaan atau cara terjadinya sebuah peristiwa, dibentuk dari kata sifat dengan menambahkan akhiran -ly
                         - Easily       - Carefully
                         - Quickly      - Loudly
                         - Slowly       - Fluently
                      2. Adverb of Place, digunakan untuk menerangkan tempat terjadinya suatu peristiwa seperti (At home, In Solo, Here, There dsb)
                      3.Adverb of Time, digunakan untuk menerangkan waktu terjadinya suatu peristiwa seperti (At 5 o'clock, A week ago, Every night, In the morning)
                      4.Adverb of Frequecy, digunakan untuk menerangkan seberapa sering kita melakukan suatu kegiatan dalam kehidupan sehari-hari seperti (Always, Usually, Often, Seldom, Sometimes, Never)
                      
                      Pembentukan Adverb pada umumnya dibentuk dengan menambahkan akhiran (-ly) pada kata sifat. Tetapi ada juga beberapa kata keterangan yang bentuknya sama dengan kata sifat seperti (bad - badly, correct - correctly, loud - loudly)
                    """.trimIndent()
                    )
                )
            ), signalWords = listOf("quickly", "silently", "often")
        ),
        GrammarContent(
            "verbs", "Verbs", useCases = listOf(
                Section(
                    "Pengertian Verbs", content = listOf(
                        """
                        Apa Fungsi Verb (Kata Kerja)?
                        Verb atau kata kerja dapat berfungsi untuk menceritakan tentang apa yang terjadi pada subjek sehingga sebuah klausa atau kalimat dapat menghasilkan makna utuh. Tanpa verb, kamu tidak dapat menyampaikan sebuah pemikiran atau gagasan pada lawan bicara.

                        Misalnya, kamu hari ini diajak nonton bareng bersama sahabat. Tetapi, kamu sudah menonton film tersebut bersama keluarga di hari Minggu. Dalam bahasa Inggris, kamu dapat menyampaikannya dengan kalimat “I already watched the movie with my family on Sunday.”

                        Dari contoh di atas, kata watched (menonton) merupakan kata kerja (verb) untuk mengungkapkan kejadian yang sudah terjadi di waktu lampau, atau biasa disebut juga sebagai verb 2.

                        Yap, di sana, “watched” bertugas untuk memberi tahu apa hal yang dilakukan oleh subjek kalimat.

                        Penggunaan kata kerja atau verb ini penting, guys, baik dalam writing dan speaking berbahasa Inggris. Nah, setidaknya dalam satu kalimat pasti terdapat satu kata kerja (verb) ya!
                        
                        Apa saja jenis-jenis verb dalam bahasa inggris dan bagaimana penggunaannya ?
                        1. Action Verbs, kata kerja yang merujuk pada tindakan yang kamu lakukan dan bisa terlihat oleh orang lain seperti (I swim with my nieces, We run this morning, They are talking about the new math teacher) selain aksi nyata, action verbs meliputi berbagai kenyataan yang didasari oleh pikiran dan perasaan kamu seperti (I consider to let him go, We change the vacation schedule,They ignore us).
                        2. Stative Verbs, kata kerja ini adalah kebalikan dari Action verbs dengan kata lain mendeskripsikan keadaan subjek yang mengandalkan persaan seperti (I love you, We want you to accompany us too, You like to eat sandwiches, We dislike any disruption)
                        3. Transitive verbs, kata kerja yang menerangkan direct object (objek langsung) yang telah dilakukan oleh subjek seperti (James kicked the ball, The wealthy man bought three paintings,She baked the banana bread)
                        4. Intransitive verb, kata kerja yang tidak menerangkan direct object (objek langsung) dari apa yang dilakukan oleh subjek seperti (She lives in a quiet neighborhood, I slept all day)
                        5. Linking verbs, kata kerja yang berfungsi sebagai penghubung antara subjek dan informasi lebih lanjut tentang subjek tersebut seperti (Appear, Become, Feel, Get, Grow)
                    """.trimIndent()
                    )
                ),
            ), signalWords = listOf(
                """
                Bring - Membawa
                Buy - Membeli
                Eat - Makan
                Drink - Minum
                Read - Membaca
                Write - Menulis
                Go - Pergi
                Walk - Berjalan
            """.trimIndent()
            )

            // Tambahkan data grammar lainnya sesuai kebutuhan
        ),
        GrammarContent(
            "nouns", "Noun", useCases = listOf(
                Section(
                    "Pengertian Noun", content = listOf(
                        """
                        What is noun? Kalau mengutip dari Grammarly, noun adalah kata yang menamai sesuatu, seperti orang, tempat, benda, bahkan ide  atau gagasan.

                        Dalam sebuah kalimat, kata benda dapat berperan sebagai subjek, objek langsung, dan objek tidak langsung dari sebuah klausa, serta memungkinkan menjadi pelengkap subjek atau pelengkap objek.
                   
                        For your information, noun berfungsi untuk menamai semua benda dan konsep di dunia, entah itu yang terlihat secara fisik atau bersifat abstrak. Jika kamu masih ingat, menurut Kamus Besar Bahasa Indonesia,  noun adalah kata nomina.

                        Salah satu ciri khas dari noun adalah tidak dapat digabungkan dengan kata “tidak”. Mari kita lihat contoh di bawah ini:

                        Person (orang): Azka, cousin, lawyer, teacher
                        Place (tempat): Bandung, bedroom, class, country
                        Thing (benda): Pen, pencil, laptop, fan
                        Idea (gagasan): Kindness, faith, joy, success
                         

                        Yuk, kita ambil salah satu contoh kata benda di atas lalu gabungkan dengan kata “tidak”. Misal bedroom, apakah ia dapat berubah menjadi “tidak bedroom” alias “tidak tempat tidur?” Yap, “tidak tempat tidur” nggak memiliki arti, sehingga kita nggak bisa menggabungkan noun dengan kata “tidak."
                    """.trimIndent()
                    )
                ),
            ), signalWords = listOf(
                """
                Jenis-Jenis Noun dalam bahasa Inggris (Types of Nouns)
                - Common Noun and Proper Noun
                - Countable and Uncountable Noun, plus Mixed Noun
                - Abstract and Concrete Noun
                - Singular dan Plural Noun, serta Collective Noun
                - Compound Noun and Noun Phrase
                - Possessive Noun
                
                Fungsi Noun dalam bahasa Inggris
                Kalau kamu masih ingat, di bagian pengertian noun sudah disebutkan bahwa ada beberapa fungsi dari noun. Berikut contoh-contoh kalimatnya:

                1. Subject (kata benda yang digunakan sebagai subjek)
                Life is wonderful.

                2. Object (objek)
                Tere Liye has published his new book.

                3. Object of Preposition (objek preposisi)
                We are going to fly to Jakarta tomorrow.

                4. Subjective Complement (penjelasan subjek)
                He is Jeffry.

                5. Objective Complement (penjelasan objek)
                Rani named her cat Pororo.
            """.trimIndent()
            )

            // Tambahkan data grammar lainnya sesuai kebutuhan
        ),
        GrammarContent(
            "pronouns",
            "Pronouns",
            useCases = listOf(
                Section(
                    "Pengertian Pronouns",
                    content = listOf(
                        """
                       Pronoun adalah kata yang digunakan untuk menggantikan noun (kata benda) dalam kalimat. Tujuannya adalah untuk menghindari pengulangan kata benda yang sama, sehingga kalimat menjadi lebih ringkas dan efektif.
                       - "Devi is my friend. Devi lives in Bandung. Devi is kind." Kalimat ini bisa di sederhanakan menjadi "Devi is my friend. She lives in Bandung. She is kind."
                       
                       Apa saja Fungsi Pronoun
                       - Menghindari repetisi: Menggantikan noun yang telah disebutkan sebelumnya.
                       - Meningkatkan kejelasan: Mempermudah pemahaman kalimat.
                       - Mempercepat komunikasi: Membuat kalimat lebih ringkas.
                       
                       Jenis-Jenis Pronoun :
                       - Personal Pronoun, Digunakan untuk menggantikan orang atau benda secara spesifik seperti Subjek: I, you, he, she, it, we, they dan seperti Objek: me, you, him, her, it, us, them Contoh: "She is reading a book.", "I saw them at the park.".
                       - Possessive Pronoun, Menunjukkan kepemilikan yang Berdiri sendiri seperti : mine, yours, his, hers, ours, theirs dan Sebagai adjektiva: my, your, his, her, its, our, their Contoh : "This book is mine." & "That is her car.".
                    """.trimIndent()
                    )
                ),
            ),
            signalWords = listOf(
                """
                Tips Penggunaan Pronoun
                - Pastikan pronoun sesuai dengan gender, jumlah, dan posisi dalam kalimat.
                - Hindari penggunaan pronoun yang ambigu atau membingungkan.
                - Gunakan pronoun untuk menjaga kelancaran dan kejelasan dalam komunikasi.
            """.trimIndent()
            )

            // Tambahkan data grammar lainnya sesuai kebutuhan
        ),
        GrammarContent(
            "interjection",
            "Interjection",
            useCases = listOf(
                Section(
                    "Pengertian Interjection",
                    content = listOf(
                        """
                        Dalam percakapan sehari-hari, kita sering kali menggunakan kata-kata spontan untuk mengekspresikan perasaan seperti kegembiraan, kejutan, atau kekecewaan. Dalam bahasa Inggris, kata-kata tersebut dikenal sebagai interjection atau kata seru.
                        
                        Apa Itu Interjection?
                        Interjection adalah kata atau frasa pendek yang digunakan untuk mengungkapkan emosi atau reaksi secara spontan. Meskipun sering kali berdiri sendiri, interjection dapat memberikan nuansa emosional pada kalimat. Contoh umum termasuk:
                        - Wow! – menyatakan kekaguman
                        - Oops! – menunjukkan kesalahan kecil
                        - Yay! – mengekspresikan kegembiraan
                        - Ouch! – mengindikasikan rasa sakit
                        
                        Jenis-Jenis Interjection, Interjection dapat dikategorikan berdasarkan fungsi dan konteks penggunaannya
                        1. Emotional Interjections, Digunakan untuk mengekspresikan perasaan seperti kegembiraan, kekaguman, atau kejutan(Contoh: Wow!, Awesome!, Yay!, Oh yeah!).
                        2. Censorial Interjections, Mengungkapkan ketidaksetujuan, kekecewaan, atau rasa sakit(Contoh: Ouch!, Oh no!, Argh!).
                        3. Exclamatory Interjections, Menunjukkan kehebohan atau reaksi spontan terhadap sesuatu yang mengejutkan(Contoh: Eureka!, Wowza!, Hurrah!).
                        4. Volitional Interjections, Digunakan untuk menarik perhatian atau menyampaikan permintaan(Contoh: Hey!, Hmm, Please!).
                    """.trimIndent()
                    )
                ),
            ),
            signalWords = listOf(
                """
                Tips Penggunaan Interjection
                - Gunakan secara tepat: Pastikan interjection sesuai dengan emosi yang ingin disampaikan.
                - Hindari berlebihan: Penggunaan yang terlalu sering dapat mengurangi efektivitasnya.
                - Perhatikan konteks: Interjection lebih cocok digunakan dalam situasi informal.
                - Penekanan maksud: Gunakan untuk menambahkan penekanan pada pernyataan atau reaksi.
            """.trimIndent()
            )

            // Tambahkan data grammar lainnya sesuai kebutuhan
        ),
        GrammarContent(
            "preposition",
            "Preposition",
            useCases = listOf(
                Section(
                    "Pengertian Preposition",
                    content = listOf(
                        """
                        Preposition atau kata depan adalah kata yang digunakan untuk menunjukkan hubungan antara kata benda (noun), kata ganti (pronoun), atau frasa benda dengan bagian lain dalam kalimat. Preposisi membantu menjelaskan arah, lokasi, waktu, atau hubungan lainnya dalam sebuah kalimat.
                        Contoh : 
                            - The book is on the table.
                        Jenis-Jenis Preposition
                        - Preposition of Direction (Preposisi Arah) yang Digunakan untuk menunjukkan arah atau tujuan dari suatu tindakan.
                          * She walked towards the park.
                        - Preposition of Time (Preposisi Waktu) yang Digunakan untuk menunjukkan waktu atau periode tertentu dalam suatu kalimat.
                          * We will meet at 5 p.m.
                        - Preposition of Place (Preposisi Tempat) Menunjukkan lokasi atau posisi suatu objek.
                          * The keys are under the pillow.
                    """.trimIndent()
                    )
                ),
            ),
            signalWords = listOf(
                """
                Tips Penggunaan Preposition
                - Konsistensi: Gunakan preposisi yang tepat sesuai dengan konteks kalimat.

                - Kolokasi: Beberapa kata kerja, kata sifat, atau kata benda memiliki preposisi yang umum digunakan bersamanya (collocations).

                - Latihan: Perbanyak latihan dengan membuat kalimat menggunakan berbagai preposisi untuk memahami penggunaannya secara kontekstual.

                Dengan memahami dan menguasai penggunaan preposisi, Anda dapat membentuk kalimat yang lebih tepat dan alami dalam Bahasa Inggris. Semoga rangkuman ini bermanfaat untuk pengembangan kemampuan bahasa Anda!
            """.trimIndent()
            )

            // Tambahkan data grammar lainnya sesuai kebutuhan
        ),
        GrammarContent(
            "conjunction",
            "Conjunction",
            useCases = listOf(
                Section(
                    "Pengertian Conjunction",
                    content = listOf(
                        """
                        Conjunction adalah kata yang digunakan untuk menghubungkan dua atau lebih elemen dalam kalimat, seperti kata dengan kata, frasa dengan frasa, atau klausa dengan klausa. Penggunaan conjunction membantu dalam menyusun kalimat yang lebih kompleks dan menghindari pengulangan kata yang tidak perlu.
                        Contoh Tanpa Conjunction :
                        - "I like reading. I like writing. I don't like studying."
                        Contoh Dengan Conjunction : 
                        - "I like reading and writing, but I don't like studying."
                        
                        Jenis-Jenis Conjunction
                        Coordinating conjunctions digunakan untuk menghubungkan elemen yang setara dalam kalimat, seperti kata dengan kata, frasa dengan frasa, atau klausa dengan klausa. Tujuh kata utama dalam kategori ini dapat diingat dengan akronim FANBOYS(For, And, Nor, But, Or, Yet, So)
                        
                        Subordinating conjunctions menghubungkan klausa independen dengan klausa dependen, menunjukkan hubungan seperti waktu, sebab-akibat, kondisi, atau tujuan. Beberapa contoh subordinating conjunctions meliputi (Because, Although, If, When, Since)
                        
                        Correlative conjunctions adalah pasangan kata yang bekerja bersama untuk menghubungkan dua elemen yang memiliki struktur gramatikal yang sama. Beberapa pasangan correlative conjunctions yang umum digunakan antara lain (Both..and.., Either..Or.., Neither..nor.., Not only..but also..)
                        
                    """.trimIndent()
                    )
                ),
            ),
            signalWords = listOf(
                """
                   Tips Penggunaan Conjunction
                        - Pastikan elemen yang dihubungkan oleh conjunction memiliki struktur gramatikal yang setara.

                        - Gunakan koma sebelum coordinating conjunction jika menghubungkan dua klausa independen.

                        - Hindari penggunaan conjunction yang berlebihan dalam satu kalimat untuk menjaga kejelasan.
                        
                    Dengan memahami dan menguasai penggunaan berbagai jenis conjunction, Anda dapat menyusun kalimat dalam Bahasa Inggris yang lebih kompleks dan efektif, serta meningkatkan kemampuan komunikasi tertulis maupun lisan.
            """.trimIndent()
            )

            // Tambahkan data grammar lainnya sesuai kebutuhan
        ),
    )

    fun getByTitle(title: String): GrammarContent? =
        grammarList.find { it.title.equals(title, ignoreCase = true) }
}
