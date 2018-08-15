package cubex.mahesh.mvp_ex_aug6am.view

import android.database.Cursor

interface IncExpViewAPI {

    fun  addResponse(msg:String)
    fun  readResponse(c:Cursor)

}