package escuelavirtual.escuelavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

//      Testeo de RecyclerView - Carga de items

        List<Ejercicio> ejecicios = new ArrayList<>();
        ejecicios.add(new Ejercicio(R.string.ejercicio_1));
        ejecicios.add(new Ejercicio(R.string.ejercicio_2));
        ejecicios.add(new Ejercicio(R.string.ejercicio_3));

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso(R.string.curso_1, ejecicios));
        cursos.add(new Curso(R.string.curso_2, ejecicios));
        cursos.add(new Curso(R.string.curso_3, ejecicios));
        cursos.add(new Curso(R.string.curso_4, ejecicios));

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new ModelAdapter(cursos));
    }

    public void gotoCurso(View view){

        Intent intent = new Intent(this, CursoActivity.class);
        startActivity(intent);
    }

}
