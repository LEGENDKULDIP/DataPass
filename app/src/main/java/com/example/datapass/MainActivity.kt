package com.example.datapass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var btnListView: Button
    lateinit var btnRecyclerView: Button
    lateinit var btnAlertBox: Button
    lateinit var btnSnackBar: Button
    lateinit var btnPassData: Button
    lateinit var btnView: Button

    lateinit var mainLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnListView = findViewById(R.id.btnListView)
        btnRecyclerView = findViewById(R.id.btnRecyclerView)
        btnAlertBox = findViewById(R.id.btnAleretBox)
        btnSnackBar = findViewById(R.id.btnSnackBar)
        btnPassData = findViewById(R.id.btnPassData)
//        mainLayout = findViewById(R.id.mainLayout)

        btnListView.setOnClickListener(btnClickEvents)
        btnListView.setOnClickListener(btnClickEvents)
        btnAlertBox.setOnClickListener(btnClickEvents)
        btnSnackBar.setOnClickListener(btnClickEvents)
        btnPassData.setOnClickListener(btnClickEvents)
    }
        private val btnClickEvents = View.OnClickListener {
        when (view.id){
R.id
        }
        }
}