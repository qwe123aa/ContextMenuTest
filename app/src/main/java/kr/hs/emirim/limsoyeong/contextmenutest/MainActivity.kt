package kr.hs.emirim.limsoyeong.contextmenutest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var btn1 : Button
    lateinit var btn2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "컨텍스트 메뉴 연습"
        linear = findViewById(R.id.linear)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)

        registerForContextMenu(btn1)
        registerForContextMenu(btn2)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        var mInflater = this.menuInflater
        if(v===btn1){
            menu!!.setHeaderTitle("배경색 변경")
            mInflater.inflate(R.menu.menu1, menu)
        }

        if(v===btn1){
            mInflater.inflate(R.menu.menu2, menu)
        }

    }

}