package android.example.com.apptrabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DisciplinaActivity extends AppCompatActivity {

    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina);

        myListView = findViewById(R.id.listView);

        ArrayList<Disciplina> lista = getIntent().getParcelableArrayListExtra("listaDisciplinas");

        if(lista != null && lista.size() > 0){
            ArrayAdapter<Disciplina> myAdapter=  new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, lista);

            myListView.setAdapter(myAdapter);
        }
    }
}
