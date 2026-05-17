package Character_Creator

import kotlin.random.Random

object Random_Calculator {

    private val rng = Random.Default

    // --------------------- Roll 4 d 6 and drop the lowest ------------------------
    fun roll_Ability_Score(): Int = (1..4).map { rng.nextInt(1, 7)}.sorted().takeLast(3).sum()

    // --------------------- Roll several scores at once (defaulted to 6 for full character randomization ---
    fun roll_Ability_Scores(count: Int = 6): List<int> = List(count) { roll_Ability_Score() }

    // ------------- Pick from a list at random ------------------------
    fun <T> pick_Random(list: List<T>): T = list[rng.nextInt(list.size)]

    // --------------- Picking Random race and class ------------------------
    fun pick_Random_Race( races: List<Race>): Race = pick_Random(races)
    fun pick_Random_Cladd( classes: List<CharClass>): CharClass = pick_Random(classes)

}