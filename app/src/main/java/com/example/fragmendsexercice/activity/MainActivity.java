package com.example.fragmendsexercice.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import com.example.fragmendsexercice.R;
import com.example.fragmendsexercice.fragment.ChatFragment;
import com.example.fragmendsexercice.fragment.ContactFragment;

public class MainActivity extends AppCompatActivity {
    private Button buttonChat, buttonContact;
    private ChatFragment chatFragment;
    private ContactFragment contactFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonChat = findViewById(R.id.buttonChat);
        buttonContact = findViewById(R.id.buttonContact);

        chatFragment = new ChatFragment();
        FragmentTransaction defaultTransaction = getSupportFragmentManager().beginTransaction();
        defaultTransaction.add(R.id.frameLayoutContent, chatFragment);
        defaultTransaction.commit();

        buttonContact.setOnClickListener(v -> {
            contactFragment = new ContactFragment();
            FragmentTransaction transactionContact = getSupportFragmentManager().beginTransaction();
            transactionContact.replace(R.id.frameLayoutContent, contactFragment);
            transactionContact.commit();
        });

        buttonChat.setOnClickListener(v -> {
            chatFragment = new ChatFragment();
            FragmentTransaction transactionFragment = getSupportFragmentManager().beginTransaction();
            transactionFragment.replace(R.id.frameLayoutContent, chatFragment);
            transactionFragment.commit();
        });
    }
}