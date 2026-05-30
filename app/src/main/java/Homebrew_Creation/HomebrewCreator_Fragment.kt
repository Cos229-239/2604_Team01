package Homebrew_Creation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.team01_application.R

class HomebrewCreator_Fragment : Fragment() {

    /*
    This is still just a shell of a fragment.
    It would work best if you add in data binding and a view binding.
     */

    /*
    Override for the onCreateView so that specific parameters can be changed
    to suit whatever you want for the view.
     */
    override fun onCreateView (
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        val view = inflater.inflate(
            R.layout.fragment_homebrew_creation,
            container,
            false
        )

        return view
    }
}