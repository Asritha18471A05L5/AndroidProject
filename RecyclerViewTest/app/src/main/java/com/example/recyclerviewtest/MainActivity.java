package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ItemAdapter.MyInterface {
    RecyclerView rv;
    Button button;
    int totalAmount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recyclerview);
        button = findViewById(R.id.button);
        int[] images = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
        String[] item_names = {"Biryani","Chicken Lollipop","Egg Fried Rice","Tomato Rice","Chicken 65","Fish Curry","Prawns Curry","Mutton Curry","Veg Manchuria","Chicken Noodels"};
        String[] item_prices = {"150","200","250","100","300","370","400","325","250","380"};
        rv.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(this,images,item_names,item_prices,this);
        rv.setAdapter(adapter);
    }

    public void submit(View view)
    {

    }

    @Override
    public void selectedItems(String itemName, String itemPrice, int position, int totalPrice) {
        Toast.makeText(this,""+totalPrice,Toast.LENGTH_SHORT).show();
        totalAmount = totalAmount+Integer.parseInt(itemPrice);
        button.setText(String.valueOf(totalAmount));
    }
}