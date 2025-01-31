package com.example.encuestapreferencia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Declarar las vistas
    EditText txtColor;
    EditText txtComida;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inicializar las vistas
        txtColor = findViewById(R.id.txtColor);
        txtComida = findViewById(R.id.txtComida);
        btnEnviar = findViewById(R.id.btnEnviar);

        // Configurar el clic del botón "Enviar"
        btnEnviar.setOnClickListener(v-> {

                // Obtener los valores ingresados por el usuario
                String color = txtColor.getText().toString();
                String comida = txtComida.getText().toString();

                // Mostrar un Toast con la información
                String mensaje = "Color favorito: " + color + "\nComida favorita: " + comida;
                Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_LONG).show();

        });
    }
}