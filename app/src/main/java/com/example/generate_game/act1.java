package com.example.generate_game;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class act1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);


        Intent intent = getIntent();
        String[] variat = intent.getStringArrayExtra("locations");







        String[] dofst = {"замечает ", "использует ", "бросает ", "берет ", "обижается на "};
        String[] itemsfst = {"камень", "дуб, умудренный опытом", "унылый листочек ", "берёзку", "весёлая травинка", "сварливый пень", "ключ от двери", "мох"};
        String[] perfst = {"заец", "лиса", "ежик", "бурый мишка", "загадочный лось", "старичок-боровичок", "мудрая сова"};
        String[] idun = {"могучий камень", "сталактит", "сталагмит", "лужу", "факел", "ключик"};
        String[] perdun = {"летучая мышь", "ворчливая плесень", "павук", "печальная ящерка", "сундучок"};
        String[] dodun = {"идет дальше", "смотрит наверх", "смотрит вниз"};
        String[] iri = {"могучий камень", "мост", "кувшинки", "свет на дне реки", "брошенную удочку", "унылую осоку", "кусочек хлеба", "зеленую бутылку"};
        String[] periv = {"отважным раком", "водомеркой", "говорливой лягушкой", "удивленной выдрой", "назойливой мухой", "смущенным утенком", "крикливой чайкой"};
        String[] doriv = {"поговорить с ", "поздороваться с ", "уйти с "};
        String[] doriv2 = {"пойти дальше", "устало вздохнуть", "броситься с моста"};
        Random random = new Random ();
        int p1 = random.nextInt(perfst.length);

        int i1 = random.nextInt(itemsfst.length);
        int i2 = random.nextInt(itemsfst.length);
        int d = random.nextInt(dofst.length);
        int i3 = random.nextInt(idun.length);
        int i4 = random.nextInt(idun.length);
        int i5 = random.nextInt(perdun.length);
        int i6 = random.nextInt(dodun.length);
        int i7 = random.nextInt(iri.length);
        int i8 = random.nextInt(periv.length);
        int i9 = random.nextInt(doriv.length);
        int i10 = random.nextInt(doriv2.length);

        textView.setText("Герой идет по лесу, в котором есть " + perfst[p1] + ". Он видит " + itemsfst[i1] + ", затем " + dofst[d] + itemsfst[i2] + ". Он заходит в пещеру, где находит " +
        idun[i3] + " и " + idun[i4] + ", " + dodun[i6] + ", а там " + perdun[i5] + ". Герой направляется к реке, где замечает " + iri[i7] +". Он хочет " +
        doriv[i9] + periv[i8] + ",  после чего " + doriv2[i10] );





        for (int i=0; i<variat.length; i++) {
            if (variat.equals("Лес")) {
                textView.setText("Герой идет по лесу, в котором есть " + perfst[p1] + ". Он видит " + itemsfst[i1] + ", затем " + dofst[d] + itemsfst[i2] + ". ");
            }
            if (variat.equals("Пещера")) {
                textView.setText("Он заходит в пещеру, где находит " + idun[i3] + " и " + idun[i4] + ", " + dodun[i6] + ", а там " + perdun[i5] + ". ");
            }
            if (variat.equals("Река")) {
                textView.setText("Герой направляется к реке, где замечает " + iri[i7] + ". Он хочет " + doriv[i9] + periv[i8] + ",  после чего " + doriv2[i10]);
            }

        }


        setContentView(textView);

        ActionBar actionBar =getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
