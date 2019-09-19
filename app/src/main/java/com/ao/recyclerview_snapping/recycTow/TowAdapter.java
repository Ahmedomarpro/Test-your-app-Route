package com.ao.recyclerview_snapping.recycTow;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.recyclerview_snapping.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class TowAdapter extends RecyclerView.Adapter<TowAdapter.ViewHolder> {

	private static final String ATG = "RecyclerView_ERROR";

	public ArrayList<String> mImageName = new ArrayList<>();
	ArrayList<Integer> mImages = new ArrayList<>();
	Context context;

	public TowAdapter(Context context , ArrayList<String> mImageName, ArrayList<Integer> mImages) {
		this.mImageName = mImageName;
		this.mImages = mImages;
		this.context = context;
	}

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itme_tow, parent,false);

		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
		Log.e(ATG, "onBindViewHolder :: onBindViewHolder");

		Glide.with(context)
				.asBitmap()
				.load(mImages.get(position))
				.into(holder.image);

		holder.imageName.setText(mImageName.get(position));

/*
		holder.parntLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Log.e(ATG, "onClick :"+mImageName.get(position));

				Toast.makeText(context, "NEW "+ getItemId(position), Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(context,IntentRecycl.class);
				intent.putExtra("image_url", mImages.get(position));
				intent.putExtra("image_Name", mImageName.get(position));
				context.startActivity(intent);
			}
		});
*/
		/*
		holder.imageName.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(context, " "+mImageName.get(position)+ getItemId(position), Toast.LENGTH_SHORT).show();

			}
		});
*/

		if (onItem_click_listener != null){

			holder.imageName.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onItem_click_listener.onItemClick(position);
				}
			});
		}


	}

	public void setOnItem_click_listener(OnItem_Click_Listener onItem_click_listener) {
		this.onItem_click_listener = onItem_click_listener;
	}

	OnItem_Click_Listener onItem_click_listener;

	public interface OnItem_Click_Listener{
		void onItemClick(int pot );
	}

	@Override
	public int getItemCount() {
		return mImages.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		CircleImageView image;
		TextView imageName;
		RelativeLayout parntLayout;
		public ViewHolder(@NonNull View itemView) {
			super(itemView);
			image = itemView.findViewById(R.id.image1);
			imageName = itemView.findViewById(R.id.image_name);
			parntLayout = itemView.findViewById(R.id.Rel_View);

		}
	}
}
