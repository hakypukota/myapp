package com.example.a3krivk20.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View.OnClickListener;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Polyline;

public class MainActivity extends AppCompatActivity implements OnClickListener
{

    MapView mv;



    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);

        // This line sets the user agent, a requirement to download OSM maps
        Configuration.getInstance().load(this, PreferenceManager.getDefaultSharedPreferences(this));

        setContentView(R.layout.activity_main);

        mv = (MapView)findViewById(R.id.map1);

        mv.setBuiltInZoomControls(true);
        mv.getController().setZoom(16);
        mv.getController().setCenter(new GeoPoint(56.9692,24.0990));

        Button b = (Button)findViewById(R.id.btn1);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText et = (EditText)findViewById(R.id.latET);
        EditText et2 = (EditText)findViewById(R.id.longET);
        double et_1 = Double.parseDouble(et.getText().toString());
        double et_2 = Double.parseDouble(et2.getText().toString());
        mv.getController().setCenter(new GeoPoint(et_1,et_2));
    }
}