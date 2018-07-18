package com.example.android.genralquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private  int score = 0;
    EditText name;

    boolean hasChecked, wahasChecked, wa3hasChecked, wa4hasChecked, wa5hasChecked, answerOne, answerTwo, answerThree, wrongAnswer, rightAnswer, wrongAnswer1;
boolean wrongAnswer7, rightAnswer7, rightAnswer8, wrongAnswer8,  wrongAnswer11, wrongAnswer9, wrongAnswer9a, wrongAnswer11a, wrongAnswer12b, wrongAnswer12a, rightAnswer9, rightAnswer11, rightAnswer12, rightAnswer5, wrongAnswer5b, wrongAnswer5a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

    }
    // this is for  answer of question 1
    public void oneSelect(View view) {
        RadioButton answer1Radio = findViewById( R.id.land1 );
        wrongAnswer = answer1Radio.isChecked();
        Toast.makeText( this, "are you sure!", Toast.LENGTH_SHORT ).show();
    }
    // this is for answer of question 1
    public void twoSelect(View view) {
        RadioButton answer2Radio = findViewById( R.id.land2 );
        rightAnswer = answer2Radio.isChecked();
        Toast.makeText( this, "Great answer", Toast.LENGTH_SHORT ).show();
    }
    // this is for  answer of question 1
    public void threeSelect(View view) {
        RadioButton answer3Radio = findViewById( R.id.land3 );
        wrongAnswer1 = answer3Radio.isChecked();
        Toast.makeText( this, "Ask for help", Toast.LENGTH_SHORT ).show();
    }
    //this is for two question
    public void onClick(View view) {
        CheckBox answerCheckBox = findViewById( R.id.watr1 );
        hasChecked = answerCheckBox.isChecked();

        CheckBox answer1CheckBox = findViewById( R.id.watr2 );
        wahasChecked = answer1CheckBox.isChecked();

        CheckBox answer2CheckBox = findViewById( R.id.watr3 );
        wa3hasChecked = answer2CheckBox.isChecked();

        CheckBox answer3CheckBox = findViewById( R.id.watr4 );
        wa4hasChecked = answer3CheckBox.isChecked();

        CheckBox answer4CheckBox = findViewById( R.id.watr5 );
        wa5hasChecked = answer4CheckBox.isChecked();

        if (wahasChecked && hasChecked && wa5hasChecked && !wa3hasChecked && !wa4hasChecked) {

            Toast.makeText( this, "Right Answer", Toast.LENGTH_SHORT ).show();
        } else {
            Toast.makeText( this, "Wrong Answer", Toast.LENGTH_SHORT ).show();
        }

    }


// this for question 3
    public void selectOnc(View view) {
        RadioButton answer5bRadio = findViewById( R.id.bal );
        wrongAnswer5b = answer5bRadio.isChecked();
        Toast.makeText( this, "really!", Toast.LENGTH_SHORT ).show();
    }
    // this for question 3
    public void selectOnce(View view) {
        RadioButton answer5aRadio = findViewById( R.id.bal2 );
        wrongAnswer5a = answer5aRadio.isChecked();
        Toast.makeText( this, "Just Focus", Toast.LENGTH_SHORT ).show();
    }
    // this for question 3
    public void selectOnca(View view) {
        RadioButton answer5Radio = findViewById( R.id.bal3 );
        rightAnswer5 = answer5Radio.isChecked();
        Toast.makeText( this, "Yes, you are right", Toast.LENGTH_SHORT ).show();
    }
    //this for question 4
    public void thirdSelect(View view) {
        EditText answer = findViewById( R.id.edit_text );
        String answerOfQuestion6 = answer.getText().toString();
        if (answerOfQuestion6.equals( "Usain Bolt" )) {
            Toast.makeText( this, "You Doing Great", Toast.LENGTH_SHORT ).show();
        } else {
            Toast.makeText( this, "you sure about it!", Toast.LENGTH_SHORT ).show();
        }
    }

    // this for question 5
    public void selectOnce0(View view) {
        RadioButton answer7Radio = findViewById( R.id.lion1 );
        wrongAnswer7 = answer7Radio.isChecked();
        Toast.makeText( this, "Search for it", Toast.LENGTH_SHORT ).show();
    }
    // this for question 5
    public void selectOnce1(View view) {
        RadioButton answer7aRadio = findViewById( R.id.lion2 );
        rightAnswer7 = answer7aRadio.isChecked();
        Toast.makeText( this, "You are gladiator", Toast.LENGTH_SHORT ).show();
    }
    // this for question 5
    public void selectOnce2(View view) {
        RadioButton answer7bRadio = findViewById( R.id.lion3 );
        wrongAnswer7 = answer7bRadio.isChecked();
        Toast.makeText( this, "You should expand your knowledge", Toast.LENGTH_SHORT ).show();
    }
    // this for question 6
    public void selectTow(View view) {
        RadioButton answer8Radio = findViewById( R.id.brdge1 );
        rightAnswer8 = answer8Radio.isChecked();
        Toast.makeText( this, "Well done", Toast.LENGTH_SHORT ).show();
    }
    // this for question 6
    public void selectTow1(View view) {
        RadioButton answer8aRadio = findViewById( R.id.brdge2 );
        wrongAnswer8 = answer8aRadio.isChecked();
        Toast.makeText( this, "You are so close", Toast.LENGTH_SHORT ).show();
    }
    // this for question 6
    public void selectTow3(View view) {
        RadioButton answer8bRadio = findViewById( R.id.brdge3 );
        wrongAnswer8 = answer8bRadio.isChecked();
        Toast.makeText( this, "Don't give up ", Toast.LENGTH_SHORT ).show();
    }
    // this for question 7
    public void selectThree(View view) {
        RadioButton answer9Radio = findViewById( R.id.geo1 );
        wrongAnswer9 = answer9Radio.isChecked();
        Toast.makeText( this, "You shold study more", Toast.LENGTH_SHORT ).show();
    }
    // this for question 7
    public void selectThree1(View view) {
        RadioButton answer9aRadio = findViewById( R.id.geo2 );
        wrongAnswer9a = answer9aRadio.isChecked();
        Toast.makeText( this, "Try to google it ", Toast.LENGTH_SHORT ).show();
    }
    // this for question 7
    public void selectThree2(View view) {
        RadioButton answer9bRadio = findViewById( R.id.geo3 );
        rightAnswer9 = answer9bRadio.isChecked();
        Toast.makeText( this, "You Are So Smart", Toast.LENGTH_SHORT ).show();
    }

//this for question 8
    public void forthSelect(View view) {
        CheckBox country = findViewById( R.id.coun1 );
        answerOne = country.isChecked();
        CheckBox countryTwo = findViewById( R.id.coun2 );
        answerTwo = countryTwo.isChecked();
        CheckBox countryThree = findViewById( R.id.coun3 );
        answerThree = countryThree.isChecked();
        if (answerOne && answerTwo && answerThree) {
            Toast.makeText( this, "Genus thinking", Toast.LENGTH_SHORT ).show();
        } else {
            Toast.makeText( this, "Why is That", Toast.LENGTH_SHORT ).show();
        }
    }
//this for question 9
    public void selectFour(View view) {
        RadioButton answer11Radio = findViewById( R.id.venus1 );
        wrongAnswer11 = answer11Radio.isChecked();
        Toast.makeText( this, "Think well", Toast.LENGTH_SHORT ).show();
    }
    //this for question 9
    public void selectFour1(View view) {
        RadioButton answer11aRadio = findViewById( R.id.venus2 );
        rightAnswer11 = answer11aRadio.isChecked();
        Toast.makeText( this, "How did you know That!", Toast.LENGTH_SHORT ).show();
    }
    //this for question 9
    public void selectFour2(View view) {
        RadioButton answer11bRadio = findViewById( R.id.venus3 );
        wrongAnswer11a = answer11bRadio.isChecked();
        Toast.makeText( this, "You Will Found it in Next Try  ", Toast.LENGTH_SHORT ).show();
    }

    //this for question 10
    public void selectFive(View view) {
        RadioButton answer12aRadio = findViewById( R.id.con1 );
        wrongAnswer12b = answer12aRadio.isChecked();
        Toast.makeText( this, "Get Answer From People", Toast.LENGTH_SHORT ).show();
    }
    //this for question 10
    public void selectFive1(View view) {
        RadioButton answer12bRadio = findViewById( R.id.con2 );
        wrongAnswer12a = answer12bRadio.isChecked();
        Toast.makeText( this, "Try Harder!", Toast.LENGTH_SHORT ).show();
    }
    //this for question 10
    public void selectFive2(View view) {
        RadioButton answer12Radio = findViewById( R.id.con3 );
        rightAnswer12 = answer12Radio.isChecked();
        Toast.makeText( this, "you are legend ", Toast.LENGTH_SHORT ).show();
    }
    // this for last button called result
    public void finalResult(View view) {
        EditText playerName =  findViewById(R.id.name);
        String name = playerName.getText().toString();


        // for answer question 1
        RadioButton answer2Radio = findViewById( R.id.land2 );
        rightAnswer = answer2Radio.isChecked();
        if (rightAnswer) {
           score += 1;
        }

        //for answer of question 2
        if (wahasChecked && hasChecked && wa5hasChecked ){
            score += 3 ;
        }

        // for answer of question 3
        RadioButton answer5Radio = findViewById( R.id.bal3 );
        rightAnswer5 = answer5Radio.isChecked();
        if(rightAnswer5){
            score += 2;
        }
        // for answer of question 4
        EditText answer = findViewById( R.id.edit_text );
        String answerOfQuestion6 = answer.getText().toString();
        if (answerOfQuestion6.equals( "Usain Bolt" )){
            score += 5;
        }
        //for answer of question 5
        RadioButton answer7aRadio = findViewById( R.id.lion2 );
        rightAnswer7 = answer7aRadio.isChecked();
        if(rightAnswer7){
            score += 3;
        }
        //for answer of question 6
        RadioButton answer8Radio = findViewById( R.id.brdge1 );
        rightAnswer8 = answer8Radio.isChecked();
        if(rightAnswer8){
            score += 1;
        }
        // for answer of question 7
        RadioButton answer9bRadio = findViewById( R.id.geo3 );
        rightAnswer9 = answer9bRadio.isChecked();
        if(rightAnswer9){
            score += 5;
        }
        //for answer of question 8
        if (answerOne && answerTwo && answerThree){
            score += 3;
        }
        // for answer of question 9
        RadioButton answer11aRadio = findViewById( R.id.venus2 );
        rightAnswer11 = answer11aRadio.isChecked();
        if (rightAnswer11){
            score += 3;
        }
        //for answer of question 10
        RadioButton answer12Radio = findViewById( R.id.con3 );
        rightAnswer12 = answer12Radio.isChecked();
        if(rightAnswer12){
            score += 5;
        }
        if (score >= 25){
            Toast.makeText( this, name + " Your score is " +  score + " Fantastic work",  Toast.LENGTH_LONG ).show();
        }if (score < 25 && score > 11){
            Toast.makeText( this, name + " Your Score is " + score + " Not bad but you should study ", Toast.LENGTH_LONG ).show();
        }
        if (score <= 11){
            Toast.makeText( this, name + " Your score is " + score + " you must read and learn more ", Toast.LENGTH_LONG ).show();
        }
        score = 0;
    }
}





