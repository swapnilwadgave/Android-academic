package e.santosh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ans;
    Button b,b1,b2,b3;
    EditText val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1=(EditText)findViewById(R.id.editText);
        val2=(EditText)findViewById(R.id.editText2);
        b=(Button)findViewById(R.id.button);
        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button4);
        ans=(TextView)findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=Integer.parseInt(val1.getText().toString());
                int j=Integer.parseInt(val2.getText().toString());
                int k=i+j;
                ans.setText(" "+k);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=Integer.parseInt(val1.getText().toString());
                int j=Integer.parseInt(val2.getText().toString());
                int k=i-j;
                ans.setText(" "+k);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=Integer.parseInt(val1.getText().toString());
                int j=Integer.parseInt(val2.getText().toString());
                int k=i*j;
                ans.setText(" "+k);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=Integer.parseInt(val1.getText().toString());
                int j=Integer.parseInt(val2.getText().toString());
                int k=i/j;
                ans.setText(" "+k);
            }
        });
    }
}
