package com.example.android.easytrivia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * This is Quiz app for kids which displays the Score and Name When Submit Button Pressed.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit Answers is clicked.
     */
    public void submitAnswers(View view) {
        // to get entered name //
        EditText nameText = findViewById(R.id.name_text);
        String textN = nameText.getText().toString();

        // to get radio buttons status //
        RadioButton rOneA = findViewById(R.id.radio_button_a1a);
        boolean isROneA = rOneA.isChecked();
        RadioButton rOneB = findViewById(R.id.radio_button_a1b);
        boolean isROneB = rOneB.isChecked();
        RadioButton rOneC = findViewById(R.id.radio_button_a1c);
        boolean isROneC = rOneC.isChecked();

        RadioButton rTwoA = findViewById(R.id.radio_button_a2a);
        boolean isRTwoA = rTwoA.isChecked();
        RadioButton rTwoB = findViewById(R.id.radio_button_a2b);
        boolean isRTwoB = rTwoB.isChecked();
        RadioButton rTwoC = findViewById(R.id.radio_button_a2c);
        boolean isRTwoC = rTwoC.isChecked();

        RadioButton rThreeA = findViewById(R.id.radio_button_a3a);
        boolean isRThreeA = rThreeA.isChecked();
        RadioButton rThreeB = findViewById(R.id.radio_button_a3b);
        boolean isRThreeB = rThreeB.isChecked();
        RadioButton rThreeC = findViewById(R.id.radio_button_a3c);
        boolean isRThreeC = rThreeC.isChecked();

        RadioButton rFourA = findViewById(R.id.radio_button_a4a);
        boolean isrFourA = rFourA.isChecked();
        RadioButton rFourB = findViewById(R.id.radio_button_a4b);
        boolean isRFourB = rFourB.isChecked();


        RadioButton rFiveA = findViewById(R.id.radio_button_a5a);
        boolean isRFiveA = rFiveA.isChecked();
        RadioButton rFiveB = findViewById(R.id.radio_button_a5b);
        boolean isRFiveB = rFiveB.isChecked();
        RadioButton rFiveC = findViewById(R.id.radio_button_a5c);
        boolean isRFiveC = rFiveC.isChecked();


        RadioButton rSixA = findViewById(R.id.radio_button_a6a);
        boolean isRSixA = rSixA.isChecked();
        RadioButton rSixB = findViewById(R.id.radio_button_a6b);
        boolean isRSixB = rSixB.isChecked();
        RadioButton rSixC = findViewById(R.id.radio_button_a6c);
        boolean isRSixC = rSixC.isChecked();


        RadioButton rSevenA = findViewById(R.id.radio_button_a7a);
        boolean isRSevenA = rSevenA.isChecked();
        RadioButton rSevenB = findViewById(R.id.radio_button_a7b);
        boolean isRSevenB = rSevenB.isChecked();
        RadioButton rSevenC = findViewById(R.id.radio_button_a7c);
        boolean isRSevenC = rSevenC.isChecked();

        RadioButton rEightA = findViewById(R.id.radio_button_a8a);
        boolean isREightA = rEightA.isChecked();
        RadioButton rEightB = findViewById(R.id.radio_button_a8b);
        boolean isREightB = rEightB.isChecked();

        // to get check boxes status //
        CheckBox cA = findViewById(R.id.check_box_aca);
        boolean isCA = cA.isChecked();
        CheckBox cB = findViewById(R.id.check_box_acb);
        boolean isCB = cB.isChecked();
        CheckBox cC = findViewById(R.id.check_box_acc);
        boolean isCC = cC.isChecked();

        // to get answer text //
        EditText eTwo = findViewById(R.id.answer_text);
        String isETwo = eTwo.getText().toString();

        // to submit answers to calculate method and return the score //
        int cA1 = calA1(isROneA, isROneB, isROneC);
        int cA2 = calA2(isRTwoA, isRTwoB, isRTwoC);
        int cA3 = calA3(isRThreeA, isRThreeB, isRThreeC);
        int cA4 = calA4(isrFourA, isRFourB);
        int cA5 = calA5(isRFiveA, isRFiveB, isRFiveC);
        int cA6 = calA6(isRSixA, isRSixB, isRSixC);
        int cA7 = calA7(isRSevenA, isRSevenB, isRSevenC);
        int cA8 = calA8(isREightA, isREightB);
        int cBA = calB(isCA, isCB, isCC);
        int cCA = calC(isETwo);

        // to submit score and name for create result message method and return the result message //
        String resultMessage = Result(cA1, cA2, cA3, cA4, cA5, cA6, cA7, cA8, cBA, cCA, textN);

        // to display name and score //
        {
            Toast.makeText(this, resultMessage, Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Calculates the Score of the Each Question.
     */
    private int calA1(boolean isROneA, boolean isROneB, boolean isROneC) {
        int qOneScore = 0;
        if (isROneA) {
            qOneScore = qOneScore + 1;
        }
        if (isROneB) {
            return qOneScore;
        }

        if (isROneC) {
            return qOneScore;
        }
        return qOneScore;
    }

    private int calA2(boolean isRTwoA, boolean isRTwoB, boolean isRTwoC) {
        int qTwoScore = 0;
        if (isRTwoA) {
            return qTwoScore;
        }
        if (isRTwoB) {
            return qTwoScore;
        }
        if (isRTwoC) {
            qTwoScore = qTwoScore + 1;
        }

        return qTwoScore;
    }

    private int calA3(boolean isRThreeA, boolean isRThreeB, boolean isRThreeC) {
        int qThreeScore = 0;
        if (isRThreeA) {
            qThreeScore = qThreeScore + 1;
        }

        if (isRThreeB) {
            return qThreeScore;
        }
        if (isRThreeC) {
            return qThreeScore;
        }
        return qThreeScore;
    }

    private int calA4(boolean isrFourA, boolean isrFourB) {
        int qFourScore = 0;
        if (isrFourA) {
            return qFourScore;
        }
        if (isrFourB) {
            qFourScore = qFourScore + 1;
        }

        return qFourScore;
    }

    private int calA5(boolean isRFiveA, boolean isRFiveB, boolean isRFiveC) {
        int qFiveScore = 0;
        if (isRFiveA) {
            return qFiveScore;
        }
        if (isRFiveB) {
            qFiveScore = qFiveScore + 1;
        }
        if (isRFiveC) {
            return qFiveScore;
        }
        return qFiveScore;
    }

    private int calA6(boolean isRSixA, boolean isRSixB, boolean isRSixC) {
        int qSixScore = 0;
        if (isRSixA) {
            return qSixScore;
        }
        if (isRSixB) {
            qSixScore = qSixScore + 1;
        }
        if (isRSixC) {
            return qSixScore;
        }
        return qSixScore;
    }

    private int calA7(boolean isRSevenA, boolean isRSevenB, boolean isRSevenC) {
        int qSevenScore = 0;
        if (isRSevenA) {
            qSevenScore = qSevenScore + 1;
        }
        if (isRSevenB) {
            return qSevenScore;
        }
        if (isRSevenC) {
            return qSevenScore;
        }
        return qSevenScore;
    }

    private int calA8(boolean isREightA, boolean isREightB) {
        int qEightScore = 0;
        if (isREightA) {
            qEightScore = qEightScore + 1;
        }
        if (isREightB) {
            return qEightScore;
        }

        return qEightScore;
    }

    private int calB(boolean isCA, boolean isCB, boolean isCC) {
        int qBScore = 0;
        if (isCA && isCB && isCC) {
            return qBScore;
        }
        if (isCB && isCC) {
            qBScore = qBScore + 1;
        }

        return qBScore;
    }

    private int calC(String isETwo) {
        int qCScore = 0;
        String correctAnswer = "CACTUS";
        if (isETwo.equals(correctAnswer)) {
            qCScore = qCScore + 1;
        } else {
            return qCScore;
        }
        return qCScore;
    }

    /**
     * Create Result Message.
     */
    private String Result(int cR1, int cR2, int cR3, int cR4, int cR5, int cR6, int cR7, int cR8, int cBA, int cCA, String textN) {

        String resultMessage = ("Name : " + textN);
        resultMessage += "\nYour Score Is " + (cR1 + cR2 + cR3 + cR4 + cR5 + cR6 + cR7 + cR8 + cBA + cCA) + " Out Of 10";
        resultMessage += "\nThank You!";
        return resultMessage;
    }
}