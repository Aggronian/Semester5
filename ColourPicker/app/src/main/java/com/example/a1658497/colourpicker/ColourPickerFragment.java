package com.example.a1658497.colourpicker;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;

/**
 * A placeholder fragment containing a simple view.
 */
public class ColourPickerFragment extends Fragment {

    //UI Fields
    private ImageView preview_ImageView;
    private SeekBar red_SeekBar;
    private SeekBar green_SeekBar;
    private SeekBar blue_SeekBar;
    private SeekBar alpha_SeekBar;

    //RGBA Fields
    private int red = 100;
    private int green = 100;
    private int blue = 100;
    private int alpha = 255;

    public ColourPickerFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_colour_picker, container, false);

        preview_ImageView = root.findViewById(R.id.preview_ImageView);
        red_SeekBar = root.findViewById((R.id.red_SeekBar));
        green_SeekBar = root.findViewById(R.id.green_SeekBar);
        blue_SeekBar = root.findViewById(R.id.blue_SeekBar);
        alpha_SeekBar = root.findViewById(R.id.alpha_SeekBar);

        red_SeekBar.setProgress(red);
        green_SeekBar.setProgress(green);
        blue_SeekBar.setProgress(blue);
        alpha_SeekBar.setProgress(alpha);

        red_SeekBar.setOnSeekBarChangeListener(new RedHandler());
        green_SeekBar.setOnSeekBarChangeListener(new GreenHandler());
        blue_SeekBar.setOnSeekBarChangeListener(new BlueHandler());
        alpha_SeekBar.setOnSeekBarChangeListener(new AlphaHandler());


        updatePreview();

        return root;
    }

    private void updatePreview(){
        int colour = Color.argb(alpha, red, green , blue);
        preview_ImageView.setBackgroundColor(colour);
    }

    private class RedHandler implements SeekBar.OnSeekBarChangeListener{

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            red = progress;
            updatePreview();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    private class GreenHandler implements SeekBar.OnSeekBarChangeListener{

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            green = progress;
            updatePreview();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    private class BlueHandler implements SeekBar.OnSeekBarChangeListener{

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            blue = progress;
            updatePreview();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    private class AlphaHandler implements SeekBar.OnSeekBarChangeListener{

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            alpha = progress;
            updatePreview();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }
}
