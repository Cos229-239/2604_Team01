package team01_application

data class CharacterClass (
    val name: String,
    val hitDie: Int,
    val primaryAbility: String,
    val savingThrows: List<String>,
    val weaponProficiencies: List<String>
)

val barbarian = CharacterClass(
    name = "Barbarian",
    hitDie = 12,
    primaryAbility = "Strength",
    savingThrows = listOf("Strength", "Constitution"),
    weaponProficiencies = listOf("Simple Weapons", "Martial Weapons")
)

val bard = CharacterClass(
    name = "Bard",
    hitDie = 8,
    primaryAbility = "charisma",
    savingThrows = listOf("Dexterity", "Charisma"),
    weaponProficiencies = listOf(
        "Simple Weapons",
        "Hand Crossbows",
        "Longswords",
        "Rapiers",
        "Shortswords"
    )
)