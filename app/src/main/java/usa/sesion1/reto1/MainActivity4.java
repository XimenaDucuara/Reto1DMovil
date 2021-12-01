package usa.sesion1.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    Button boton2;
    TextView texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        boton2 = (Button) findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto2.setText("Gracias por escribirnos");
                Toast.makeText(getApplicationContext(), "Enviado", Toast.LENGTH_SHORT).show();
            }
        });

        texto2 = (TextView) findViewById(R.id.texto2);



    }
}