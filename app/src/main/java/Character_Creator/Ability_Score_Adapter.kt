package Character_Creator

import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import Character_Creator.*
import com.example.team01_application.databinding.FragmentItemAbilityScoreBinding

/*
This is the adapter for the recyclerview of the Ability Scores.
Its primary function is to link the ability score manipulation to the UI multiple times with
this one class.
 */

public class Ability_Score_Adapter(
    val scores: MutableMap<Ability_Score, Int>
): RecyclerView.Adapter<Ability_Score_Adapter.Ability_ViewHolder>(){

    /*
    This is the override for the creation of the view holder, so that we can bind the Ability Scores
    to the view holder.
     */
    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): Ability_ViewHolder {
        val binding = FragmentItemAbilityScoreBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return Ability_ViewHolder(binding)
    }

    /*
    This is a simple getter method that is built into the Adapter class, it is used to get a general
    count and then indicate how many times the recycler will run.
     */
    override fun getItemCount(): Int = scores.size

    /*
    The override of the binding of the view holder so that we can identify how we want the values in
    the map to be displayed by giving them their own values.
     */
    override fun onBindViewHolder(holder: Ability_ViewHolder, position: Int) {
        val key = scores.keys.elementAt(position)
        val value = scores[key] ?: 10
        holder.bind(key, value)
    }

    /*
    This is the actual view holder method that fully binds the ability scores to the recycler and
    makes sure that they are displayed in the right place.
     */
    inner class Ability_ViewHolder(private val binding: FragmentItemAbilityScoreBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bind(ability: Ability_Score, score: Int) {

            /*
            this binds the Ability score to the text view in the recycler and changes the format of
            the text to the first letter being uppercase and the rest being lowercase.
             */
            binding.tvAbility.text = ability.name.lowercase().replaceFirstChar { it.uppercase() }

            /*
            This grabs the score of whatever ability is being displayed and changes it into a string
            to be displayed in the text editor of the recycler.
             */
            binding.etScore.setText(score.toString())

            /*
            This is the method that listens to the text editor so that the new number will be
            displayed if the user types one in.
             */
            binding.etScore.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    val newValue = s.toString().toIntOrNull() ?: 10
                    scores[ability] = newValue
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            })

            /*
            General Note:
            If you wish to add the randomization, this is where it would be for the rolling of the
            4 d6 for the ability scores.
             */
        }
    }
}