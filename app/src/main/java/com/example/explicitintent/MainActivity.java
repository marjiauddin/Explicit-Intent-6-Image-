package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView kuakataTV, satlabilTV, horinghataTV, durgasagorTV, gutiamosqueTV, guavamarketTV;
    private ImageButton kuakataBtn, satlabilBtn, horinghataBtn, durgasagorBtn, gutiamosqueBtn, guavamarketBtn;
    private String kuakata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kuakataTV = findViewById(R.id.kuakataTV);
        satlabilTV = findViewById(R.id.satlabilTV);
        horinghataTV = findViewById(R.id.horinghataTV);
        durgasagorTV = findViewById(R.id.durgasagorTV);
        gutiamosqueTV = findViewById(R.id.gutiamosqueTV);
        guavamarketTV = findViewById(R.id.guavamarketTV);

        kuakataBtn = findViewById(R.id.kuakataBtn);
        satlabilBtn = findViewById(R.id.satlabilBtn);
        horinghataBtn = findViewById(R.id.horinghataBtn);
        durgasagorBtn = findViewById(R.id.durgasagorBtn);
        gutiamosqueBtn = findViewById(R.id.gutiamosqueBtn);
        guavamarketBtn = findViewById(R.id.guavamarketBtn);

      /*  kuakataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kuakata=kuakataBtn.toString();

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra(kuakata,"image");
                startActivity(intent);
            }
        });*/



    }

    public void picShow(View view) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        switch (view.getId()) {
            case R.id.kuakataBtn:
                intent.putExtra("title","kuakata");
                intent.putExtra("img",R.drawable.kuakata);
                intent.putExtra("description"," Kuakata, locally known as sagar kannya (Daughter of the Sea) is a rare scenic spot located on the southernmost tip of Bangladesh. Kuakata in Latachapli union under Kalapara Police Station of Patuakhali district is about 30 km in length and 6 km in breadth. It is 70 km from Patuakhali district headquarters and 320 km from Dhaka. An excellent combination of the picturesque natural beauty, sandy beaches, blue sky and the shimmering expanse of water of the Bay of Bengal and the evergreen forest makes Kuakata a much sought after tourist destination.");
                break;
            case R.id.satlabilBtn:
                intent.putExtra("title","Satla Bil");
                intent.putExtra("img",R.drawable.satlabil);
                intent.putExtra("description","Satla Beel is situated in the Satla (Village), Satla (Union) of Uzirpur, Barisal, Bangladesh.The area of the beel is about 200 acres and that is 60 km away from Barisal City, Bangladesh. The beel is called “Shaplar Beel” as the total area of the beel is full of Shapla (water lilies) that is the blessing of Almighty. And that is why we can say that Satla is the kingdom of red water lilies as the maximum area of the beel is full of red water lilies. Eventually, the local people of the region are feeling proud of having this kind of natural beauty. The beauty of the kingdom can exist for about 5 months (June-July to October-November). The original beauty of the beel of red lilies can be enjoyed best at dawn till 8 AM as well as in the afternoon. Actually, 3 kinds of water lilies can be observed in Satla beel area and those are red colored lilies, white colored lilies, and pink colored lilies.");
                break;
            case R.id.horinghataBtn:
                intent.putExtra("title","Horinghata");
                intent.putExtra("img",R.drawable.horinghata);
                intent.putExtra("description"," Haringhata  is one of the most spectacular visiting places in Pathorghata area. Here, a beautiful forest is situated in the lap of the sea. Besides the forest and the sea, one can also observe the congregation of several deer at this spot. It is a remarkably pleasant sight of blue waters of the sea, green trees of the forest and beautiful deer roaming around in the area." );
                break;
            case R.id.durgasagorBtn:
                intent.putExtra("title","Durga Sagar");
                intent.putExtra("img",R.drawable.durgasagar);
                intent.putExtra("description"," Durga Sagar, known locally as Madhabpasha Dighi, is the largest lake in southern Bangladesh. It has a total area of about 2500 hectares. The lake is about 11 kilometres (6.8 mi) away from Barisal city. Rani Durgabati, mother of Raja Joy Narayan, had the pond excavated in 1780. There is a small island in the middle of the lake; this island was originally not part of the lake - it was created artificially to beautify and increase tourist attraction." );
                break;
            case R.id.gutiamosqueBtn:
                intent.putExtra("title","Gutia Mosque");
                intent.putExtra("img",R.drawable.gutiamosque);
                intent.putExtra("description"," The Baitul Aman Jame Masjid Complex (Bengali: বাইতুল আমান জামে মসজিদ), commonly known as Guthia Mosque of Barisal, is a mosque complex of Bangladesh having a land area of 14 acres, comparing to the 8.30 acres land area of the national mosque Baitul Mukarram of the country. The Baitul Aman Jame Masjid Complex consists of a Mosque, a huge Eidgah, a graveyard, three lakes, Madrasa and an orphanage.Established on December 16, 2003, Guthia Mosque is also a tourist spot in Bangladesh." );
                break;
            case R.id.guavamarketBtn:
                intent.putExtra("title","Guava Market");
                intent.putExtra("img",R.drawable.guavamarket);
                intent.putExtra("description","  The southern region of Bangladesh is famous for guavas, more popularly known in Bangladesh as ‘Bengal’s Apple’. Especially in Jhalakathi Sadar Upazila and at Swarupkathi and Banaripara Upazila in Pirozpur, farmers heavily rely on guava farming. Such diversity of life is hardly to be found in other places of the country. Loss in guava farming in one season usually leads to extreme distress for the farmers throughout the year. The current year is one of those." );
                break;

        }
        startActivity(intent);
    }
}
