package com.example.refaldiday06;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.refaldiday06.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(binding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String namaHero = getIntent().getStringExtra("nama");
        String roleHero = getIntent().getStringExtra("role");
        String laneHero = getIntent().getStringExtra("lane");
        int fotoHero = getIntent().getIntExtra("foto", 1);

        binding.nama.setText(namaHero);
        binding.role.setText(roleHero);
        binding.foto.setImageResource(fotoHero);
        binding.lane.setText(laneHero);

        binding.share.setOnClickListener( v -> {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_SEND);
            i.putExtra(Intent.EXTRA_TEXT, "Nama Hero : " + namaHero + "\n" + "Role Hero : " + roleHero + "\n"
                  + "Lane Hero : " + laneHero + " Lane");
            i.setType("text/plain");
            startActivity(i);
        });
    }
}