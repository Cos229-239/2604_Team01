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
    primaryAbility = "charisma",
    savingThrows = listof("Dexterity", "Charisma"),
    weaponProficiencies = listof("Simple Weapons", "Martial Weapons")
)
