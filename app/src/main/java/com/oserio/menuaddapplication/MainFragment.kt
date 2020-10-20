package com.oserio.menuaddapplication

import android.os.Bundle
import android.provider.ContactsContract
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.EditText
import android.widget.PopupMenu
import android.widget.Toast
import javax.security.auth.callback.Callback


class MainFragment : Fragment() {

    lateinit var et_menu : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var strArray = arrayListOf("1" , "2" , "3","4")
        et_menu = view.findViewById(R.id.et_menu)
        et_menu.isFocusable = false
        et_menu.setOnClickListener {
            creatMenu(requireActivity(),it,strArray,callback = {
                et_menu.setText(it)
            })
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
    }
}