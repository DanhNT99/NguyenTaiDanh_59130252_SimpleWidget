package vn.edu.ntu.taidanh.nguyentaidanh_59130252_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtName, edtBirthday, edtInterests;
    RadioGroup rdgGender, rdgInterests;
    RadioButton rdbMale, rdbFemale;
    CheckBox checkFilm, checkMusic, checkCafe, checkStayhouse, checkCook;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }
    public void addView(){
        edtName = findViewById(R.id.edtName);
        edtBirthday = findViewById(R.id.edtBirthday);
        edtInterests = findViewById(R.id.edtInterests);
        rdgGender = findViewById(R.id.rdgGender);
        rdgInterests = findViewById(R.id.rdgInterests);
        rdbFemale = findViewById(R.id.rdbFemale);
        rdbMale = findViewById(R.id.rdbMale);
        checkFilm = findViewById(R.id.checkFilm);
        checkMusic = findViewById(R.id.checkMusic);
        checkCafe = findViewById(R.id.checkCafe);
        checkStayhouse = findViewById(R.id.checkStayhouse);
        checkCook = findViewById(R.id.checkCook);
        button = findViewById(R.id.button);

    }
    public void addEvent(){
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               DisplayInfor();
           }
       });
    }
    private void DisplayInfor(){
       String str = edtName.getText().toString() +
               "\nNgày sinh: " + edtBirthday.getText().toString() +
               "\nGiới tính: ";
       switch (rdgGender.getCheckedRadioButtonId()) {
           case R.id.rdbMale:
               str += rdbMale.getText().toString();
               break;
           case R.id.rdbFemale:
               str += rdbFemale.getText().toString();
               break;
       }
       str += "\nSở thích: ";
     if(checkFilm.isChecked()){
         str += checkFilm.getText().toString().concat("; ");
     }
        if(checkMusic.isChecked()){
            str += checkMusic.getText().toString().concat("; ");
        }
        if(checkCafe.isChecked()){
            str += checkCafe.getText().toString().concat("; ");
        }
        if(checkStayhouse.isChecked()){
            str += checkStayhouse.getText().toString().concat("; ");
        }
        if(checkCook.isChecked()){
            str += checkCook.getText().toString().concat("; ");
        }
        str += edtInterests.getText().toString();
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
    }
}
