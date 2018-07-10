package cards.materialdesign.interra.com.cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.button.MaterialButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PokemonCustomAdapter extends RecyclerView.Adapter<PokemonCustomAdapter.PokemonCustomViewHolder> {

    private Context context;
    private List<Pokemon> list;

    PokemonCustomAdapter (Context context, List<Pokemon>list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public PokemonCustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_material_card_view, parent, false);
        return new PokemonCustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PokemonCustomViewHolder holder, int position) {

        final Pokemon model = list.get(position);

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.ability.setText(list.get(position).getAbility());
        holder.name.setText(list.get(position).getName());
        holder.type.setText(list.get(position).getType());

        boolean state = model.getState();
        if(state) {
            holder.imageButton.setImageResource(R.drawable.ic_favorite_black_24dp);
        }else {
            holder.imageButton.setImageResource(R.drawable.ic_favorite_border_black_24dp);
        }

        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean state = model.getState();
                if(state) {
                    model.setState(false);
                    holder.imageButton.setImageResource(R.drawable.ic_favorite_border_black_24dp);
                }else {
                    model.setState(true);
                    holder.imageButton.setImageResource(R.drawable.ic_favorite_black_24dp);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class PokemonCustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView type, ability,name;
        ImageButton imageButton;
        MaterialButton materialButton;

        PokemonCustomViewHolder(View view){
            super(view);

            imageView = view.findViewById(R.id.imagePoki);
            type = view.findViewById(R.id.pokiType);
            ability = view.findViewById(R.id.pokiAbility);
            name = view.findViewById(R.id.namePoki);
            imageButton = view.findViewById(R.id.imageButton2);
            materialButton = view.findViewById(R.id.textExplore);
        }
    }
}
