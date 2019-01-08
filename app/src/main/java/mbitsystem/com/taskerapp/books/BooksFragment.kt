package mbitsystem.com.taskerapp.books

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import mbitsystem.com.taskerapp.mvibase.View as MviView
import android.view.ViewGroup
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_books.*
import mbitsystem.com.taskerapp.R
import mbitsystem.com.taskerapp.mvibase.Intent
import mbitsystem.com.taskerapp.mvibase.ViewState


class BooksFragment : Fragment(), MviView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_books, container, false)
        fab_add_task.setOnClickListener { showAddTask() }
        return root
    }

    override fun intents(): Observable<Intent> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun render(state: ViewState) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStart() {
        super.onStart()
        /*bind*/
    }

    override fun onStop() {
        super.onStop()
        /*unbind*/
    }

    private fun showAddTask() {
        val intent = android.content.Intent(context, AddEditTaskActivity::class.java)
        startActivityForResult(intent, AddEditTaskActivity.REQUEST_ADD_TASK)
    }


}
