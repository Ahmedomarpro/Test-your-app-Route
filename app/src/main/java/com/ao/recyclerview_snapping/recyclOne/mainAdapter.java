package com.ao.recyclerview_snapping.recyclOne;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.recyclerview_snapping.R;

import java.util.ArrayList;

class mainAdapter extends RecyclerView.Adapter<mainAdapter.ViewHolder>{
	public ArrayList<String> mDataset;
	ONtListener  ONtListener;

	public mainAdapter(ArrayList<String> mDataset,ONtListener oNtListener) {
		this.mDataset = mDataset;
		this.ONtListener = oNtListener;


	}



	@NonNull
	@Override
	public mainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

		View view =   LayoutInflater.from(parent.getContext()).inflate(R.layout.itme_view, parent,false);
		return new ViewHolder(view,ONtListener);
 	}

	@Override
	public void onBindViewHolder(@NonNull mainAdapter.ViewHolder holder, int position) {
		holder.mTitle.setText(mDataset.get(position));

	}

	@Override
	public int getItemCount() {
		return mDataset.size();

	}

	public interface ONtListener{

		void  OnClick(View view, int position);
	}



	public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
		TextView mTitle;
		ONtListener oNtListener;

		public ViewHolder(@NonNull View itemView , ONtListener oNtListener) {
			super(itemView);
			this.oNtListener = oNtListener;
			mTitle =  itemView.findViewById(R.id.Title);
			itemView.setOnClickListener(this);

		}

		@Override
		public void onClick(View view) {
			oNtListener.OnClick(view,this.getAdapterPosition());

		}
	}

}
