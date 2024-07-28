package com.mohamadandyb.notesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/*public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}*/

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Buat daftar Person
        List<Person> people = new ArrayList<>();
        people.add(new Student("Mohamad Y.", 20, "mohamad.y@gmail.com"));
        people.add(new Student("Andy Warhol", 22, "andy_w@hotmail.com"));
        people.add(new Student("Baharuddin J.", 21, "baharuddin_j@yahoo.com"));

        // Gabungkan informasi setiap Person menjadi satu string
        StringBuilder info = new StringBuilder();
        for (Person person : people) {
            info.append("Nama: ").append(person.getName()).append("\n")
                    .append("Umur: ").append(person.getAge()).append("\n")
                    .append("Email: ").append(((Student) person).getEmail()).append("\n\n");
        }

        // Tampilkan informasi di TextView
        TextView infoTextView = findViewById(R.id.info_text_view);
        infoTextView.setText(info.toString());
    }
}


