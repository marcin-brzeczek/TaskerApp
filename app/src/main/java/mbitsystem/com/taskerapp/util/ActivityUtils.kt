package mbitsystem.com.taskerapp.util

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

fun addFragmentToActivity(
    fragmentManager: FragmentManager,
    fragment: Fragment,
    frameId: Int) {
    fragmentManager.beginTransaction().run {
        add(frameId, fragment)
        commit()
    }
}