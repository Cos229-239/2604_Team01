package com.example.team01_application
/**
 * Represents a playable Dungeons & Dragons character class.
 *
 * Stores class information used throughout the application,
 * including gameplay statistics, descriptions, and icon resources.
 * Icons for classes can be found at Main->res->drawable. All icons have been named to match their class
 *
 *  FUTURE DEVELOPMENT NOTES
 *
 *  Planned Features:
 *  - Clickable class entries
 *  - Expandable class descriptions
 *  - Character creation integration
 *  - Inventory/equipment system integration
 *  - Additional D&D classes
 */


data class CharacterClass (
    val name: String,
    val hitDie: Int,
    val primaryAbility: String,
    val savingThrows: List<String>,
    val weaponProficiencies: List<String>,
    val description: String,
    val imageResId: Int
)

val barbarian = CharacterClass(
    name = "Barbarian",
    hitDie = 12,
    primaryAbility = "Strength",
    savingThrows = listOf("Strength", "Constitution"),
    weaponProficiencies = listOf("Simple Weapons", "Martial Weapons") ,
    description = "A fierce melee warrior who uses rage and brute strength to overpower enemies.",
    imageResId = R.drawable.barbarian_icon
)

val bard = CharacterClass(
    name = "Bard",
    hitDie = 8,
    primaryAbility = "Charisma",
    savingThrows = listOf("Dexterity", "Charisma"),
    weaponProficiencies = listOf("Simple Weapons", "Hand Crossbows", "Longswords", "Rapiers", "Shortswords"),
    description = "A charismatic performer who uses music, magic, and inspiration to support allies.",
    imageResId = R.drawable.bard_icon
)

val cleric = CharacterClass(
    name = "Cleric",
    hitDie = 8,
    primaryAbility = "Wisdom",
    savingThrows = listOf("Wisdom", "Charisma"),
    weaponProficiencies = listOf("Simple Weapons"),
    description = "A divine spellcaster who heals allies and channels the power of their deity.",
    imageResId = R.drawable.cleric_icon
)

val druid = CharacterClass(
    name = "Druid",
    hitDie = 8,
    primaryAbility = "Wisdom",
    savingThrows = listOf("Intelligence", "Wisdom"),
    weaponProficiencies = listOf("Clubs", "Daggers", "Darts", "Javelins", "Maces", "Quarterstaffs", "Scimitars", "Sickles", "Slings", "Spears"),
    description = "A nature-based spellcaster who can wield elemental magic and transform into animals.",
    imageResId = R.drawable.druid_icon
)

val fighter = CharacterClass(
    name = "Fighter",
    hitDie = 10,
    primaryAbility = "Strength/Dexterity",
    savingThrows = listOf("Strength" , "Constitution"),
    weaponProficiencies = listOf("Simple Weapons", "Martial Weapons"),
    description = "A skilled combat specialist who excels with weapons, armor, and battlefield tactics.",
    imageResId = R.drawable.fighter_icon
)

val paladin = CharacterClass(
    name = "Paladin",
    hitDie = 10,
    primaryAbility = "Strength/Charisma/Wisdom",
    savingThrows = listOf("Wisdom","Strength","Charisma"),
    weaponProficiencies = listOf("Simple Weapons", "Martial Weapons"),
    description = "A holy warrior who combines powerful melee combat with divine magic and protection.",
    imageResId = R.drawable.paladin_icon
)

/**
 * Master list of all currently implemented character classes.
 *
 * To add a new class:
 * 1. Create a new CharacterClass object.
 * 2. Add an icon to the drawable folder.
 * 3. Add the class to this list.
 *
 * RecyclerView updates automatically when new entries are added.
 */


val allClasses = listOf( barbarian, bard, cleric, druid, fighter, paladin)

fun getClassByName(name: String): CharacterClass?{
    return allClasses.find {
        it.name.equals(name, ignoreCase = true)
    }
}