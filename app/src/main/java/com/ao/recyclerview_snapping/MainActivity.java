package com.ao.recyclerview_snapping;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ao.recyclerview_snapping.facebook.Face_Recyc;
import com.ao.recyclerview_snapping.fork.Fork_one;
import com.ao.recyclerview_snapping.recycTow.TowRecyc;
import com.ao.recyclerview_snapping.recyclOne.OneRecyc;
import com.ao.recyclerview_snapping.threeRecycl.StaggeredRecyc;


public class MainActivity extends AppCompatActivity {

	private Button mButton1;
	private Button mButton2;
	private Button mButton3;
	private Button mButton4;
	private Button mButton5;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mButton1 = findViewById(R.id.button1);
		mButton3 = findViewById(R.id.button3);


		mButton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//	Intent intent = new Intent(MainActivity.this, OneRecyc.class);
				startActivity(new Intent(MainActivity.this, OneRecyc.class));

			}
		});
		mButton2 = findViewById(R.id.button2);

		mButton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(MainActivity.this, TowRecyc.class));

			}
		});

		mButton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(MainActivity.this, StaggeredRecyc.class));

			}
		});

		mButton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(MainActivity.this, StaggeredRecyc.class));

			}
		});

		mButton4 = findViewById(R.id.button4);

		mButton4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(MainActivity.this, Face_Recyc.class));

			}
		});
		mButton5 = findViewById(R.id.button5);

		mButton5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(MainActivity.this, Fork_one.class));

			}
		});


	}
}
