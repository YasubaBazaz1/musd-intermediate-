package com.example.user.movieintermediate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_add_review.*

class AddReview : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_add_review)
    registerForContextMenu(retrev)
  }

  override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
    super.onCreateContextMenu(menu, v, menuInfo)

    if (v?.id == R.id.retrev) {
      menu?.add(1, 1001, 1, "Add")
    }
  }

  override fun onContextItemSelected(item: MenuItem?): Boolean {
    if (item?.itemId == 1001) {
      finish()
    }
    return super.onContextItemSelected(item)
  }
}
