package com.example.a1658497.editnote;

import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;

/**
 * A placeholder fragment containing a simple view.
 */
public class EditNoteFragment extends Fragment {

    //UI Fields
    private CircleView pinkCircle;
    private CircleView orangeCircle;
    private CircleView beigeCircle;
    private CircleView limeCircle;
    private CircleView lightblueCircle;
    private CircleView skyblueCircle;
    private CircleView purpleCircle;
    private CircleView brownCircle;
    private ConstraintLayout bg;
    private Switch settingsSwitch;
    private LinearLayout colourArea;

    private Integer bgColor;


    public EditNoteFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_edit_note, container, false);

        //Get items from fragment
        pinkCircle = root.findViewById((R.id.pink_Circle));
        orangeCircle = root.findViewById((R.id.orange_Circle));
        beigeCircle = root.findViewById((R.id.beige_Circle));
        limeCircle = root.findViewById((R.id.lime_Circle));
        lightblueCircle = root.findViewById((R.id.lightBlue_Circle));
        skyblueCircle = root.findViewById((R.id.skyBlue_Circle));
        purpleCircle = root.findViewById((R.id.purple_Circle));
        brownCircle = root.findViewById((R.id.brown_Circle));
        bg = root.findViewById(R.id.background);
        settingsSwitch = root.findViewById(R.id.settings_Switch);
        colourArea = root.findViewById(R.id.colours_LineraLayout);

        //Create events
        settingsSwitch.setOnClickListener(new settingsHandler());
        pinkCircle.setOnClickListener(new pinkCircleHandler());
        orangeCircle.setOnClickListener(new orangeCircleHandler());
        beigeCircle.setOnClickListener(new beigeCircleHandler());
        limeCircle.setOnClickListener(new limeCircleHandler());
        lightblueCircle.setOnClickListener(new lightblueCircleHandler());
        skyblueCircle.setOnClickListener(new skyblueCircleHandler());
        purpleCircle.setOnClickListener(new purpleCircleHandler());
        brownCircle.setOnClickListener(new brownCircleHandler());


        return root;
    }

    private void updateBG()
    {
        bg.setBackgroundColor(bgColor);
    }
    //Show/Hide the Colour picker and Reminder
    private  class settingsHandler implements Switch.OnClickListener
    {
        @Override
        public void onClick(View v) {
            switch (colourArea.getVisibility())
            {
                case View.VISIBLE:
                    colourArea.setVisibility(View.GONE);
                    break;
                case View.GONE:
                    colourArea.setVisibility(View.VISIBLE);
                    break;
            }
        }
    }

    //region Colour Pickers

    private class pinkCircleHandler implements CircleView.OnClickListener
    {
        @Override
        public void onClick(View v) {
            CircleView circleView = (CircleView) v;
            bgColor = circleView.getColor();
            updateBG();
        }
    }

    private class orangeCircleHandler implements CircleView.OnClickListener
    {
        @Override
        public void onClick(View v) {
            CircleView circleView = (CircleView) v;
            bgColor = circleView.getColor();
            updateBG();
        }
    }

    private class beigeCircleHandler implements CircleView.OnClickListener
    {
        @Override
        public void onClick(View v) {
            CircleView circleView = (CircleView) v;
            bgColor = circleView.getColor();
            updateBG();
        }
    }

    private class limeCircleHandler implements CircleView.OnClickListener
    {
        @Override
        public void onClick(View v) {
            CircleView circleView = (CircleView) v;
            bgColor = circleView.getColor();
            updateBG();
        }
    }

    private class lightblueCircleHandler implements CircleView.OnClickListener
    {
        @Override
        public void onClick(View v) {
            CircleView circleView = (CircleView) v;
            bgColor = circleView.getColor();
            updateBG();
        }
    }

    private class skyblueCircleHandler implements CircleView.OnClickListener
    {
        @Override
        public void onClick(View v) {
            CircleView circleView = (CircleView) v;
            bgColor = circleView.getColor();
            updateBG();
        }
    }

    private class purpleCircleHandler implements CircleView.OnClickListener
    {
        @Override
        public void onClick(View v) {
            CircleView circleView = (CircleView) v;
            bgColor = circleView.getColor();
            updateBG();
        }
    }

    private class brownCircleHandler implements CircleView.OnClickListener
    {
        @Override
        public void onClick(View v) {
            CircleView circleView = (CircleView) v;
            bgColor = circleView.getColor();
            updateBG();
        }
    }
    //endregion

}
