package escuelavirtual.escuelavirtual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class CursoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

//      Testeo de RecyclerView - Carga de items

        List<Ejercicio> ejecicios = new ArrayList<>();
        ejecicios.add(new Ejercicio(R.string.ejercicio_1));
        ejecicios.add(new Ejercicio(R.string.ejercicio_2));
        ejecicios.add(new Ejercicio(R.string.ejercicio_3));


        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new ModelAdapterEjercicio(ejecicios));
    }
}
