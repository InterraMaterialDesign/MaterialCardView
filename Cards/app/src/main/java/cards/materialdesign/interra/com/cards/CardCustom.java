package cards.materialdesign.interra.com.cards;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CardCustom extends AppCompatActivity {

    private RecyclerView recycle;
    private List<Pokemon> list;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_custom);


        recycle = findViewById(R.id.recycler);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recycle.setLayoutManager(manager);


        list = new ArrayList<>();
        Pokemon pokemon = new Pokemon("Charizard", "Fire,\nFlying", "Blaze", R.drawable.charizard);
        list.add(pokemon);
        pokemon = new Pokemon("Ivysaur", "Grass,\nPoison", "Overgrow", R.drawable.ivysaur);
        list.add(pokemon);
        pokemon = new Pokemon("Clefairy", "Fairy", "Cute\nCharm", R.drawable.clefairy);
        list.add(pokemon);
        pokemon = new Pokemon("Blastoise", "Water", "Torrent", R.drawable.blastoise);
        list.add(pokemon);
        pokemon = new Pokemon("Slowking", "Water,\nPsychic", "Oblivious",R.drawable.slowking);
        list.add(pokemon);
        pokemon = new Pokemon("Lombre", "Water,\nGrass", "Swift\nSwim", R.drawable.lombre);
        list.add(pokemon);
        pokemon = new Pokemon("Ludicolo", "Water,\nGrass", "Swift\nSwim", R.drawable.ludicolo);
        list.add(pokemon);
        pokemon = new Pokemon("Pelipper", "Water,\nFlying", "Keen\nEye", R.drawable.pelipper);
        list.add(pokemon);
        pokemon = new Pokemon("Slakoth", "Normal", "Truant", R.drawable.slakoth);
        list.add(pokemon);
        pokemon = new Pokemon("Slaking", "Normal", "Truant", R.drawable.slaking);
        list.add(pokemon);
        pokemon = new Pokemon("Loudred", "Normal", "Sound\nproof", R.drawable.loudred);
        list.add(pokemon);
        pokemon = new Pokemon("Spheal", "Ice,\nWater", "Thick\nFat", R.drawable.spheal);
        list.add(pokemon);
        pokemon = new Pokemon("Piplup", "Water", "Torrent", R.drawable.piplup);
        list.add(pokemon);
        pokemon = new Pokemon("Hippopotas", "Ground", "SAnd\nStream", R.drawable.hippopotas);
        list.add(pokemon);
        pokemon = new Pokemon("Lickilicky", "Normal", "Oblivious", R.drawable.lickilicky);
        list.add(pokemon);
        pokemon = new Pokemon("Exeggutor", "Grass,\nPsychic", "Cholorophyll", R.drawable.exeggutor);
        list.add(pokemon);
        pokemon = new Pokemon("Drowzee", "Psychic", "Insomnia", R.drawable.drowzee);
        list.add(pokemon);

        PokemonCustomAdapter customAdapter = new PokemonCustomAdapter(getParent(), list);
        recycle.setAdapter(customAdapter);

    }
}
