package com.android.student.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import com.android.student.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.android.student.Adapter.ViewPagerAdapter;
import com.android.student.StuFragment.FirstFragment;
import com.android.student.ManFragment.ManagerFirstFragment;
import com.android.student.ManFragment.ManagerSecondFragment;
import com.android.student.ManFragment.ManagerThirdFragment;
import com.android.student.StuFragment.SecondFragment;
import com.android.student.StuFragment.ThirdFragment;
import com.android.student.DataBase.MyDatabaseHelper;
import com.android.student.App.LoginActivity;
import com.android.student.Dao.StudentDao;
import com.android.student.App.EditCheck;
import com.android.student.Entity.Student;
import com.android.student.App.MyApplication;
import com.android.student.Dao.UserDao;
import com.android.student.App.EditCheck;
import com.android.student.Entity.User;
import com.android.student.App.MyApplication;



public class YyActivity extends AppCompatActivity {

    /*private String[] names = new String[]{"新闻与传播学院", "计算机学院", "经管学院", "外国语学院", "中文学院", "自动化学院", "海洋学院"};
    private String[] descs = {
            "新闻与传播学院活动讯息。",
            "计算机学院活动讯息。",
            "经管学院活动讯息。",
            "外国语学院活动讯息。",
            "中文学院活动讯息。",
            "自动化学院活动讯息。", "海洋学院活动讯息。"
    };*/
    private String[] names = new String[]{"讲座1","讲座2","讲座3","讲座4", "讲座5", "讲座6","讲座7"};
    private String[] descs = {
            "在线讲堂",
            "新财经通识教育大讲堂。",
            "新财经通识教育大讲堂",
            "新财经通识教育大讲堂","新财经通识教育大讲堂",
            "新财经通识教育大讲堂", "新财经通识教育大讲堂"
    };
    private int[] imageIds = new int[]{R.drawable.jz1,R.drawable.jz2
            ,R.drawable.jz3,R.drawable.jz4,R.drawable.jz5,R.drawable.jz6,R.drawable.jz7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act);
        //创建一个List集合,List集合的元素是map
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", imageIds[i]);
            listItem.put("personName", names[i]);
            listItem.put("desc", descs[i]);
            listItems.add(listItem);
        }
        //创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.simple_item,
                new String[]{"personName", "header", "desc"},
                new int[]{R.id.name, R.id.header, R.id.desc});
        ListView list = (ListView) findViewById(R.id.mylist);
        //为ListView设置Adapter
        list.setAdapter(simpleAdapter);

       list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
// TODO Auto-generated method stub
                Map<String, Object> map;
                Toast.makeText(YyActivity.this, "预约成功", Toast.LENGTH_LONG).show();

            }
        });


    }
}
