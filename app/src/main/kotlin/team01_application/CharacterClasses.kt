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
    primaryAbility = "Charisma",
    savingThrows = listOf("Dexterity", "Charisma"),
    weaponProficiencies = listOf("Simple Weapons", "Hand Crossbows", "Longswords", "Rapiers", "Shortswords")
)

val cleric = CharacterClass(
    name = "Cleric",
    hitDie = 8,
    primaryAbility = "Wisdom",
    savingThrows = listOf("Wisdom", "Charisma"),
    weaponProficiencies = listOf("Simple Weapons")
)

val druid = CharacterClass(
    name = "Druid",
    hitDie = 8,
    primaryAbility = "Wisdom",
    savingThrows = listOf("Intelligence", "Wisdom"),
    weaponProficiencies = listOf("Clubs", "Daggers", "Darts", "Javelins", "Maces", "Quarterstaffs", "Scimitars", "Sickles", "Slings", "Spears")
)

val fighter = CharacterClass(
    name = "Fighter",
    hitDie = 10,
    primaryAbility = "Strength/Dexterity",
    savingThrows = listOf("Strength" , "Constitution"),
    weaponProficiencies = listOf("Simple Weapons", "Martial Weapons")
)

val paladin = CharacterClass(
    name = "Paladin",
    hitDie = 10,
    primaryAbility = "Strength/Charisma",
    savingThrows = listOf("Wisdom", "Charisma"),
    weaponProficiencies = listOf("Simple Weapons", "Martial Weapons")
)

val allClasses = listOf( barbarian, bard, cleric, druid, fighter, paladin)