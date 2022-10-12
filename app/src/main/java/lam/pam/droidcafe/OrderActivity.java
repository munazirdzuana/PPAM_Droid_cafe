package lam.pam.droidcafe;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.navigation.NavigationBarView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent=getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        final Spinner List = findViewById(R.id.spinner);
        List.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String nama = List.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onRadioButtonClicked(View view) {
                // Is the button now checked?
                boolean checked = ((RadioButton) view).isChecked();
                // Check which radio button was clicked.
                switch (view.getId()) {
                    case R.id.sameday:
                        if (checked)
                            // Same day service
                            displayToast(getString(R.string.same_day_messenger_service));
                        break;
                    case R.id.nextday:
                        if (checked)
                            // Next day delivery
                            displayToast(getString(R.string.next_day_ground_delivery));
                        break;
                    case R.id.pickup:
                        if (checked)
                            // Pick up
                            displayToast(getString(R.string.pick_up));
                        break;
                    default:
                        // Do nothing.
                        break;
                }
            }

            private void displayToast(String message) {
                Toast.makeText(getApplicationContext(), message,
                        Toast.LENGTH_SHORT).show();
            }

        }