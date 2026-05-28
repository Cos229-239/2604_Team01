package Character_Creator

import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import Character_Creator.*
import com.example.team01_application.databinding.FragmentItemAbilityScoreBinding

public class Ability_Score_Adapter(
    val scores: MutableMap<Ability_Score, Int>
): RecyclerView.Adapter<Ability_Score_Adapter.Ability_ViewHolder>(){

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): Ability_ViewHolder {
        val binding = FragmentItemAbilityScoreBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return Ability_ViewHolder(binding)
    }

    override fun getItemCount(): Int = scores.size

    override fun onBindViewHolder(holder: Ability_ViewHolder, position: Int) {
        val key = scores.keys.elementAt(position)
        val value = scores[key] ?: 10
        holder.bind(key, value)
    }

    inner class Ability_ViewHolder(private val binding: FragmentItemAbilityScoreBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bind(ability: Ability_Score, score: Int) {
            binding.tvAbility.text = ability.name.lowercase().replaceFirstChar { it.uppercase() }

            binding.etScore.setText(score.toString())

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
        }
    }
}