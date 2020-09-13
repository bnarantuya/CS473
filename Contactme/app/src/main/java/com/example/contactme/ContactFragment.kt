package com.example.contactme

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_contact.*

class ContactFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    fun webHandler(url:String) {
        val intent = Intent(activity, WebActivity::class.java)
        val bundle = Bundle()
        bundle.putString("url", url)
//        intent.putExtra("url", url)
        intent.putExtras(bundle)
        activity?.startActivity(intent)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        facebook.setOnClickListener {
            webHandler("https://www.facebook.com/n.batjargal")
        }
        twitter.setOnClickListener {
            webHandler("https://www.twitter.com")
        }
    }
}