package info.androidhive.rxjavasearch.adapter;

/**
 * Created by ravi on 31/01/18.
 */

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import info.androidhive.rxjavasearch.R;
import info.androidhive.rxjavasearch.network.model.Contact;
import info.androidhive.rxjavasearch.network.model.Person;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder> {
    private Context context;
    private List<Person> personList;
    private ContactsAdapterListener listener;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, phone;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
            phone = view.findViewById(R.id.phone);
            thumbnail = view.findViewById(R.id.thumbnail);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // send selected contact in callback
                    listener.onContactSelected(personList.get(getAdapterPosition()));
                }
            });
        }
    }


    public ContactsAdapter(Context context, List<Person> personList, ContactsAdapterListener listener) {
        this.context = context;
        this.listener = listener;
        this.personList = personList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_row_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Person person = personList.get(position);
        holder.name.setText(person.getFirstName());
        holder.phone.setText(person.getLastName());

/*        Glide.with(context)
                .load(person.getProfileImage())
                .apply(RequestOptions.circleCropTransform())
                .into(holder.thumbnail);*/
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public interface ContactsAdapterListener {
        void onContactSelected(Person person);
    }
}
