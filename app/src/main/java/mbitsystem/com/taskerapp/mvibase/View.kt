package mbitsystem.com.taskerapp.mvibase

import io.reactivex.Observable


interface View {

    fun intents(): Observable<Intent>

    fun render(state: ViewState)
}