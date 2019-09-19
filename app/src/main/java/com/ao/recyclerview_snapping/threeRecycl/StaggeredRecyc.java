package com.ao.recyclerview_snapping.threeRecycl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.ao.recyclerview_snapping.R;
import com.ao.recyclerview_snapping.recycTow.TowAdapter;

import java.util.ArrayList;
import java.util.List;

import static android.media.CamcorderProfile.get;

public class StaggeredRecyc extends AppCompatActivity {

	private static final int NUM_COLUMNS = 2;

		List<threeItem>data ;

	Stag_Rec_Adpter  stag_rec_adpter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_staggered_recyc);
		uploding();
	}

	public void uploding (){

		data  = new ArrayList<>();
		data.add(new threeItem("ddd","https://www.w-festival.com/templates/w-festival/images/w-fest-2020-logo.png"));

		for (int i =0; i <50; ++i ){
		//sImageUrls.add(R.drawable.imgsrc);
		//sNames.add("Welcome new ||Welcome new ");
			data.add(new threeItem("ddd","https://www.w-festival.com/templates/w-festival/images/w-fest-2020-logo.png"));

	}
	inRycyclerView();
}
	private void inRycyclerView(){

	RecyclerView mRecycler3 = findViewById(R.id.recycler3);

 stag_rec_adpter = new Stag_Rec_Adpter(data);
 stag_rec_adpter.setOnClickItem(new Stag_Rec_Adpter.OnClickItem() {
	 @Override
	 public void OnItemClick(int pos, threeItem threeItem) {
		 Toast.makeText(StaggeredRecyc.this, " ece"+pos , Toast.LENGTH_SHORT).show();
	 }
 });
		StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayout.VERTICAL);
		mRecycler3.setLayoutManager(staggeredGridLayoutManager);
		mRecycler3.setAdapter(stag_rec_adpter);



	}

}
