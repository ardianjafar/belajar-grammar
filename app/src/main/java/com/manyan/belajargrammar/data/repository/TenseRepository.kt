// data/TenseRepository.kt
package com.manyan.belajargrammar.data.repository

import com.manyan.belajargrammar.data.model.Section
import com.manyan.belajargrammar.data.model.TensesContent

object TenseRepository {
    val tenses = listOf(
        TensesContent(
            route = "simple_present",
            title = "Simple Present",
            useCases = listOf(
                Section(
                    title = "Pengertian Simple Present Tense",
                    content = listOf(
                        """
                            Simple present tense adalah bentuk tense yang paling umum digunakan dalam kehidupan sehari-hari. Biasanya, simple present tense digunakan untuk mengungkapkan fakta, menceritakan suatu kejadian, atau kebiasaan yang terjadi di masa sekarang.
                            Present itu artinya apa? Present dalam simple present tense artinya “masa kini”, kemudian simple artinya sederhana, dan tense adalah bentuk kata kerja sesuai periode waktu yang digunakan.
                            Present tense digunakan ketika seseorang hendak mengungkapkan suatu peristiwa atau fakta umum yang terjadi saat ini. Selain itu, simple present tense juga digunakan dalam pola kalimat conditional sentence type 0 dan conditional sentence type 1 yang diikuti dengan simple future tense.
                        """.trimIndent()
                    ),
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf(
                        """
                        (+) I am an international school student (saya adalah seorang mahasiswa)
                        (-) She is not an international school student (dia bukan seorang mahasiswa)
                        (?) Is she an international school student? (apakah dia seorang mahasiswa?) 
                    """.trimIndent()
                    )
                ),
            ),
            signalWords = listOf(
                """
                - Always -> I always wake up at 6 a.m.
                - Sometimes -> I sometimes wake up at 6 a.m.
                - Often -> I often wake up at 6 a.m.
                - Never -> I never wake up at 6 a.m.
                - Usually -> I usually wake up at 6 a.m.
                - Occasionally -> I occasionally wake up at 6 a.m.
                - Rarely -> I rarely wake up at 6 a.m.
                - Mostly -> I mostly wake up at 6 a.m.
            """.trimIndent()
            )
        ),
        TensesContent(
            route = "present_continuous",
            title = "Present Continuous",
            useCases = listOf(
                Section(
                    title = "Pengertian Simple Present Continuous",
                    content = listOf(
                        """
                            Arti present yaitu masa sekarang, jadi, pengertian present continuous tense adalah bentuk tense yang dapat kamu gunakan untuk menjelaskan sesuatu atau menyatakan aksi yang sedang berlangsung selama waktu tertentu pada masa sekarang (present).
                            Berdasarkan salah satu contoh kalimat yang sudah kita bahas di awal, kalau dalam bahasa Indonesia, tenses ini dipakai untuk menunjukkan aktivitas yang sedang dilakukan, biasa ditandai dengan kata “lagi” atau “sedang”. Bentuk ini menunjukkan bahwa aksi tersebut terjadi sebelum (begins before), selama (is in progress at the present), dan berlanjut setelah (continues after) waktu atau aksi lainnya. 
                        """.trimIndent()
                    )
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf(
                        """
                        (+) She is reading a romance novel right now. (Dia sedang membaca buku sekarang.)
                        (-) They are not eating the cake. (Mereka tidak sedang memakan kue.)
                        (?) Are we going to the beach this weekend? (Apakah kita akan pergi ke pantai akhir pekan ini?)
                    """.trimIndent()
                    )
                ),
            ),
            signalWords = listOf(
                """
                - Now -> She is now reading a romance novel.
                - Currently -> They are currently eating the cake.
                - Right now -> We are right now going to the beach.
                - At the moment -> Are we at the moment going to the beach?
                - At this moment -> They are at this moment eating the cake.
                - At the time -> She is at the time reading a romance novel.
                - At the time -> We are at the time going to the beach.
                - These days -> They are these days eating the cake.
                - Today -> She is today reading a romance novel.
                - Today -> We are today going to the beach.
            """.trimIndent()
            )
        ),
        TensesContent(
            "present_perfect",
            "Present Perfect",
            useCases = listOf(
                Section(
                    title = "Pengertian Present Perfect",
                    content = listOf(
                        """
                        Present perfect tense adalah suatu pola kalimat dengan perubahan bentuk kata kerja yang digunakan untuk menyatakan/mengungkapkan suatu aksi/peristiwa masa lalu yang masih berlanjut sampai sekarang.
                        
                        Jadi, peristiwanya baru saja terjadi, tapi hasil atau akibat dari peristiwa tersebut masih bisa terlihat dan masih bisa dirasakan pada saat pembicaraan terjadi.

                        Selain itu, tenses ini biasanya digunakan untuk menunjukkan peristiwa atau membahas tentang pengalaman/perubahan yang berkaitan dengan suatu tempat.
                    """.trimIndent()
                    )
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf("""
                        (+) You have been a creative writer since 2018. (Kamu telah menjadi seorang penulis kreatif sejak tahun 2018.)
                        (-) We have not been hungry. (Kita belum merasa lapar.)
                        (?) Has she been very busy this week? (Apakah dia sangat sibuk pekan ini?)
                    """.trimIndent())
                ),
            ),
            listOf("""
                - Just -> You have just been a creative writer.
                - Last -> We have last been hungry.
                - Ever -> Has she been very busy this week?
                - Ever -> We have ever been hungry.
                - Yet -> You have yet been a creative writer.
                - Since -> We have since been hungry.
                - Since -> Has she been very busy this week?
                - For -> You have for been a creative writer. 
            """.trimIndent())
        ),
        TensesContent(
            "present_perfect_continuous",
            "Present Perfect Continuous",
            useCases = listOf(
                Section(
                    title = "Pengertian Present Perfect Continuous",
                    content = listOf(
                        """
                            Present perfect continuous tense adalah suatu bentuk kata kerja atau tenses untuk menyatakan aksi yang telah selesai pada suatu titik di masa lampau, atau tindakan yang sudah dimulai di masa lalu, tetapi tindakan tersebut masih terjadi/berlanjut sampai masa sekarang.
                            Tindakan pada present perfect continuous tense biasanya berdurasi waktu tertentu dan ada kaitannya dengan kondisi sekarang.
                        """.trimIndent()
                    )
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf("""
                        (+) I have been thinking about it.
                        (-) I have not been thinking about it.
                        (?) Has she been thinking about it?
                    """.trimIndent())
                ),
            ),
            listOf("""
                - Since -> I have since been thinking about it.
                - For -> I have for been thinking about it.
                - All day -> Has she been all day thinking about it?
                - Lately -> I have lately been thinking about it.
                - Up to now -> I have up to now been thinking about it.
                - Recently -> Has she been recently thinking about it?
                - All week -> I have all week been thinking about it.
            """.trimIndent())
        ),
        TensesContent(
            "simple_past",
            "Simple Past",
            useCases = listOf(
                Section(
                    title = "Pengertian Simple Past Tense",
                    content = listOf( """
                        You’re right, simple past tense ini adalah kebalikan dari simple present tense. Dalam hal ini, simple past tense digunakan untuk menceritakan suatu kejadian, kebiasaan, menyatakan fakta, atau situasi yang terjadi di masa lampau. Tense ini menggunakan kata kerja bentuk kedua atau lampau. Kata keterangan waktu yang biasa digunakan dalam tense ini adalah yesterday, two days ago, dan masih banyak lagi.
                    """.trimIndent()
                    )
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf("""
                        (+) They called their friends yesterday.
                        (-) They did not call their friends  yesterday.
                        (?) Did they call their friends yesterday?
                    """.trimIndent())
                ),
            ),
            listOf("""
                - Yesterday -> They called their friends yesterday.
                - Two days ago -> They did not call their friends  yesterday.
                - Last week -> Did they call their friends yesterday?
                - Last month -> They called their friends  yesterday.
                - Last year -> They did not call their friends  yesterday.
                - Last night -> Did they call their friends yesterday?
                - Last day -> They called their friends  yesterday.
                - Lastweek -> They did not call their friends  yesterday.
            """.trimIndent())
        ),
        TensesContent(
            "past_continuous",
            "Past Continuous",
            useCases = listOf(
                Section(
                    title = "Pengertian Past Continuous",
                    content = listOf("""
                        Sedikit lebih kompleks, menurut fungsinya, past continuous tense merupakan bentuk tense untuk menceritakan kejadian yang sedang terjadi di masa lampau. Tetapi, nggak cuma satu, past continuous tense juga dapat digunakan untuk menceritakan dua kejadian yang sedang terjadi di masa lampau. Jadi, ada satu aktivitas dibarengi dengan aktivitas yang lain.
                    """.trimIndent()
                    )
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf("""
                        (+) I was washing my clothes when the phone rang.
                        (-) I was not washing my clothes when the phone rang.
                        (?) Was I washing my clothes when the phone rang?
                    """.trimIndent())
                ),
            ),
            listOf("""
                - Yesterday -> I was washing my clothes when the phone rang.
                - Last week -> I was not washing my clothes when the phone rang.
                - Last month -> Was I washing my clothes when the phone rang?
                - Last year -> I was washing my clothes when the phone rang.
                - Last night -> I was not washing my clothes when the phone rang.
                - Last day -> Was I washing my clothes when the phone rang?
                - Lastweek -> I was washing my clothes when the phone rang.
                - Lastmonth -> I was not washing my clothes when the phone rang.
            """.trimIndent())
        ),
        TensesContent(
            "past_perfect",
            "Past Perfect",
            useCases = listOf(
                Section(
                    title = "Pengertian Past Perfect Tense",
                    content = listOf("""
                        Past perfect tense digunakan untuk menyatakan suatu kejadian yang terjadi sebelum waktu tertentu di masa lampau. Seringkali, past perfect tense lebih menaruh penekanan pada fakta bahwa sesuatu sudah terjadi dan bukan pada durasi.
                    """.trimIndent()
                    )
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf("""
                        (+) The girl had cried before her mother came.
                        (-) The girl had not cried before her mother came.
                        (?) Had the girl cried before her mother came?
                    """.trimIndent())
                ),
            ),
            listOf("""
                - Before -> The girl had cried before her mother came.
                - After -> The girl had not cried before her mother came.
                - By the time -> By the time I got there, they had gone.
                - Already -> He had already left when I arrived.
                - When / After / Before + Past Simple -> When we got to the station, the train had left.
            """.trimIndent())
        ),
        TensesContent(
            "past_perfect_continuous",
            "Past Perfect Continuous",
            useCases = listOf(
                Section(
                    title = "Pengertian Past Perfect Continuous Tense",
                    content = listOf("""
                        Past perfect continuous tense adalah tenses atau bentuk kata kerja untuk mengungkapkan suatu aksi (dengan durasi waktu tertentu) atau kejadian yang sudah dimulai dan sedang berlangsung pada masa lampau, tapi sudah tidak terjadi lagi saat ini. 

                        Intinya, past perfect continuous tense digunakan untuk menceritakan sebuah kejadian atau aksi yang dimulai di masa lalu, terjadi di masa lalu, dan juga selesai dalam periode waktu di masa lalu.

                        Jika dilihat dari paparan di atas, maka aksi dan kondisi yang diceritakan dalam tense ini berarti tidak ada kaitannya sama sekali dengan masa sekarang. Oh ya, tense ini juga memiliki nama lain, lo, yaitu past perfect progressive tense.
                    """.trimIndent()
                    )
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf("""
                        (+) Rasya had been working at the international hospital for five years when he got the promotion. (Rasya telah bekerja di rumah sakit internasional selama lima tahun ketika dia mendapat promosi.)
                        (-) Lia had not been playing before she finished her exam. (Lia tidak telah sedang bermain sebelum dia menyelesaikan ujiannya.)
                        (?) Had Alfi been working? (Apakah Alfi telah sedang bekerja?)
                    """.trimIndent())
                ),
            ),
            listOf("""
                - When -> I had been reading when the lights went out.
                - Before -> I had been crying before you found me.
                - Since -> I had been working since morning when the power went out.
                - For -> I had been waiting for two hours before the bus came.
                - For -> We had been walking for 30 minutes before it started raining.
            """.trimIndent())
        ),
        TensesContent(
            "simple_future",
            "Simple Future",
            useCases = listOf(
                Section(
                    title = "Pengertian Simple Future Tense",
                    content = listOf("""
                        Simple future tense merupakan bentuk tenses untuk menunjukkan suatu peristiwa yang belum mulai dan baru terjadi di waktu yang akan datang a.k.a di masa depan.

                        Jadi, tenses ini merujuk pada tindakan yang akan dilakukan setelah sekarang. Selain untuk mengekspresikan hal tersebut, simple future tense juga dapat kamu gunakan untuk menyatakan suatu prediksi dan keinginan.
                    """.trimIndent()
                    )
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf("""
                        (+) She will come to the cinema tomorrow.
                        (-) She will not come to the cinema tomorrow.
                        (?) Will she come to the cinema tomorrow?
                    """.trimIndent())
                ),
            ),
            listOf("""
                - Tomorrow  -> She will come to the cinema tomorrow.
                - Soon -> The show will start soon.
                - Soon -> It will be ready soon.
                - In (a few minutes/hours/days/years) -> The plane will land in ten minutes.
                                                         She will be here in an hour.
                                                         I will finish my homework in a few minutes.
                - This (afternoon/evening/weekend/year) -> I will meet him this afternoon.
                                                         She will cook dinner this evening.
                                                         They will visit us this weekend.
                                                         We will start the project this week.
            """.trimIndent())
        ),
        TensesContent(
            "future_continuous",
            "Future Continuous",
            useCases = listOf(
                Section(
                    title = "Pengertian Future Continuous Tense",
                    content = listOf("""
                        Future continuous tense adalah bentuk kata kerja untuk menyatakan kejadian yang sedang berlangsung pada masa atau waktu yang akan datang dengan keterangan waktu yang spesifik, alias kalimat yang menggunakan tenses ini memiliki durasi waktu. 
                        
                        For your information, future continuous tense memang biasa disebut juga dengan future progressive tense. Istilah “future progressive tense” memberi kita gagasan yang lebih baik tentang makna dari tenses yang satu ini. Dalam hal ini, kata “progresif” menunjukkan bahwa ada sesuatu yang sedang berlangsung, a.k.a there is an action in progress.
                    """.trimIndent()
                    )
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf("""
                        (+) Rama will be running in a marathon race this Saturday morning. (Rama akan mengikuti lomba lari marathon Sabtu pagi ini.)
                        (-) Bima will not be playing games for a month. (Bima tidak akan bermain game selama sebulan.)
                        (?) Will you be coming to Susi’s birthday party tomorrow night? (Apakah kamu akan datang ke pesta ulang tahun Susi besok malam?
                    """.trimIndent())
                ),
            ),
            listOf("""
                - At this time tomorrow -> I will be attending a meeting at this time tomorrow.
                - At -> I will be studying at 9 p.m.
                - This time next week/month/year -> I will be relaxing at the beach this time next week.
                                                    She will be starting college this time next month.
                                                    He will be working in his new office this time next year.
                - While -> I will be cooking while she is cleaning.
                - During -> I will be sleeping during the flight.
            """.trimIndent())
        ),
        TensesContent(
            "future_perfect",
            "Future Perfect",
            useCases = listOf(
                Section(
                    title = "Pengertian Future Perfect Tense",
                    content = listOf("""
                        Future perfect tense digunakan untuk mengungkapkan bahwa ada suatu aksi yang akan dilakukan dan diselesaikan pada waktu tertentu di masa depan. Secara sederhana, penggunaan future perfect tense ini adalah bentuk kata untuk menunjukkan kehendak seseorang yang berhubungan dengan masa depan.
                    """.trimIndent()
                    )
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf("""
                        (+) I will have finished my homework by tomorrow.
                        (-) I will not have finished my homework by tomorrow.
                        (?) Will she have finished her homework by tomorrow?
                    """.trimIndent())
                ),
            ),
            listOf("""
                - By + time expression -> I will have finished the report by 5 p.m.
                - By + time expression -> They will have completed the project by Friday.
                - By the time + simple present clause -> By the time you arrive, I will have cleaned the house.
                                                         By the time the class starts, the students will have submitted their work.
                                                         By the time he comes home, she will have cooked dinner.
                - In + (a period of time) -> I will have learned 1000 words in two months.
                                             She will have improved her skills in a year.
            """.trimIndent())
        ),
        TensesContent(
            "future_perfect_continuous",
            "Future Perfect Continuous",
            useCases = listOf(
                Section(
                    title = "Pengertian Future Perfect Continuous Tense",
                    content = listOf("""
                        Future perfect continuous tense adalah bentuk kalimat untuk menyatakan aksi, tindakan, atau kejadian yang sedang akan berlangsung hingga suatu titik tertentu di masa mendatang.

                        Dalam hal ini, seseorang akan mengekspresikan suatu tindakan yang sedang terjadi di masa depan, tetapi masih terus berlanjut sampai masa nanti. Tenses ini biasa dikenal juga sebagai future perfect progressive.

                        Dilansir dari Grammarly, ketika kita menggambarkan suatu tindakan di masa depan, maka kita harus memproyeksikan diri kita ke depan dalam suatu waktu, dan melihat masa lalu sebagai patokan durasi dari aktivitas yang kita ungkapkan.

                        Kegiatan tersebut akan dimulai suatu saat di masa lalu, sekarang, atau di masa depan, dan diperkirakan akan berlanjut di masa depan. 
                    """.trimIndent()
                    )
                ),
                Section(
                    title = "Contoh Kalimat",
                    content = listOf("""
                        (+) In August, I will have been working as a Digital Marketer for three years. (Pada bulan Agustus, saya akan telah bekerja sebagai Digital Marketer selama tiga tahun.) 
                        (-) My mother will not have been teaching in 80 Jakarta Senior High School for a few weeks before he moves to Bali. (Ibuku belum sempat mengajar di SMA 80 Jakarta selama beberapa minggu sebelum dia pindah ke Bali.)
                        (?) Will you have been working for two hours when I arrive? (Apakah Anda sudah bekerja selama dua jam ketika saya tiba?) 
                    """.trimIndent())
                ),
            ),
            listOf("""
                 - By + time expression -> I will have finished the assignment by 10 p.m.
                 - By the time + Simple Present clause -> By the time you wake up, I will have left.
                 - Before + event -> I will have finished my work before the meeting starts.
                 - In + duration -> I will have completed the book in two days.
                 - By then / By that time -> The guests will have gone by then.
            """.trimIndent())
        )
    )

    fun getByRoute(route: String): TensesContent? = tenses.find { it.route == route }
}
