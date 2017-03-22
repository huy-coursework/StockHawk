package com.udacity.stockhawk.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.udacity.stockhawk.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChartActivity extends AppCompatActivity {
    public static final String EXTRA_SYMBOL = "EXTRA_SYMBOL";

    @BindView(R.id.chart_symbol)
    TextView symbolTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        ButterKnife.bind(this);

        // Show the given stock symbol.
        if (getIntent() != null && getIntent().hasExtra(EXTRA_SYMBOL)) {
            String symbol = getIntent().getStringExtra(EXTRA_SYMBOL);
            symbolTextView.setText(symbol);
        }
    }
}
