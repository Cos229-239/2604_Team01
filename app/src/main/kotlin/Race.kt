data class Race(
    val name: String = "",
    val description: String = "",
    val background: String = "",
    val traits: String = "",
)

// elf
val elfDescription: String = """
    Elves are as curious as they are long-lived. 
    They are divided into groups such as Drow, High Elves, and Wood Elves.
    """.trimIndent()
val elfBackground: String = """
    Originating from the god Corellon, elves were once shapeshifters. 
    Inspired by the deity Lolth, they attempted to dethrone him but were defeated and lost their ability to change form.
    
    Without this power, elves were overwhelmed with sorrow and despair. Driven by both emotion and curiosity, many relocated to the Feywild. 
    However, this feeling of despair only intensified in this new realm, causing many to seek other places to survive.
    
    Elves can live up to 750 years and are recognized by their pointed ears and lack of facial or body hair. 
    Their appearance is influenced by the environments they inhabit, which can also shape their abilities over time.
""".trimIndent()
val elfTraits: String = """
    Type: Humanoid
    Size: 6ft
    Speed: 30ft
""".trimIndent()

val elfRace = Race(
    name = "Elf",
    description = elfDescription,
    background = elfBackground,
    traits = elfTraits
)

