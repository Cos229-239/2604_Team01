package com.example.team01_application

data class CharacterClass (
    val name: String,
    val hitDie: Int,
    val primaryAbility: String,
    val savingThrows: List<String>,
    val weaponProficiencies: List<String>,
    val description: String
)

val barbarian = CharacterClass(
    name = "Barbarian",
    hitDie = 12,
    primaryAbility = "Strength",
    savingThrows = listOf("Strength", "Constitution"),
    weaponProficiencies = listOf("Simple Weapons", "Martial Weapons") ,
    description = "A fierce melee warrior who uses rage and brute strength to overpower enemies."
)

val bard = CharacterClass(
    name = "Bard",
    hitDie = 8,
    primaryAbility = "Charisma",
    savingThrows = listOf("Dexterity", "Charisma"),
    weaponProficiencies = listOf("Simple Weapons", "Hand Crossbows", "Longswords", "Rapiers", "Shortswords"),
    description = "A charismatic performer who uses music, magic, and inspiration to support allies."
)

val cleric = CharacterClass(
    name = "Cleric",
    hitDie = 8,
    primaryAbility = "Wisdom",
    savingThrows = listOf("Wisdom", "Charisma"),
    weaponProficiencies = listOf("Simple Weapons"),
    description = "A divine spellcaster who heals allies and channels the power of their deity."
)

val druid = CharacterClass(
    name = "Druid",
    hitDie = 8,
    primaryAbility = "Wisdom",
    savingThrows = listOf("Intelligence", "Wisdom"),
    weaponProficiencies = listOf("Clubs", "Daggers", "Darts", "Javelins", "Maces", "Quarterstaffs", "Scimitars", "Sickles", "Slings", "Spears"),
    description = "A nature-based spellcaster who can wield elemental magic and transform into animals."
)

val fighter = CharacterClass(
    name = "Fighter",
    hitDie = 10,
    primaryAbility = "Strength/Dexterity",
    savingThrows = listOf("Strength" , "Constitution"),
    weaponProficiencies = listOf("Simple Weapons", "Martial Weapons"),
    description = "A skilled combat specialist who excels with weapons, armor, and battlefield tactics."
)

val paladin = CharacterClass(
    name = "Paladin",
    hitDie = 10,
    primaryAbility = "Strength/Charisma/Wisdom",
    savingThrows = listOf("Wisdom","Strength","Charisma"),
    weaponProficiencies = listOf("Simple Weapons", "Martial Weapons"),
    description = "A holy warrior who combines powerful melee combat with divine magic and protection."
)

val allClasses = listOf( barbarian, bard, cleric, druid, fighter, paladin)

fun getClassByName(name: String): CharacterClass?{
    return allClasses.find {
        it.name.equals(name, ignoreCase = true)
    }
}