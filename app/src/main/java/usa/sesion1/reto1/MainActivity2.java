package usa.sesion1.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    Drawable drawable1, drawable2, drawable3;
    ImageView imagen1, imagen2, imagen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //--------------------------------------------------

        Resources res1 =getResources();
        drawable1 = res1.getDrawable(R.drawable.dos, getTheme());

        imagen1 = (ImageView) findViewById(R.id.imagen1);
        imagen1.setImageDrawable(drawable1);

        //---------------------------------------------------------------

        Resources res2 =getResources();
        drawable2 = res2.getDrawable(R.drawable.tres, getTheme());

        imagen2 = (ImageView) findViewById(R.id.imagen2);
        imagen2.setImageDrawable(drawable2);

        //--------------------------------------------------------------

        Resources res3 =getResources();
        drawable3 = res3.getDrawable(R.drawable.uno, getTheme());

        imagen3 = (ImageView) findViewById(R.id.imagen3);
        imagen3.setImageDrawable(drawable3);
    }
}