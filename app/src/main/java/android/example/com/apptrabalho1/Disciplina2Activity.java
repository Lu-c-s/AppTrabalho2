package android.example.com.apptrabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class Disciplina2Activity extends AppCompatActivity {
    TextView cargaHoraria;
    TextView codigo;
    TextView descricao;
    TextView cargaHorariaRelogio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina2);

        ArrayList<Disciplina> listaDisciplina = getIntent().getParcelableArrayListExtra("listaDisciplinas");

        Log.i("stesda",listaDisciplina.get(0).getDescricao());

        if(listaDisciplina != null){

            Disciplina dc = listaDisciplina.get(1);

            Log.i("carga",String.valueOf(dc.getCargaHoraria()));
            Log.i("codigo",String.valueOf(dc.getCodigo()));
            Log.i("desc",dc.getDescricao());
            Log.i("carga2",String.valueOf(dc.convertCargaToHora()));

            cargaHoraria = findViewById(R.id.cargaHorario);
            codigo = findViewById(R.id.codigo);
            descricao = findViewById(R.id.descricao);
            cargaHorariaRelogio = findViewById(R.id.cargaHorarioRelogio);

            String cargaHorariaPlace = "Carga Horária: "+ String.valueOf(dc.getCargaHoraria());
            String codigoPlace = "Codigo: " + String.valueOf(dc.getCodigo());
            String descricaoPlace = "Descrição: " + dc.getDescricao();
            String cargaHorariaRelogioPlace = "Carga  Horária(converted): " + String.valueOf(dc.convertCargaToHora());

            cargaHoraria.setText(cargaHorariaPlace);
            codigo.setText(codigoPlace);
            descricao.setText(descricaoPlace);
            cargaHorariaRelogio.setText(cargaHorariaRelogioPlace);
        }




    }
}
