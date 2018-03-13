package com.example.labredes.manillas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private RadioButton cuerdas;
    private RadioButton cuero;
    private RadioButton martillo;
    private RadioButton ancla;
    private RadioButton oro;
    private RadioButton plata;
    private RadioButton niquel;
    private RadioButton usd;
    private RadioButton cop;
    private Button total;
    private EditText num;
    private EditText valor;
    private Resources recursos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cuerdas= findViewById(R.id.scuerda);
        cuero= findViewById(R.id.scuero);
        martillo= findViewById(R.id.smartillo);
        ancla= findViewById(R.id.sancla);
        oro=findViewById(R.id.soro);
        plata=findViewById(R.id.splata);
        niquel=findViewById(R.id.sniquel);
        usd=findViewById(R.id.susd);
        cop= findViewById(R.id.scop);
        total=findViewById(R.id.stotal);
        num=findViewById(R.id.txtcantidad);
        valor=findViewById(R.id.txtresultado);
        recursos=this.getResources();



    }
    public double cotizar() {
        double resultado = 0;
        if (cuero.isChecked()&&martillo.isChecked()&&oro.isChecked()){
            resultado = 100;
            return resultado;
        }else  if (cuero.isChecked()&&martillo.isChecked()&&plata.isChecked()){
            resultado = 80;
            return resultado;
        }else  if (cuero.isChecked()&&martillo.isChecked()&&niquel.isChecked()) {
            resultado = 70;
            return resultado;
        }else  if (cuero.isChecked()&&ancla.isChecked()&&oro.isChecked()) {
            resultado = 120;
            return resultado;
        }else  if (cuero.isChecked()&&ancla.isChecked()&&plata.isChecked()) {
            resultado = 100;
            return resultado;
        }
        else  if (cuero.isChecked()&&ancla.isChecked()&&niquel.isChecked()) {
            resultado = 90;
            return resultado;
        }else  if (cuerdas.isChecked()&&martillo.isChecked()&&oro.isChecked()) {
            resultado = 90;
            return resultado;
        }else  if (cuerdas.isChecked()&&martillo.isChecked()&&plata.isChecked()) {
            resultado = 70;
            return resultado;
        }else  if (cuerdas.isChecked()&&martillo.isChecked()&&niquel.isChecked()) {
            resultado = 50;
            return resultado;
        }else  if (cuerdas.isChecked()&&ancla.isChecked()&&oro.isChecked()) {
            resultado = 110;
            return resultado;
        }else  if (cuerdas.isChecked()&&ancla.isChecked()&&plata.isChecked()) {
            resultado = 90;
            return resultado;
        }else  if (cuerdas.isChecked()&&ancla.isChecked()&&niquel.isChecked()) {
            resultado = 50;
            return resultado;
        }
        {
            return resultado;
        }
    }


    public void calcular(View V){
        double seleccion= cotizar(),peso=3200;
        if (validar()){
            int canti= Integer.parseInt(num.getText().toString());
            seleccion=seleccion*canti;
            if (cop.isChecked()){
                seleccion=seleccion*peso;
            }
            valor.setText(seleccion+"");
        }
    }

    public boolean validar(){
        if (num.getText().toString().isEmpty()){
            num.requestFocus();
            num.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (Double.parseDouble(num.getText().toString())<1){
            num.requestFocus();
            num.setError(recursos.getString(R.string.error_2));
            return false;
        }

        return true;
    }
    }

