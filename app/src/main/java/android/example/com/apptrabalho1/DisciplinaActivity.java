package android.example.com.apptrabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisciplinaActivity extends AppCompatActivity {

    TextView cargaHoraria;
    TextView codigo;
    TextView descricao;
    TextView cargaHorariaRelogio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina);

        Disciplina dc = getIntent().getParcelableExtra("Disciplina");

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
