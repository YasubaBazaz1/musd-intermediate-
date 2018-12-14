
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import com.example.user.movieintermediate.R
import kotlinx.android.synthetic.main.activity_add_movie.*

class AddMovie : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_add_movie)

      chkbxage.setOnClickListener() {
        if (chkbxage.isChecked == true) {
          chkbxvio.setVisibility(View.VISIBLE);
          chkbxlang.setVisibility(View.VISIBLE);
        } else {
          chkbxvio.setVisibility(View.INVISIBLE);
          chkbxlang.setVisibility(View.INVISIBLE);
        }
      }
    }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.addmoviemenu, menu)
    return super.onCreateOptionsMenu(menu)
  }

  override fun onOptionsItemSelected(item: MenuItem?): Boolean {
    //Checkboxes and intialization
    var age = findViewById<CheckBox>(R.id.chkbxage)
    var lang = findViewById<CheckBox>(R.id.chkbxlang)
    var vio = findViewById<CheckBox>(R.id.chkbxvio)
    var movieLangx = ""
    var movieViolencex = ""
    var language = ""



    if (rbtneng.isChecked) {
      language = "${rbtneng.text}"
    } else if (rbtnchi.isChecked) {
      language = "${rbtnchi.text}"
    } else if (rbtnmal.isChecked) {
      language = "${rbtnmal.text}"
    } else if (rbtntam.isChecked) {
      language = "${rbtntam.text}"
    }


    if (item?.itemId == R.id.add) {

      var movietitle = findViewById<EditText>(R.id.movietitle)
      var description = findViewById<EditText>(R.id.description)
      var releasedate = findViewById<EditText>(R.id.rd)


      if (releasedate.text.isNullOrEmpty()) {
        movietitle.setError("Enter a valid movie name")
      }

      else if (description.text.isNullOrEmpty()) {
        description.setError("Enter a description")
      }

      else if (releasedate.text.isNullOrEmpty()) {
        releasedate.setError("Enter a Date")

      } else if (item?.itemId == R.id.clearEntries) {
        movietitle.text.clear()
        description.text = null
        rd.text = null
        rbtntam.isChecked = false
        rbtnmal.isChecked = false
        rbtnchi.isChecked = false
        rbtneng.isChecked = false
        age.isChecked = false
        lang.isChecked = false
        vio.isChecked = false
      }
    }
  }

}
