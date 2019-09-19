package com.ao.recyclerview_snapping.fork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.ao.recyclerview_snapping.R;

import java.util.ArrayList;
import java.util.List;

public class Fork_one extends AppCompatActivity {

	RecyclerView recyclerView;
	Adapter_forf adapter_forf;
	RecyclerView.LayoutManager layoutManager;
	List<Contact_fork> data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fork_one);




		viewAdd();

		recycler();

	//	adapter_forf = new Adapter_forf(data, this);

		//layoutManager = new LinearLayoutManager(this);





		//recyclerView.setAdapter(adapter_forf);
		//recyclerView.setLayoutManager(layoutManager);



		//adapter_forf.notifyDataSetChanged();

	}
	public void recycler(){

		recyclerView = findViewById(R.id.recycler_fork);
		adapter_forf = new Adapter_forf(data, this);
		recyclerView.setAdapter(adapter_forf);
 		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		recyclerView.setHasFixedSize(true);

		adapter_forf.setOnClickItem(new Adapter_forf.OnClickItem() {
			@Override
			public void OnItemClick(int pos, Contact_fork contact_fork) {
				Toast.makeText(Fork_one.this, " new"+pos, Toast.LENGTH_SHORT).show();
			}
		});

		adapter_forf.setOnClickItem2(new Adapter_forf.OnClickItem() {
			@Override
			public void OnItemClick(int pos, Contact_fork contact_fork) {

				Toast.makeText(Fork_one.this, " Ahmed "+pos, Toast.LENGTH_SHORT).show();
			}
		});

	}

	public void viewAdd(){
		data = new ArrayList<>();
		for (int i = 0;  i<100; ++i){
			data.add(new Contact_fork("efefe", "efom"));
		}


	}


}
