package com.example.libreriaterceros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity() {

    private lateinit var buttonError: Button
    private lateinit var buttonSuccess: Button
    private lateinit var buttonInfo: Button
    private lateinit var buttonWarning: Button
    private lateinit var buttonNormal: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonError = findViewById(R.id.buttonError)
        buttonSuccess = findViewById(R.id.buttonSuccess)
        buttonInfo = findViewById(R.id.buttonInfo)
        buttonWarning = findViewById(R.id.buttonWarning)
        buttonNormal = findViewById(R.id.buttonNormal)

        //Boton para mostrar el color rojo
        buttonError.setOnClickListener {
            Toasty.error(baseContext, "This is an error toast.", Toast.LENGTH_SHORT, true).show()
        }

        //Boton para mostrar el color verde
        buttonSuccess.setOnClickListener {
            Toasty.success(baseContext, "Success!", Toast.LENGTH_SHORT, true).show()
        }

        //Boton para mostrar el color azul
        buttonInfo.setOnClickListener {
            Toasty.info(baseContext, "Here is some info for you.", Toast.LENGTH_SHORT, true).show()
        }

        //Boton para mostrar el color amarillo
        buttonWarning.setOnClickListener {
            Toasty.warning(baseContext, "Beware of the dog.", Toast.LENGTH_SHORT, true).show()
        }

        //Boton para mostrar texto sin color
        buttonNormal.setOnClickListener {
            //Toasty.normal(baseContext, "Normal toast w/o icon").show()
            Toasty.normal(baseContext, "Normal toast w/ icon", R.drawable.ic_backup).show();
        }
    }
}