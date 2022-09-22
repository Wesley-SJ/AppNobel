package com.example.appnobel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;

public class LocationActivity extends AppCompatActivity {

    public static final String PREFERENCIAS_NAME = "com.example.android.localizacao";
    private static final String TRACKING_LOCATION_KEY = "tracking_location";
    private static final int REQUEST_LOCATION_PERMISSION = 1;
    private static final String LATITUDE_KEY = "latitude";
    private static final String LONGITUDE_KEY = "longitude";
    private static final String LASTDATE_KEY = "data";

    private Button mLocationButton;
    private TextView mLocationTextView;
    private static final String LASTADRESS_KEY = "adress";
    private FusedLocationProviderClient mFusedLocationClient;
    private LocationCallback mLocationCallback;

    private boolean mTrackingLocation;

    private SharedPreferences mPreferences;
    private String lastLatitude = "";
    private String lastLongitude = "";
    private String lastAdress = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_location);

        mLocationButton = findViewById(R.id.btnLocalizacao);
        mLocationTextView = findViewById(R.id.edtxtLocalizacao);

        // Inicializa FusedLocationClient.
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(
                this);

        if (savedInstanceState != null) {
            mTrackingLocation = savedInstanceState.getBoolean(
                    TRACKING_LOCATION_KEY);
        }

        mLocationButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!mTrackingLocation) {
                    startTrackingLocation();
                } else {
                    stopTrackingLocation();
                }
            }
        });
        mLocationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                // If tracking is turned on, reverse geocode into an address
                if (mTrackingLocation) {
                    new BuscarEndereco(LocationActivity.this, LocationActivity.this)
                            .execute(locationResult.getLastLocation());
                }
            }
        };

        mPreferences = getSharedPreferences(PREFERENCIAS_NAME, MODE_PRIVATE);
        recuperar();



    }


}