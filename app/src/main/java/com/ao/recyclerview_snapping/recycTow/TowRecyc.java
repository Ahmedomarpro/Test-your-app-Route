package com.ao.recyclerview_snapping.recycTow;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.recyclerview_snapping.R;

import java.util.ArrayList;


public class TowRecyc extends AppCompatActivity {

	private static final String TAG = "activity_ERROR";

	private RecyclerView mRecycler2;

	ArrayList <String> mNames = new ArrayList<>();
	ArrayList<Integer> mImageUrls = new ArrayList<Integer>();




	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tow_recyc);
		uploading();


	}

	private void uploading (){
		Log.e(TAG , "Error URLS");
		mImageUrls.add(R.drawable.ahmed);
		mNames.add("Ahmed omar ");
		mImageUrls.add(R.drawable.imgsrc);
		mNames.add("Welcome  ||Welcome new ");
		Log.e(TAG , "Error URLS");
		mImageUrls.add(R.drawable.ahmed);
		mNames.add("Ahmed omar ");
		mImageUrls.add(R.drawable.imgsrc);
		mNames.add("Welcome  ||Welcome new ");Log.e(TAG , "Error URLS");
		mImageUrls.add(R.drawable.imgsrc);
		mNames.add("Welcome new   ");
		mImageUrls.add(R.drawable.imgsrc);
		mNames.add("Welcome  ||Welcome new ");
		for (int i =0; i <50; ++i ){
			mImageUrls.add(R.drawable.imgsrc);
			mNames.add("Welcome new ||Welcome new ");

		}
			inRycyclerView();
	}

	private void inRycyclerView(){
		Log.e(TAG , "Error inRycyclerView");

		mRecycler2 = findViewById(R.id.recycler2);
		TowAdapter adapter = new TowAdapter(this,mNames,mImageUrls);
		mRecycler2.setAdapter(adapter);
		mRecycler2.setLayoutManager(new LinearLayoutManager(this));

		adapter.setOnItem_click_listener(new TowAdapter.OnItem_Click_Listener() {
			@Override
			public void onItemClick(int pot) {

				Toast.makeText(TowRecyc.this, "wwwwwwwwwwwww"+pot, Toast.LENGTH_SHORT).show();
			}
		});




	}
}
