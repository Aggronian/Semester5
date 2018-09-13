package com.example.a1658497.tipcalculator;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class TipCalculatorFragment extends android.support.v4.app.Fragment implements View.OnClickListener {

    private EditText billTotalEditText;
    private Button calculateButton;
    private TextView tip10TextView;
    private TextView tip15TextView;
    private TextView tip20TextView;
    private TextView total10TextView;
    private TextView total15TextView;
    private TextView total20TextView;




    public TipCalculatorFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tip_calculator, container, false);

        //Initialize UI
        billTotalEditText = root.findViewById(R.id.billTotal_EditText);
        calculateButton = root.findViewById(R.id.calculate_Button);
        tip10TextView = root.findViewById(R.id.tip10_TextView);
        tip15TextView = root.findViewById(R.id.tip15_TextView);
        tip20TextView = root.findViewById(R.id.tip20_TextView);
        total10TextView = root.findViewById(R.id.total10_TextView);
        total15TextView = root.findViewById(R.id.total15_TextView);
        total20TextView = root.findViewById(R.id.total20_TextView);


        billTotalEditText.setText("10.50");
        updateTipAmount(10.5);

        calculateButton.setOnClickListener(this);
        billTotalEditText.addTextChangedListener(this);
        return root;
    }

    private void updateTipAmount (double billTotal)
    {
        tip10TextView.setText("$" + billTotal * 0.1);
        tip15TextView.setText("$" + billTotal * 0.15);
        tip20TextView.setText("$" + billTotal * 0.2);
        total10TextView.setText("$" + billTotal * 1.1);
        total15TextView.setText("$" + billTotal * 1.15);
        total20TextView.setText("$" + billTotal * 1.2);

    }
    //Callback for button Click
    @Override
    public void onClick(View v)
    {
        String billTotalStr = billTotalEditText.getText().toString();
        double billTotal = Double.valueOf(billTotalStr);
        updateTipAmount(billTotal);
    }

}
