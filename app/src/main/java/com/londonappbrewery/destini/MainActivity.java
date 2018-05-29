package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    Story mStoryIndex;

    Story allStory = new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2,
            new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2,
                    new Story(R.string.T6_End, 0, 0, null, null),
                    new Story(R.string.T5_End, 0, 0, null, null)),
            new Story(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2,
                    new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2,
                            new Story(R.string.T6_End, 0, 0, null, null),
                            new Story(R.string.T5_End, 0, 0, null, null)),
                    new Story(R.string.T4_End, 0, 0, null, null))
            );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        mStoryIndex = allStory;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(true);
            }
        });

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(false);
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }

    private void updateStory(boolean answer){
        mStoryIndex = (answer) ? mStoryIndex.nextStory1: mStoryIndex.nextStory2;
        mStoryTextView.setText(mStoryIndex.getIdStoryTextView());
        if(mStoryIndex.getIdAnswer1() != 0){
            mButtonTop.setText(mStoryIndex.getIdAnswer1());
            mButtonBottom.setText(mStoryIndex.getIdAnswer2());
        }else{
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }
    }
}