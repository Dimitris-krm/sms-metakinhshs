package com.wdk.sms;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;

import androidx.annotation.NonNull;


public class MainActivity extends Activity {


   public static String  PACKAGE_NAME;

    EditText stoixeia;
    EditText stoixeia2;
    EditText logosxd;

    Button send_sms;
    Button button;
    Button button2;
    Button button3;
    Button button4;

    RadioButton logos1;
    RadioButton logos2;
    RadioButton logos3;
    RadioButton logos4;
    RadioButton logos5;
    RadioButton logos6;

    RadioGroup logoi;


    int checked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BUTTONS
        button= (Button)findViewById(R.id.button);
        button2= (Button)findViewById(R.id.button2);
        button3= (Button)findViewById(R.id.button3);
        button4= (Button)findViewById(R.id.button4);
        send_sms=(Button)findViewById(R.id.button1);

        //EDITTEXT
        stoixeia=(EditText)findViewById(R.id.stoixeia);
        stoixeia2=(EditText)findViewById(R.id.stoixeia2);
        logosxd=(EditText)findViewById(R.id.logosxd);


        //Radio Buttons
        logoi = (RadioGroup)findViewById(R.id.logoi);
        logos1 = (RadioButton)findViewById(R.id.logos1);
        logos2 = (RadioButton)findViewById(R.id.logos2);
        logos3 = (RadioButton)findViewById(R.id.logos3);
        logos4 = (RadioButton)findViewById(R.id.logos4);
        logos5 = (RadioButton)findViewById(R.id.logos5);
        logos6 = (RadioButton)findViewById(R.id.logos6);

        PACKAGE_NAME = getApplicationContext().getPackageName();



        final  SharedPreferences savedFields;

        savedFields = this.getSharedPreferences("stoixeiaios", 0);
        stoixeia.setText(savedFields.getString("stoixeiadieth", ""));
        stoixeia2.setText(savedFields.getString("stoixeiaonoma", ""));


        float textSize = savedFields.getFloat("megethos1",33);
        logos1.setTextSize(pxToDp(textSize));
        float textSize2 = savedFields.getFloat("megethos2",33);
        logos2.setTextSize(pxToDp(textSize2));
        float textSize3 = savedFields.getFloat("megethos3",33);
        logos3.setTextSize(pxToDp(textSize3));
        float textSize4 = savedFields.getFloat("megethos4",33);
        logos4.setTextSize(pxToDp(textSize4));
        float textSize5 = savedFields.getFloat("megethos5",33);
        logos5.setTextSize(pxToDp(textSize5));
        float textSize6 = savedFields.getFloat("megethos6",33);
        logos6.setTextSize(pxToDp(textSize6));





/*

        logos1.setTextSize(savedFields.getFloat("megethos1",12));
        logos2.setTextSize(savedFields.getFloat("megethos2",12));
        logos3.setTextSize(savedFields.getFloat("megethos3",12));
        logos4.setTextSize(savedFields.getFloat("megethos4",12));
        logos5.setTextSize(savedFields.getFloat("megethos5",12));
        logos6.setTextSize(savedFields.getFloat("megethos6",12));

*/


button2.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View view) {


        AlertDialog.Builder alertadd = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater factory = LayoutInflater.from(MainActivity.this);
        view = factory.inflate(R.layout.sample, null);
        alertadd.setView(view);
        alertadd.setNeutralButton("Κλείσιμο", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dlg, int sumthin) {

            }
        });

        alertadd.show();
    }
});



button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {


                SharedPreferences.Editor preferencesEditor = savedFields.edit();
             /*   logos1.setTextSize(TypedValue.COMPLEX_UNIT_PX,22);
                logos1.setTextSize(TypedValue.COMPLEX_UNIT_PX,22);
                logos2.setTextSize(TypedValue.COMPLEX_UNIT_PX,22);
                logos3.setTextSize(TypedValue.COMPLEX_UNIT_PX,22);
                logos4.setTextSize(TypedValue.COMPLEX_UNIT_PX,22);
                logos5.setTextSize(TypedValue.COMPLEX_UNIT_PX,22);
                logos6.setTextSize(TypedValue.COMPLEX_UNIT_PX,22);
*/

                logos1.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos1.getTextSize() - 2);
                logos2.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos2.getTextSize() - 2);
                logos3.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos3.getTextSize() - 2);
                logos4.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos4.getTextSize() - 2);
                logos5.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos5.getTextSize() - 2);
                logos6.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos6.getTextSize() - 2);

                preferencesEditor.putFloat("megethos1", logos1.getTextSize());
                preferencesEditor.putFloat("megethos2", logos2.getTextSize());
                preferencesEditor.putFloat("megethos3", logos3.getTextSize());
                preferencesEditor.putFloat("megethos4", logos4.getTextSize());
                preferencesEditor.putFloat("megethos5", logos5.getTextSize());
                preferencesEditor.putFloat("megethos6", logos6.getTextSize());

                preferencesEditor.commit();
            }
        });


button3.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View view) {
        SharedPreferences.Editor preferencesEditor = savedFields.edit();

        logos1.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos1.getTextSize() + 2);
        logos2.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos2.getTextSize() + 2);
        logos3.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos3.getTextSize() + 2);
        logos4.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos4.getTextSize() + 2);
        logos5.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos5.getTextSize() + 2);
        logos6.setTextSize(TypedValue.COMPLEX_UNIT_PX,logos6.getTextSize() + 2);


        /*logos1.setTextSize(TypedValue.COMPLEX_UNIT_PX,35);
        logos2.setTextSize(TypedValue.COMPLEX_UNIT_PX,35);
        logos3.setTextSize(TypedValue.COMPLEX_UNIT_PX,35);
        logos4.setTextSize(TypedValue.COMPLEX_UNIT_PX,35);
        logos5.setTextSize(TypedValue.COMPLEX_UNIT_PX,35);
        logos6.setTextSize(TypedValue.COMPLEX_UNIT_PX,35);

         */
        preferencesEditor.putFloat("megethos1", logos1.getTextSize());
        preferencesEditor.putFloat("megethos2", logos2.getTextSize());
        preferencesEditor.putFloat("megethos3", logos3.getTextSize());
        preferencesEditor.putFloat("megethos4", logos4.getTextSize());
        preferencesEditor.putFloat("megethos5", logos5.getTextSize());
        preferencesEditor.putFloat("megethos6", logos6.getTextSize());


        preferencesEditor.commit();
}
});






        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("Πληροφορίες Εφαρμογής");
                builder.setMessage("Η συγκεκριμένη εφαρμογή δεν αποτελεί σε καμία περίπτωση επίσημη εφαρμογή της Κυβέρνησης\n\nΗ εφαρμογή έχει δημιουργηθεί άπο φοιτητή πληροφορικής \n\n\nΓια οποιαδήποτε ερώτηση ή πρόταση για την βελτίωση της εφαρμογής παρακαλώ επικοινωνείστε μαζί μου στο email : wdkaramatskos@gmail.com");
                builder.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });



        logoi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                checked =radioGroup.indexOfChild(findViewById(i));
                switch (checked){
                    case 0:
                        logosxd.setText("1");
                        break;
                    case 1:
                        logosxd.setText("2");
                        break;
                    case 2:
                        logosxd.setText("3");
                        break;
                    case 3:
                        logosxd.setText("4");
                        break;
                    case 4:
                        logosxd.setText("5");
                        break;
                    case 5:
                        logosxd.setText("6");
                        break;
                }

            }
        });
     /*   ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS}, SEND_SMS_PERIMSSION_REQUEST_CODE);       AMA DEN ΛΕΙΤΟΥΡΓΕΙ RREMOVE*/

       /* if (checkPermission(Manifest.permission.SEND_SMS)){
            send_sms.setEnabled(true);
        }
        else    {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS}, SEND_SMS_PERIMSSION_REQUEST_CODE);
        } */



        send_sms.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

              final  String msg=stoixeia.getText().toString();
               final String msg2=stoixeia2.getText().toString();
               final String logos=logosxd.getText().toString();

                if (logoi.getCheckedRadioButtonId() == -1)
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setTitle("ΠΡΟΣΟΧΗ");
                    builder.setMessage("Δεν έχετε επιλέξει λόγο μετακίνησης");
                    builder.setPositiveButton("Ok",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });

                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setTitle("Προσοχή");
                    builder.setMessage("Είναι σωστά τα στοιχεία που συμπληρώσατε?\n" + logos + " " + msg2 + " " + msg);
                    builder.setNegativeButton("Οχι", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    builder.setPositiveButton("Ναι",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("sms","13033",null));
                                intent.putExtra("sms_body",logos + " " + msg2 + " " + msg);
                                startActivity(intent);

                                }
                            });

                    AlertDialog dialog = builder.create();
                    dialog.show();

                    SharedPreferences.Editor preferencesEditor = savedFields.edit();

                    preferencesEditor.putString("stoixeiadieth", stoixeia.getText().toString());
                    preferencesEditor.putString("stoixeiaonoma", stoixeia2.getText().toString());

                    preferencesEditor.commit();
                }


            }
        });

    }



    public int pxToDp(float px) {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

/*public boolean checkPermission(String permission){
        int check = ContextCompat.checkSelfPermission(this,permission);
        return   (check == PackageManager.PERMISSION_GRANTED);
}*/
}