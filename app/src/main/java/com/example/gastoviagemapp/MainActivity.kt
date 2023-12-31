package com.example.gastoviagemapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.gastoviagemapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding //lateinit indica que a variável será instanciada posteriormente
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //View Binding para conectar layout ao codigo

        binding.btnCalcular.setOnClickListener(this) //Quando botão for clicado será enviada a referência do mesmo para o método onclick

    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_calcular) {
            calcular()
        }
    }

    private fun validaCampos() : Boolean {
        return (binding.edtDistancia.text.toString() != ""
                && binding.edtPreco.text.toString() != ""
                && binding.edtAutonomia.text.toString() != ""
                && binding.edtAutonomia.text.toString().toFloat() != 0f)
    }

    private fun calcular() {
        if(validaCampos()) {
            val distancia = binding.edtDistancia.text.toString().toFloat()
            val preco = binding.edtPreco.text.toString().toFloat()
            val autonomia = binding.edtAutonomia.text.toString().toFloat()

            val valorTotal = (distancia * preco) / autonomia

            binding.tvValortotal.text = "R$ ${"%.2f".format(valorTotal)}"
        } else {
            Toast.makeText(this, R.string.preencha_todos_campos, Toast.LENGTH_SHORT).show()
        }
    }

}