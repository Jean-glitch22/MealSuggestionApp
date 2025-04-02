package vcmsa.jean.mealsuggestionapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log as log


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

            log.d("mealApp", "submit button clicked. Time entered: $time")

            tVMeal.postDelayed({


                if (time.equals("morning", ignoreCase = true)) {
                    meal = "Toast with egg, avocado and cranberries!! or \n Oatmeal with banana and peanut butter!!"
                } else if (time.equals("mid-morning", ignoreCase = true)) {
                    meal = "Yogurt, banana and peanut butter smoothie!! or \n Avocado and banana smoothie!!"
                } else if (time.equals("afternoon", ignoreCase = true)) {
                    meal = "Chicken and mayonnaise bagel!! or \n Turkey and cheese bagel!!"
                } else if (time.equals("mid-afternoon", ignoreCase = true)) {
                    meal = "Fruit salad!! or \n Apple and bananas!!"
                } else if (time.equals("dinner", ignoreCase = true)) {
                    meal = "Lamb shank with rice and vegetables!! or \n Chicken and rice with vegetables!!"
                } else if (time.equals("after-dinner", ignoreCase = true)) {
                    meal = "Coffee with milk and honey!! or \n Tea with milk and honey!!"
                } else {
                    log.d("mealApp", "Invalid time entered: $time")
                    meal = "INVALID TIME"
                }
                log.d("mealApp", "Meal suggestion: $meal")
                tVMeal.text = meal // Display meal suggestions
            }, 1000) // Adding a delay by 1 second
        }

        // reset button
        btnReset.setOnClickListener {
            edTTime.text.clear()
            tVMeal.text = "RESET SUCCESSFUL"  // reset message
            log.d("mealApp", "Reset button clicked")

            // checks if reset message has been displayed
            tVMeal.postDelayed({
                tVMeal.text = "WOULD YOU LIKE TO ENTER ANOTHER TIME?"
                log.d("mealApp", "Reset message displayed")
            }, 2000) // Adding a delay by 2 seconds
        }
    }
}