package com.example.user.movieintermediate

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    registerForContextMenu(text)
  }
  override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
    super.onCreateContextMenu(menu, v, menuInfo)

    if(v?.id == R.id.text) {
      menu?.add(1,1002,1,"Add")
    }
  }

  override fun onContextItemSelected(item: MenuItem?): Boolean {
    if (item?.itemId ==1002){
      //Redirect to add movie
      val intented = Intent(this@MainActivity, AddMovie::class.java )
      startActivity(intented)
    }
    return super.onContextItemSelected(item)
  }
}


