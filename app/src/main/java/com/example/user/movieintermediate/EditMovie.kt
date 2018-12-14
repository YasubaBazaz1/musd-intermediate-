package com.example.user.movieintermediate

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_edit_movie.*

class EditMovie : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_edit_movie)

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
        menuInflater.inflate(R.menu.editmoviemenu, menu)
        return super.onCreateOptionsMenu(menu)
      }


  override fun onOptionsItemSelected(item: MenuItem?): Boolean {
    if(item?.itemId == R.id.save) {
      //Checkboxes and intialization
      var age = findViewById<CheckBox>(R.id.chkbxage)
      var lang = findViewById<CheckBox>(R.id.chkbxlang)
      var vio = findViewById<CheckBox>(R.id.chkbxvio)

      var movieLangx2 = ""
      var movieViolencex2 = ""


    }
    else if (item?.itemId == R.id.cancel){
      var intention = Intent(applicationContext, MainActivity::class.java)
      startActivity(intention)
    }
    return super.onOptionsItemSelected(item)
  }


}
