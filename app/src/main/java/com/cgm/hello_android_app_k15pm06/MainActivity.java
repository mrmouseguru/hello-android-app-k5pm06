package com.cgm.hello_android_app_k15pm06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.cgm.hello_android_app_k15pm06.entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.productListView);

        List<Product> productListData = Arrays.asList(
                new Product("Sam sung galaxy s 21", 1500, "ss.jpg"),
                new Product("Iphone 15 promax", 2000, "ip.jpg")
        );

        ArrayAdapter<Product> adapter =
                new ArrayAdapter<Product>
                        (this, android.R.layout.simple_list_item_1, productListData);
        listView.setAdapter(adapter);
    }
}