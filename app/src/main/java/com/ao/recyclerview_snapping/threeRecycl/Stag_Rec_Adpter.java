package com.ao.recyclerview_snapping.threeRecycl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.recyclerview_snapping.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


import java.util.ArrayList;
import java.util.List;

public class Stag_Rec_Adpter extends RecyclerView.Adapter<Stag_Rec_Adpter.ViewHolder> {


	List<threeItem> items ;

//	ArrayList<Integer> sImages = new ArrayList<>();
//	Context scontext;


	public Stag_Rec_Adpter(List<threeItem> items) {
		this.items = items;
	}

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent,false);

	//	ViewHolder v = new ViewHolder(view);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
		RequestOptions requestOptions = new RequestOptions()
				.placeholder(R.drawable.imgsrc);
		
		final threeItem item_id = items.get(position);

		Glide.with(holder.imageView)
				.asBitmap()
				.load("https://www.w-festival.com/templates/w-festival/images/w-fest-2020-logo.png")
				.into(holder.imageView);



		holder.textView.setText(item_id.sImageName);
			if(onClickItem != null){
				holder.imageView.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						onClickItem.OnItemClick(position, item_id);
					}
				});


			}



	}

	public void setOnClickItem(OnClickItem onClickItem) {
		this.onClickItem = onClickItem;
	}

	OnClickItem onClickItem;
	public interface OnClickItem{
		  void OnItemClick( int pos,threeItem threeItem);
	}

	@Override
	public int getItemCount() {
		return items.size();
	}

	public static class ViewHolder extends RecyclerView.ViewHolder {

		ImageView imageView;
		TextView textView;

		public ViewHolder(@NonNull View itemView) {
			super(itemView);

			imageView = itemView.findViewById(R.id.Image3);
			textView = itemView.findViewById(R.id.name3);

		}
	}
}
