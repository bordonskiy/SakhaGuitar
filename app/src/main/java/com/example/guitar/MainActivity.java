package com.example.guitar;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {

    //Создаём массив разделов:
    private String titles[] = {
            "01. Айыы Уола - Бэлэхтээ",
            "02. Айыы Уола - Сардаана сибэкки",
            "03. Айталина Дьячковская - Мин тапталым эйиэхэ",
            "04. Аскалон Павлов - Тыаллаах туун",
            "05. Байанай - Дойдум сарсыардата",
            "06. Байанай - Дойдум сонуна",
            "07. Дапсы - Ыллаа, ыллаа",
            "08. Дыгын - Дьоллоохтук айаннаа",
            "09. Ирина Елизарова - Сулустар",
            "10. Константин Иванов - Ардахха санаа",
            "11. Михаил Семенов - Эргэрбит хаартыскалар",
            "12. Михаил Семенов - Эргэрбит хаартыскалар",
            "13. Михаил Семенов - Эргэрбит хаартыскалар",
            "14. Михаил Семенов - Эргэрбит хаартыскалар",
            "15. Михаил Семенов - Эргэрбит хаартыскалар",
            "16. Михаил Семенов - Эргэрбит хаартыскалар",
            "17. Михаил Семенов - Эргэрбит хаартыскалар",
            "18. Михаил Семенов - Эргэрбит хаартыскалар",
            "19. Михаил Семенов - Эргэрбит хаартыскалар",
            "20. Михаил Семенов - Эргэрбит хаартыскалар",
            "21. Михаил Семенов - Эргэрбит хаартыскалар",
            "22. Михаил Семенов - Эргэрбит хаартыскалар",
            "23. Михаил Семенов - Эргэрбит хаартыскалар",
            "24. Михаил Семенов - Эргэрбит хаартыскалар",
            "25. Михаил Семенов - Эргэрбит хаартыскалар",
            "26. Михаил Семенов - Эргэрбит хаартыскалар",
            "27. Михаил Семенов - Эргэрбит хаартыскалар",
            "28. Михаил Семенов - Эргэрбит хаартыскалар",
            "29. Михаил Семенов - Эргэрбит хаартыскалар",
            "30. Михаил Семенов - Эргэрбит хаартыскалар",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получим идентификатор ListView
        ListView listView = findViewById(R.id.listView);
        //устанавливаем массив в ListView
        listView.setAdapter(
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, titles));
        listView.setTextFilterEnabled(true);

        //Обрабатываем щелчки на элементах ListView:
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, DetailActivity.class);

                intent.putExtra("title", position);

                //запускаем вторую активность
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0,0,0,"Понравившиеся");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() == 0)
        {
            Intent intentLike = new Intent(MainActivity.this, LikeActivity.class);
            startActivity(intentLike);
        }
        return super.onOptionsItemSelected(item);
    }
}