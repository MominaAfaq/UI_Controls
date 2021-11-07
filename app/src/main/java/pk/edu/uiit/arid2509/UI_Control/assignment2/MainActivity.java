package pk.edu.uiit.arid2509.UI_Control.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ImageView simpleImg;
    TextView simpleText, simpleLang, bluetoothText, motive;
    EditText userName, userPass;
    RadioButton radioBtn1, radioBtn2;
    CheckBox checkEng,checkUrdu,checkChinese;
    ToggleButton bluetoothToggle;
    SeekBar seekbar;
    ImageButton imgButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        initialize();
        String name=userName.getText().toString();
        String password= userPass.getText().toString();
        simpleImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "User Id", Toast.LENGTH_LONG).show();
            }
        });

        bluetoothToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(bluetoothToggle.isChecked()){
                    bluetoothText.setText("Bluetooth is ON");
                }
                else{
                    bluetoothText.setText("Bluetooth is OFF");
                }
            }
        });

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });
        }






    private void initialize(){
         simpleText= (TextView) findViewById(R.id.simpleText);
        simpleImg= (ImageView) findViewById(R.id.simpleImg);
        userName= (EditText) findViewById(R.id.userName);
         userPass= (EditText) findViewById(R.id.userPass);
         radioBtn1= (RadioButton) findViewById(R.id.radioBtn1);
         radioBtn2= (RadioButton) findViewById(R.id.radioBtn2);
         simpleLang= (TextView) findViewById((R.id.simpleLang));
         checkEng= (CheckBox)  findViewById(R.id.checkEng);
         checkUrdu= (CheckBox)  findViewById(R.id.checkUrdu);
         checkChinese= (CheckBox)  findViewById(R.id.checkChinese);

         bluetoothText=(TextView) findViewById(R.id.bluetoothText);
         bluetoothToggle=(ToggleButton) findViewById(R.id.bluetoothToggle);
         motive= (TextView) findViewById(R.id.motive);
         seekbar=(SeekBar) findViewById(R.id.seekbar);

         imgButton=(ImageButton) findViewById(R.id.imgButton);
    }
}