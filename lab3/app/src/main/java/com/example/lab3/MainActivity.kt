package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener {
            var version: String = version.text.toString()
            var codeName: String = codeName.text.toString()

            val tableRow = TableRow(this)
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT)
            tableRow.layoutParams = layoutParams

            val linearLayout = LinearLayout(this)
            linearLayout.orientation = LinearLayout.VERTICAL
            val wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT
            val matchParents = LinearLayout.LayoutParams.MATCH_PARENT
            linearLayout.layoutParams = LinearLayout.LayoutParams(matchParents, wrapContent)

            val textViewLayoutPrams = LinearLayout.LayoutParams(matchParents, wrapContent)
            textViewLayoutPrams.weight = 1f
            val textView1 = TextView(this)
            textView1.layoutParams = textViewLayoutPrams
            val textView2 = TextView(this)
            textView2.layoutParams = textViewLayoutPrams
            textView1.text = version
            textView2.text = codeName
            linearLayout.addView(textView1)
            linearLayout.addView(textView2)
            tableRow.addView(linearLayout)
            table.addView(tableRow)
        }
    }
}