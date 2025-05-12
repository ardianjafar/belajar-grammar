package com.manyan.belajargrammar.data.repository

import com.manyan.belajargrammar.data.model.ConversationContent

object ConversationRepository {
    val conversation = listOf(
        ConversationContent(
            "introduction", "Introduction",
            useCases = listOf("""
                Person A : Good Morning! My name is Sarah. What's your name ?
                Person B : Hi Sarah, nice to meet you. I am Jonathan.
                Person A : Nice to meet you too, Jonathan. Are you new here ?
                Person B : Yes, I am new here just joined this week.
                Person A : Oh, Welcome to the team! What department are you in?
                Person B : I am in the Marketing Department, How about you ?
                Person A : I work in Human Resources
                Person B : That's Great. I look forward to working with you.
                Person A : Same here. Let me know if you need anything!
            """.trimIndent()), signalWords = ""
        ),
        ConversationContent(
            "school", "School",
            useCases = listOf("""
                 Person A : Hey Maya, did you do the English homework?
                Person B : Hi Kevin! Yes, I finished it last night. What about you?
                Person A : Not yet. I didn’t understand the last question.
                Person B : The one about writing a short story?
                Person A : Yes, that one. I didn’t know how to start.
                Person B : I can help you during lunch break if you want.
                Person A : Really? That would be awesome. Thanks!
                Person B : No problem! Let's meet in the library later.
            """.trimIndent()), signalWords = ""
        ),
        ConversationContent(
            "office", "Office Conversation",
            useCases = listOf("""
                Person A : Good morning, Thomas! Did you get a chance to review the client report?
                Person B : Good morning, Sarah. Yes, I went through it last night. There are a few sections we might need to revise.
                Person A : I thought so too. Especially the part about the market analysis — the data seems a bit outdated.
                Person B : Exactly. I suggest we update it with the Q2 statistics. I can work on that this afternoon.
                Person A : That would be great. I’ll handle the competitor benchmarking section then.
                Person B : Perfect. Also, have you scheduled the meeting with the client for Friday?
                Person A : Not yet. I was waiting for your input before confirming. Do you think Friday at 10 a.m. works?
                Person B : Sounds good to me. Let’s make it a virtual meeting since they’re based in Singapore.
                Person A : Good point. I’ll send out the calendar invite and draft the agenda.
                Person B : Awesome. Should we also prepare a summary slide deck for the meeting?
                Person A : Yes, definitely. Let’s keep it short and visual — no more than 6 slides.
                Person B : Agreed. I’ll start working on the design. You can fill in the content when you’re done with the analysis.
                Person A : Deal. Let’s touch base again tomorrow morning to check on our progress.
                Person B : Sure. Oh, and don’t forget we have that department meeting at 4 p.m. today.
                Person A : Thanks for the reminder! See you there.
            """.trimIndent()), signalWords = ""
        ),
        ConversationContent(
            "restaurant", "Ordering Food",
            useCases = listOf("""
                Person A : Hi, have you decided what you want to order?
                Person B : I’m still thinking, but the grilled salmon looks really good.
                Person A : Yeah, I saw that too. I’m torn between the steak and the pasta.
                Person B : The steak here is great, but it takes longer to cook.
                Person A : Hmm, maybe I’ll go with the pasta then. How about drinks?
                Person B : I’ll have iced lemon tea. You?
                Person A : Just water for me. I’m trying to cut down on sugar.
                Person B : Good call. Are we sharing an appetizer?
                Person A : Sure, let’s get the garlic bread. Everyone says it’s amazing.
                Person B : Sounds perfect. Let’s call the waiter!
            """.trimIndent()), signalWords = ""
        ),
        ConversationContent(
            "airport", "At the Airport",
            useCases = listOf("""
                Person A : Have you checked in already?
                Person B : Yes, I checked in online last night. How about you?
                Person A : I just did it at the counter. The line wasn’t too bad.
                Person B : Great. Do you know which gate we’re boarding from?
                Person A : Yes, it’s Gate 12B. Boarding starts at 10:15.
                Person B : Perfect. That gives us some time. Do you want to grab a coffee?
                Person A : Sounds good. There’s a coffee shop near Gate 10.
                Person B : Also, don’t forget to go through security. I saw the line getting longer.
                Person A : Good point. Let’s get coffee first, then head to security.
                Person B : Deal. By the way, do you know how long the flight is?
                Person A : Around two and a half hours. I downloaded a movie just in case.
                Person B : Smart move! I hope we get window seats.
                Person A : Me too. I love looking out during take-off.
            """.trimIndent()), signalWords = ""
        ),
        ConversationContent(
            "movie_theater", "Choosing a Movie",
            useCases = listOf("""
                Person A : Hey guys, have you decided what movie you want to watch?
                Person B : I was thinking about watching that new action movie, “Speed Chase”. The trailer looked awesome!
                Person C : I’m okay with action, but I heard the comedy “Laugh Out Loud” is really funny.
                Person A : Hmm, both sound good. I haven’t seen either of them.
                Person B : What time does “Speed Chase” start?
                Person C : It starts at 7:00 p.m., and the comedy starts at 7:15.
                Person A : If we choose the comedy, we’ll have more time to grab snacks.
                Person B : True. But you know I love action scenes on the big screen!
                Person C : Let’s vote. I choose the comedy.
                Person A : I’ll go with the comedy too. We can watch the action one next time.
                Person B : Alright, comedy it is! Let’s get the tickets.
                Person C : And don’t forget the popcorn!
                Person A : And nachos for me!
            """.trimIndent()), signalWords = ""
        ),
    )
}