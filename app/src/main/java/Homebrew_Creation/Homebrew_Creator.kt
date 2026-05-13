package Homebrew_Creation

import Character_Creator.Ability_Score
import androidx.annotation.Nullable

enum class create_Type { RACE, CLASS, SPELL, ITEM }

enum class Skills {
    Athletics,
    Acrobatics,
    Sleight_of_Hand,
    Stealth,
    Arcana,
    History,
    Investigation,
    Nature,
    Religion,
    Animal_Handling,
    Insight,
    Medicine,
    Perception,
    Survival,
    Deception,
    Intimidation,
    Performance,
    Persuasion
}

enum class item_Type {
    WEAPON,
    UTILITY,
    ARMOR,
    CONSUMABLE,
    MAGIC_IMPLEMENT
}

class Race_Feature {
    val rf_Name: String? = null
    val rf_Description: String? = null
    val rf_Damage: List<Int> = listOf()
    val rf_Damage_Type: String? = null
}

class Class_Feature {
    val cf_Name: String? = null
    val cf_Description: String? = null
    val cf_Damage: List<Int> = emptyList()
    val cf_Damege_Type: String? = null
}

class Homebrew_Creator {

    val hb_Type: create_Type? = null
    val hb_Description: String? = null

}

class Homebrew_Race {

    val r_Name: String? = null
    val r_Descritpion: String? = null
    val r_Speed: Int? = null
    val r_Features: List<Race_Feature> = listOf()
    val r_AB_Adjustments: Map<Ability_Score, Int> = emptyMap()

}

class Homebrew_Class {

    val c_Name: String? = null
    val c_Description: String? = null
    val c_Level: Int? = null
    val c_Features: Map<Int, Class_Feature> = emptyMap()
    val c_Skills: List<Skills> = emptyList()
    val c_Proficiencies: List<String> = emptyList()
}

class Homebrew_Spell {
    val s_Name: String? = null
    val s_Description: String? = null
    val s_Damage: List<Int> = emptyList()
    val s_Damage_Type: String? = null
}

class Homebrew_Item {
    val i_Name: String? = null
    val i_Description: String? = null
    val i_Damage: List<Int> = emptyList()
    val i_Damage_Type: String? = null
    val i_AC_Rating: Int? = null
}