package faks.android.prvilabos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import faks.android.prvilabos.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




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


        //ROW ONE
        val rowOneButtonTwo = binding.rowOneButtonTwo
        var movedRowOneButtonTwo = false

        val rowOneButtonThree = binding.rowOneButtonThree
        var movedRowOneButtonThree = false

        val rowOneButtonFour = binding.rowOneButtonFour
        var movedRowOneButtonFour = false

        val rowOneButtonFive = binding.rowOneButtonFive
        var movedRowOneButtonFive = false

        rowOneButtonTwo.setOnClickListener{
            movedRowOneButtonTwo = moveBottomButton(rowOneButtonTwo, true, movedRowOneButtonTwo, movedRowOneButtonThree, binding.rowOneNumber)
        }


        rowOneButtonThree.setOnClickListener{
            movedRowOneButtonThree = moveBottomButton(rowOneButtonThree, movedRowOneButtonTwo, movedRowOneButtonThree, movedRowOneButtonFour, binding.rowOneNumber)
        }

        rowOneButtonFour.setOnClickListener{
            movedRowOneButtonFour = moveBottomButton(rowOneButtonFour, movedRowOneButtonThree, movedRowOneButtonFour, movedRowOneButtonFive, binding.rowOneNumber)
        }

        rowOneButtonFive.setOnClickListener{
            movedRowOneButtonFive = moveBottomButton( rowOneButtonFive, movedRowOneButtonFour, movedRowOneButtonFive, false, binding.rowOneNumber)
        }


        // ROW TWO
        val rowTwoButtonTwo = binding.rowTwoButtonTwo
        var movedRowTwoButtonTwo = false

        val rowTwoButtonThree = binding.rowTwoButtonThree
        var movedRowTwoButtonThree = false

        val rowTwoButtonFour = binding.rowTwoButtonFour
        var movedRowTwoButtonFour = false

        val rowTwoButtonFive = binding.rowTwoButtonFive
        var movedRowTwoButtonFive = false

        rowTwoButtonTwo.setOnClickListener{
            movedRowTwoButtonTwo = moveBottomButton(rowTwoButtonTwo, true, movedRowTwoButtonTwo, movedRowTwoButtonThree, binding.rowTwoNumber)
        }


        rowTwoButtonThree.setOnClickListener{
            movedRowTwoButtonThree = moveBottomButton(rowTwoButtonThree, movedRowTwoButtonTwo, movedRowTwoButtonThree, movedRowTwoButtonFour, binding.rowTwoNumber)
        }

        rowTwoButtonFour.setOnClickListener{
            movedRowTwoButtonFour = moveBottomButton(rowTwoButtonFour, movedRowTwoButtonThree, movedRowTwoButtonFour, movedRowTwoButtonFive, binding.rowTwoNumber)
        }

        rowTwoButtonFive.setOnClickListener{
            movedRowTwoButtonFive = moveBottomButton( rowTwoButtonFive, movedRowTwoButtonFour, movedRowTwoButtonFive, false, binding.rowTwoNumber)
        }


        // ROW THREE
        val rowThreeButtonTwo = binding.rowThreeButtonTwo
        var movedRowThreeButtonTwo = false

        val rowThreeButtonThree = binding.rowThreeButtonThree
        var movedRowThreeButtonThree = false

        val rowThreeButtonFour = binding.rowThreeButtonFour
        var movedRowThreeButtonFour = false

        val rowThreeButtonFive = binding.rowThreeButtonFive
        var movedRowThreeButtonFive = false

        rowThreeButtonTwo.setOnClickListener{
            movedRowThreeButtonTwo = moveBottomButton(rowThreeButtonTwo, true, movedRowThreeButtonTwo, movedRowThreeButtonThree, binding.rowThreeNumber)
        }


        rowThreeButtonThree.setOnClickListener{
            movedRowThreeButtonThree = moveBottomButton(rowThreeButtonThree, movedRowThreeButtonTwo, movedRowThreeButtonThree, movedRowThreeButtonFour, binding.rowThreeNumber)
        }

        rowThreeButtonFour.setOnClickListener{
            movedRowThreeButtonFour = moveBottomButton(rowThreeButtonFour, movedRowThreeButtonThree, movedRowThreeButtonFour, movedRowThreeButtonFive, binding.rowThreeNumber)
        }

        rowThreeButtonFive.setOnClickListener{
            movedRowThreeButtonFive = moveBottomButton( rowThreeButtonFive, movedRowThreeButtonFour, movedRowThreeButtonFive, false, binding.rowThreeNumber)
        }


        // ROW FOUR
        val rowFourButtonTwo = binding.rowFourButtonTwo
        var movedRowFourButtonTwo = false

        val rowFourButtonThree = binding.rowFourButtonThree
        var movedRowFourButtonThree = false

        val rowFourButtonFour = binding.rowFourButtonFour
        var movedRowFourButtonFour = false

        val rowFourButtonFive = binding.rowFourButtonFive
        var movedRowFourButtonFive = false

        rowFourButtonTwo.setOnClickListener{
            movedRowFourButtonTwo = moveBottomButton(rowFourButtonTwo, true, movedRowFourButtonTwo, movedRowFourButtonThree, binding.rowFourNumber)
        }


        rowFourButtonThree.setOnClickListener{
            movedRowFourButtonThree = moveBottomButton(rowFourButtonThree, movedRowFourButtonTwo, movedRowFourButtonThree, movedRowFourButtonFour, binding.rowFourNumber)
        }

        rowFourButtonFour.setOnClickListener{
            movedRowFourButtonFour = moveBottomButton(rowFourButtonFour, movedRowFourButtonThree, movedRowFourButtonFour, movedRowFourButtonFive, binding.rowFourNumber)
        }

        rowFourButtonFive.setOnClickListener{
            movedRowFourButtonFive = moveBottomButton( rowFourButtonFive, movedRowFourButtonFour, movedRowFourButtonFive, false, binding.rowFourNumber)
        }



        // ROW FIVE
        val rowFiveButtonTwo = binding.rowFiveButtonTwo
        var movedRowFiveButtonTwo = false

        val rowFiveButtonThree = binding.rowFiveButtonThree
        var movedRowFiveButtonThree = false

        val rowFiveButtonFour = binding.rowFiveButtonFour
        var movedRowFiveButtonFour = false

        val rowFiveButtonFive = binding.rowFiveButtonFive
        var movedRowFiveButtonFive = false

        rowFiveButtonTwo.setOnClickListener{
            movedRowFiveButtonTwo = moveBottomButton(rowFiveButtonTwo, true, movedRowFiveButtonTwo, movedRowFiveButtonThree, binding.rowFiveNumber)
        }


        rowFiveButtonThree.setOnClickListener{
            movedRowFiveButtonThree = moveBottomButton(rowFiveButtonThree, movedRowFiveButtonTwo, movedRowFiveButtonThree, movedRowFiveButtonFour, binding.rowFiveNumber)
        }

        rowFiveButtonFour.setOnClickListener{
            movedRowFiveButtonFour = moveBottomButton(rowFiveButtonFour, movedRowFiveButtonThree, movedRowFiveButtonFour, movedRowFiveButtonFive, binding.rowFiveNumber)
        }

        rowFiveButtonFive.setOnClickListener{
            movedRowFiveButtonFive = moveBottomButton( rowFiveButtonFive, movedRowFiveButtonFour, movedRowFiveButtonFive, false, binding.rowFiveNumber)
        }


        // ROW SIX
        val rowSixButtonTwo = binding.rowSixButtonTwo
        var movedRowSixButtonTwo = false

        val rowSixButtonThree = binding.rowSixButtonThree
        var movedRowSixButtonThree = false

        val rowSixButtonFour = binding.rowSixButtonFour
        var movedRowSixButtonFour = false

        val rowSixButtonFive = binding.rowSixButtonFive
        var movedRowSixButtonFive = false

        rowSixButtonTwo.setOnClickListener{
            movedRowSixButtonTwo = moveBottomButton(rowSixButtonTwo, true, movedRowSixButtonTwo, movedRowSixButtonThree, binding.rowSixNumber)
        }


        rowSixButtonThree.setOnClickListener{
            movedRowSixButtonThree = moveBottomButton(rowSixButtonThree, movedRowSixButtonTwo, movedRowSixButtonThree, movedRowSixButtonFour, binding.rowSixNumber)
        }

        rowSixButtonFour.setOnClickListener{
            movedRowSixButtonFour = moveBottomButton(rowSixButtonFour, movedRowSixButtonThree, movedRowSixButtonFour, movedRowSixButtonFive, binding.rowSixNumber)
        }

        rowSixButtonFive.setOnClickListener{
            movedRowSixButtonFive = moveBottomButton( rowSixButtonFive, movedRowSixButtonFour, movedRowSixButtonFive, false, binding.rowSixNumber)
        }


        // ROW SEVEN
        val rowSevenButtonTwo = binding.rowSevenButtonTwo
        var movedRowSevenButtonTwo = false

        val rowSevenButtonThree = binding.rowSevenButtonThree
        var movedRowSevenButtonThree = false

        val rowSevenButtonFour = binding.rowSevenButtonFour
        var movedRowSevenButtonFour = false

        val rowSevenButtonFive = binding.rowSevenButtonFive
        var movedRowSevenButtonFive = false

        rowSevenButtonTwo.setOnClickListener{
            movedRowSevenButtonTwo = moveBottomButton(rowSevenButtonTwo, true, movedRowSevenButtonTwo, movedRowSevenButtonThree, binding.rowSevenNumber)
        }


        rowSevenButtonThree.setOnClickListener{
            movedRowSevenButtonThree = moveBottomButton(rowSevenButtonThree, movedRowSevenButtonTwo, movedRowSevenButtonThree, movedRowSevenButtonFour, binding.rowSevenNumber)
        }

        rowSevenButtonFour.setOnClickListener{
            movedRowSevenButtonFour = moveBottomButton(rowSevenButtonFour, movedRowSevenButtonThree, movedRowSevenButtonFour, movedRowSevenButtonFive, binding.rowSevenNumber)
        }

        rowSevenButtonFive.setOnClickListener{
            movedRowSevenButtonFive = moveBottomButton( rowSevenButtonFive, movedRowSevenButtonFour, movedRowSevenButtonFive, false, binding.rowSevenNumber)
        }



        val resultTextView = binding.finalResultTextView
        val plusButton = binding.plusButton
        plusButton.setOnClickListener{

            val currValue = Integer.parseInt(resultTextView.text.toString()) + getCurrentNumberValue()

            resultTextView.text = currValue.toString()


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

    private fun moveBottomButton(buttonToMove: Button,
                                 buttonAboveMoved : Boolean,
                                 moved: Boolean,
                                 buttonBelowMoved : Boolean,
                                 txt: TextView,
                                ) : Boolean {

        return if(!moved and buttonAboveMoved){

            buttonToMove.top -= 90
            buttonToMove.bottom -= 90
            val currValue =  Integer.parseInt( txt.text.toString() ) + 1
            txt.text = currValue.toString()
            true

        }else return if(moved and !buttonBelowMoved){

            buttonToMove.top += 90
            buttonToMove.bottom += 90
            val currValue =  Integer.parseInt( txt.text.toString() ) - 1
            txt.text = currValue.toString()
            false

        }else{

            return moved
        }

    }


    private fun getCurrentNumberValue(): Int{
        val numberOne = Integer.parseInt(binding.rowOneNumber.text.toString())
        val numberTwo = Integer.parseInt(binding.rowTwoNumber.text.toString())
        val numberThree = Integer.parseInt(binding.rowThreeNumber.text.toString())
        val numberFour = Integer.parseInt(binding.rowFourNumber.text.toString())
        val numberFive = Integer.parseInt(binding.rowFiveNumber.text.toString())
        val numberSix = Integer.parseInt(binding.rowSixNumber.text.toString())
        val numberSeven = Integer.parseInt(binding.rowSevenNumber.text.toString())

        return numberSeven + numberSix*10 + numberFive*100 + numberFour*1000 + numberThree*10000 + numberTwo*100000 + numberOne*1000000
    }

}