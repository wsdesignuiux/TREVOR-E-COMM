package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wolfsoft.datingapp.ForgotPasswordActivity;
import com.wolfsoft.datingapp.FromCategory;
import com.wolfsoft.datingapp.HomeActivity;
import com.wolfsoft.datingapp.LoginActivity;
import com.wolfsoft.datingapp.MostLiked;
import com.wolfsoft.datingapp.Details;
import com.wolfsoft.datingapp.ProductDetailActivity;
import com.wolfsoft.datingapp.Profile;
import com.wolfsoft.datingapp.Promote;
import com.wolfsoft.datingapp.R;
import com.wolfsoft.datingapp.SettingsActivity;
import com.wolfsoft.datingapp.SignUpActivity;
import com.wolfsoft.datingapp.StartScreenActivity;
import com.wolfsoft.datingapp.WalkthroughActivity;

import java.util.ArrayList;

import modelclass.ListModel;

/**
 * Created by wolfsoft4 on 22/8/18.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    Context context;
    private ArrayList<ListModel> listModelArrayList;

    public ListAdapter(Context context, ArrayList<ListModel> listModelArrayList) {
        this.context = context;
        this.listModelArrayList = listModelArrayList;
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListAdapter.ViewHolder holder, final int position) {
        holder.title.setText(listModelArrayList.get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                    Intent i = new Intent(context, StartScreenActivity.class);
                    context.startActivity(i);}
                else if(position==1){
                    Intent i = new Intent(context, WalkthroughActivity.class);
                    context.startActivity(i);}
                else if(position==2){
                    Intent i = new Intent(context, SignUpActivity.class);
                    context.startActivity(i);}
                else if(position==3){
                    Intent i = new Intent(context,LoginActivity.class);
                    context.startActivity(i);}
                else if(position==4){
                    Intent i = new Intent(context, ForgotPasswordActivity.class);
                    context.startActivity(i);}
                else if(position==5){
                    Intent i = new Intent(context, HomeActivity.class);
                    context.startActivity(i);}
                else if(position==6){
                    Intent i = new Intent(context, ProductDetailActivity.class);
                    context.startActivity(i);}

                else if(position==7){
                    Intent i = new Intent(context, MostLiked.class);
                    context.startActivity(i);}
                else if(position==8){
                    Intent i = new Intent(context, FromCategory.class);
                    context.startActivity(i);}
                else if(position==9){
                    Intent i = new Intent(context, Promote.class);
                    context.startActivity(i);}
                else if(position==10){
                    Intent i = new Intent(context, Details.class);
                    context.startActivity(i);}
                else if(position==11){
                    Intent i = new Intent(context, Profile.class);
                    context.startActivity(i);}
                else if(position==12){
                    Intent i = new Intent(context, SettingsActivity.class);
                    context.startActivity(i);}



            }
        });


    }

    @Override
    public int getItemCount() {
        return listModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        public ViewHolder(View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.title);
        }
    }
}
