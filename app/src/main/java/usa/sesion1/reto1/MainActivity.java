package usa.sesion1.reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 *
 * @author Ximena Ducuara
 */

/**
 *
 *Clase principal Main Activity
 */
public class MainActivity extends AppCompatActivity {
    /**
     * Variable Menu
     */
    Menu menu;
    /**
     * Variable Button
     */
    Button boton1;
    /**
     * Variable TextView
     */
    TextView texto1;
    /**
     * Variable Drawable
     */
    Drawable drawable4;
    /**
     * Variable ImageView
     */
    ImageView imagen4;

    @Override
    /**
     * constructor method
     * @param
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {

            /**
             *
             * @param
             */
            @Override
            public void onClick(View v) {
                texto1.setText("Pinta tu mundo, adorna tu casa.");
                Toast.makeText(getApplicationContext(), "♥♥♥", Toast.LENGTH_SHORT).show();
            }
        });

        texto1 =(TextView) findViewById(R.id.texto1);


    }

    @Override
    /**
     * @param
     *@return
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones,menu);
        return true;
    }

    @Override
    /**
     * method
     *@param
     *@return
     */
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opcion1) {
            Toast.makeText(getApplicationContext(), "Cuadros", Toast.LENGTH_LONG).show();
            Intent segundaPantalla = new Intent(this, MainActivity2.class);
            startActivity(segundaPantalla);
        }
        if (id == R.id.opcion2) {
            Toast.makeText(getApplicationContext(), "Personalizados", Toast.LENGTH_LONG).show();
            Intent terceraPantalla = new Intent(this, MainActivity3.class);
            startActivity(terceraPantalla);
        }
        if (id == R.id.opcion3) {
            Toast.makeText(getApplicationContext(), "Contáctanos", Toast.LENGTH_LONG).show();
            Intent cuartaPantalla = new Intent(this, MainActivity4.class);
            startActivity(cuartaPantalla);
        }
        return super.onOptionsItemSelected(item);

    }
}