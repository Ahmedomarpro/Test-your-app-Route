package com.ao.recyclerview_snapping.facebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.recyclerview_snapping.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Fsce_Adapter extends RecyclerView.Adapter<Fsce_Adapter.viewholder>{


	ArrayList <Integer> ImageURL = new ArrayList<>();
	Context context;

	public Fsce_Adapter(Context context, ArrayList<Integer> imageURL) {
		ImageURL = imageURL;
		this.context = context;
	}

	@NonNull
	@Override
	public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_face, parent,false);

		return new viewholder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull viewholder holder, final int position) {

		Glide.with(context)
				.asBitmap()
				.load(ImageURL.get(position))
				.into(holder.imageView);

		holder.imageView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(context, "new "+ getItemId(position),  Toast.LENGTH_SHORT).show();
			}
		});

	}

	@Override
	public int getItemCount() {
		return ImageURL.size();
	}

	public class viewholder extends RecyclerView.ViewHolder {
		ImageView imageView;
		public viewholder(@NonNull View itemView) {
			super(itemView);
			imageView = itemView.findViewById(R.id.image_face);
		}
	}
}
