package com.example.dreamcraft

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dreamInput = findViewById<EditText>(R.id.dreamInput)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val analysisResult = findViewById<TextView>(R.id.analysisResult)
        val visualizationResult = findViewById<TextView>(R.id.visualizationResult)

        saveButton.setOnClickListener {
            val dreamText = dreamInput.text.toString()
            val analysis = analyzeDream(dreamText)
            val visualization = generateDreamVisualization(dreamText)

            analysisResult.text = "Analysis Result: $analysis"
            visualizationResult.text = "Visualization: $visualization"
        }
    }

    private fun analyzeDream(dream: String): String {
        return when {
            dream.contains("falling", ignoreCase = true) -> {
                "Your dream indicates feelings of insecurity or loss of control."
            }
            dream.contains("flying", ignoreCase = true) -> {
                "Your dream represents a desire for freedom or escape from reality."
            }
            dream.contains("chased", ignoreCase = true) -> {
                "Your dream suggests you are avoiding a situation or feeling overwhelmed."
            }
            dream.contains("water", ignoreCase = true) -> {
                "Your dream symbolizes emotions and the unconscious mind."
            }
            else -> {
                "Your dream reflects a blend of your daily experiences and subconscious thoughts."
            }
        }
    }

    private fun generateDreamVisualization(dream: String): String {
        return when {
            dream.contains("falling", ignoreCase = true) -> {
                "Imagine a person falling through a vast sky, with clouds rushing by."
            }
            dream.contains("flying", ignoreCase = true) -> {
                "Visualize soaring above a beautiful landscape, feeling the wind."
            }
            dream.contains("chased", ignoreCase = true) -> {
                "Picture a tense chase through a dense forest or cityscape."
            }
            dream.contains("water", ignoreCase = true) -> {
                "Envision yourself floating peacefully on calm waters."
            }
            else -> {
                "A colorful and abstract visualization representing a mix of various elements."
            }
        }
    }
}
