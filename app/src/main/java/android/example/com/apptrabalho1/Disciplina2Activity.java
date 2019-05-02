package android.example.com.apptrabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Disciplina2Activity extends AppCompatActivity {
    GridView myGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina2);

        myGridView = findViewById(R.id.gridView);

        ArrayList<Disciplina> listaDisciplina = getIntent().getParcelableArrayListExtra("listaDisciplinas");

        if(listaDisciplina != null){
            ArrayAdapter<Disciplina> myAdapter=  new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, listaDisciplina);

            myGridView.setAdapter(myAdapter);
        }
    }
}
