package caidat.dmt.kt_pheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LOG extends AppCompatActivity {
    EditText edtA, edtkq;
    Button btnLOG;
    int a,kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log2);

        edtA = (EditText) findViewById(R.id.soA);
        edtkq = (EditText) findViewById(R.id.ketqua);
        btnLOG = (Button) findViewById(R.id.btn_chia);

        btnLOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(edtA.getText().toString());
                kq = a;
                edtkq.setText(String.valueOf(kq));
            }
        });
    }
}