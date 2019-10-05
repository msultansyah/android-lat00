package id.ac.poliban.mi.sultan.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //konten view dihubungkan dengan koding
        //java kita
        setContentView(R.layout.activity_main);

        //menghubungkan view dengan source code kita
        Button btFirst = findViewById(R.id.btPertama);
        Button btSecond = findViewById(R.id.btKedua);
        Button btThird = findViewById(R.id.btKetiga);
        Button btFourth= findViewById(R.id.btKeempat);

        //interface onClickListener merupakan interface yang ada dikelas View
        //hanya berisi satu method onClick(View view)

        //berikut kode memasang onClickListener onclick pada object button
        btFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei Anda Telah menekan Tombol Nuklir", Toast.LENGTH_SHORT).show();
            }
        });

        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei Anda Telah menekan Tombol Rudal", Toast.LENGTH_SHORT).show();
            }
        });

        btThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei Anda Telah Menekan Tombol Torpedo", Toast.LENGTH_SHORT).show();
            }
        });

        btFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei Anda Telah Menekan Tombol Roket", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
