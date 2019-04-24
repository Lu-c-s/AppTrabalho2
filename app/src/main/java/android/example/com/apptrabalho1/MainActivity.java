package android.example.com.apptrabalho1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {
    Button goToDisciplina;
    Button goToDisciplina2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        goToDisciplina = findViewById(R.id.button);
        goToDisciplina.setOnClickListener(goToDisplinaListener);

        goToDisciplina2 = findViewById(R.id.button2);
        goToDisciplina2.setOnClickListener(goToDisplina2Listener);

    }

    private View.OnClickListener goToDisplinaListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Disciplina dc = new Disciplina(1000,9000, "Calculo1");

            Log.i("main",String.valueOf(dc.getCodigo()));
            Log.i("main",String.valueOf(dc.getCargaHoraria()));
            Log.i("main",String.valueOf(dc.getDescricao()));

            Intent i = new Intent(MainActivity.this, DisciplinaActivity.class);
            i.putExtra("Disciplina", dc);
            startActivity(i);
        }
    };

    private View.OnClickListener goToDisplina2Listener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            Disciplina dc1 = new Disciplina(1001,9000, "Calculo1");
            Disciplina dc2 = new Disciplina(1002,8000, "Calculo2");
            Disciplina dc3  = new Disciplina(1003,7000, "Calculo3");
            Disciplina dc4  = new Disciplina(1004,7000, "Calculo4");
            Disciplina dc5  = new Disciplina(1005,7000, "Calculo5");

            ArrayList<Disciplina> dcs = new ArrayList<>(asList(dc1,dc2,dc3));

            Intent i = new Intent(MainActivity.this, Disciplina2Activity.class);
            i.putParcelableArrayListExtra("listaDisciplinas", dcs);
            startActivity(i);
        }
    };



}
