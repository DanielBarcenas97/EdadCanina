package com.dan.edadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCal = findViewById<Button>(R.id.btn_calc)
        val textResult = findViewById<TextView>(R.id.textView2)
        val editText = findViewById<EditText>(R.id.et_age)

        //buttonCal.setOnClickListener {
        //    Toast.makeText(this,"Le diste click", Toast.LENGTH_SHORT).show()
        //}


        buttonCal.setOnClickListener {

            if(editText.text.toString() != ""){
                val value = editText.text.toString().toInt()
                val result = value * 7
                textResult.text = "Mi edad canina es $result"
            }else{
                Toast.makeText(this,"Favor de ingresar un valor", Toast.LENGTH_SHORT).show()
            }

        }

    }
}