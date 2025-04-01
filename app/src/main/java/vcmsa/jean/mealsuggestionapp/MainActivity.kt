package vcmsa.jean.mealsuggestionapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//code starts here
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val edTTime = findViewById<EditText>(R.id.edTTime)
        val tVMeal = findViewById<TextView>(R.id.tVMeal)

        // submit button and meal suggestions
        btnSubmit.setOnClickListener {
            val time = edTTime.text.toString()
            var meal = "SUGGESTIONS"
            tVMeal.postDelayed({

                if (time == "morning") {
                    meal = "Toast with egg, avocado and cranberries!!"
                } else if (time == "mid-morning") {
                    meal = "Yogurt, banana and peanut butter smoothie!!"
                } else if (time == "afternoon") {
                    meal = "Chicken and mayonnaise bagel!!"
                } else if (time == "mid-afternoon") {
                    meal = "Fruit salad!!"
                } else if (time == "dinner") {
                    meal = "Lamb shank with rice and vegetables!!"
                } else if (time == "after-dinner") {
                    meal = "Coffee with milk and honey!!"
                } else {
                    meal = "INVALID TIME"
                }

                tVMeal.text = meal // Display meal suggestions
            }, 1000) // Adding a delay
        }

        // reset button
        btnReset.setOnClickListener {
            edTTime.text.clear()
            tVMeal.text = "RESET SUCCESSFUL"  // reset message
            // checks if reset message has been displayed
            tVMeal.postDelayed({
                tVMeal.text = "WOULD YOU LIKE TO ENTER ANOTHER TIME?"
            }, 2000) // Adding a delay
        }
    }
}