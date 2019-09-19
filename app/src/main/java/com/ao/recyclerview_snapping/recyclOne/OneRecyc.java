package com.ao.recyclerview_snapping.recyclOne;



import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
 import androidx.recyclerview.widget.RecyclerView;

import com.ao.recyclerview_snapping.R;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

public class OneRecyc extends AppCompatActivity implements mainAdapter.ONtListener {
	RecyclerView recyclerView;
	RecyclerView.LayoutManager layoutManager;
	RecyclerView.Adapter adapter;
	ArrayList<String> mDataset;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one_recyc);
		vtnview();


		recyclerView = findViewById(R.id.recycler1);
		recyclerView.setHasFixedSize(true);
		layoutManager = new LinearLayoutManager(this);

		//SnapHelper snapHelper = new LinearSnapHelper();
	//	snapHelper.attachToRecyclerView(recyclerView);

		recyclerView.setLayoutManager(layoutManager);

		adapter = new mainAdapter(mDataset,this);
		recyclerView.setAdapter(adapter);




	}


	public void vtnview() {

		mDataset = new ArrayList<>();
		mDataset.add("New Title #$#$#$%%# @@" );
		mDataset.add("New #$#$#$%%# @@ Title" );
		mDataset.add("New Title#$#$#$%%# @@" );

		for (int i = 0; i < 50; i++) {

			mDataset.add(" #$#$#$%%# @@ New Title" + i);
		}
	}


	@Override
	public void OnClick(View view, int position) {
		mDataset.get(position);
		Toast.makeText(this, " "+position, Toast.LENGTH_SHORT).show();
	}
}
