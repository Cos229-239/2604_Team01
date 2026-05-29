package ui.friends

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.team01_application.R
import com.example.team01_application.model.FriendManager

// Fragment that displays the user's friends list
class FriendsFragment : Fragment() {

    private val friendManager = FriendManager()

    // Inflates the layout for this fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_friends_list, container, false)
    }

    // Called after the view is created - good place to setup UI and load data
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val statusText = view.findViewById<TextView>(R.id.tv_friends_status)
        loadFriends(statusText)
    }

    // Loads the user's friends and updates the status text
    private fun loadFriends(statusText: TextView) {
        val currentUserId = "current_user_placeholder"

        val friends = friendManager.getFriends(currentUserId)

        statusText.text = getString(R.string.friends_count, friends.size)
    }
}