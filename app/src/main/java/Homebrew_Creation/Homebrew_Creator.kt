package Homebrew_Creation

import Character_Creator.Ability_Score
import androidx.annotation.Nullable

/*
The following three enums are for general use for the type of homebrew, skills for assignment in a class,
and the type of item that is being created. Depending on how far you wish to go, I would suggest another enum
that has a list of the different schools of magic for sorting the spells that will be created.
 */
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

/*
The following two classes are specifically for features that go into the race or the class.
For full functionality, you will need to add a repository of all the features that are already
available in D&D.
 */
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

/*
This is a simple class for the soul purpose of identifying which thing the user is trying to create.
 */
class Homebrew_Creator {

    val hb_Type: create_Type? = null
    val hb_Description: String? = null

}

/*
The following 4 classes are the primary classes that will be used for the homebrew creation.
Race, Class, Spell, and Item.
Each one has a name and description field, but there are many differences as you look closer at them.
 */
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
    /*
    This is a feature tracking method that identifies which level a character receives a feature.
     */
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
    val i_Type: item_Type? = null
    val i_Name: String? = null
    val i_Description: String? = null
    val i_Damage: List<Int> = emptyList()
    val i_Damage_Type: String? = null
    val i_AC_Rating: Int? = null
}

/*
As a general note, if you wish to upload any of the objects in this into the overall breakdown, you
can use these methods to create the repository of classes, races, features, spells, and items.
 */