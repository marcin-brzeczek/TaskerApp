package mbitsystem.com.taskerapp.books

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_books.*
import mbitsystem.com.taskerapp.R
import mbitsystem.com.taskerapp.util.addFragmentToActivity


class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        // Set up the toolbar.
        setSupportActionBar(findViewById(R.id.toolbar))

        supportActionBar?.apply {
            setHomeAsUpIndicator(R.drawable.ic_menu)
            setDisplayHomeAsUpEnabled(true)
        }
        drawer_layout.setStatusBarBackground(R.color.colorPrimaryDark)

        if (supportFragmentManager.findFragmentById(R.id.contentFrame) == null) {
            addFragmentToActivity(supportFragmentManager, BooksFragment(), R.id.contentFrame)
        }
    }
}
