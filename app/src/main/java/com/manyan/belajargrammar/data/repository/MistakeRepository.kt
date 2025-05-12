package com.manyan.belajargrammar.data.repository


import com.manyan.belajargrammar.data.model.MistakeContent
import com.manyan.belajargrammar.data.model.MistakeExample
import com.manyan.belajargrammar.data.model.MistakeItem

object MistakeRepository {

    val mistakes = listOf(
        MistakeContent(
            id = "wrong_preposition",
            title = "Using the Wrong Preposition",
            total = 74,
            learned = 0,
            items = listOf(
                MistakeItem(
                    title = "Absorbed (= very much interested)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "The girl is absorbed at her work.",
                            correct = "The girl is absorbed in her work."
                        ),
                        MistakeExample(
                            incorrect = "I was absorbed with the book.",
                            correct = "I was absorbed in the book."
                        )
                    )
                ),
                MistakeItem(
                    title = "Accuse (= to charge someone with doing something bad)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "They accused him for theft.",
                            correct = "They accused him of theft."
                        )
                    )
                ),
                MistakeItem(
                    title = "Married (= to become husband and wife)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "She married with a doctor.",
                            correct = "She married a doctor."
                        ),
                        MistakeExample(
                            incorrect = "He got married with Lisa last year.",
                            correct = "He got married to Lisa last year."
                        )
                    )
                ),

                MistakeItem(
                    title = "Listen (= to pay attention to sound)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "I like to listen music.",
                            correct = "I like to listen to music."
                        )
                    )
                ),

                MistakeItem(
                    title = "Discuss (= to talk about something)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "We discussed about the problem.",
                            correct = "We discussed the problem."
                        )
                    )
                ),

                MistakeItem(
                    title = "Arrive (= to reach a place)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "They arrived to the airport late.",
                            correct = "They arrived at the airport late."
                        ),
                        MistakeExample(
                            incorrect = "He arrived in the office early.",
                            correct = "He arrived at the office early."
                        )
                    )
                ),

                MistakeItem(
                    title = "Depend (= to rely on someone/something)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "It depends of the situation.",
                            correct = "It depends on the situation."
                        )
                    )
                ),
                MistakeItem(
                    title = "Reply (= to respond to someone)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "He replied me yesterday.",
                            correct = "He replied to me yesterday."
                        )
                    )
                ),

                MistakeItem(
                    title = "Reach (= to arrive at a place)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "We reached to the hotel at noon.",
                            correct = "We reached the hotel at noon."
                        )
                    )
                ),

                MistakeItem(
                    title = "Enter (= to go into a place)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "She entered into the room quietly.",
                            correct = "She entered the room quietly."
                        )
                    )
                ),

                MistakeItem(
                    title = "Request (= to ask for something)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "He requested to me a pen.",
                            correct = "He requested a pen from me."
                        )
                    )
                ),

                MistakeItem(
                    title = "Explain (= to make something clear)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "She explained me the rule.",
                            correct = "She explained the rule to me."
                        )
                    )
                ),

                MistakeItem(
                    title = "Say vs Tell",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "She said me the truth.",
                            correct = "She told me the truth."
                        ),
                        MistakeExample(
                            incorrect = "He told that he was tired.",
                            correct = "He said that he was tired."
                        )
                    )
                ),

                MistakeItem(
                    title = "Provide (= to give something)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "They provided us the materials.",
                            correct = "They provided the materials to us."
                        )
                    )
                ),

                MistakeItem(
                    title = "Go to / Visit",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "I went the museum yesterday.",
                            correct = "I went to the museum yesterday."
                        ),
                        MistakeExample(
                            incorrect = "We visited to our grandmother.",
                            correct = "We visited our grandmother."
                        )
                    )
                ),

                MistakeItem(
                    title = "Inform (= to tell someone)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "She informed to me about the changes.",
                            correct = "She informed me about the changes."
                        )
                    )
                ),

                MistakeItem(
                    title = "Capable (= having the ability)",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "She is capable to lead the team.",
                            correct = "She is capable of leading the team."
                        )
                    )
                ),

                MistakeItem(
                    title = "Concerned",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "I am concerned with his health.",
                            correct = "I am concerned about his health."
                        )
                    )
                ),

                MistakeItem(
                    title = "Good at / Good in",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "He is good in math.",
                            correct = "He is good at math."
                        )
                    )
                ),

                MistakeItem(
                    title = "Prefer",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "I prefer coffee than tea.",
                            correct = "I prefer coffee to tea."
                        )
                    )
                ),

                MistakeItem(
                    title = "Complain",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "She complained over the food.",
                            correct = "She complained about the food."
                        )
                    )
                ),

                MistakeItem(
                    title = "Different from / Different than",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "This is different than that.",
                            correct = "This is different from that."
                        )
                    )
                )
            )
        ),
        MistakeContent(
            id = "wrong_singular_plural",
            title = "Wrong Singular And Plural",
            total = 10,
            learned = 0,
            items = listOf(
                MistakeItem(
                    title = "Incorrect use of 'informations'",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "She gave me many informations.",
                            correct = "She gave me a lot of information."
                        ),
                        MistakeExample(
                            incorrect = "These informations are useful.",
                            correct = "This information is useful."
                        ),
                        MistakeExample(
                            incorrect = "I found all the informations online.",
                            correct = "I found all the information online."
                        )
                    )
                ),
                MistakeItem(
                    title = "Incorrect use of 'furnitures'",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "They bought new furnitures.",
                            correct = "They bought new furniture."
                        ),
                        MistakeExample(
                            incorrect = "The room has modern furnitures.",
                            correct = "The room has modern furniture."
                        ),
                        MistakeExample(
                            incorrect = "Those furnitures are expensive.",
                            correct = "That furniture is expensive."
                        )
                    )
                ),
                MistakeItem(
                    title = "Incorrect use of 'advices'",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "He gave me many advices.",
                            correct = "He gave me a lot of advice."
                        ),
                        MistakeExample(
                            incorrect = "Your advices helped me.",
                            correct = "Your advice helped me."
                        ),
                        MistakeExample(
                            incorrect = "She gave useful advices.",
                            correct = "She gave useful advice."
                        )
                    )
                ),
                MistakeItem(
                    title = "Incorrect use of 'equipments'",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "The lab has modern equipments.",
                            correct = "The lab has modern equipment."
                        ),
                        MistakeExample(
                            incorrect = "We need more equipments.",
                            correct = "We need more equipment."
                        ),
                        MistakeExample(
                            incorrect = "All the equipments are ready.",
                            correct = "All the equipment is ready."
                        )
                    )
                ),
                MistakeItem(
                    title = "Incorrect plural of 'childs'",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "There are three childs in the park.",
                            correct = "There are three children in the park."
                        ),
                        MistakeExample(
                            incorrect = "I saw many childs playing.",
                            correct = "I saw many children playing."
                        ),
                        MistakeExample(
                            incorrect = "The childs are laughing.",
                            correct = "The children are laughing."
                        )
                    )
                ),
                MistakeItem(
                    title = "Incorrect plural of 'womans'",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "Two womans walked by.",
                            correct = "Two women walked by."
                        ),
                        MistakeExample(
                            incorrect = "The womans are talking.",
                            correct = "The women are talking."
                        ),
                        MistakeExample(
                            incorrect = "I met some interesting womans.",
                            correct = "I met some interesting women."
                        )
                    )
                ),
                MistakeItem(
                    title = "Incorrect plural of 'mans'",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "Five mans were arrested.",
                            correct = "Five men were arrested."
                        ),
                        MistakeExample(
                            incorrect = "The mans are here.",
                            correct = "The men are here."
                        ),
                        MistakeExample(
                            incorrect = "I saw several mans.",
                            correct = "I saw several men."
                        )
                    )
                ),
                MistakeItem(
                    title = "Incorrect use of 'peoples'",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "There are many peoples here.",
                            correct = "There are many people here."
                        ),
                        MistakeExample(
                            incorrect = "Peoples from different countries came.",
                            correct = "People from different countries came."
                        ),
                        MistakeExample(
                            incorrect = "I like meeting new peoples.",
                            correct = "I like meeting new people."
                        )
                    )
                ),
                MistakeItem(
                    title = "Incorrect plural of 'tooths'",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "She has white tooths.",
                            correct = "She has white teeth."
                        ),
                        MistakeExample(
                            incorrect = "My tooths hurt.",
                            correct = "My teeth hurt."
                        ),
                        MistakeExample(
                            incorrect = "The dentist cleaned all my tooths.",
                            correct = "The dentist cleaned all my teeth."
                        )
                    )
                ),
                MistakeItem(
                    title = "Incorrect plural of 'foots'",
                    examples = listOf(
                        MistakeExample(
                            incorrect = "He has big foots.",
                            correct = "He has big feet."
                        ),
                        MistakeExample(
                            incorrect = "My foots are sore.",
                            correct = "My feet are sore."
                        ),
                        MistakeExample(
                            incorrect = "She washed her foots.",
                            correct = "She washed her feet."
                        )
                    )
                )
            )
        )

    )

        fun getAll(): List<MistakeContent> = mistakes

        fun getById(id: String): MistakeContent? = mistakes.find { it.id == id }

        fun getItem(categoryId: String, index: Int): MistakeItem? {
            val category = mistakes.find { it.id == categoryId }
            return category?.items?.getOrNull(index)
        }

}
