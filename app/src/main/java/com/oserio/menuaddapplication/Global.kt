package com.oserio.menuaddapplication

import android.app.Activity
import android.view.View
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import javax.security.auth.callback.Callback

fun creatMenu(activity: Activity , view: View ,titleList:MutableList<String> , callback: (String) -> Unit){
    var menu = PopupMenu(activity,view)
    for (t in titleList){
        menu.menu.add(t)
    }
    menu.show()
    menu.setOnMenuItemClickListener {

        if (it != null){
            callback(it.title.toString())
        }
        true
    }
}