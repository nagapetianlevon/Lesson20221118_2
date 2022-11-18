package ru.myitschool.lesson20221118_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import ru.myitschool.lesson20221118_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    /*TextView outputtext;
    EditText inputName, inputPhone;
    FloatingActionButton button;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.getRoot();


        binding.add.setOnClickListener(view -> {String name = binding.InputName.getText().toString();
            String phone = binding.InputPhone.getText().toString();
            binding.outputText.append(name + "\n" + phone + "\n");
        });



       /* outputtext = (TextView) findViewById(R.id.outputText);
        inputName = findViewById(R.id.InputName);
        inputPhone = findViewById(R.id.InputPhone);
        button = findViewById(R.id.add);*/



       /* button.setOnClickListener(view -> outputtext.append(inputName.getText().toString()+"\n"+inputPhone.getText().toString())) ;*/




    }


}