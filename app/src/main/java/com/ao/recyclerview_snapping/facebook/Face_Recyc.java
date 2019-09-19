package com.ao.recyclerview_snapping.facebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.ao.recyclerview_snapping.R;

import java.util.ArrayList;

public class Face_Recyc extends AppCompatActivity {

	ArrayList <Integer> ImageUrl = new ArrayList<>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_face__recyc);
		uploding();
	}

	private void uploding(){
		ImageUrl.add(R.drawable.ahmed);
		ImageUrl.add(R.drawable.ahmed);
		ImageUrl.add(R.drawable.ahmed);
		ImageUrl.add(R.drawable.imgsrc);


		for (int i =0 ; i<30; ++i){

			ImageUrl.add(R.drawable.imgsrc);
			ImageUrl.add(R.drawable.ahmed);

		}

		viewRecyc();;

	}

	private void viewRecyc(){

		RecyclerView recyclerView = findViewById(R.id.recycler_face);

		Fsce_Adapter fsce_adapter = new Fsce_Adapter(this, ImageUrl);
		recyclerView.setAdapter(fsce_adapter);
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
	}
}
