package com.example.user.buttons;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.alert1);
        button2 = (Button) findViewById(R.id.alert2);
        button3 = (Button) findViewById(R.id.alert3);

button1.setOnClickListener(new View.OnClickListener()
{
    @Override
    public void onClick(View v)
    {
        AlertDialog alertDialogBuilder = new AlertDialog.Builder(MainActivity.this).create();
        alertDialogBuilder.setTitle("Alert Dialog");
        alertDialogBuilder.setMessage("Welcome to androidHive.info");
        alertDialogBuilder.setIcon(R.drawable.tick);

        alertDialogBuilder.setButton("Ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"You clicked on Ok",Toast.LENGTH_SHORT).show();
            }

        });

        alertDialogBuilder.show();
    }
});

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                AlertDialog alertDialogBuilder = new AlertDialog.Builder(MainActivity.this).create();
                alertDialogBuilder.setTitle("Confirm Delete");
                alertDialogBuilder.setMessage("Are you sure want to delete this file");
                alertDialogBuilder.setIcon(R.drawable.delete);

                alertDialogBuilder.setButton(DialogInterface.BUTTON_POSITIVE, "YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "You clicked on YES", Toast.LENGTH_SHORT).show();
                    }
                });
                        alertDialogBuilder.setButton(DialogInterface.BUTTON_NEGATIVE, "NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "You clicked on NO", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });
                                alertDialogBuilder.show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                AlertDialog alertDialogBuilder = new AlertDialog.Builder(MainActivity.this).create();
                alertDialogBuilder.setTitle("Save file");
                alertDialogBuilder.setMessage("Are you sure want to save this file");
                alertDialogBuilder.setIcon(R.drawable.save);

                alertDialogBuilder.setButton(DialogInterface.BUTTON_POSITIVE, "YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "You clicked on YES", Toast.LENGTH_SHORT).show();
                    }
                });
                        alertDialogBuilder.setButton(DialogInterface.BUTTON_NEGATIVE,"NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "You clicked on NO", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });

                                alertDialogBuilder.setButton(DialogInterface.BUTTON_NEUTRAL,"Cancel", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(getApplicationContext(), "You clicked on CANCEL", Toast.LENGTH_SHORT).show();
                                    }
                                });

                                alertDialogBuilder.show();
            }

        });
    };
}
