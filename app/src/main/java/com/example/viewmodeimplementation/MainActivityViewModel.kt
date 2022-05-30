package com.example.viewmodeimplementation

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
private var count=0
     fun getcurrentcount():Int{
        return  count
    }

     fun getupdatedcount():Int{
        return ++count
    }

}