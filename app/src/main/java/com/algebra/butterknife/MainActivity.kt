package com.algebra.butterknife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import butterknife.BindString
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class MainActivity : AppCompatActivity( ) {

    @BindView( R.id.etFirst )  lateinit var etUserName : EditText
    @BindView( R.id.etSecond ) lateinit var etPassword : EditText

    @BindString( R.string.login_error ) lateinit var  errorMassege : String
    @BindString( R.string.login_success ) lateinit var  successMassege : String

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        ButterKnife.bind( this )
    }

    @OnClick( R.id.bFirst )
    fun login( ) {
        if( etUserName.text.toString( ).isEmpty( ) ||
            etPassword.text.toString( ).isEmpty( )  )
                Toast
                    .makeText( this, errorMassege, Toast.LENGTH_LONG )
                    .show( )
        else
            Toast
                .makeText( this, successMassege, Toast.LENGTH_LONG )
                .show( )
    }



    @OnClick( R.id.bSecond )
    fun showFragment( ) {
        supportFragmentManager
            .beginTransaction( )
            .add( R.id.fragmentContainer, YellowFragment( ) )
            .commit( )
    }
}