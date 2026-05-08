package model

class RaceRepository {

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

// Dwarf

    val dwarfDescription: String = """
    Dwarves are known for their deep connection to stone and the mountains. 
    They are resilient and enduring beings, often living up to 350 years. 
    Their strength, discipline, and craftsmanship define their way of life, making them one of the most steadfast races.
    """.trimIndent()

    val dwarfBackground: String = """
    Dwarves were brought into the world by the forge god Moradin. According to legend, 
    Moradin shaped them in his own image from stone, metal, and precious gems, then breathed life into them. 
    While Moradin remains their primary deity, many dwarves also revere other gods such as Abbathor and Berronar Truesilver.
    
    Dwarven society is built upon exceptional craftsmanship and patience. 
    They are known to spend generations carving vast cities and strongholds deep within mountains. 
    Once completed, these structures can endure for thousands of years. 
    Their mastery of stonework and mining has also made them incredibly wealthy, as they uncover and refine the riches hidden within the earth.
    
    Though dwarves typically stand around four feet tall, they are powerfully built, with broad frames and remarkable physical strength. 
    Their thick beards and rugged features are often seen as symbols of pride and tradition within their culture.
""".trimIndent()

    val dwarfTraits: String = """
    Type: Humanoid
    Size: 4-5ft
    Speed: 30ft
""".trimIndent()

    val dwarfRace = Race(
        name = "Dwarf",
        description = dwarfDescription,
        background = dwarfBackground,
        traits = dwarfTraits
    )

// Dragonborn

    val dragonBornDescription: String = """
    Dragonborn are a noble and proud race that is shaped by their draconic heritage. 
    """.trimIndent()

    val dragonBornBackground: String = """
    Dragonborn hatched from dragon eggs. 
    According to the lore, these eggs were blessed by dragon gods Bahamut and Tiamat, or created by non-divine dragons. 
    
    The dragonborn’s culture is built on honor and discipline. The worst offense you could commit is breaking your word.
    
    The majority of Dragonborn society in the nation of Tymanther have a strong hatred of dragons. 
    Despite this, they were known to tolerate all kinds of races--even those who are generally disliked. 
""".trimIndent()

    val dragonBornTraits: String = """
    Type: Humanoid
    Size: 5-7ft
    Speed: 30ft
""".trimIndent()

    val dragonBornRace = Race(
        name = "Dragonborn",
        description = dragonBornDescription,
        background = dragonBornBackground,
        traits = dragonBornTraits
    )

// human race

    val humanDescription: String = """
    Humans are ambitious and versatile, driven by the brevity of their lives to achieve as much as possible. 
""".trimIndent()

    val humanBackground: String = """
    With lifespans far shorter than elves, dwarves, or other long-lived races,
    humans feel an urgency to make their mark on the world before their time runs out. 
    They build cities in decades and push the boundaries of exploration and invention.
    
    Humans can be found in every climate and culture, from desert nomads and seafaring traders to imperial nobles and frontier settlers. 
    They adapt quickly to new environments, often blending traditions from other peoples into their own. 
""".trimIndent()

    val humanTraits: String = """
    Type: Humanoid
    Size: 5-6ft
    Speed: 30ft
""".trimIndent()

    val humanRace = Race(
        name = "Human",
        description = humanDescription,
        background = humanBackground,
        traits = humanTraits)

// race list

    val raceList = listOf(elfRace, dwarfRace, dragonBornRace, humanRace)

    val raceMap: Map<String, Race> = mapOf(
        "elf" to elfRace,
        "dwarf" to dwarfRace,
        "dragon" to dragonBornRace,
        "human" to humanRace)


    // returns a specified race object
    fun getRaceByName(raceName: String): Race?
    {
        if (raceMap.containsKey(raceName))
        {
            val raceValue: Race? = raceMap[raceName]
            return raceValue
        }
        else
        {
            return null
        }
    }

    // returns the list of all race objects
    fun getAllRaces(): List<Race>
    {
        return raceList
    }

    // returns the names of each race
    fun getRaceNames(): List<String>
    {
        return listOf(elfRace.name, dwarfRace.name, dragonBornRace.name, humanRace.name)
    }

}