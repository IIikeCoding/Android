package faks.android.prvilabos

import android.R
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import faks.android.prvilabos.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding
    private val NUMBER_OF_ROWS : Int = 7

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        for (i in 1..NUMBER_OF_ROWS){

            val btn1 = binding.rowOneButtonOne
            var movedBtn1 : Boolean = false
            btn1.setOnClickListener{
                movedBtn1 = moveTopButton( btn1, movedBtn1, binding.rowOneNumber)
            }

        }

        val btn1 = binding.rowOneButtonOne
        var movedBtn1 : Boolean = false
        btn1.setOnClickListener{
            movedBtn1 = moveTopButton( btn1, movedBtn1, binding.rowOneNumber)
        }

        val btn2 = binding.rowTwoButtonOne
        var movedBtn2 : Boolean = false
        btn2.setOnClickListener{
            movedBtn2 = moveTopButton( btn2, movedBtn2, binding.rowTwoNumber)
        }

        val btn3 = binding.rowThreeButtonOne
        var movedBtn3 : Boolean = false
        btn3.setOnClickListener{
            movedBtn3 = moveTopButton( btn3, movedBtn3, binding.rowThreeNumber)
        }

        val btn4 = binding.rowFourButtonOne
        var movedBtn4 : Boolean = false
        btn4.setOnClickListener{
            movedBtn4 = moveTopButton( btn4, movedBtn4, binding.rowFourNumber)
        }

        val btn5 = binding.rowFiveButtonOne
        var movedBtn5 : Boolean = false
        btn5.setOnClickListener{
            movedBtn5 = moveTopButton( btn5, movedBtn5, binding.rowFiveNumber)
        }

        val btn6 = binding.rowSixButtonOne
        var movedBtn6 : Boolean = false
        btn6.setOnClickListener{
            movedBtn6 = moveTopButton( btn6, movedBtn6, binding.rowSixNumber)
        }

        val btn7 = binding.rowSevenButtonOne
        var movedBtn7 : Boolean = false
        btn7.setOnClickListener{
            movedBtn7 = moveTopButton( btn7, movedBtn7, binding.rowSevenNumber)
        }
    }

    private fun moveTopButton(button : Button, moved : Boolean, txt : TextView): Boolean {

        return if (!moved){
            button.top += 40
            button.bottom += 40
            val currValue =  Integer.parseInt( txt.text.toString() ) + 5
            txt.text = currValue.toString()
            true
        }else{
            button.top -= 40
            button.bottom -= 40
            val currValue =  Integer.parseInt( txt.text.toString() ) - 5
            txt.text = currValue.toString()
            false
        }

    }
}