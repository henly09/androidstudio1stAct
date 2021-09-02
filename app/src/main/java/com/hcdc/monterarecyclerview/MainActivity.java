package com.hcdc.monterarecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String programName[];
    String courses[];
    String Acourses[];
    int deptImages[];

    String Acrim = "BSC";
    String Acetso = "BLIS,BSCE,BSEE,BSIT";
    String Ahostoumanage = "BSHM,BSTM";
    String Ahusocom = "BACS(JB),BACS(NMS),BACS(SC),BAE,BAP,BSP,BSSW";
    String Amaritime = "BSMT";
    String Abusman = "BSA,BSBA(FM),BSBA(HRM),BSBA(MM),BSCA,BSMA,BSREM";
    String Aeduc = "BEE,BPE,BSE(E),BSE(F),BSE(M),BSE(S),BSE(SS),BSE(ValEd/wC),BSNEG";

    String crim = "Bachelor of Science in Criminology\n";

    String cetso =
            "Bachelor of Library and Information Science\n"+
            "Bachelor of Science in Computer Engineering\n"+
            "Bachelor of Science in Electronics Engineering\n"+
            "Bachelor of Science in Information Technology\n";

    String hostoumanage =
            "Bachelor of Science in Hospitality Management\n" +
            "Bachelor of Science in Tourism Management\n";

    String husocom =
            "Bachelor of Arts in Political Science\n"+
            "Bachelor of Arts in Communication Specializing in Journalism and Broadcasting\n"+
            "Bachelor of Arts in Communication Specializing in New Media Studies\n"+
            "Bachelor of Arts in Communication Specializing in Social Communications\n"+
            "Bachelor of Arts in Economics\n"+
            "Bachelor of Arts in History\n"+
            "Bachelor of Arts in Philosophy\n"+
            "Bachelor of Science in Psychology\n"+
            "Bachelor of Science in Social Work\n";

    String maritime = "Bachelor of Science in Marine Transportation";

    String busman =
            "Bachelor of Science in Accountancy\n"+
            "Bachelor of Science in Business Administration Major in Financial Management\n"+
            "Bachelor of Science in Business Administration Major in Human Resource Management\n"+
            "Bachelor of Science in Business Administration Major in Marketing Management\n"+
            "Bachelor of Science in Customs Administration\n"+
            "Bachelor of Science in Management Accounting\n"+
            "Bachelor of Science in Real Estate Management\n";

    String educ =
            "Bachelor of Early Childhood Education\n"+
            "Bachelor of Elementary Education\n"+
            "Bachelor of Physical Education\n"+
            "Bachelor of Secondary Education Major in English\n"+
            "Bachelor of Secondary Education Major in Filipino\n"+
            "Bachelor of Secondary Education Major in Mathematics\n"+
            "Bachelor of Secondary Education Major in Science\n"+
            "Bachelor of Secondary Education Major in Social Studies\n"+
            "Bachelor of Secondary Education Major in Values Education with Catechetics\n"+
            "Bachelor of Special Needs Education Generalist";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        recyclerView = findViewById(R.id.recyclerView);

        programName = new String[] {
                "College of Criminal Justice Education",
                "College of Engineering & Technology",
                "College of Hospitality and Tourism Management",
                "College of Humanities Social Sciences & Communication",
                "College of Maritime Education",
                "School of Business & Management Education",
                "School of Teacher Education"};

        courses = new String[] {crim, cetso, hostoumanage,husocom, maritime,busman, educ};

        Acourses = new String[] {Acrim, Acetso, Ahostoumanage,Ahusocom, Amaritime,Abusman, Aeduc};

        deptImages = new int[] {
                R.drawable.crim,
                R.drawable.cetso,
                R.drawable.hotouman,
                R.drawable.husocom,
                R.drawable.maritime,
                R.drawable.busman,
                R.drawable.hcdclogo
        };

        CourseAdapter adapter = new CourseAdapter(this, programName, courses, Acourses, deptImages);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}