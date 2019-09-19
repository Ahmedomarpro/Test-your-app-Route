package com.ao.recyclerview_snapping.fork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.recyclerview_snapping.R;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter_forf extends RecyclerView.Adapter<Adapter_forf.View_Holder> {

	List<Contact_fork> contact_forks;
	Context context;

	public Adapter_forf(List<Contact_fork> contact_forks, Context context) {
		this.contact_forks = contact_forks;
		this.context = context;
	}

	@NonNull
	@Override
	public View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fork, parent,false);


		return new View_Holder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull View_Holder holder, final int position) {
		final Contact_fork id_contact_fork =  contact_forks.get(position);

		holder.nemeFork1.setText(id_contact_fork.nameOne);

		holder.nemeFork2.setText(id_contact_fork.nameTow);

		if (onClickItem != null){
			holder.nemeFork1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onClickItem.OnItemClick(position,  id_contact_fork);
				}
			});
		}
		if (onClickItem2 != null){
			holder.nemeFork2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onClickItem2.OnItemClick(position, id_contact_fork);
				}
			});
		}


	}

	public void setOnClickItem(OnClickItem onClickItem) {
		this.onClickItem = onClickItem;
	}

	OnClickItem onClickItem;
	OnClickItem onClickItem2;

	public void setOnClickItem2(OnClickItem onClickItem2) {
		this.onClickItem2 = onClickItem2;
	}


	public interface OnClickItem{

		void OnItemClick(int pos, Contact_fork contact_fork);
	}

	@Override
	public int getItemCount() {
		if ( contact_forks == null)return 0;
		return contact_forks.size();
	}

	public class View_Holder extends RecyclerView.ViewHolder {
		TextView nemeFork1,nemeFork2;

		public View_Holder(@NonNull View itemView) {
			super(itemView);

			nemeFork1 = itemView.findViewById(R.id.textfork1);
			nemeFork2 = itemView.findViewById(R.id.textfork2);

		}
	}
}
