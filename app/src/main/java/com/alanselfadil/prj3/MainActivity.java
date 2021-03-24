package com.alanselfadil.prj3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtJenisKelamin, edtNoHp, edtAlamat, edtJurusan;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtNpmDanNama);
        edtNpm  = (EditText) findViewById(R.id.editNpm);
        edtNama = (EditText) findViewById(R.id.editNama);
        edtJenisKelamin = (EditText) findViewById(R.id.editJenisKelamin);
        edtNoHp = (EditText) findViewById(R.id.editNoHp);
        edtAlamat = (EditText) findViewById(R.id.editAlamat);
        edtJurusan = (EditText) findViewById(R.id.editJurusan);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strJenisKelamin = edtJenisKelamin.getText().toString();
                String strNoHp = edtNoHp.getText().toString();
                String strAlamat = edtAlamat.getText().toString();
                String strJurusan = edtJurusan.getText().toString();

                txtTampil.setText(strNpm + "\n" + strNama);

            }
        });
    }
}