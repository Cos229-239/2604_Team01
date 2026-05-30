package Character_Creator

import kotlin.random.Random
import model.RaceRepository
import model.Race
import com.example.team01_application.CharacterClass

object Random_Calculator {

    private val rng = Random.Default

    val ran_Race_Repo = RaceRepository()

    // --------------------- Roll 4 d 6 and drop the lowest ------------------------
    fun roll_Ability_Score(): Int = (1..4).map { rng.nextInt(1, 7)}.sorted().takeLast(3).sum()

    // --------------------- Roll several scores at once (defaulted to 6 for full character randomization ---
    fun roll_Ability_Scores(count: Int = 6): List<Int> = List(count) { roll_Ability_Score() }

    // ------------- Pick from a list at random ------------------------
    fun <T> pick_Random(list: List<T>): T = list[rng.nextInt(list.size)]

    // --------------- Picking Random race and class ------------------------
    // For some reason this didn't want to call the lists from the repos. I think it has something to
    // do with the format, but I am not sure.
    fun pick_Random_Race( races: raceList): Race = pick_Random(races)
    fun pick_Random_Cladd( classes: allClasses): CharacterClass = pick_Random(classes)

}