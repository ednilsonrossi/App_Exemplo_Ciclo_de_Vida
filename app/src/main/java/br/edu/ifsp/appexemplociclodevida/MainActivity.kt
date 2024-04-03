package br.edu.ifsp.appexemplociclodevida

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifsp.appexemplociclodevida.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG = "CICLO_DE_VIDA"
    private var changes: Int = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.v(TAG, "Executando onCreate()")
        changes += 1
    }

    override fun onStart() {
        super.onStart()

        Log.v(TAG, "Executando onStart()")
        changes += 1
    }

    override fun onResume() {
        super.onResume()

        Log.v(TAG, "Executando onResume()")
        changes += 1

        binding.textviewChanges.text = "Mudanças de estado: $changes vezes."
    }

    override fun onPause() {
        super.onPause()

        Log.v(TAG, "Executando onPause()")
        changes += 1
    }

    override fun onStop() {
        super.onStop()

        Log.v(TAG, "Executando onStop()")
        changes += 1
    }

    override fun onDestroy() {
        Log.v(TAG, "Executando onDestroy()")

        Log.v(TAG, "Esse é meu fim, foram $changes mudanças de estados durante meu ciclo de vida.")
        super.onDestroy()
    }
}