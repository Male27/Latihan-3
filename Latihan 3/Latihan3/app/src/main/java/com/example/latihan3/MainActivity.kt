package com.example.latihan3

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.latihan3.databinding.DialogExampleBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showDialog()
    }

    private fun showDialog() {
        val binding = DialogExampleBinding.inflate(layoutInflater)
        val dialog = AlertDialog.Builder(this)
            .setView(binding.root)
            .create()

        binding.dialogText.text = "Dialog with View Binding"
        binding.dialogButton.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}
